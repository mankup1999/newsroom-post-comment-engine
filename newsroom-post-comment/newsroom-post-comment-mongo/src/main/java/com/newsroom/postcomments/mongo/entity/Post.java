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
public class Post {

	private String postID;
	private String userID;
	private PostLocation postLocation;
	private String postTitle;
	private String postText;
	private List<PostBody> contents;
	private List<String> userLikes;
	private int likes;
	private List<String> userDislikes;
	private int dislikes;
	private List<String> userShares;
	private int shares;
	private List<String> commentIds;

}
