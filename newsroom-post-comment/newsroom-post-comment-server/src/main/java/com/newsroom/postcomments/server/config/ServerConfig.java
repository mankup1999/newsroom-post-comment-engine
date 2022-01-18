package com.newsroom.postcomments.server.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.newsroom.postcomments.mongo.MongoConfig;
import com.newsroom.postcomments.server.service.AddCommentService;
import com.newsroom.postcomments.server.service.CreatePostService;
import com.newsroom.postcomments.server.service.DeleteCommentService;
import com.newsroom.postcomments.server.service.DeletePostService;
import com.newsroom.postcomments.server.service.UpdateCommentService;
import com.newsroom.postcomments.server.service.UpdatePostService;
import com.newsroom.postcomments.server.service.UserLikeService;
import com.newsroom.postcomments.server.service.UserShareService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@Import(MongoConfig.class)
public class ServerConfig {

	@Value("${newsroom.postcomments.rpc.port}")
	private int port;

	@PostConstruct
	public void setup() {

		try {

			Server server = ServerBuilder.forPort(port).addService(new AddCommentService())
					.addService(new CreatePostService()).addService(new DeleteCommentService())
					.addService(new DeletePostService()).addService(new UpdateCommentService())
					.addService(new UpdatePostService()).addService(new UserLikeService())
					.addService(new UserShareService()).build();

			System.out.println(server.getServices());

			log.info("GRPC Post/Comment server starting at {}", port);
			server.start();
			log.info("GRPC Post/Comment server started at {}", port);
			server.awaitTermination();

		} catch (Exception ex) {
			log.error("Error: Starting gRPC server at {} - {}", port, ex.getMessage());
			ex.printStackTrace();
		}

	}

}
