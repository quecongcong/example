package everythingisobject;

import java.util.Date;

/**
 * Title: HelloData.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年2月28日 上午10:03:28 <br>
 *
 * @author gaoxing
 */
public class HelloData {
	
	public static void main(String[] args){
		System.out.println("Hello,it's: ");
		System.out.println(new Date());
		if (args!=null&&args.length>0) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
