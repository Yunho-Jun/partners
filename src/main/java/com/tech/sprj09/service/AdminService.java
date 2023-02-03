package com.tech.sprj09.service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.tech.sprj09.dao.IDao;
import com.tech.sprj09.dto.MemberDto;
import com.tech.sprj09.vopage.SearchVO;

public class AdminService implements BServiceInter {
private SqlSession sqlSession;
	
	public AdminService(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
//		Map<String, Object> map=model.asMap();
//		HttpServletRequest request=
//				(HttpServletRequest)map.get("request");
//		SearchVO searchVO=
//				(SearchVO)map.get("searchVO");
		
		IDao dao=sqlSession.getMapper(IDao.class);
		
		ArrayList<MemberDto> dots=dao.mlist();
		
		model.addAttribute("mlist",dots); 
		
	//	String[] brdtitle=request.getParameterValues("searchType");	
		
	}

}
