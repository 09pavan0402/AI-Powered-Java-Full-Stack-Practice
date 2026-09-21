package com.flm.list.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationPractice {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for(int i=0;i<list.size();i++) {
//			if(list.get(i) == 30) {
//				int index=list.indexOf(30);
//				list.remove(index);
//			}
			System.out.println(list.get(i));
		}
		System.out.println("==============");
		for(Integer num:list) {
//			if(num == 30) {
//				int index=list.indexOf(30);   
//				list.remove(index); //concurrent modification exception
//			}
			System.out.println(num);
		}
		System.out.println("==============");
		System.out.println("===Iterator====");
		Iterator<Integer> iterator= list.iterator();
		while(iterator.hasNext()) {
			int num=iterator.next();
			if(num == 30) {
				iterator.remove();
			}
			
		}
		System.out.println(list);
		System.out.println("===ListIterator====");
		list.add(2,30);
		ListIterator<Integer> iterator2= list.listIterator();
		
		System.out.println(list);
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
	}
}
