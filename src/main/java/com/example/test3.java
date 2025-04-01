package com.example;

public class test3 {
	public static void main(String[] args) {
	int k = 0, m = 0;
	int a = ++k + 3;   // 前置遞增運算子
	int b = m++ + 3;   // 後置遞增運算子
	System.out.println("a = " + a + ", b = " + b + ", k = " + k + ", m = " + m);
}
}