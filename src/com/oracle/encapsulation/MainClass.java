package com.oracle.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		PrivateVariables var = new PrivateVariables("hello","hi","hey");
		var.method();
		System.out.println(var.toString());
		
		PrivateVariables var1 = new PrivateVariables();
		
		var1.setVar2("adesh");
		System.out.println(var1.getVar2()+" jeevan");
		
//		
		

	}

}
