//package com.tech.sprj09.controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.tech.sprj09.service.BServiceInter;
//import com.tech.sprj09.service.MemberListService;
//import com.tech.sprj09.vopage.SearchVO;
//
//@Controller
//public class AdminController {
//	BServiceInter bServiceInter;
//
//	@Autowired
//	private SqlSession sqlSession;
//
//	@RequestMapping("/admin")
//	public String admin(HttpServletRequest request, SearchVO searchVO, Model model) {
//		System.out.println("========admin=======");
//		// db에서 데이터 가져오기
//		
//		model.addAttribute("request", request);
//		model.addAttribute("searchVO", searchVO);
//
//		bServiceInter = new MemberListService(sqlSession);
//		bServiceInter.execute(model);
//
//		return "admin/admin";
//	}
//
//}
