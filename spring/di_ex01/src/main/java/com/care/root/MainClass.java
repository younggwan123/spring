package com.care.root;

public class MainClass {
	public static void main(String[] args) {
		Student st01 = new Student();
		STBean stb = new STBean();
		
		stb.setSt(st01);
		stb.setName("ȫ�浿");
		stb.setAge(20);
		
		stb.nP(); stb.aP();
	}
}


