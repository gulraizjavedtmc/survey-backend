package com.gulraiz.survey.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
@TypeDefs({@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)})
@Entity
@Table(name="survey")
public class Survey {

	private UUID id;
	private int documentId;
	private String email;
	private String comments;
	private String pcFavoriteBrand;
	private LocalDateTime replyDateTime;
	
	
	
	public Survey(UUID id, int documentId, String email, String comments, String pcFavoriteBrand,
			LocalDateTime replyDateTime) {
		super();
		this.id = id;
		this.documentId = documentId;
		this.email = email;
		this.comments = comments;
		this.pcFavoriteBrand = pcFavoriteBrand;
		this.replyDateTime = replyDateTime;
	}
	
	public Survey() {}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", updatable = false)
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPcFavoriteBrand() {
		return pcFavoriteBrand;
	}
	public void setPcFavoriteBrand(String pcFavoriteBrand) {
		this.pcFavoriteBrand = pcFavoriteBrand;
	}
	public LocalDateTime getReplyDateTime() {
		return replyDateTime;
	}
	public void setReplyDateTime(LocalDateTime replyDateTime) {
		this.replyDateTime = replyDateTime;
	}
	
	
	
	
}
