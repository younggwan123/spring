package com.care.root02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 Student st01 = new Student(); 
		 STBean stb = new STBean();
		 stb.setSt(st01);
		 */
		
		String path = "classpath:applicationST.xml";
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		
		STBean stb = ctx.getBean("stb",STBean.class);
		
		//stb.setName("홍길동1111");
		//stb.setAge(201111);
		
		stb.nP(); stb.aP();
}
}
