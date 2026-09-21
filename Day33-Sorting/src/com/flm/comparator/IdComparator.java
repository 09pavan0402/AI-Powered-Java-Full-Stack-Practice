package com.flm.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.stuId - student2.stuId;
	}

}
