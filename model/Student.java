package model;

public class Student {

	// each student may be enrolled in 5 courses as a max//

	public String name;
	public final int MAX_NUM_COURSES = 5;

	public CourseRecord[] courses; // courses[0] .... courses[courses.length-1] stores the address of the elements
									// of CourseRecord
	int noc; // represent num of courses and elements of the array//

	int totalStudents = 0;
	public final int MAX_NUM_STUDENTS = 100;
	public Student[] students;
	int nos;

	// constructor//

	public Student(String name) {

		this.name = name;
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc = 0;

	}

	// mutator//

	public void addCourse(CourseRecord c) {

		this.courses[this.noc] = c;
		this.noc++;
	}

	//with GP

	public void addCourse(String title) {

		CourseRecord c = new CourseRecord(title);
		this.addCourse(c);
		// this.courses[this.noc] = c;
		// this.noc++;

	}

	public void setMarks(String title, int mark) {

		int index = this.indexOf(title);

		if (index >= 0) {

			this.courses[index].setMark(mark);
		}

	}

	// accessors//

	public int getStudents() {
		int result = 0;

		return result;
	}

	public int getMarks(String title) {
		int mark = 0;

		int index = this.indexOf(title);

		if (index >= 0) {
			CourseRecord c = this.courses[index];
			mark = this.courses[index].getMark();
		}
		else {
			mark = -1;
		}

		return mark;
	}

	public int indexOf(String title) {

		int index = -1;
		boolean found = false;
		for (int i = 0; i < this.noc && !found; i++) {

			if (this.courses[i].getCourseTitle().equals(title)) {
				found = true;
				index = i;

			}

		}

		return index;
	}

	double getGPA() {
		double gpa = 0;
		double gp = 0;
		for (int i = 0; i < this.noc; i++) {

			String lg = this.courses[i].getLetterGrade();

			if (lg.equals("A+")) {

				gp += 9;
			}

			else if (lg.equals("A")) {

				gp += 8;
			}

			else if (lg.equals("B")) {

				gp += 7;
			}

			else if (lg.equals("C")) {

				gp += 6;
			} else if (lg.equals("D")) {

				gp += 5;
			}

			else {

				gp += 0;
			}
		}

		gpa = (gp / this.noc);

		return gpa;

	}

	public String getDescription() {
		String result = " ";
		result += "this student " + this.name + " has enrolled in: " + this.noc + " courses: (with GPA " + this.getGPA()
				+ ")" + ":\n";

		for (int i = 0; i < this.noc; i++) {

			result += this.courses[i].getDescription() + "\n";
		}

		return result;

	}

}
