package com.lagou.domain;

public class User {
	private String userId;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String topDegree;
	private Integer phoneno;
	private String workyear;
	private String currentState;
	private Integer type;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(String userId, String name, String email, String password, String gender, String topDegree,
			Integer phoneno, String workyear, String currentState, Integer type) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.topDegree = topDegree;
		this.phoneno = phoneno;
		this.workyear = workyear;
		this.currentState = currentState;
		this.type = type;
	}


	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTopDegree() {
		return topDegree;
	}
	public void setTopDegree(String topDegree) {
		this.topDegree = topDegree;
	}
	public Integer getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}
	public String getWorkyear() {
		return workyear;
	}
	public void setWorkyear(String workyear) {
		this.workyear = workyear;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", topDegree=" + topDegree + ", phoneno=" + phoneno + ", workyear=" + workyear
				+ ", currentState=" + currentState + ", type=" + type + "]";
	}
	
	
	
}
