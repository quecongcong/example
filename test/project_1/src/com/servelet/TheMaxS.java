package com.servelet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Title: TheMaxS.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2017年11月23日 下午2:58:53 <br>
 *
 * @author gaoxing
 */
public class TheMaxS {

	public static void main(String[] args) {
		int m1 = 0, n1 = 0, m2 = 0, n2 = 0;
		Point p1 = new Point(m1, n1);
		Point p2 = new Point(m2, n2);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(1, 2);
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Integer iteratorNum = iterator.next();
			arrayList.indexOf(1);
		}
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "0");
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Iterator<Integer> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer key = (Integer) keyIterator.next();
			System.out.println(map.get(key));
		}
		int length = arrayList.size();
		System.out.println(length);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
	}
}