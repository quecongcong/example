package com.algorithm;

import java.util.Random;

/**
 * Title: BubbleSort.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2017年7月21日 下午3:56:32 <br>
 *
 * @author gaoxing
 */
public class BubbleSort {
	private int[] array;
	private int[] afterSortArray;
	
	public void setArray(int[]array) {
		this.array = array;
	}
	public int[] getAfterSortArray() {
		return this.array;
	}
	public void setAfterSortArray(int[]afterSortArray) {
		this.afterSortArray = afterSortArray;
	}
	public int[] getArray() {
		return this.afterSortArray;
	}
	
	public BubbleSort(int[]array) {
		this.array = array;
		this.afterSortArray = array;
	}
	
	public void bubbleSort() {
		long startTime = System.currentTimeMillis();
		System.out.println("开始冒泡排序");
		for (int i = 0; i < afterSortArray.length; i++) {
			for (int j = 0; j < afterSortArray.length-i-1; j++) {
				if (afterSortArray[j]>afterSortArray[j+1]) {
					swap(j,j+1,afterSortArray);
				}
			}
		}
		System.out.println("用时:"+(System.currentTimeMillis()-startTime));
	}
	
	public void print() {
		for (int i : array) {
			System.out.print(i+",");
		}
		System.out.println();
		for (int i : afterSortArray) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	
	public void swap(int a,int b,int []array) {
		int middle;
		middle = array[a] ;
		array[a] = array[b];
		array[b] = middle;
	}
	
	public void proveSort() {
		long startTime = System.currentTimeMillis();
		System.out.println("开始冒泡排序改进版");
		int i = afterSortArray.length-1;
		while (i>0) {
			int pos = 0;
			for (int j = 0; j < i; j++) {
				if (afterSortArray[j]>afterSortArray[j+1]) {
					swap(j, j+1, afterSortArray);
					pos = j;
				}
			}
			i = pos;
		}
		System.out.println("用时:"+(System.currentTimeMillis()-startTime));
	}
	
	public static void main(String[] args) {
		int[] array = new int[500];
		 for (int i = 0; i < 500; i++) {
			Random random = new Random();
			array[i] = random.nextInt(100000);
//			array[i] =i;
		}
		BubbleSort bubbleSort = new BubbleSort(array);
		bubbleSort.proveSort();
		bubbleSort.bubbleSort();
		bubbleSort.print();
		QuickSort quickSort = new QuickSort();
		System.out.println("快速排序开始:");
		long startTime = System.currentTimeMillis();
		quickSort.sort(array, 0, array.length-1);
		System.out.println("排序结束,用时:"+(System.currentTimeMillis()-startTime));
	}
}

/**
 * 快速排序,快速排序的平均效率比较高
 * @author Administrator
 *
 */
class QuickSort{
	 void swap(int[] array,int i,int j){
		 int pos = 0;
		 pos = array[i];
		 array[i] = array[j];
		 array[j] =pos;
	 }
	 
	 int partition(int array[],int low,int high){
		 int privotkey = array[low];
		 while (low<high) {
			while (low < high && array[high] >= privotkey) {
				high --;
			}
			swap(array, low, high);
			while (low < high && array[low] <= privotkey) {
				low ++;
			}
			swap(array, low, high);
		}
		 return low;
	 }
	 
	 void sort(int[]array,int low,int high){
		 if (low<high) {
			 int pos = partition(array,low, high);
			 sort(array, low, pos-1);
			 sort(array, pos+1, high);
		}
	 }
	 public static void main(String[] args) {
		 int[] array = new int[500];
		 for (int i = 0; i < 500; i++) {
			 Random random = new Random();
			array[i] = random.nextInt(1000000);
		}
		 QuickSort quickSort = new QuickSort();
		 System.out.println("快速排序开始:");
		 long startTime = System.currentTimeMillis();
		 quickSort.sort(array, 0, array.length-1);
		 System.out.println("排序结束,用时:"+(System.currentTimeMillis()-startTime));
		 for (int i : array) {
			System.out.print(i+" ");
		}
	 }
}
