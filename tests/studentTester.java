package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;

public class studentTester {

	public static void main(String[] args) {
		
		
		Faculty f1 = new Faculty("Jackie", "LAS560", 70310);
		
		CourseRecord cr1 = new CourseRecord("2030", f1, 78);
		CourseRecord cr2 = new CourseRecord("3310", f1, 54);
		
		Student s1 = new Student("Jeff");
		System.out.println(s1.getDescription());
		System.out.println("==after adding s1==");
		
		
		s1.addCourse(cr1);
		System.out.println(s1.getDescription());
		System.out.println("==after adding cr1==");
		
		
		s1.addCourse(cr2);
		System.out.println(s1.getDescription());
		System.out.println("==after adding cr2==");
		
		
	}

}
