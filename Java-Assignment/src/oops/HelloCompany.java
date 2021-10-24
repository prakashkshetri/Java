package oops;


abstract class MNC {			// parent 

    MNC() {						
        String detail="parent";
        System.out.println("Company detail is: "+ detail);
    }

    abstract public void admin();
    abstract public void hr();

    void housekeeping(){			// normal method
        System.out.println("House keeping department of MNC company");
    }
}

abstract class Infosis extends MNC {		// abstract child class

    public void admin() {
        System.out.println("Admin department of Infosis");
    }
}


public class HelloCompany extends Infosis{

	public void admin() {
//      super.admin();
      System.out.println("Admin department of Hello");
  }
  public void hr() {
      System.out.println("HR department of Hello");
  }

  public void myMethod(){
   	// calling implemented abstract methods within normal method in same class
	  admin();
	  hr();
	  System.out.println("Inside Normal Method...");
  }
	
	
	public static void main(String[] args) {
		MNC hi = new HelloCompany();		// dynamic polymorphism
	    hi.admin();
	    hi.hr();
	    hi.housekeeping();
	    new HelloCompany().myMethod(); // shorthand method to display methods of a class.

	}

}
