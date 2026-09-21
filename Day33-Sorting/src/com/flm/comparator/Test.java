package com.flm.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"pavan",87));
		studentList.add(new Student(2,"mouli",57));
		studentList.add(new Student(3,"gopla",77));
		System.out.println(studentList);
		Collections.sort(studentList,new IdComparator());
		System.out.println(studentList);
		Collections.sort(studentList,new MarksComparator());
		System.out.println(studentList);
	}
}
