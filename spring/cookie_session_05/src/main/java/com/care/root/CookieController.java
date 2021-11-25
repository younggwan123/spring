package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	@GetMapping("cookie")
	public String myCookie(HttpServletResponse response, 
							HttpServletRequest request,
				@CookieValue(value="myCookie", required = false) Cookie cookie) {
		
		System.out.println("cookie : "+cookie);
		
		Cookie cook = new Cookie("myCookie","쿠키생성");
		cook.setMaxAge(5);
		
		response.addCookie(cook);
		/*
		for(Cookie c: request.getCookies()) {
			System.out.println(c.getName());
		}
		*/
		return "cook/cookie";
	}
}




