package com.example.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mybatis.dao.PersonInfo1Dao;
import com.example.mybatis.dao.PersonInfo2Dao;
import com.example.mybatis.dao.PersonInfo3Dao;
import com.example.mybatis.dao.PersonInfoDao;
import com.example.mybatis.dto.PersonInfo;
import com.example.mybatis.dto.PersonInfo1;
import com.example.mybatis.dto.PersonInfo2;
import com.example.mybatis.dto.PersonInfo3;

@SpringBootTest
class MybatisApplicationTests {
	
	@Autowired
	private PersonInfoDao dao;
	
	@Autowired
	private PersonInfo1Dao dao1;
	
	@Autowired
	private PersonInfo2Dao dao2;
	
	@Autowired
	private PersonInfo3Dao dao3;

	@Test
	public void addInfoTest() {
		dao.addInfo("B01", "BBB", 15, "Tainan");
	}
	
	
	@Test
	public void addInfo2Test() {
		int res = dao.addInfo2(new PersonInfo("A01", "AAA", 22, "Kh"));
		System.out.println(res);
	}
	
	@Test
	public void selectByNameAndCityTest() {
		Map<String, Object> map = new HashMap<>();
		map.put("userName", "AAA");
		map.put("city", "kh");
		List<PersonInfo> res = dao.selectByNameAndCity(map);
		System.out.println(res.size());
	}
	
	@Test
	public void selectByIdTest() {
		PersonInfo res = dao.selectById("A01");
		System.out.println(res.getUserName());
	}
	
	@Test
	public void selectByIdListTest() {
		List<PersonInfo> res = dao.selectByIdList(List.of("A01", "B01", "C01"));
		System.out.println(res.size());
	}
	
	@Test
	public void selectByCityLikeTest() {
		List<PersonInfo1> res = dao1.selectByCityLike(null);
		System.out.println(res.size());
	}
	
	@Test
	public void selectByUserNameAndCityLikeTest() {
		List<PersonInfo1> res = dao1.selectByUserNameAndCityLike("AAA", List.of("KH"));
		System.out.println(res.size());
	}
	
	@Test
	public void insertTest2() {
		int res = dao2.insert(new PersonInfo("A09", "AAA", 22, "Kh"));
		System.out.println(res);
	}
	
	@Test
	public void addInfo3Test() {
		PersonInfo3 info = new PersonInfo3("AAA", 22, "Kh");
		System.out.println("add before: " + info.getUserId());
		dao3.addInfo3(info);
		System.out.println("add after: " + info.getUserId());
	}
	
	@Test
	public void addInfo32Test() {
		PersonInfo3 info = new PersonInfo3("BBB", 33, "Taipei");
		System.out.println("add before: " + info.getUserId());
		dao3.addInfo2(info);
		System.out.println("add after: " + info.getUserId());
	}
	
	@Test
	public void selectByIdTest2() {
		PersonInfo2 res = dao2.selectById("C01");
		System.out.println(res.getUserId());
		System.out.println(res.getUserName());
	}
	
	@Test
	public void selectByIdTest3() {
		PersonInfo2 res = dao2.selectById2("C01");
		System.out.println(res.getUserId());
		System.out.println(res.getUserName());
	}
	
	@Test
	public void selectByUserNameAndAgeLessThanTest() {
		List<PersonInfo2> res = dao2.selectByUserNameAndAgeLessThan("AAA", 22);
		System.out.println(res.size());
	}

}
