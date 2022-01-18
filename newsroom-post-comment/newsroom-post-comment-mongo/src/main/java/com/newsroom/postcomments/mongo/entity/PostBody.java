package com.newsroom.postcomments.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.newsroom.postcomments.mongo.constants.PostType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class PostBody {

	private String postURL;
	private PostType postType;

}
