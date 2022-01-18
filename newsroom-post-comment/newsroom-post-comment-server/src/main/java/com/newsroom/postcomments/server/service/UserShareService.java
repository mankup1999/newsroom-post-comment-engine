package com.newsroom.postcomments.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.newsroom.postcomments.mongo.entity.UserPost;
import com.newsroom.postcomments.rpc.PostComments.Data;
import com.newsroom.postcomments.rpc.PostComments.ServiceResponse;
import com.newsroom.postcomments.rpc.PostComments.UserShareRequest;
import com.newsroom.postcomments.rpc.UserShareServiceGrpc.UserShareServiceImplBase;
import com.newsroom.postcomments.server.ServerMain;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserShareService extends UserShareServiceImplBase {

	private MongoTemplate mongoTemplate = ServerMain.template;

	@Override
	public void share(UserShareRequest request, StreamObserver<ServiceResponse> responseObserver) {

		Update update = new Update();
		update.push("postIDs", request.getPostID());
		System.out.println(mongoTemplate.upsert(Query.query(Criteria.where("userID").is(request.getUserID())), update,
				UserPost.class));

		Data data = Data.newBuilder().setData("data").build();
		ServiceResponse serviceResponse = ServiceResponse.newBuilder().setSuccess(true).setData(data).build();
		log.info("UserShare Response - {}", serviceResponse);
		responseObserver.onNext(serviceResponse);
		responseObserver.onCompleted();
	}

}
