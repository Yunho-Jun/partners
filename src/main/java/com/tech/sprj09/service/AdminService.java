package com.tech.sprj09.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public class AdminService implements BServiceInter {
private SqlSession sqlSession;
	
	public AdminService(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

	}

}
