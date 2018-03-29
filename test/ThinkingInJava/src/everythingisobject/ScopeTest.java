package everythingisobject;

/**
 * Title: ScopeTest.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年2月27日 下午5:09:04 <br>
 *
 * @author gaoxing
 */
// 作用域
public class ScopeTest {
	
	static int i = 48;
	static void increment() {
		i++;
	}

	public static void main(String[] args) {
		{
			String s = new String("a string");
			System.out.println(s);
		}
		{
			String s = new String("a string");
			System.out.println(s);
		}
		Num num = new Num();
		System.out.println(num.value);
		ScopeTest.increment();
		System.out.println(ScopeTest.i);
	}
}

class Num {
	int value;

	public Num() {

	}
}
