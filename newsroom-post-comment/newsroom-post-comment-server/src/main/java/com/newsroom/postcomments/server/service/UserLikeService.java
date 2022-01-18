package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.Post;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.rpc.PostComments.UserLikeRequest;
import com.newsroom.postcomments.rpc.UserLikeServiceGrpc.UserLikeServiceImplBase;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserLikeService extends UserLikeServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void like(UserLikeRequest request, StreamObserver<ServiceResponse> responseObserver) {

		String postID = request.getPostID();
		String userID = request.getUserID();

		Update update = new Update();
		update.inc("likes");
		update.push("userLikes", userID);
		System.out.println(
				mongoTemplate.updateFirst(Query.query(Criteria.where("postID").is(postID)), update, Post.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("UserLike Response - {}", serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();
	}

}
