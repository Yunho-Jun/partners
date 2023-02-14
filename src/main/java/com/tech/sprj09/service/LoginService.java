package com.tech.sprj09.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tech.sprj09.dao.IDao;
import com.tech.sprj09.dto.MemberDto;

@Service
public class LoginService implements BServiceInter {

	private SqlSession sqlSession;

	public LoginService(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
	}
	// 로그인 체크
	public MemberDto loginCheck(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String memid = request.getParameter("memid");
		String mempass = request.getParameter("mempass");

		System.out.println("=============로그인서비스지나감============");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		MemberDto findMember = dao.login(memid, mempass);
		
		return findMember;
	}
	

	
}
