package innerclass;

/**
 * Title: Exercise26Class1.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月28日 下午3:40:03 <br>
 *
 * @author gaoxing
 */
public class Exercise26Class1 {
	private int a;

	public Exercise26Class1(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return a + "";
	}

	class Class1Inner {
		private int b;

		public Class1Inner(int b) {
			this.b = b;
		}

		@Override
		public String toString() {
			return b + "";
		}
	}
}
