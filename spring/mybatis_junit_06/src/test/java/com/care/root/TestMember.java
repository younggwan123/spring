package com.care.root;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.member.controller.MemberController;
import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {
		"classpath:testMember.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
		})
public class TestMember {
	@Autowired MemberController mc;
	@Autowired MemberService ms;
	@Autowired MemberDAO mapper;
	
	@Test
	public void testMapper() {
		assertNotNull(mapper);
	}
	
	@Test
	public void testMc() {
		System.out.println("mc : "+mc);
		assertNotNull(mc);// null이 아니면 성공
	}
	@Test
	public void testMs() {
		assertNotNull(ms);
	}
	
	@Test
	public void testMsIns() {
		MemberDTO dto = new MemberDTO();
		dto.setId(222); dto.setName("김길이");
		ms.insert(dto);
	}
	@Test
	public void testMapperIns() {
		MemberDTO dto = new MemberDTO();
		dto.setId(111); dto.setName("홍길동");
		mapper.insert(dto);
	}
	
	@Test
	public void testMapperMemView() {
		ArrayList<MemberDTO> list = mapper.memberview();
		System.out.println( list.size() );
	}
}













