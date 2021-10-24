package oops;
//Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods
//as abstract methods create another class smart telephone and demonstrate polymorphism

abstract class Telephone {
 abstract void lift();
 abstract void disconnected();
}

public class SmartTelephone extends Telephone {

	public void lift(){
        System.out.println("Phone is lifted...");
    }
    public void disconnected(){
        System.out.println("Phone is disconnected...");
    }
    
	public static void main(String[] args) {
		Telephone tel = new SmartTelephone();
        tel.lift();
        tel.disconnected();

	}

}
