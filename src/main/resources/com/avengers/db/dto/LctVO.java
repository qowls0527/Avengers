package com.avengers.db.dto;


/**
 * 강의에 대한 정보 관리
 * @author 조영훈
 * 2017.07.10 최초작성
 *
 */
public class LctVO {
	private String lct_num;//강의 고유번호
	private String lct_yr;//개설년도
	private String lct_atr;//개설학기
	private String lct_nm;//강의명
	private String lct_tb;//강의교재
	private String lct_cd;//이수구분
	private String lct_estm_grd;//개설학년
	private String lct_cont;//강의내용
	private int lct_qua_num;//학생정원
	private int lct_me_rate;//중간고사비율
	private int lct_fe_rate;//기말고사비율
	private int lct_atdc_rate;//출결비율
	private int asgn_rate;//과제비율
	private String lct_prfs;//교수번호
	private String lct_sjt;//과목번호
	
	
	public String getLct_num() {
		return lct_num;
	}
	public void setLct_num(String lct_num) {
		this.lct_num = lct_num;
	}
	public String getLct_yr() {
		return lct_yr;
	}
	public void setLct_yr(String lct_yr) {
		this.lct_yr = lct_yr;
	}
	public String getLct_atr() {
		return lct_atr;
	}
	public void setLct_atr(String lct_atr) {
		this.lct_atr = lct_atr;
	}
	public String getLct_nm() {
		return lct_nm;
	}
	public void setLct_nm(String lct_nm) {
		this.lct_nm = lct_nm;
	}
	public String getLct_tb() {
		return lct_tb;
	}
	public void setLct_tb(String lct_tb) {
		this.lct_tb = lct_tb;
	}
	public String getLct_cd() {
		return lct_cd;
	}
	public void setLct_cd(String lct_cd) {
		this.lct_cd = lct_cd;
	}
	public String getLct_estm_grd() {
		return lct_estm_grd;
	}
	public void setLct_estm_grd(String lct_estm_grd) {
		this.lct_estm_grd = lct_estm_grd;
	}
	public String getLct_cont() {
		return lct_cont;
	}
	public void setLct_cont(String lct_cont) {
		this.lct_cont = lct_cont;
	}
	public int getLct_qua_num() {
		return lct_qua_num;
	}
	public void setLct_qua_num(int lct_qua_num) {
		this.lct_qua_num = lct_qua_num;
	}
	public int getLct_me_rate() {
		return lct_me_rate;
	}
	public void setLct_me_rate(int lct_me_rate) {
		this.lct_me_rate = lct_me_rate;
	}
	public int getLct_fe_rate() {
		return lct_fe_rate;
	}
	public void setLct_fe_rate(int lct_fe_rate) {
		this.lct_fe_rate = lct_fe_rate;
	}
	public int getLct_atdc_rate() {
		return lct_atdc_rate;
	}
	public void setLct_atdc_rate(int lct_atdc_rate) {
		this.lct_atdc_rate = lct_atdc_rate;
	}
	public int getAsgn_rate() {
		return asgn_rate;
	}
	public void setAsgn_rate(int asgn_rate) {
		this.asgn_rate = asgn_rate;
	}
	public String getLct_prfs() {
		return lct_prfs;
	}
	public void setLct_prfs(String lct_prfs) {
		this.lct_prfs = lct_prfs;
	}
	public String getLct_sjt() {
		return lct_sjt;
	}
	public void setLct_sjt(String lct_sjt) {
		this.lct_sjt = lct_sjt;
	}
	
	
	
}
