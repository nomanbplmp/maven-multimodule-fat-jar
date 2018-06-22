package com.nk.test;

public class Application {

private static	BService b = new BService();
private static	CService c  = new CService();
 public static void main(String[] args) {
	System.out.println("Hello World !!");
	System.out.println(b.call());
	System.out.println(c.call());
}
}
