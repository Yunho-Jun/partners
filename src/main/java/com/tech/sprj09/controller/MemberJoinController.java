package com.tech.sprj09.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.sprj09.service.BListService;
import com.tech.sprj09.service.BServiceInter;
import com.tech.sprj09.vopage.SearchVO;


@Controller
public class MemberJoinController {
	BServiceInter bServiceInter;
	
	
	@Autowired
	private SqlSession sqlSession;

	// 회원가입 구현
	@RequestMapping("/joinAAview")
	public String join(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("membercontroller");
		
		model.addAttribute("request", request);
		model.addAttribute("searchVO", searchVO);

		bServiceInter = new BListService(sqlSession);
		bServiceInter.execute(model);
		

		
		return "joinAAview";
	}
	
	

	
}
