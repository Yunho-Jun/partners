//package com.tech.sprj09.service;
//
//import java.util.ArrayList;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.ui.Model;
//
//import com.tech.sprj09.dao.IDao;
//import com.tech.sprj09.dto.BoardDto;
//import com.tech.sprj09.dto.MemberDto;
//import com.tech.sprj09.vopage.SearchVO;
//
//public class AdminService implements BServiceInter {
//private SqlSession sqlSession;
//	
//	public AdminService(SqlSession sqlSession) {
//		this.sqlSession=sqlSession;
//	}
//	@Override
//	public void execute(Model model) {
//		System.out.println("adminservice");
//		
//		
//		IDao dao=sqlSession.getMapper(IDao.class);
//		
//		ArrayList<MemberDto> dtos=dao.mlist();
//		
//		for (MemberDto memberDto : dtos) {
//			System.out.println("memberMeno : "+memberDto.getMemno());
//		}
//		
//		model.addAttribute("mlist",dtos); 
//
//	}
//
//}
