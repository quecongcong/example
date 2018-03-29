package visitcontrolright;

/**
 * Title: Lunch.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月9日 上午10:09:36 <br>
 *
 * @author gaoxing
 */
public class Lunch {
		void testPrivate(){
//			Soup1 soup1 = new Soup1();
		}
		
		void testStatic(){
			Soup1 soup1 = Soup1.makeSoup();
		}
		
		void testSingleton(){
			Soup2.access().f();
		}
}

class Soup1{
	private Soup1(){}
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2{
	private Soup2(){
	}
	private static Soup2 ps1 = new Soup2();
	
	public static Soup2 access() {
		return ps1;
	}
	
	public void f(){}
}
