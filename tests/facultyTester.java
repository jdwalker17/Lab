package tests;

import model.Faculty;

public class facultyTester {

	public static void main(String[] args) {
		
		
		
		Faculty f1 = new Faculty("Jackie", "LAS2043", 70310);
		Faculty f2 = new Faculty("Jon", "LAS2045", 60311);
		
		System.out.println(f1==f2);
		
		
		System.out.println(f1.getDescription());
		System.out.println(f2.getDescription());
		
		
		
		//aliasing//
		// now if we test f1==f4 they will be equal//
		
		Faculty f4 = f1;
		
	}

}
