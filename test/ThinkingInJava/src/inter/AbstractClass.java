package inter;

import util.Print;

/**
 * Title: AbstractClass.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月14日 下午5:55:26 <br>
 *
 * @author gaoxing
 */
public abstract class AbstractClass {
	
	public static void main(String[] args) {
		AbstractClass abstractClass = new AbstractClass() {
			
		};
	}
}

abstract class TestClass{
	abstract void print();
	public TestClass() {
		print();
	}
}

class TestClass1 extends TestClass {
	private int a = 4;
	@Override
	void print() {
		Print.print("a.value:"+a);
	}
	public static void main(String[] args) {
		TestClass testClass = new TestClass1();
		testClass.print();
		"".contains("");
	}
	
}
