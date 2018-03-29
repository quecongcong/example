package initializeandclear;

/**
 * Title: Tank.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月6日 下午3:06:00 <br>
 *
 * @author gaoxing
 */
public class Tank {
	boolean status;// true:慢的 false:空的

	public Tank() {
		status = false;// 默认是空的
	}

	void full() {
		status = true;
	}

	void empty() {
		status = false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if (!status) {
			//如果是空的进行垃圾回收
			System.out.println("空的,回收空间");
			super.finalize();
		}
	}
	
	public static void main(String[] args) {
		new Tank();
		new Tank().full();
		new Tank().empty();
		System.gc();
	}
}
