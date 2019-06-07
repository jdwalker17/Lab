package model;

public class Faculty {

	//each faculty member their name, address, and phone ext.
	
	
	
	//attributes//
	
	public String name;
	public String address;
	public int extention;
	
	//constructor//
	public Faculty(String name, String address, int extention){
		
		this.name =name;
		this.address = address;
		this.extention = extention;
		
		
	}

	// Source, Generate getters and setters//
	
	// accessors//
	
	
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public int getExtention() {
		return extention;
	}

	public String getDescription(){
		
		String result = " ";
		
		result = "faculty "+ this.name + " has campus address " + this.address + "and extention " + this.extention;
		
		
		return result;
		
	}
	
	
	//mutators//
	
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setExtention(int extention) {
		this.extention = extention;
	}
	
	
	
}
