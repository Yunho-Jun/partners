package com.tech.sprj09.dto;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberDto {
	public MemberDto() {

	}
	
<<<<<<< HEAD
	private int memno; // 회원 고유정보
	private String memid; // 회원 ID
	private String mempass; // 회원 PASS
	private String memname; // 회원 이름
	private String membirth; // 회원 나이
	private String memsex; // 회원 성별
	private String mememail; // 회원 이메일
	private String mempnum; // 회원 연락처
	private String memaddress;// 회원지역
	private String memlikemenu; // 회원이 선호하는 메뉴
	private Timestamp memjoindate; // 회원가입일
	private int memadmin; // ADMIN인지 일반 회원인지 구분하는 ...
=======
	public int memno; // 회원 고유정보
	public String memid; // 회원 ID
	public String mempass; // 회원 PASS
	public String memname; // 회원 이름
	public String membirth; // 회원 나이
	public String memsex; // 회원 성별
	public String mememail; // 회원 이메일
	public String mempnum; // 회원 연락처
	public String memaddress;// 회원지역
	public String memlikemenu; // 회원이 선호하는 메뉴
	public Timestamp memjoindate; // 회원가입일
<<<<<<< HEAD
	public String memadmin; // ADMIN인지 일반 회원인지 구분하는 ...
	private String lv;
	private String sum;
	public MemberDto(int memno, String memid, String mempass, String memname, String membirth, String memsex,
			String mememail, String mempnum, String memaddress, String memlikemenu, Timestamp memjoindate, String memadmin,
=======
	public int memadmin; // ADMIN인지 일반 회원인지 구분하는 ...
>>>>>>> ac09d1f445c90079fe0aa95ebc232a8ce3b79994
	private String lv;
	private String sum;
	
	public MemberDto(int memno, String memid, String mempass, String memname, String membirth, String memsex,
			String mememail, String mempnum, String memaddress, String memlikemenu, Timestamp memjoindate, int memadmin,
>>>>>>> 3db164deabf601832146c73f7f3a399ccfc3e6fd
			String lv, String sum) {
	
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
		this.lv = lv;
		this.sum = sum;
	}
	
	
	
	


	
}
