package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.Post;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.rpc.PostComments.UpdatePostRequest;
import com.newsroom.postcomments.rpc.UpdatePostServiceGrpc.UpdatePostServiceImplBase;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpdatePostService extends UpdatePostServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void updatePost(UpdatePostRequest request, StreamObserver<ServiceResponse> responseObserver) {

		Update update = new Update();
		update = update.set("postTitle", request.getPostTitle());
		update = update.set("postText", request.getPostTest());
		update = update.set("postLocation", request.getPostLocation());
		update = update.set("contents", request.getContentsList());
		System.out.println(mongoTemplate.findAndModify(Query.query(Criteria.where("postID").is(request.getPostID())),
				update, Post.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("UpdatePost Response - {}", serviceResponse);
		responseObserver.onNext(serviceResponse);

		responseObserver.onCompleted();
	}

}
