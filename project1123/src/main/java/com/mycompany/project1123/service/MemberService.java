package com.mycompany.project1123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.project1123.model.dao.MemberDao;
import com.mycompany.project1123.model.vo.Member;

@Service("memberService")
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public int select(Member m) {
		return memberDao.select(m);
	}

	public int insert(Member m) {
		return memberDao.insert(m);
		
	}

}
