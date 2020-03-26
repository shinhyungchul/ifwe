package com.kh.ifwe.club.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ifwe.club.model.vo.Club;
import com.kh.ifwe.club.model.vo.ClubMaster;
import com.kh.ifwe.club.model.vo.ClubMember;
import com.kh.ifwe.member.model.vo.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class ClubDAOImpl implements ClubDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int create(Club club) {
		return sqlSession.insert("club.clubCreate",club);
	}

	@Override
	public int selectSeq() {
		return sqlSession.selectOne("club.selectSeq");
	}

	@Override
	public String selectCate(String hashtag) {
		return sqlSession.selectOne("club.selectCate",hashtag);
	}

	@Override
	public int insertContent(String hashtag) {
		return sqlSession.insert("club.insertContent",hashtag);
	}

	@Override
	public int insertCategory(Map<String, Object> map) {
		return sqlSession.insert("club.insertCategory", map);
	}

	@Override
	public List<ClubMaster> clubSearch() {

		return sqlSession.selectList("club.clubSearch");
	}

	
	@Override
	public Club selectOne(int clubCode) {
		return sqlSession.selectOne("club.selectOne",clubCode);
	}

	@Override
	public Member selectClubMaster(int clubMaster) {
		return sqlSession.selectOne("club.selectClubMaster",clubMaster);
	}

	

	@Override
	public List<ClubMaster> searchClubByHashtag(Map<String, String> param) {
		return sqlSession.selectList("club.searchClubByHashtag", param);
	}

	@Override
	public List<ClubMaster> selectListByName(Map<String, String> param) {
		return sqlSession.selectList("club.selectListByName", param);
	}

	@Override
	public List<Member> selectMemberCode(int clubCode) {
		return sqlSession.selectList("club.selectMemberCode",clubCode);
	}

	@Override
	public List<ClubMember> selectClubMember(List<Member> clubMemberCode_) {
		return sqlSession.selectList("club.selectClubMember", clubMemberCode_);
	}

	@Override
	public ClubMember selectClubMaster2(int clubMaster) {
		return sqlSession.selectOne("club.selectClubMaster2",clubMaster);
	}


	
	
	
	
	
	
}
