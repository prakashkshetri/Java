package oops;

class Teacher {
	 private String designation = "Teacher";
	 private String collegeName = "BeginnersBook";
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	 
}

public class SingleInheritance extends Teacher{      // inheriting parent"Teacher"

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		
        System.out.println(obj.getCollegeName());
        
        System.out.println(obj.getDesignation());
        
        obj.setCollegeName("SimpliLearn");           // setting new variable data
        System.out.println(obj.getCollegeName());	// getting the defined variable data
        
        obj.setDesignation("Instructor");
        System.out.println(obj.getDesignation());
	}

}
