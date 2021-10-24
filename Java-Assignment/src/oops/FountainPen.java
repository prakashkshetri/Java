package oops;
	//	1) Create an abstract class pen with methods write () and refill () 
	//	as abstract methods 
	//	2) Use the pen class from Q1 to create a concrete class fountain pen
	//	with additional method change Nib ()

abstract class pen{
    abstract void write();
    abstract void refill();
}

public class FountainPen extends pen {
   void write(){
       System.out.println("Writing..");
   }
   void refill(){
       System.out.println("Refilling..");
   }
    void changeNib(){
        System.out.println("Changing Nib...");
    }
    
	public static void main(String[] args) {
		pen p = new FountainPen();
        p.write();
        p.refill();
        new FountainPen().changeNib();
	}

}
