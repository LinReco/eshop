package com.example;

public class test1 {

	static void f() {
		boolean a = 3<2 ;
		boolean b = 3>2 ;
		if(a == false ) {
			System.out.println("永遠不會進行到這");
		}
		if(b == false) {
			System.out.println("一定會秀出此句");
		}
		//f(0){}
 	}
	public static void main(String[] args){
		test1.f();
	}
}
