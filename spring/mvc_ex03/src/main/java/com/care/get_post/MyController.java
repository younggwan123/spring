package com.care.get_post;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@RequestMapping(value="my/index",  method = RequestMethod.GET)
	public String index() {
		return "get_post/index";
	}
	@GetMapping(value="my/result")
	public String resultGet(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("get방식 실행");
		
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		//service.insert(name, age) -> dao.insert(name,age) -> db에 저장
		
		model.addAttribute("method",request.getMethod() );
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		
		return "get_post/result";
	}
	@PostMapping(value="my/result")
	public String resultPost(HttpServletRequest request, Model model,
							@RequestParam("name") String name, 
							@RequestParam("age") String age) {
		
		System.out.println("post방식 실행");
		
		model.addAttribute("method",request.getMethod() );
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		
		return "get_post/result";
	}
	
	@RequestMapping("my/object")
	public String object(MyDTO dto, Model model ) {
		
		System.out.println("name : "+dto.getName());
		System.out.println("age : "+dto.getAge());
		
		model.addAttribute("member",dto);
		
		return "get_post/result";
	}
}






