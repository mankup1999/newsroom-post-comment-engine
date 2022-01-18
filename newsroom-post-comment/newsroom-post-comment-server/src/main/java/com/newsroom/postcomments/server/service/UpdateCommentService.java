package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.UserComment;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.rpc.PostComments.UpdateCommentRequest;
import com.newsroom.postcomments.rpc.UpdateCommentServiceGrpc.UpdateCommentServiceImplBase;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpdateCommentService extends UpdateCommentServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void updateComment(UpdateCommentRequest request, StreamObserver<ServiceResponse> responseObserver) {

		String commentID = request.getCommentID();
		String newComment = request.getNewComment();

		Update update = new Update();
		update = update.set("comment", newComment);
		System.out.println(mongoTemplate.findAndModify(Query.query(Criteria.where("commentID").is(commentID)), update,
				UserComment.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("UpdateComment Response - {}", serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();

	}

}
