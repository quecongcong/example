package operator;

import java.util.Random;

/**
 * Title: URShift.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月1日 下午4:35:33 <br>
 *
 * @author gaoxing
 */
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		short s = -1;
		System.out.println(Integer.toBinaryString(s));
		s>>>=10;
		System.out.println(Integer.toBinaryString(s));
		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(11^7);
		System.out.println(~11);
		Random random = new Random();
		printBinaryChar('1');
		
		int x=0,y=1,z=2;
		String S = "x,y,z";
		System.out.println(S+x+y+z);
		System.out.println(""+x);
		System.out.println(true^true);
		char c1 = '0',c2='1';
		System.out.println("c1*c2:"+c1*c2);
		System.out.println(0.1*0.3);
		System.out.println(Double.MAX_VALUE);
		
		int sybom = 2;
//		System.out.println(++sybom);
		System.out.println(sybom++);
//		String string = "";
//		String string1 = "abcd";
//		String string2 = "abcd";
//		String string3 = "abc";
//		System.out.println("");
//		System.out.println("string1 string2调用方法");
//		compareStr(string1, string2);
//		
//		System.out.println("");
//		System.out.println("string1 string1调用方法");
//		compareStr(string1, string1);
//		
//		System.out.println("");
//		System.out.println("string1 string3调用方法");
//		compareStr(string1, string3);
		
		}
	
	static void printBinaryChar(char c){
		System.out.println("c:"+c);
		int c0 = c;
		System.out.println("c0:"+c0);
		int intC = c-'0';
		intC = +1;
		System.out.println(Integer.toBinaryString(c0));
	}
	
	static void compareStr(String x,String y){
		System.out.println("x字符串："+x+",y字符串"+y);
		System.out.println("x==y:"+(x==y));
		System.out.println("x!=y:"+(x!=y));
		System.out.println("x.equals(y):"+x.equals(y));
	}
}
