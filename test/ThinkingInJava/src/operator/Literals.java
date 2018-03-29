package operator;

/**
 * Title: Literals.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月1日 上午10:29:03 <br>
 *
 * @author gaoxing
 */
public class Literals {
	public static void main(String[] args) {
		int i = 0x2f;
		int i0 = i;
		int length = 0;
		while(i0 > 0){
			i0 >>= 1;
			length++;
		}
		int mask = 0x80000000;
		System.out.println("mask:"+mask);
		System.out.println("i&mask:"+(i&mask));
		System.out.println("2>>1:"+(2>>1));
		System.out.println("转换为2进制有效数字位数:"+length);
		System.out.println(i>>>16);
//		System.out.println(i<<=16);
		i=i<<16;
		System.out.println(i);
		int i1 = 0x2f;
		System.out.println("十进制i1:"+i1);
		System.out.println("i1:"+Integer.toBinaryString(i1));
		int i2 = 0x2F;
		System.out.println("十进制i2:"+i2);
		System.out.println("i2:"+Integer.toBinaryString(i2));
		
		long j1 = 0xf;
		System.out.println("j1的2进制表示:"+Long.toBinaryString(j1));
		long j2 = 010;
		System.out.println("j2的2进制表示:"+Long.toBinaryString(j2));
		
		float f1 = 1e-43f;
		System.out.println("f1:"+f1);
		
		int maxHex = 0xaaaaaaaa;
		System.out.println("maxHex:"+Integer.toBinaryString(maxHex));
		
		//float和double的最大和最小
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		System.out.println("minFloat:"+minFloat);
		System.out.println("maxFloat:"+maxFloat);
		System.out.println("minDouble:"+minDouble);
		System.out.println("maxDouble:"+maxDouble);
		
	}
}
