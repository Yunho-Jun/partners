package com.tech.sprj09.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tech.sprj09.dao.IDao;
import com.tech.sprj09.dto.MemberDto;

@Service
public class MemberListService implements BServiceInter{
	private SqlSession sqlSession;
	
	public MemberListService(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	@Override
	public void execute(Model model) {
		System.out.println(">>>MemberListService");
		

		
//		SearchVO searchVO=
//				(SearchVO)map.get("searchVO");
		IDao dao=sqlSession.getMapper(IDao.class);
		
	
		ArrayList<MemberDto> mlist=dao.mlist();
		System.out.println("ccccc");
		
		for (MemberDto memberDto : mlist) {
			System.out.println(memberDto.getMembirth());
		}
		
		model.addAttribute("mlist",mlist);
	}

}
