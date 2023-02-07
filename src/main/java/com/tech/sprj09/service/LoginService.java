package com.tech.sprj09.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tech.sprj09.dao.IDao;

@Service
public class LoginService implements BServiceInter{

	private SqlSession sqlSession;
	
	public LoginService(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}

	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		System.out.println(">>>LoginSerivce");
		
		
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=
				(HttpServletRequest)map.get("request");
		String memid=request.getParameter("memid");
		String mempass= request.getParameter("mempass");
		
		System.out.println(memid);
		System.out.println(mempass);
		
		IDao dao=sqlSession.getMapper(IDao.class);
		 dao.login(memid,mempass);		

		
		
	}
}
