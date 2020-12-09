package com.gulraiz.survey.dto;

public class AddSurveyDto {

	private int documentId;
	private String email;
	private String comments;
	private String pcFavoriteBrand;
	
		public AddSurveyDto(int documentId, String email, String comments, String pcFavoriteBrand) {
		super();
		this.documentId = documentId;
		this.email = email;
		this.comments = comments;
		this.pcFavoriteBrand = pcFavoriteBrand;
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
	
	
}
