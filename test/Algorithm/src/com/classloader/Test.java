package com.classloader;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Test.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2017年8月28日 下午3:41:39 <br>
 *
 * @author gaoxing
 */
public class Test {
	
    public static void main(String[] args) {
    	int a =1,b=0;
    	
		if (a > b) {
			System.out.println("1");
		}else if (a==b) {
			System.out.println("0");
		}else if (a < b) {
			System.out.println("2");
		}
	}
}