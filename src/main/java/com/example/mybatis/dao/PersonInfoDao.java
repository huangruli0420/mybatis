package com.example.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis.dto.PersonInfo;

@Mapper // 讓 Spring Boot 託管
public interface PersonInfoDao {
	// 方法中參數的傳遞有以下幾種常用的方式:
	// 1. 使用 @Param 將帶入的值映射到參數中
	public void addInfo(//
			@Param("inputId") String id, //
			@Param("inputName") String userName,//
			@Param("inputAge") int age,//
			@Param("inputCity") String city);
	
	// 2. 使用 dto
	// 註: 回傳資料型態設定為 int，可以用來判斷是否有 insert 成功
	//     因為是新增單筆資料，所以回傳 1 表示新增成功；反之新增失敗
	public int addInfo2(PersonInfo personInfo);
	
	// 3. 使用 map
	// 註: 回傳結果是多筆
	public List<PersonInfo> selectByNameAndCity(Map<String, Object> params);
	
	// 4. 使用參數順序位置
	public PersonInfo selectById(String id);
	
	// 5. 傳遞的參數是集合類型(List、Set、Array 等)
	public List<PersonInfo> selectByIdList(@Param("idList") List<String> idList);
	
	// 不帶參數
	public List<PersonInfo> selectAll();
}
