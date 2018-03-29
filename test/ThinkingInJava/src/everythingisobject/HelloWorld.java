package everythingisobject;

/**
 * Title: HelloWorld.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年2月28日 下午2:59:33 <br>
 *
 * @author gaoxing
 */
public class HelloWorld {
	static int a = 0;
	public static void main(String[] args) {
		System.out.println("Hello,World!");
		HelloWorld helloWorld = new HelloWorld();
		HelloWorld helloWorld2 = new HelloWorld();
		helloWorld.a ++;
		System.out.println(helloWorld2.a);
		int b = 1,c=2;
		c = b;
		b=3;
		System.out.println(c);
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		tank1.level = 1;
		tank2.level = 2;
		tank1 = tank2;
		System.out.println(tank1.level);
		tank1.level = 3;
		System.out.println(tank2.level);
		f(tank1);
		System.out.println(tank1.level);
	}
	static void f(Tank tank){
		tank.level = 100;
	}
}
class Tank{
	int level;
	public Tank() {
		super();
	}
}
