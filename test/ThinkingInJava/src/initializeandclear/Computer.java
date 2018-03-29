package initializeandclear;

/**
 * Title: Book.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月6日 下午2:42:48 <br>
 *
 * @author gaoxing
 */
public class Computer {
	
	boolean open;
	
	public Computer(boolean open) {
		this.open = open;//新建电脑对象默认是被打开状态
	}
	void close(){
		this.open = false;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if (this.open) {//终结条件
			System.out.println("电脑没有关闭!");
			super.finalize();
		}
	}
	
	public static void main(String[] args) {
		Computer computer1 = new Computer(true);
		computer1.close();
		new Computer(true).close();
		System.gc();
	}
}
