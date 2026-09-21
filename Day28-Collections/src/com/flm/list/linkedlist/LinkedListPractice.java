package com.flm.list.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);
		li.addFirst(5);
		li.addLast(35);
		System.out.println(li);
		System.out.println(li.removeFirst());
		System.out.println(li);
	}
}
