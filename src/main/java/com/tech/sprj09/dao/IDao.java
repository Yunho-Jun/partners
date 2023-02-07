package com.tech.sprj09.dao;

import java.util.ArrayList;

import com.tech.sprj09.dto.BoardDto;
import com.tech.sprj09.dto.MemberDto;

public interface IDao {

	// 기본 리스트 ,디테일, 수정 ,삭제 ,리플 , 카테고리별 검색, 하위 리플 삭제 방지 !!시작!!
	public ArrayList<BoardDto> list(int start, int end, String sk, String selNum);

	public void write(String bname, String btitle, String bcontent, String fname);

	public BoardDto contentview(String gbid);

	public void upHit(String gbid);

	public BoardDto contentupdate(String gbid);

	public void modify(String bid, String bname, String btitle, String bcontent);

	public void delete(String bid);

	public BoardDto replyview(String gbid);

	public void reply(String bid, String bname, String btitle, String bcontent, String bgroup, String bstep,
			String bindent);

	public int replyShape(String bgroup, String bstep);

	public int selectBoardTotCount1(String searchKeyword);

	public int selectBoardTotCount2(String searchKeyword);

	public int selectBoardTotCount3(String searchKeyword);

	public int selectBoardTotCount4(String searchKeyword);

	public ArrayList<BoardDto> sonReply(int bgroup);
	// 기본 리스트 ,디테일, 수정 ,삭제 ,리플 , 카테고리별 검색, 하위 리플 삭제 방지 !!끝!!
	
	
	//admin 설정 정리
	public ArrayList<MemberDto> mlist();
	
	//회원가입 DBinsert
	public void join(String memid, String mempass, String memname, String memsex, String membirth, String mememail,
			String mempnum, String memaddress, String memlikemenu);

	//로그인 서비스에서 넘어옴. 
	public void login(String memid, String mempass);
	
	

	
	
	
	

}
