package com.care.root.member.dao;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.care.root.member.dto.MemberDTO;

public interface MemberDAO {
	public void insert(MemberDTO dto) ;
	public ArrayList<MemberDTO> memberview();
}











