package com.example.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis.dto.PersonInfo1;

@Mapper // 讓 Spring Boot 託管
public interface PersonInfo1Dao {
	// 使用 @Param 將帶入的值映射到參數中
	public List<PersonInfo1> selectByCityLike(// 
			@Param("inputCity") String city);
	
	public List<PersonInfo1> selectByUserNameAndCityLike(//
			@Param("inputUserName") String userName,//
			@Param("inputCityList") List<String> cityList);
	
	public List<PersonInfo1> selectByUserNameAndAgeLessThan(//
			@Param("inputUserName") String userName,//
			@Param("inputAge") int age);

}
