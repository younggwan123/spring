package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String configLocation = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(configLocation);
		SaveClass sc = ctx.getBean("SC",SaveClass.class);
		System.out.print("연산 숫자 입력 : ");
		
		sc.setNum1(input.nextInt());
		sc.setOp(input.next());
		sc.setNum2(input.nextInt());
		
		sc.operationClass();
		sc.printClass();
		
	}
}
