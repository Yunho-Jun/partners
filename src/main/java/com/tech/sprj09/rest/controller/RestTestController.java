package com.tech.sprj09.rest.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.sprj09.db.DBCon;
import com.tech.sprj09.dto.DeptDto;
import com.tech.sprj09.dto.Member5Dto;

@RestController
@RequestMapping("/test/*")
public class RestTestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello REST";
	}
	@RequestMapping("/member")
	public Member5Dto member() {
		Member5Dto dto=new Member5Dto();
		dto.setId("hong");
		dto.setPass("1234");
		dto.setName("홍길동");
		dto.setAddr("hong@h.com");
		return dto;
	}
	@RequestMapping("/membersMap")
	public Map<Integer, Member5Dto> membersMap() {
		Map<Integer, Member5Dto> map
		=new HashMap<Integer, Member5Dto>();
		for (int i = 0; i < 10; i++) {
			Member5Dto dto=new Member5Dto();
			dto.setId("hong");
			dto.setPass("1234");
			dto.setName("홍길동");
			dto.setAddr("hong@test.com");
			map.put(i, dto);
		}
		
		return map;
	}
	@RequestMapping("/member5")
	public List<Member5Dto> member5() throws Exception{
		//디비에서 데이터 가져오기
		String sql="select * from member5";
		List<Member5Dto> list=new ArrayList<Member5Dto>();
		
		Connection con=DBCon.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
			Member5Dto d=new Member5Dto();
			
			d.setId(rs.getString("id"));
			d.setPass(rs.getString("pass"));
			d.setName(rs.getString("name"));
			d.setAddr(rs.getString("addr"));
			list.add(d);
		}
		
		return list;
	}

}
