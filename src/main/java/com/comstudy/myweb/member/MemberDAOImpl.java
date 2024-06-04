package com.comstudy.myweb.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	// 멤버 목록 구현 static
	public static final List<MemberDTO> memberList;
	static {
		memberList = new ArrayList<MemberDTO>();
		memberList.add(new MemberDTO("hong","1234","관리자","Admin"));
		memberList.add(new MemberDTO("user1","1234","홍길동","User"));
		memberList.add(new MemberDTO("user2","1234","김길동","User"));
		memberList.add(new MemberDTO("user3","1234","이길동","User"));
		memberList.add(new MemberDTO("user4","1234","오길동","User"));
	}

	@Override
	public List<MemberDTO> selectAll() {
		System.out.println("selectAll 실행");
		
		return memberList;
	}
	
	// 상세보기, 저장, 수정, 삭제 기능 구현
	@Override
	public MemberDTO findById (MemberDTO dto) {
		int idx = memberList.indexOf(dto);
		if (idx != -1) return memberList.get(idx);
		return null;
	}
	
	@Override
	public void insert (MemberDTO dto) {
		memberList.add(dto);
	}
	
	@Override
	public void update (MemberDTO dto) {
		int idx = -1;
		for (int i=0 ; i<memberList.size() ; i++) {
			System.out.println("리스트 : " + memberList.get(i).getId());
			System.out.println(dto);
			if (memberList.get(i).getId().equals(dto.getId())) {
				idx = i;
				break;
			}
		}
		if (idx != -1) {
			memberList.get(idx).setId(dto.getId());
			memberList.get(idx).setName(dto.getName());
			memberList.get(idx).setPassword(dto.getPassword());
			memberList.get(idx).setRole(dto.getRole());
		}
	}
	
	@Override
	public void delete (MemberDTO dto) {
		int idx = memberList.indexOf(dto);
		memberList.remove(idx);
	}

}
