package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.Post;
import com.newsroom.postcomments.mongo.entity.UserComment;
import com.newsroom.postcomments.mongo.entity.UserPost;
import com.newsroom.postcomments.rpc.DeletePostServiceGrpc.DeletePostServiceImplBase;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.DeletePostRequest;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeletePostService extends DeletePostServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void deletePost(DeletePostRequest request, StreamObserver<ServiceResponse> responseObserver) {

		String postID = request.getPostID();

		Post post = mongoTemplate.findOne(Query.query(Criteria.where("postID").is(postID)), Post.class);
		System.out.println(mongoTemplate.findAndRemove(Query.query(Criteria.where("postID").is(postID)), Post.class));
		for (String commentID : post.getCommentIds()) {
			System.out.println(mongoTemplate.findAndRemove(Query.query(Criteria.where("commentID").is(commentID)),
					UserComment.class));
		}

		String userID = post.getUserID();
		Update update = new Update();
		update = update.pull("postIDs", postID);
		System.out.println(
				mongoTemplate.findAndModify(Query.query(Criteria.where("userID").is(userID)), update, UserPost.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("DeletePost Response - {}", serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();
	}

}
