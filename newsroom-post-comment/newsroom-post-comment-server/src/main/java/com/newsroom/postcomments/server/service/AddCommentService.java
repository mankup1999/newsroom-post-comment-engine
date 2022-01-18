package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.Post;
import com.newsroom.postcomments.mongo.entity.UserComment;
import com.newsroom.postcomments.rpc.AddCommentServiceGrpc.AddCommentServiceImplBase;
import com.newsroom.postcomments.rpc.PostComments.AddCommentRequest;
import com.newsroom.postcomments.rpc.PostComments.Comment;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddCommentService extends AddCommentServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void addComment(AddCommentRequest request, StreamObserver<ServiceResponse> responseObserver) {

		UserComment userComment = assignComment(request.getComment());

		System.out.println(mongoTemplate.save(userComment));
		Update update = new Update();
		update = update.push("commentIds", userComment.getCommentID());
		System.out.println(mongoTemplate
				.findAndModify(Query.query(Criteria.where("postID").is(userComment.getPostID())), update, Post.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("AddComment Response for userID-{},Response-{}", request.getComment().getUserID(), serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();

	}

	public UserComment assignComment(Comment comment) {
		return UserComment.builder().commentID(comment.getCommentID()).userID(comment.getUserID())
				.postID(comment.getPostID()).comment(comment.getComment()).build();
	}

}
