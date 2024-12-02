package com.example.mybatis.dto;

public class PersonInfo {

	private String id;

	private String userName; // user_name

	private int age;

	private String city;
	
	// 以下建構方法以及屬性的 getter/setter 方法自行建立

	public PersonInfo() {
		super();
	}

	public PersonInfo(String userName, String city) {
		super();
		this.userName = userName;
		this.city = city;
	}

	public PersonInfo(String id, String userName, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}

	public PersonInfo(String id, String userName, int age, String city) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.city = city;
	}

	public String getId() {
		return id;
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

	public void setId(String id) {
		this.id = id;
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
