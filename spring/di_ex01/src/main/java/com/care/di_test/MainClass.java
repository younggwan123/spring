package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		String configLocation = "classpath:application_test.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(configLocation);
		PrintBean printBean = ctx.getBean("PB",PrintBean.class);
		
		System.out.print("아무 내용이나 입력 : ");
		printBean.setPrint(input.next());
		
		printBean.printString();
	}
}

