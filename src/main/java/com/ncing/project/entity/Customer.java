package com.ncing.project.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Document(collection = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String name;
	private String description;
	private Long parentCard;
	private Date cardDate;
	@Field("attributes")
	private Map<String, String> attributes = new HashMap();
	private String role;
	

}
