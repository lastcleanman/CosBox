package cosbox.member.service;

import java.util.List;

import cosbox.member.dto.MemberVO;

public interface MemberService {
	
	public List<MemberVO> selectMember() throws Exception;
}
