package innerclass;

import static util.Print.*;

/**
 * Title: Parcel8.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月20日 下午2:18:17 <br>
 *
 * @author gaoxing
 */
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			@Override
			public int value() {
				return super.value() * 47;
			}

			@Override
			public String toString() {
				return String.valueOf(value());
			}
		};
	}

	public static void main(String[] args) {
		Parcel8 parcel8 = new Parcel8();
		Wrapping wrapping = parcel8.wrapping(10);
		print(wrapping);
	}
}
