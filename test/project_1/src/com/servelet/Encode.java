package com.servelet;

import java.io.UnsupportedEncodingException;

/**
 * Title: Encode.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2017年8月25日 下午2:42:35 <br>
 *
 * @author gaoxing
 */
public class Encode {
	
		private static String charsetISO8859 = "ISO-8859-1";
		private static String charsetUTF8 = "UTF-8";
		private static String charsetGBK = "GBK";
		private static String charsetGB2312 = "GB2312";
		private static String charsetUTF16 = "UTF-16";
		
		public static void main(String[] args) throws UnsupportedEncodingException {
			String taobao = "淘宝";
			System.out.println("ISO-8859-1编码,ISO-8859-1解码:"+ new String(taobao.getBytes(charsetISO8859),charsetISO8859));
			System.out.println("ISO-8859-1编码,UTF-8解码:"+new String(taobao.getBytes(charsetISO8859),charsetUTF8));
			System.out.println("ISO-8859-1编码,gbk解码:"+new String(taobao.getBytes(charsetISO8859),charsetGBK));
			System.out.println("ISO-8859-1编码,GB2312解码:"+new String(taobao.getBytes(charsetISO8859),charsetGB2312));
			System.out.println("ISO-8859-1编码,UTF-16解码:"+new String(taobao.getBytes(charsetISO8859),charsetUTF16));
			System.out.println("utf-8编码,utf-8解码:"+new String(taobao.getBytes(charsetUTF8),charsetUTF8));
			System.out.println("utf-8编码,ISO-8859-1解码:"+new String(taobao.getBytes(charsetUTF8),charsetISO8859));
			System.out.println("utf-8编码,gbk解码:"+new String(taobao.getBytes(charsetUTF8),charsetGBK));
			System.out.println("utf-8编码,gb2312解码:"+new String(taobao.getBytes(charsetUTF8),charsetGB2312));
			System.out.println("utf-8编码,utf-16解码:"+new String(taobao.getBytes(charsetUTF8),charsetUTF16));
			System.out.println("gbk编码,utf-8解码:"+new String(taobao.getBytes(charsetGBK),charsetUTF8));
			System.out.println("gbk编码,utf-16解码:"+new String(taobao.getBytes(charsetGBK),charsetISO8859));
			System.out.println("gbk编码,gbk解码:"+new String(taobao.getBytes(charsetGBK),charsetGBK));
			System.out.println("gbk编码,gb2312解码:"+new String(taobao.getBytes(charsetGBK),charsetGB2312));
			System.out.println("gbk编码,utf-16解码:"+new String(taobao.getBytes(charsetGBK),charsetUTF16));
			System.out.println("gb2312编码,utf-8解码:"+new String(taobao.getBytes(charsetGB2312),charsetUTF8));
			System.out.println("gb2312编码,iso-8859-1解码:"+new String(taobao.getBytes(charsetGB2312),charsetISO8859));
			System.out.println("gb2312编码,gbk解码:"+new String(taobao.getBytes(charsetGB2312),charsetGBK));
			System.out.println("gb2312编码,gb2312解码:"+new String(taobao.getBytes(charsetGB2312),charsetGB2312));
			System.out.println("gb2312编码,utf-16解码:"+new String(taobao.getBytes(charsetGB2312),charsetUTF16));
			System.out.println("utf-16编码,utf-8解码:"+new String(taobao.getBytes(charsetUTF16),charsetUTF8));
			System.out.println("utf-16编码,iso-8859-1解码:"+new String(taobao.getBytes(charsetUTF16),charsetISO8859));
			System.out.println("utf-16编码,gbk解码:"+new String(taobao.getBytes(charsetUTF16),charsetGBK));
			System.out.println("utf-16编码,gb2312解码:"+new String(taobao.getBytes(charsetUTF16),charsetGB2312));
			System.out.println("utf-16编码,utf-16解码:"+new String(taobao.getBytes(charsetUTF16),charsetUTF16));
			
		}
		
}
