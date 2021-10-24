package Java_Package2;

import Java_Package1.ClassM;
import Java_Package1.ClassN;

public class ClassY extends ClassN{

	public static void main(String[] args) {
		new ClassX().methodPublic();
		System.out.println("ClassX Float Variable Value: "+ new ClassX().floatValue);
		System.out.println("ClassX Long Variable Value: "+ new ClassX().longValue);
		System.out.println("ClassX Char Variable Value: "+ new ClassX().charValue);

//		--------- Calling ClassM Method -----------
		new ClassM().methodPublic();
		
//		---------- Calling ClassN Method --------
		new ClassN().methodPublic();
	}

}
