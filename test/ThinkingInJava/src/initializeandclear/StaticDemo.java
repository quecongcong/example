package initializeandclear;

/**
 * Title: StaticDemo.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月7日 下午2:31:25 <br>
 *
 * @author gaoxing
 */
class Bowl{
	{
//		System.out.println("普通代码块");
//		f1(100000);
	}
	static{
		System.out.println("静态代码块");
	}
	public Bowl(int marker) {
		// TODO Auto-generated constructor stub
		System.out.println("Bowl("+marker+")");
	}
	void f1(int marker){
		System.out.println("f1("+marker+")");
	}
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	public Table() {
		// TODO Auto-generated constructor stub
		System.out.println("Table()");
		bowl1.f1(1);
	}
	void f2(int marker){
		System.out.println("f2("+marker+")");
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	public Cupboard() {
		// TODO Auto-generated constructor stub
		System.out.println("Cupboard");
		bowl4.f1(2);
	}
	void f3(int marker){
		System.out.println("f3("+marker+")");
	}
	static Bowl bowl5 = new Bowl(5);
}

class Cup{
	static String str1 = "str1";
	static String str2;
	static{
		str2 = "str2";
	}
	public Cup() {
		// TODO Auto-generated constructor stub
	}
	static void print(){
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
		Cup.print();
	}
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}