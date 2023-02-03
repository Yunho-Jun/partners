package com.tech.sprj09.dto;

import java.security.Timestamp;

public class SikdangDto {

	private int sikno; //식당고유번호
	private String sikloca; //식당
	private String sikname; //식당이름 
	private String sikcontent; //식당소개
	private String sikwriter; //식당 글쓴이 
	private String sikaddress; //식당주소 
	private String siktel; //식당 전화번호 
	private Timestamp sikdate; // 식당 가입일 
	private int sikhit; //식당 방문자수 
	private String sikopenclose; //영업일 
	
	
	public SikdangDto(int sikno, String sikloca, String sikname, String sikcontent, String sikwriter, String sikaddress,
			String siktel, Timestamp sikdate, int sikhit, String sikopenclose) {

		this.sikno = sikno;
		this.sikloca = sikloca;
		this.sikname = sikname;
		this.sikcontent = sikcontent;
		this.sikwriter = sikwriter;
		this.sikaddress = sikaddress;
		this.siktel = siktel;
		this.sikdate = sikdate;
		this.sikhit = sikhit;
		this.sikopenclose = sikopenclose;
	}
	public int getSikno() {
		return sikno;
	}
	public void setSikno(int sikno) {
		this.sikno = sikno;
	}
	public String getSikloca() {
		return sikloca;
	}
	public void setSikloca(String sikloca) {
		this.sikloca = sikloca;
	}
	public String getSikname() {
		return sikname;
	}
	public void setSikname(String sikname) {
		this.sikname = sikname;
	}
	public String getSikcontent() {
		return sikcontent;
	}
	public void setSikcontent(String sikcontent) {
		this.sikcontent = sikcontent;
	}
	public String getSikwriter() {
		return sikwriter;
	}
	public void setSikwriter(String sikwriter) {
		this.sikwriter = sikwriter;
	}
	public String getSikaddress() {
		return sikaddress;
	}
	public void setSikaddress(String sikaddress) {
		this.sikaddress = sikaddress;
	}
	public String getSiktel() {
		return siktel;
	}
	public void setSiktel(String siktel) {
		this.siktel = siktel;
	}
	public Timestamp getSikdate() {
		return sikdate;
	}
	public void setSikdate(Timestamp sikdate) {
		this.sikdate = sikdate;
	}
	public int getSikhit() {
		return sikhit;
	}
	public void setSikhit(int sikhit) {
		this.sikhit = sikhit;
	}
	public String getSikopenclose() {
		return sikopenclose;
	}
	public void setSikopenclose(String sikopenclose) {
		this.sikopenclose = sikopenclose;
	}

}
