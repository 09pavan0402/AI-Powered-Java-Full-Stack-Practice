package com.flm.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		Student st=new Student(101,"pavan",24);
		ArrayList li=new ArrayList();
		li.add(10);
		li.add(20);
		li.add(10);
		li.add("pavan");
		li.add(true);
		li.add(st);
		li.add(10);
//		li.add(1,20);
		System.out.println(li);
		System.out.println(li.get(0));
		Student student=(Student) li.get(5);
		System.out.println(student.getStudentName());
		System.out.println("----------------------------");
		ArrayList<Integer> li2=new ArrayList<Integer>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(1,30);
		System.out.println(li2);
		System.out.println("----------------------------");
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		list.add(1, 15);
		System.out.println(list);
		System.out.println(list.size());
		list.set(1, 18);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(20));
		System.out.println(list.indexOf(10));
		System.out.println(list.lastIndexOf(10));
		System.out.println(list.isEmpty());
		
		System.out.println("----------------------------");
		List<Integer> list2=new ArrayList<Integer>();
		list2.addAll(list);
		System.out.println(list2);
		list2.clear();
		System.out.println(list2);
	}
}
