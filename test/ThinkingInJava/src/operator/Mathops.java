package operator;

import java.util.Random;

/**
 * Title: Mathops.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年2月28日 下午5:39:41 <br>
 *
 * @author gaoxing
 */
public class Mathops {
	public static void main(String[] args) {
		Random random = new Random(47);
		int i, j, k;
		j = random.nextInt(100) + 1;
		System.out.println("j:" + j);
		k = random.nextInt(100) + 1;
		System.out.println("k:" + k);
		i = j + k;
		System.out.println("j+k:" + i);
		i = j - k;
		System.out.println("j-k:" + i);
		i = j%k;
		System.out.println("j%k:" + i);
		j%=k;
		System.out.println("j%=k:"+j);
		System.out.println("j++:"+ j++);
		System.out.println("++i:"+ ++i);
		System.out.println("j:"+j);
		System.out.println("i:"+i);
	}
}
