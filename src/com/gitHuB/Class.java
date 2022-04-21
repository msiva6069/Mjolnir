package com.gitHuB;

public class Class {
	public static void B() {
		System.out.println("print B");

	}

	public void C() {
		System.out.println("print C");

	}
	

	public static void main(String[] args) {
		B();

		Class obj = new Class();
		obj.C();

	}

}
