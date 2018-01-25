package cosbox.member.dao;

import java.util.List;

import cosbox.member.dto.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;
}
