package Method_Overloading;

//Assignment 3: create the 4 student objects with name s1,s2,s3,s4
//- declare the class member variables with String name, int age, section(char type),
//gender (char type), and three int subject marks (subject1, subject 2, subject 3). 
//
//Calcuate the total marks and percentage obtained by every student 
//(total= subject 1 + subject 2+ subject 3) by passing the values from the parameterized constructor.
//and for s2 and s3 stduents we will not pass subject 1 marks so it is 0 
//so dont pass it in constructor.

public class ConstructorOverloading {
	String name;
	int age, sub1, sub2, sub3;
	char section, gender;
	
	ConstructorOverloading(String name, int age, char section, char gender, int sub1, int sub2, int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		

	}
	ConstructorOverloading(String name, int age, char section, char gender, int sub2, int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
		
	}
	void display() {
		System.out.println("Name of Student: "+ name);
		System.out.println("Student's Age: "+ age);
		System.out.println("Section: "+ section);
		System.out.println("Gender: "+ gender);
		System.out.println("Total Marks Obtained: "+ sub1 + sub2 + sub3);
		System.out.println("Percentage:  "+ ((float)(sub1 + sub2 + sub3)/300)*100);
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloading s1 = new ConstructorOverloading("John", 15, 'A', 'M', 54, 65, 76);
		
		ConstructorOverloading s2 = new ConstructorOverloading("Diva", 16, 'B', 'F', 64, 54);
		
		ConstructorOverloading s3 = new ConstructorOverloading("Jack", 15, 'A', 'M', 65, 76);
		
		ConstructorOverloading s4 = new ConstructorOverloading("Jenne", 17, 'C', 'F', 45, 50, 46);
		s1.display();
		System.out.println("---------------------------------------------");
		s2.display();
		System.out.println("---------------------------------------------");
		s3.display();
		System.out.println("---------------------------------------------");
		s4.display();
	}

}
