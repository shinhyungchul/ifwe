package com.kh.ifwe.club.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ifwe.club.model.vo.Club;
import com.kh.ifwe.club.model.vo.ClubMaster;
import com.kh.ifwe.member.model.vo.Member;

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
	public List<String> selectCate(String hashtag) {
		return sqlSession.selectList("club.selectCate",hashtag);
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

	
	
	
	
	
	
	
}
