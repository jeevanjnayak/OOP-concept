package com.oracle.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		PrivateVariables var = new PrivateVariables("hello","hi","hey");
		System.out.println(var.getVar2()+" jeevan");
		var.method();
		

	}

}
