package com.flm.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsPractice {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(null);
		set.add(null);
		System.out.println(set);
		for(Integer num: set) {
			System.out.println(num);
		}
		System.out.println("==============");
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(null);
		set2.add(10);
		set2.add(null);
		System.out.println(set2);
		System.out.println("==============");
		TreeSet<Integer> set3=new TreeSet<Integer>();
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(10);
		System.out.println(set3);
	}
}
