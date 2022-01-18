package com.newsroom.postcomments.server.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.constants.PostType;
import com.newsroom.postcomments.mongo.entity.Post;
import com.newsroom.postcomments.mongo.entity.PostBody;
import com.newsroom.postcomments.mongo.entity.PostLocation;
import com.newsroom.postcomments.mongo.entity.UserPost;
import com.newsroom.postcomments.rpc.CreatePostServiceGrpc.CreatePostServiceImplBase;
import com.newsroom.postcomments.rpc.PostComments.CreatePostRequest;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreatePostService extends CreatePostServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void createPost(CreatePostRequest request, StreamObserver<ServiceResponse> responseObserver) {

		log.info("Creating Post for userID-{}", request.getUserID());
		Post post = Post.builder().postID(request.getPostID()).userID(request.getUserID())
				.postLocation(assignPostLocation(request.getPostLocation())).postTitle(request.getPostTitle())
				.postText(request.getPostText()).contents(populateContents(request.getContentsList()))
				.userLikes(pouplateUserLikes(request.getUserLikesList())).likes(request.getLikes())
				.userDislikes(pouplateUserDislikes(request.getUserDislikesList())).dislikes(request.getDislikes())
				.userShares(populateUserShares(request.getUserSharesList())).shares(request.getShares())
				.commentIds(populateComments(request.getCommentsList())).build();

		System.out.println(mongoTemplate.save(post));
		Update update = new Update();
		update = update.push("postIDs", request.getPostID());
		System.out.println(mongoTemplate.upsert(Query.query(Criteria.where("userID").is(request.getUserID())), update,
				UserPost.class));

		Data data = Data.newBuilder().setData(post.getPostID()).build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("CreatePost Response for userID-{},Response-{}", request.getUserID(), serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();

	}

	public PostLocation assignPostLocation(com.newsroom.postcomments.rpc.PostComments.PostLocation location) {

		if (location == null) {
			return null;
		}

		return PostLocation.builder().latitude(location.getLatitude()).longitude(location.getLongitude())
				.address(location.getAddress()).build();

	}

	public List<PostBody> populateContents(List<com.newsroom.postcomments.rpc.PostComments.PostBody> bodies) {

		List<PostBody> ret = new ArrayList<PostBody>();

		if (bodies == null) {
			return ret;
		}

		for (com.newsroom.postcomments.rpc.PostComments.PostBody body : bodies) {
			ret.add(PostBody.builder().postURL(body.getPostURL()).postType(assignPostType(body.getPostType())).build());
		}

		return ret;

	}

	public PostType assignPostType(String postType) {
		if (postType.equalsIgnoreCase("image")) {
			return PostType.IMAGE;
		}
		if (postType.equalsIgnoreCase("video")) {
			return PostType.VIDEO;
		}
		return PostType.AUDIO;
	}

	public List<String> pouplateUserLikes(List<String> userIds) {
		List<String> ret = new ArrayList<String>();
		if (userIds == null) {
			return ret;
		}

		for (String userId : userIds) {
			ret.add(userId);
		}

		return ret;
	}

	public List<String> pouplateUserDislikes(List<String> userIds) {
		List<String> ret = new ArrayList<String>();
		if (userIds == null) {
			return ret;
		}

		for (String userId : userIds) {
			ret.add(userId);
		}

		return ret;
	}

	public List<String> populateUserShares(List<String> userIds) {
		List<String> ret = new ArrayList<String>();
		if (userIds == null) {
			return ret;
		}

		for (String userId : userIds) {
			ret.add(userId);
		}

		return ret;
	}

	public List<String> populateComments(List<String> comments) {
		List<String> ret = new ArrayList<String>();
		if (comments == null) {
			return ret;
		}
		for (String commentID : comments) {
			ret.add(commentID);
		}
		return ret;
	}

}
