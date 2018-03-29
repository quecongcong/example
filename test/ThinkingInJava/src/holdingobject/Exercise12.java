package holdingobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Title: Exercise12.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月29日 下午1:48:56 <br>
 *
 * @author gaoxing
 */
public class Exercise12 {
	public static void print(List<Integer> list) {
		if (list != null && !list.isEmpty()) {
			for (Integer integer : list) {
				System.out.print(integer+",");
			}
		}
		System.out.println();
	}

	public static void addMiddle(LinkedList<Integer> linkedList, Integer... integers) {
		if (integers != null && integers.length > 0) {
			for (Integer integer : integers) {
				ListIterator<Integer> iterator = linkedList.listIterator();
				while (iterator.hasNext()) {
					iterator.next();
					int index = iterator.previousIndex() + 1;
					if (linkedList.size() / 2 == index || linkedList.size() == 1) {
						iterator.add(integer);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> list2 = new ArrayList<>(7);
		ListIterator<Integer> it = list1.listIterator(list1.size());
		while (it.hasPrevious()) {
			Integer integer = (Integer) it.previous();
			list2.add(integer);
		}
		print(list2);
		for (int i = list1.size() - 1; i >= 0; i--) {
			list2.add(list1.get(i));
		}
		print(list2);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		addMiddle(linkedList, 1,2,3,4,5,6);
		System.out.println("linklist:");
		print(linkedList);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
	}
}
