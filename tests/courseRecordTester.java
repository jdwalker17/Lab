package tests;
import model.CourseRecord;
import model.Faculty;
public class courseRecordTester {

	public static void main(String[] args) {
		
		Faculty f1 = new Faculty("Jackie", "LAS2043", 70310);
		Faculty f2 = new Faculty("Jon", "LAS2059", 69999);
		CourseRecord cr1 = new CourseRecord("EECS1021", f1, 78);
		CourseRecord cr2 = new CourseRecord("EECS3010");
		
		System.out.println(cr1.getDescription());
		
		
		
		System.out.println(cr2.getDescription());
		
		cr2.setInstructor(f1);
		
		System.out.println(cr1.getInstructor()==cr2.getInstructor());
		

	}

}
