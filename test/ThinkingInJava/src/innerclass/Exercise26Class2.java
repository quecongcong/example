package innerclass;

import innerclass.Exercise26Class1.Class1Inner;

/**
 * Title: Exercise26Class2.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月28日 下午3:43:25 <br>
 *
 * @author gaoxing
 */
public class Exercise26Class2 {
	int a;

	class Class2Inner extends Class1Inner {
		public Class2Inner(Exercise26Class1 exercise26Class1, int b) {
			exercise26Class1.super(b);
		}

	}
}