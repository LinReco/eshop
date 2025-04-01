package com.example;

//定字(Literal): 擴充以上程式
public class Homework3{
public static void main(String[] args){
System.out.println("嗨,");
System.out.println("你好!\n");
System.out.println("嗨, \n");
System.out.println("你好!\n");
int decVal = 26;
int hexVal = 0x1a;
int binVal = 0b11010;
System.out.println("decVal="+decVal+" hexVal="+hexVal+" binVal="+binVal);
System.out.println("hexString="+ Integer.toHexString(decVal)
+" binaryString="+ Integer.toBinaryString(decVal));
}
}

