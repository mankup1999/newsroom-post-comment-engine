package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.Post;
import com.newsroom.postcomments.mongo.entity.UserComment;
import com.newsroom.postcomments.rpc.DeleteCommentServiceGrpc.DeleteCommentServiceImplBase;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.DeleteComentRequest;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeleteCommentService extends DeleteCommentServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void deleteComment(DeleteComentRequest request, StreamObserver<ServiceResponse> responseObserver) {

		String postID = request.getPostID();
		String commentID = request.getCommentID();

		System.out.println(
				mongoTemplate.findAndRemove(Query.query(Criteria.where("commentID").is(commentID)), UserComment.class));
		Update update = new Update();
		update = update.pull("commentIds", commentID);
		System.out.println(
				mongoTemplate.findAndModify(Query.query(Criteria.where("postID").is(postID)), update, Post.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("DeleteComment Response:{}", serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();

	}

}
