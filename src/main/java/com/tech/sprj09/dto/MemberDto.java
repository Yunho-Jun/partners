package com.tech.sprj09.dto;

import java.security.Timestamp;

public class MemberDto {
	public MemberDto() {

	}
	public int memno; // 회원 고유정보
	public String memid; // 회원 ID
	public String mempass; // 회원 PASS
	public String memname; // 회원 이름
	public String membirth; // 회원 나이 (주민등록)
	public String memsex; // 회원 성별
	public String mememail; // 회원 이메일
	public String mempnum; // 회원 연락처
	public String memaddress;// 회원지역 (선호지역)
	public String memlikemenu; // 회원이 선호하는 메뉴 (선호메뉴)
	public Timestamp memjoindate; // 회원가입일
	public int memadmin; // ADMIN인지 일반 회원인지 구분하는 ...
	
	
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMempass() {
		return mempass;
	}
	public void setMempass(String mempass) {
		this.mempass = mempass;
	}
	public String getMemname() {
		return memname;
	}
	public void setMemname(String memname) {
		this.memname = memname;
	}
	public String getMembirth() {
		return membirth;
	}
	public void setMembirth(String membirth) {
		this.membirth = membirth;
	}
	public String getMemsex() {
		return memsex;
	}
	public void setMemsex(String memsex) {
		this.memsex = memsex;
	}
	public String getMememail() {
		return mememail;
	}
	public void setMememail(String mememail) {
		this.mememail = mememail;
	}
	public String getMempnum() {
		return mempnum;
	}
	public void setMempnum(String mempnum) {
		this.mempnum = mempnum;
	}
	public String getMemaddress() {
		return memaddress;
	}
	public void setMemaddress(String memaddress) {
		this.memaddress = memaddress;
	}
	public String getMemlikemenu() {
		return memlikemenu;
	}
	public void setMemlikemenu(String memlikemenu) {
		this.memlikemenu = memlikemenu;
	}
	public Timestamp getMemjoindate() {
		return memjoindate;
	}
	public void setMemjoindate(Timestamp memjoindate) {
		this.memjoindate = memjoindate;
	}
	public int getMemadmin() {
		return memadmin;
	}
	public void setMemadmin(int memadmin) {
		this.memadmin = memadmin;
	}
	
	public MemberDto(int memno, String memid, String mempass, String memname, String membirth, String memsex,
			String mememail, String mempnum, String memaddress, String memlikemenu, Timestamp memjoindate,
			int memadmin) {
		this.memno = memno;
		this.memid = memid;
		this.mempass = mempass;
		this.memname = memname;
		this.membirth = membirth;
		this.memsex = memsex;
		this.mememail = mememail;
		this.mempnum = mempnum;
		this.memaddress = memaddress;
		this.memlikemenu = memlikemenu;
		this.memjoindate = memjoindate;
		this.memadmin = memadmin;
	}


	
}
