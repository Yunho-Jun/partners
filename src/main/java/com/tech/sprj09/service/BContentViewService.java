package com.tech.sprj09.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tech.sprj09.dao.IDao;
import com.tech.sprj09.dto.BoardDto;

@Service
public class BContentViewService implements BServiceInter{

	private SqlSession sqlSession;
	
	public BContentViewService(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	
	@Override
	public void execute(Model model) {
		System.out.println(">>>BContentViewService");
//		db접속 select처리 글번호조건으로
//		model에서 request를 풀기
//		model을 Map로 변환
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=
				(HttpServletRequest)map.get("request");
		String bid=request.getParameter("bid");
//		System.out.println("bid : "+bid);
//		BoardDao dao=new BoardDao();
		
		IDao dao=sqlSession.getMapper(IDao.class);
		dao.upHit(bid);
		
		BoardDto dto=dao.contentview(bid);
		
		//리턴받은 db의 선택글을 모델에 담기
		model.addAttribute("content_view",dto);
		
	}

}
