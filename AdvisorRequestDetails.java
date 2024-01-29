package com.example.demo;

public class AdvisorRequestDetails {

	private String name;
    private String photoUrl;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public AdvisorRequestDetails(String name, String photoUrl) {
		super();
		this.name = name;
		this.photoUrl = photoUrl;
	}
}
