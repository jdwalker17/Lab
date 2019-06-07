package model;

public class CourseRecord {

	// attributes//

	public String courseTitle;
	public Faculty instructor; // this will store form the faculty class//
	public int mark;

	// constructor//

	public CourseRecord(String courseTitle, Faculty instructor, int mark) {

		this.courseTitle = courseTitle;
		this.instructor = instructor;
		this.mark = mark;

	}

	public CourseRecord(String courseTitle) {

		this.courseTitle = courseTitle;

	}

	public CourseRecord(String courseTitle, int mark) {

		this.courseTitle = courseTitle;
		this.mark = mark;

	}

	// accessor//

	public String getCourseTitle() {
		return courseTitle;
	}

	public Faculty getInstructor() {
		return instructor;
	}

	public int getMark() {
		
		
		return mark;
		
		
		
		
	}

	public String getDescription() {
		String desc = " ";
		if (this.instructor == null) {

			desc = "course: " + this.courseTitle + " with mark : " + this.mark + " has no instructor";

		} else {

			desc = "course: " + this.courseTitle + "(raw mark : " + this.mark + " and letter grade" + this.getLetterGrade() + ")"
					+ "has instructor: " + this.instructor.getDescription() + "\n";
		}
		return desc;
	}

	String getLetterGrade() {
		String lg = " ";

		if (this.mark >= 90) {
			lg = "A+";
		}

		else if (this.mark >= 80) {

			lg = "A";
		} else if (this.mark >= 70) {

			lg = "B";
		} else if (this.mark >= 60) {
			lg = "C";
		}

		else if (this.mark >= 50) {

			lg = "D";
		} else {

			lg = "F";
		}

		return lg;

	}

	// mutator//

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
	public void setMark(String courseTitle,int mark) {
		this.mark = mark;
	}

}
