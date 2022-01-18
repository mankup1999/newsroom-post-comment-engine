package com.newsroom.postcomments.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

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
public class PostLocation {

	private double latitude;
	private double longitude;
	private String address;

}
