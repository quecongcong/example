package util;

/**
 * Title: Range.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月8日 下午3:40:29 <br>
 *
 * @author gaoxing
 */
public class Range {

	public static int[] range(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = i;
		}
		return result;
	}

	public static int[] range(int start, int end) {
		int sz = end - start;
		int[] result = new int[sz];
		for (int i = 0; i < sz; i++) {
			result[i] = start + i;
		}
		return result;
	}
	
	public static int[] range(int start,int end,int step) {
		int sz = (end - start)/step;
		int[] result = new int[sz];
		for (int i = 0; i < sz; i++) {
			result[i] = start + i*step;
		}
		return result;
	}
}
