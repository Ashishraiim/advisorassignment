package com.example.demo;

public class AdvisorDetails {

	private String name;
	private Byte profileImage;
	private Long Id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(Byte profileImage) {
		this.profileImage = profileImage;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public AdvisorDetails(String name, Byte profileImage, Long id) {
		super();
		this.name = name;
		this.profileImage = profileImage;
		Id = id;
	}	
}
