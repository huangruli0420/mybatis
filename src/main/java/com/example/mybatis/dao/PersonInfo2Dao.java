package com.example.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.mybatis.dto.PersonInfo;
import com.example.mybatis.dto.PersonInfo2;

@Mapper
public interface PersonInfo2Dao {
	
	@Insert("insert into person_info (id, user_name, age, city) "
			+ " values (#{id}, #{userName}, #{age}, #{city})")
	public int insert(PersonInfo personInfo);
	
	@Results(//
		id = "personInfoResultMap", // 此 Results 的唯一辨識
		value = {//
		// 使用 @Result 將欄位和屬性名稱對應； column: 欄位名稱，property: 屬性名稱
		// 多個 @Result 用逗號區隔
		@Result(column = "id", property = "userId", id = true), //id = true；表示此欄位是 PK
		@Result(column = "user_name", property = "userName"),
		@Result(column = "age", property = "userAge"),
		@Result(column = "city", property = "userCity")
	})
	@Select("select id, user_name, age, city from person_info where id = #{inputId}")
	public PersonInfo2 selectById(@Param("inputId")String id);
	
	// 透過 @ResultMap 帶入使用 @Results 的 id 值
	@ResultMap("personInfoResultMap")
	@Select("select id, user_name, age, city from person_info where id = #{inputId}")
	public PersonInfo2 selectById2(String inputId);
	
	// 使用 <script> 標籤將動態語法包住
	// 語法中表示字串的雙引號需要跳脫(使用跳脫符號 \)
	@Select("<script>"
			+ " select id, user_name, age, city from person_info "
			+ " where user_name = #{inputUserName} "
			+ " <if test=\"inputAge >= 0 and inputAge lte 99\">"
			+ "    and age &lt;= #{inputAge} "
			+ "  </if>"
			+ " </script>")
	public List<PersonInfo2> selectByUserNameAndAgeLessThan(//
			@Param("inputUserName") String userName,//
			@Param("inputAge") int age);

}
