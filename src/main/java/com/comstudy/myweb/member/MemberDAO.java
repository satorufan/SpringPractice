package com.comstudy.myweb.member;

import java.util.List;

public interface MemberDAO {

	List<MemberDTO> selectAll();

	// 상세보기, 저장, 수정, 삭제 기능 구현
	MemberDTO findById(MemberDTO dto);

	void insert(MemberDTO dto);

	void update(MemberDTO dto);

	void delete(MemberDTO dto);

}