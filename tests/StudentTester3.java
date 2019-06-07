package tests;

import model.CourseRecord;
import model.Student;

public class StudentTester3 {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Jeff");
		
		CourseRecord cr = new CourseRecord("1021");
		s1.addCourse(cr);
		
		System.out.println(s1.getDescription());
		
		s1.addCourse("2090");
		
		System.out.println(s1.getDescription());
		cr.setMark(79);
		s1.courses[1].setMark(60);
		
	}

}
