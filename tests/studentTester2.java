package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;
public class studentTester2 {

	public static void main(String[] args) {
		
	
		
		 Faculty f1 = new Faculty( "Jackie", "LAS045", 70310);
		 Faculty f2 = new Faculty( "Jon", "LAS300", 60310);
		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("3020");
		CourseRecord cr3 = new CourseRecord("4590");
		
		Student s1 = new Student("Jeff");
		
		Student s2 = new Student("Brian");
		
		
		//link from course obj to faculty obj//
		
		cr1.setInstructor(f2);
		cr2.setInstructor(f2);
		cr3.setInstructor(f1);
		
		//link from student obj to courserecord obj//
		
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
		
		
		
		System.out.println(s1.courses[0]==s2.courses[1]);
		System.out.println(s1.courses[1]==s2.courses[0]);
		System.out.println(s1.courses[2]==s2.courses[2]);
		System.out.println(s1.courses[0].instructor==s2.courses[0].instructor);
	}

}
