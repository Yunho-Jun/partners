package com.tech.sprj09.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.sprj09.dto.MenuDto;
import com.tech.sprj09.service.BServiceInter;
import com.tech.sprj09.service.MenuService;
import com.tech.sprj09.vopage.SearchVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MenuController {
	BServiceInter bServiceInter;

	@Autowired
	private SqlSession sqlSession;
	
	private final MenuService menuService;
	
	// 목록표현
	@RequestMapping("/menulist")
	public String list(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("========menulist=======");
		// db에서 데이터 가져오기

		model.addAttribute("request", request);
		model.addAttribute("searchVO", searchVO);
		

		
		List<MenuDto> list = menuService.getMenuList(2);

		model.addAttribute("list",list);

		return "menu/menulist";
	}

//	글쓰기폼기능
	@RequestMapping("/writeview")
	public String writeview(Model model) {
		System.out.println("========menuwriteview=======");
		return "menu/writeview";
	}

//	글쓰기기능
	@PostMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception {
		System.out.println("========menuwrite=======");


		return "menu/menulist";
	}

}