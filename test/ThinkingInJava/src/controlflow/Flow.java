package controlflow;

import java.util.Random;

/**
 * Title: Flow.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月2日 下午5:04:20 <br>
 *
 * @author gaoxing
 */
public class Flow {
	/**
	 * 
	 * @Title: test1 @Description: TODO(打印1-100) @param 参数 @return void
	 *         返回类型 @throws
	 */
	static void test1() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	static void test2() {
		while (true) {
			Random random = new Random();
			int[] num = new int[25];
			for (int i = 0; i < num.length; i++) {
				int ran = random.nextInt();
				num[i] = ran;
			}
			for (int i = 0; i < num.length; i++) {
				if (i < num.length - 1) {
					if (num[i] > num[i + 1]) {
						System.out.println("num[" + i + "]" + "被分为大于类");
					} else if (num[i] < num[i + 1]) {
						System.out.println("num[" + i + "]" + "被分为小于类");
					} else {
						System.out.println("num[" + i + "]" + "被分为等于类");
					}
				}
			}
		}
	}

	/**
	 * 
	 * @Title: test3 @Description:(求目标数以内素数) @param @param critical @return
	 *         void @throws
	 */
	static void test3(int critical) {
		boolean flag = true;// 一个标识,默认是
		for (int i = 2; i < critical; i++) {
			for (int j = 2; j <= i; j++) {
				if (j != i && i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i + "是一个素数");
			}
			flag = true;
		}
	}

	static void test4() {
		for (int i = 0; i < 32; i++) {
			System.out.println();
		}
	}

	/**
	 * 
	 * @Title: test6 @Description:(判断testval在不在begin和end之间) @param @param
	 *         testval @param @param begin @param @param
	 *         end @param @return @return boolean @throws
	 */
	static boolean test6(int testval, int begin, int end) {
		if (testval >= begin && testval <= end) {
			return true;
		} else {
			return false;
		}
	}

	static void test7() {
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
			if (i == 99) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// System.out.println("test1完成");
		// test1();
		// System.out.println("test2完成");
		// test2();
		// test3(100);
		// test7();
		int i = 0;
		outer: for (; true;) {
			inner: for (; i < 10; i++) {
				if (i == 3) {
					System.out.println("i=" + i + ":break");
					i++;
					break;
				}
				if (i==6) {
					System.out.println("i=" + i + ":break inner");
					i++;
					break inner;
				}
				if (i == 7) {
					System.out.println("i=" + i + ":continue outer");
					i++;
					continue outer;
				}
				if (i == 8) {
					System.out.println("i=" + i + ":break outer");
					break outer;
				}
				for (int k = 0; k < 5; k++) {
					if (k == 3) {
						System.out.println("i=" + i +",k="+k+ ":continue inner");
						continue inner;
					}
				}
			}
		}
	}
}
