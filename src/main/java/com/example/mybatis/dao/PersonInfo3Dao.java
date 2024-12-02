package com.example.mybatis.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.example.mybatis.dto.PersonInfo3;

@Mapper // 讓 Spring Boot 託管
public interface PersonInfo3Dao {		
	// 假設欄位 id 的資料型態是流水號，新增資訊後要返回該流水號
	// 方法的回傳值可以是 數字或是 void
	public void addInfo3(PersonInfo3 personInfo);
	
	@Insert("insert into person_info_3 (user_name, age, city) "
			+ " values (#{userName}, #{age}, #{city})")
	@Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "id")
	public void addInfo2(PersonInfo3 personInfo);
}
