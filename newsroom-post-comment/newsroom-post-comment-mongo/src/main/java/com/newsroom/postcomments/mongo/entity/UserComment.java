package com.newsroom.postcomments.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Document
public class UserComment {
	
	private String commentID;
	private String postID;
	private String userID;
	private String comment;

}
