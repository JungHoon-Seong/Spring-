package com.mycompany.project1123.model.vo;

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberNm;
	private String memberEnrollDt; //입력은 to_date 불러오기는 to_char을 이용
	
	
	
	
	public Member() {
		super();
	}
	public Member(String id, String pwd, String name) {
		this.memberId = id;
		this.memberPwd = pwd;
		this.memberNm = name;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNm=" + memberNm
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public String getMemberEnrollDt() {
		return memberEnrollDt;
	}
	public void setMemberEnrollDt(String memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}
	
	
}
