//package com.tech.sprj09.service;
//
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.stereotype.Service;
//import org.springframework.ui.Model;
//
//import com.tech.sprj09.dao.IDao;
//import com.tech.sprj09.dto.MemberDto;
//
//@Service
//public class IdCheckService implements BServiceInter {
//	private SqlSession sqlSession;
//
//	public IdCheckService(SqlSession sqlSession) {
//		this.sqlSession=sqlSession;
//	}
//
//	@Override
//	public void execute(Model model) {
//		System.out.println(">>>>>IdCheckService");
////		model에서 request를 풀기
////		model을 Map로 변환
//		Map<String, Object> map=model.asMap();
//		HttpServletRequest request=
//				(HttpServletRequest)map.get("request");
//		
//		String memid = request.getParameter("memid");
//		MemberDto dto = new MemberDto();
//		dto.setMemid(memid);
//		
////		db에 연결해서 sql문 dao에서 처리
//		IDao dao=sqlSession.getMapper(IDao.class);
//		int result = IDao.idCheck(memid);
//		
//		return result;
//
//	}
//
//}
