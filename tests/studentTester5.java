package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;
public class studentTester5 {

	public static void main(String[] args) {
		
		Faculty f1 = new Faculty("Jackie", "LAS250", 74310);
		
		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("3020");
		CourseRecord cr3 = new CourseRecord("4590");
		
		Student s1 = new Student("Jeff");
		
		cr1.setInstructor(f1);
		cr2.setInstructor(f1);
		cr3.setInstructor(f1);
		
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s1.addCourse(cr3);
		
		s1.setMarks("2030", 95);
		s1.setMarks("3020", 75);
		s1.setMarks("4590", 47);
		
		System.out.println(s1.getDescription());
		
		
		
		
	}

}