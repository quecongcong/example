package controlprocedure;

/**
 * Title: Exercises.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月5日 上午11:25:43 <br>
 *
 * @author gaoxing
 */
public class Exercises {
	static void test8(int key) {
		switch (key) {
		case 0:
			System.out.println("case 0 ");
			// break;
		case 1:
			System.out.println("case 1");
			// break;
		case 2:
			System.out.println("case 2");
			// break;
		default:
			System.out.println("default");
			// break;
		}
	}

	static void test9(int testval) {
		if (testval > 0) {
			int[] fibonacci = new int[testval];
			fibonacci[0] = 1;
			System.out.print(fibonacci[0] + " ");
			if (testval > 1) {
				fibonacci[1] = 1;
				System.out.print(fibonacci[1] + " ");
			}
			if (testval > 2) {
				for (int i = 2; i < testval; i++) {
					fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
					System.out.print(fibonacci[i] + " ");
				}
			}
		}
		System.out.println();
	}

	static void test10() {
		System.out.print("四位数吸血鬼数字:");
		for (int digit = 1000; digit < 10000; digit++) {
			if (digit % 100 == 0) {
				continue;// 末位连着两个零的数字直接跳过
			}
			if (f(digit)) {
				System.out.print(digit + " ");
			}
		}
	}

	static boolean f(int digit) {
		int thousandDigit = digit / 1000;// 千位
		int hundredDigit = digit % 1000 / 100;// 百位
		int tenDigit = digit % 100 / 10;// 十位
		int singelDigit = digit % 10;// 个位
		if (f(thousandDigit, hundredDigit, tenDigit, singelDigit, digit)) {
			return true;
		}else if (f(thousandDigit, tenDigit, hundredDigit, singelDigit, digit)) {
			return true;
		}else if (f(thousandDigit, singelDigit, hundredDigit, tenDigit, digit)) {
			return true;
		}
		return false;
	}

	static boolean f(int a, int b, int c, int d, int digit) {
		int x1 = a * 10 + b, x2 = b * 10 + a;
		int y1 = c * 10 + d, y2 = d * 10 + c;
		if (f(x1, y1, digit) || f(x1, y2, digit) || f(x2, y1, digit) || f(x2, y2, digit)) {
			return true;
		}
		return false;
	}

	static boolean f(int a, int b, int digit) {
		if (a * b == digit) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			test8(i);
		}
		test9(10);
		System.out.println(2210 % 1000 / 100);
		test10();
		System.out.println(Integer.toBinaryString(-2147483648));
	}
}
