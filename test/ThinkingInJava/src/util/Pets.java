package util;

import java.util.ArrayList;
import java.util.List;

import holdingobject.Pet;

/**
 * Title: Pets.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月29日 上午11:34:36 <br>
 *
 * @author gaoxing
 */
public class Pets {
	public static List<Pet> arrayList(int size){
		return new ArrayList<Pet>(size);
	}
}
