package com.care.root;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	@RequestMapping("make_session")
	public String makeSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		session.setAttribute("id", "abc123");
		session.setAttribute("name", "홍길동");
		
		return "session/makeSession";
	}
	@GetMapping("del_session")
	public String delSession(HttpSession session) {
		session.removeAttribute("id"); //특정 세션 만료
		//session.invalidate(); // 모든 세션 종료
		return "session/delSession";
	}
	@GetMapping("result_session")
	public String resultSession(Model model) {
		model.addAttribute("id","모델이다~~");
		return "session/resultSession";
	}
}







