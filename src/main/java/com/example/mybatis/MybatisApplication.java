package com.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 指定要掃描 Mapper 類接口的路徑位置，就是放 Dao 的 package
// 路徑只有一個時，括號中可直接放路徑；例如: @MapperScan("com.example.mybatis.dao")
// 路徑多個時用逗號分隔: {"路徑A", "路徑B"}
@MapperScan(basePackages = {"com.example.mybatis.dao"})
@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

}
