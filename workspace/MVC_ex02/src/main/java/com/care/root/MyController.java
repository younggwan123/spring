package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	// url 경로 localhost:port/root/index
	@RequestMapping(value="index")
	public String memberIndex() {
		// .jsp 파일의 경로
		return "member/index";
		
	}
}
