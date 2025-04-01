package com.example;

	class test4{
		public static void main(String[] args){
		int bitmask = 0x000F;
		int val = 0x2222;
		//prints"2"
		System.out.println(val&bitmask);
		int x = 0b11000111;
		System.out.println(x);
		x= x <<3;
		System.out.println(x);
		x = x >>3;
		System.out.println(x);
		boolean birthday =false;
		int age =64;
		if(birthday == true & ++age >=65){
		System.out.println("Yes,you have discount");
		}
		else{
		System.out.println("No, you didn't have discount");
		}
		}
		
	}
