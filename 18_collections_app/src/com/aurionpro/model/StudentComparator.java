package com.aurionpro.model;

import java.util.Comparator;

public class StudentComparator {
	public static class StudentSortByRollNumberComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			if(student1.getRollNumber()>student2.getRollNumber())
				return 1;
			if(student1.getRollNumber()<student2.getRollNumber())
				return -1;
			return 0;
		}

	}
	public static class StudentSortByNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			int comparator = student1.getName().compareTo(student2.getName());
			if(comparator>0)
				return 1;
			if(comparator<0)
				return -1;
			return 0;
		}

	}
	public static class StudentSortByPercentageComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			if(student1.getPercentage()>student2.getPercentage())
				return 1;
			if(student1.getPercentage()<student2.getPercentage())
				return -1;
			return 0;
		}
		

	}

}
