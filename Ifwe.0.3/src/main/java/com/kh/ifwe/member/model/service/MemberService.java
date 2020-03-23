package com.kh.ifwe.member.model.service;

import com.kh.ifwe.member.model.vo.Member;

public interface MemberService {

	int insertMember(Member member);

	Member selectOne(String memberId);

	int updatePassword(Member member);

	int updatePhone(Member member);

	int updateEamil(Member member);

	int deleteMember(Member member);

}
