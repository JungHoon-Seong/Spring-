package com.mycompany.project1123.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.project1123.model.vo.Member;

@Repository("memberDao")
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int select(Member m) {
		List<Member> MemberList = null;
		int result = 0;
		MemberList = sqlSession.selectList("Member.selectId",m);
		
		if (MemberList == null) {
			result = 0;
		}else if( MemberList != null) {
			result = 1;
		}
		return result;
	}

	public int insert(Member m) {
		int result = 0;
		
		result = sqlSession.insert("Member.signUp", m);
		
		return result;
	}

	

}
