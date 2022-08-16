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

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long id, String name, String description, Long parentCard, Date cardDate,
			Map<String, String> attributes, String role) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parentCard = parentCard;
		this.cardDate = cardDate;
		this.attributes = attributes;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParentCard() {
		return parentCard;
	}

	public void setParentCard(Long parentCard) {
		this.parentCard = parentCard;
	}

	public Date getCardDate() {
		return cardDate;
	}

	public void setCardDate(Date cardDate) {
		this.cardDate = cardDate;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
