package model;


public class StudentManagementSystem {
    
    //attributes//
    
    //int totalStudents = 0;
    public final int MAX_NUM_STUDENTS = 100;
    public Student[] students;
    int nos;
    
    //constructors//    
    public StudentManagementSystem() {
        this.students = new Student[MAX_NUM_STUDENTS];
        this.nos = 0;
    }
    //accessors//
    
    
    public String getDescription() {
        
        String result = "";
        
        if(this.nos==0) {
            
            result = "Student management system currently stores no students.\r\n" + 
                    "Size of SMS: 0";
            
        }
        
        
        else {
            
            result = "Student management system currently stores " + this.nos + " students:\n";
            		
            
          //  String result2 = "";
            for(int i=0;i<this.nos;i++) {
            	
            	result += students[i].getDescription();
            }
            
           
            
        }
        
        return result;
    }
    
    
    
    
    public Student[] getStudents() {

        //return this.students;
        Student[] result = new Student[this.nos];
        for(int i=0;i<this.nos;i++) {
            
            result[i] = this.students[i];
            
            
            
        }
    
        
        return result;
    }
    
    
    
    
    
    public int getMarks(String s,String t) {
        
        int result = -1;
        
        
        for(int i=0;i<this.nos;i++) {
            if(students[i].name.equals(s)) {
            
                result =    students[i].getMarks(t);
                break;
            
            }
            
            
            
        }
        
        
        return result;
    
    }
    
    
    
    
    
    
    public double getGPA(String s) {
         double result  = 0;
        
         
         
         
         
         
         
         int l =this.indexOf(s);
       result= this.students[l].getGPA();
        
        
        return result;
    }
    
    
    
    //mutators// 
    

    public void addStudent(Student s) {
        this.students[this.nos] = s;
        this.nos++;
    }
    
    
    public void addStudent(String s) {
        this.students[this.nos] = new Student(s);
        this.nos++;
        
        
        
    }
    
    public void addCourse(String s,CourseRecord c) {
        
        int l =this.indexOf(s);
        this.students[l].addCourse(c);
        
        
        
        
    }
    
    
    
    
    
    

    
    
    public void setMarks(String s,String t, int i) {
        
    	
    	
    	    	
    	
    	
    	
    	
        int l =this.indexOf(s);
        if (l>=0) {
        this.students[l].setMarks(t,i);
        
        
        }
        
        
    }
    
public int indexOf(String name) {
        
	// int index was originally -1//
        int index = -1;
        boolean found = false;
        for(int i=0; i<this.nos&&!found;i++) {
            
            if(this.students[i].name.equals(name)) {
                found = true;
                index = i;
                
                
            }
            
        }
        
        
        return index;
    }




}
