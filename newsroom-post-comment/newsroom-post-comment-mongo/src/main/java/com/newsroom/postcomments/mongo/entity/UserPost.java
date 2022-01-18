package com.newsroom.postcomments.mongo.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Document
public class UserPost {
	
	private String userID;
	private List<String> postIDs;

}
