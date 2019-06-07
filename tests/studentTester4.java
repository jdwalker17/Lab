package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;
public class studentTester4 {

	public static void main(String[] args) {
		
	
		
		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("3020");
		CourseRecord cr3 = new CourseRecord("4590");
		
		Student s1 = new Student("Jeff");
		
		Student s2 = new Student("Brian");
		
		
		
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
		System.out.println(s1.getMarks("2030"));
		s1.setMarks("2030", 70);
		System.out.println(s1.getMarks("2030"));
		
		
	}

}
