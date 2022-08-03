package com.oracle.interfac;

public class IntrfcExe implements Intrfc, Intrfc2 {

	@Override
	public void myMethod() {
		System.out.println("my first method");
	}

	@Override
	public void myMethod2() {
		System.out.println("my second method");
	}

	@Override
	public void secondMethod() {
		System.out.println("second interface method");
		
	}

}
