package com.example.mybatis.dto;

public class PersonInfo1 {

	private String userId;

	private String userName; // user_name

	private int userAge;

	private String userCity;

	// 以下建構方法以及屬性的 getter/setter 方法自行建立

	public PersonInfo1() {
		super();
	}

	public PersonInfo1(String userName, String userCity) {
		super();
		this.userName = userName;
		this.userCity = userCity;
	}

	public PersonInfo1(String userId, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}

	public PersonInfo1(String userId, String userName, int userAge, String userCity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userCity = userCity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

}
