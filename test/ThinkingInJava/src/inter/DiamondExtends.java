package inter;

/**
 * Title: DiamondExtends.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月15日 下午3:26:46 <br>
 *
 * @author gaoxing
 */
interface A {
	void fa();

	void ga();
}

interface B {
	void fb();

	void gb();
}

interface C {
	void fc();

	void gc();
}

interface D extends A, B, C {
	void fd();
}

class E {
	private int value;

	public void setVlues(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

class F extends E implements D {

	@Override
	public void fa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ga() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fb() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gb() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fd() {
		// TODO Auto-generated method stub

	}

}

public class DiamondExtends {
	static void fA(A a) {

	}

	static void fB(B b) {

	}

	static void fC(C c) {

	}

	static void fD(D d) {

	}

	public static void main(String[] args) {
		F f = new F();
		fA(f);
		fB(f);
		fC(f);
		fD(f);
	}
}
