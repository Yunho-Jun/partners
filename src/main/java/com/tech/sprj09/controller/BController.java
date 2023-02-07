package com.tech.sprj09.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.sprj09.dao.IDao;
import com.tech.sprj09.dto.MemberDto;
import com.tech.sprj09.service.BContentUpdateService;
import com.tech.sprj09.service.BContentViewService;
import com.tech.sprj09.service.BDeleteService;
import com.tech.sprj09.service.BDownLoadService;
import com.tech.sprj09.service.BListService;
import com.tech.sprj09.service.BModifyService;
import com.tech.sprj09.service.BReplyService;
import com.tech.sprj09.service.BReplyViewService;
import com.tech.sprj09.service.BServiceInter;
import com.tech.sprj09.service.BWriteService;
import com.tech.sprj09.service.admin.MemberListService;
import com.tech.sprj09.service.admin.MemberViewService;
import com.tech.sprj09.vopage.SearchVO;

@Controller
public class BController {
	BServiceInter bServiceInter;

	@Autowired
	private SqlSession sqlSession;

	// 회원가입 구현
	@RequestMapping("/join")
	public String join(HttpServletRequest request, SearchVO searchVO, Model model) {
		
		model.addAttribute("request", request);
		model.addAttribute("searchVO", searchVO);

		bServiceInter = new BListService(sqlSession);
		bServiceInter.execute(model);
		

		return "join";
	}

	// 목록표현
	@RequestMapping("/list")
	public String list(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("========list=======");
		// db에서 데이터 가져오기

		model.addAttribute("request", request);
		model.addAttribute("searchVO", searchVO);

		bServiceInter = new BListService(sqlSession);
		bServiceInter.execute(model);

		return "list";
	}
//<<<<<<< HEAD=======
//	로그인기능
	@RequestMapping("/login")
	public String login(Model model) {
		System.out.println("========login=======");
		return "login";
	}
<<<<<<< HEAD
	
	//로그인 기능 . 
	@RequestMapping(value="/loginCheck", method = RequestMethod.POST)
	public String loginCheck(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("=============loginCheck============");
		
		model.addAttribute("request", request);
		model.addAttribute("searchVO", searchVO);

		bServiceInter = new LoginService(sqlSession);
		bServiceInter.execute(model);
		
		d
	
		

		return "loginCheck";
	}

	
=======
>>>>>>> f9a12838be8e8feadbfa5251834786c5c24ffb10
//>>>>>>> origin/jeaho
//	글쓰기폼기능
	@RequestMapping("/writeview")
	public String writeview(Model model) {
		System.out.println("========writeview=======");
		return "writeview";
	}

//	글쓰기기능
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception {
		System.out.println("========write=======");

//		db에 글쓰기기능		
		// toss
		model.addAttribute("request", request);
		bServiceInter = new BWriteService(sqlSession);
		bServiceInter.execute(model);

		return "redirect:list";
	}

//	상세페이지기능
	@RequestMapping("/contentview")
	public String contentview(HttpServletRequest request, Model model) {
		System.out.println("========contentview=======");
//		db에 디테일기능		
		// toss
		model.addAttribute("request", request);

		bServiceInter = new BContentViewService(sqlSession);
		bServiceInter.execute(model);

		return "contentview";
	}

//	다운로드페이지기능
	@RequestMapping("/download")
	public String download(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		System.out.println("========download=======");

		model.addAttribute("request", request);
		model.addAttribute("response", response);
		bServiceInter = new BDownLoadService(sqlSession);
		bServiceInter.execute(model);

		return null;

	}

//	수정폼으로
	@RequestMapping("/contentupdate")
	public String contentupdate(HttpServletRequest request, Model model) {
		System.out.println("========contentupdate=======");
//		db에 디테일기능		
		// toss
		model.addAttribute("request", request);
		bServiceInter = new BContentUpdateService(sqlSession);
		bServiceInter.execute(model);

		return "contentupdate";
	}

//	글수정하기
	@RequestMapping(method = RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("========modify=======");
//		db에 디테일기능		
		// toss
		model.addAttribute("request", request);
		bServiceInter = new BModifyService(sqlSession);
		bServiceInter.execute(model);
//	
		return "redirect:list";
	}

//	글삭제하기
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("========delete=======");
//		db에 디테일기능		
		// toss
		model.addAttribute("request", request);
		bServiceInter = new BDeleteService(sqlSession);
		bServiceInter.execute(model);

		return "redirect:list";
	}

//	답변달기
	@RequestMapping("/replyview")
	public String replyview(HttpServletRequest request, Model model) {
		System.out.println("========replyview=======");
//		db에 디테일기능		
		// toss
		model.addAttribute("request", request);
		bServiceInter = new BReplyViewService(sqlSession);
		bServiceInter.execute(model);

		return "replyview";
	}

//	답변을 db에 insert
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("========reply=======");
//		db에 답글기능		
		// toss
		model.addAttribute("request", request);
		bServiceInter = new BReplyService(sqlSession);
		bServiceInter.execute(model);

		return "redirect:list";
	}



<<<<<<< HEAD
		return "admin/admin";

	}
	
	// 회원가입폼으로
	@RequestMapping("/joinform")
	public String joinform(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("=============this is joinform============");
		return "joinform";
	}
	
	// 회원가입폼으로 버전2
	@RequestMapping("/joinform1")
	public String joinform1(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("=============this is joinform============");
		return "joinform1";
	}
	
	// 회원가입 기능 
	@RequestMapping("/join")
	public String joinProc(HttpServletRequest request, SearchVO searchVO, Model model) {
		System.out.println("=============join PROC============");
		
		model.addAttribute("request", request);

		bServiceInter = new JoinService(sqlSession);
		bServiceInter.execute(model);
		
		return "redirect:login";
	}
	
	// id중복조회
	@ResponseBody
	@RequestMapping(value = "/usingId_chk", produces = "text/plain")
	public String idCheck(HttpServletRequest request, HttpServletResponse reponse, Model model) {
		System.out.println("=======usingId_chk==========");
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
=======
>>>>>>> 012047ff08bd6dce1affb38d520392a9d6d356eb

		String memid = request.getParameter("memid");
		System.out.println("memid컨트롤 : " + memid);
//		MemberDto dto = new MemberDto();
//		dto.setMemid(memid);
		
		IDao dao=sqlSession.getMapper(IDao.class);
		int using_user = dao.loginLookup(memid);
		System.out.println("using_user"+using_user);
		String result = "" + using_user; // 숫자를 문자열로 변환

		return result;
	}
}