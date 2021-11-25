package com.care.root.member.service;

import org.springframework.ui.Model;

import com.care.root.member.dto.MemberDTO;

public interface MemberService {
	public int userCheck(String id, String pw);
	public void memberInfo(Model model);
	public void getMember(String id,Model model);
	public int register(MemberDTO dto);
public void keepLogin(String sessionId,java.sql.Date limitDate,String id);

	public MemberDTO getUserSessionId(String sessionId);
}








