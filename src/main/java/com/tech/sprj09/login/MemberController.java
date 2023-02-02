package com.tech.sprj09.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/login")
@Controller
public class MemberController {
	
	@GetMapping("/all")
	public void doAll() {
		
		log.info("로그인이 필요합니다.");
		
	}
	@GetMapping("/member")
	public void doMember() {
		
		log.info("환영합니다.");
		
	}
	@GetMapping("/admin")
	public void doAdimin() {
		
		log.info("환영합니다 . 관리자 ");
		
	}
	
	

	
}
