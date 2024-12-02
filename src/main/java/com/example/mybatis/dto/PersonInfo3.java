package com.example.mybatis.dto;

public class PersonInfo3 {

	private int userId;

	private String userName; // user_name

	private int age;

	private String city;

	// 以下建構方法以及屬性的 getter/setter 方法自行建立

	public PersonInfo3() {
		super();
	}

	public PersonInfo3(String userName, String city) {
		super();
		this.userName = userName;
		this.city = city;
	}

	public PersonInfo3(String userName, int age, String city) {
		super();
		this.userName = userName;
		this.age = age;
		this.city = city;
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
