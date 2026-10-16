package com.flm.comparator;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.marks - student2.marks;
	}
}
