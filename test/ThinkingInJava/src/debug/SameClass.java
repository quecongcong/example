package debug;

import util.Print;

/**
 * Title: SameClass.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月8日 下午4:14:49 <br>
 *
 * @author gaoxing
 */
public class SameClass {
	public void debug(String string) {
		Print.print(string);
	}

	protected void protectedMethod() {
		System.out.println("protectedMethod");
	}
}