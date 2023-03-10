package com.tech.sprj09.service.admin;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.tech.sprj09.dao.IDao;
import com.tech.sprj09.dto.MemberDto;
import com.tech.sprj09.service.BServiceInter;
import com.tech.sprj09.vopage.admin.AdminSearchVO;



public class MemberListService implements BServiceInter{
	private SqlSession sqlSession;
	
	public MemberListService(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	@Override
	public void execute(Model model) {
		System.out.println(">>>MemberListService");
		

		Map<String, Object> map=model.asMap();//map으로 변환
		HttpServletRequest request=(HttpServletRequest) map.get("request");
<<<<<<< HEAD
=======
		AdminSearchVO searchVO=(AdminSearchVO) map.get("searchVO");
>>>>>>> 3db164deabf601832146c73f7f3a399ccfc3e6fd
		
		
		IDao dao=sqlSession.getMapper(IDao.class);
		
<<<<<<< HEAD
		String searchtype = request.getParameter("searchType");

		//기본값은 1=memid 로
		String selnum="1";
	
		// searchtype null 처리를 안하면 널포인트 익셉션이 뜨고 진입이 안된다...
		if(searchtype!=null) {
			
			if(searchtype.equals("MEMID")) {
				selnum="1";
				System.out.println("memid ");
			}
			if(searchtype.equals("MEMNAME")) {
				selnum="2";
				System.out.println("memname ");
			}
			
		}

		//키워드 가져오기
		String searchKeyword=request.getParameter("searchName");
		if (searchKeyword==null) {
			searchKeyword="";}
		

		
		ArrayList<MemberDto> mlist=dao.mlist(searchKeyword, selnum);

=======
		String[] rememid = request.getParameterValues("searchType");
//
//		if (rememid != null) {//null 처리
//
//			for (int i = 0; i < rememid.length; i++) {
//
//				System.out.println("선택한 체크박스 " + rememid[i]);
//			}
//
//		} 
//		
//		
		String memid="";
		String memname="";
//		
		if(rememid!=null) {
			for (String var : rememid) {
				if(var.equals("memid")) {
					
					model.addAttribute("memid","true");
					memid="memid";
				}else if (var.equals("memname")) {
					
					model.addAttribute("memname","true");
					memname="memname";
				}
			}
		}
		
		//키워드 가져오기
		String searchKeyword=request.getParameter("searchName");
		if (searchKeyword==null) 
			searchKeyword="";
		
		model.addAttribute("resk",searchKeyword);
		
//		System.out.println("keyword ::"+searchKeyword);
//		
//		String strpage = request.getParameter("page");
//		if (strpage == null) {
//			strpage = "1";
//		}
//		System.out.println("str page눈 " + strpage);
//		int page = Integer.parseInt(strpage);
//		searchVO.setPage(page);
//		
//		// 토탈 글의 개수 구하기
//		
//		int total=0;
//		if (memid.equals("memid") && memname.equals("")) {
//			total=dao.selectMemeberTotCount1(searchKeyword);
//		}else if (memid.equals("") && memname.equals("memname")) {
//			total=dao.selectMemeberTotCount2(searchKeyword);
//		}else if (memid.equals("memid") && memname.equals("memname")) {
//			total=dao.selectMemeberTotCount3(searchKeyword);
//		}else if (memid.equals("") && memname.equals("")) {
//			total=dao.selectMemeberTotCount4(searchKeyword);
//		} 
//		int rowStart = searchVO.getRowStart();
//		int rowEnd = searchVO.getRowEnd();
//		
		
		
//		
//	
//		ArrayList<MemberDto> mlist=dao.mlist();
		ArrayList<MemberDto> mlist=null;
//		
		if(memid.equals("memid") && memname.equals("")) {
			
			model.addAttribute("mlist",dao.mlist(searchKeyword,"1"));
		}else if(memid.equals("") && memname.equals("memname")) {
			
			model.addAttribute("mlist",dao.mlist(searchKeyword,"2"));
		}else if(memid.equals("memid") && memname.equals("memname")) {
			
			model.addAttribute("mlist",dao.mlist(searchKeyword,"3"));
		}else if(memid.equals("") && memname.equals("")) {
			
			model.addAttribute("mlist",dao.mlist(searchKeyword,"4"));
		}
		
		
		
>>>>>>> 3db164deabf601832146c73f7f3a399ccfc3e6fd
		
		
		
		
		ArrayList<MemberDto> clist=dao.clist();
		
		model.addAttribute("mlist",mlist);
<<<<<<< HEAD

=======
		
//		model.addAttribute("totRowcnt", total);
//		model.addAttribute("searchVO", searchVO);
>>>>>>> 3db164deabf601832146c73f7f3a399ccfc3e6fd
		model.addAttribute("clist",clist);
	}

}
