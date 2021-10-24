package String;
//	Calculate the number of objects created inside the string pool and heap.
//	Also compare the below objects using the equals and ==
//	equals and ==
//	(1) o with l
//	(2) y with p
//	(3) t with o
//	(4) k with y
//	(5) p with y

public class StringPool {

	
	public static void main(String[] args) {
		String t= "Delhi";   
		String o = "Mumbai"; 
		String k= "delhi";   
		String y= new String ("Mumbai");   
		String l= new String ("delhi");  
		String p = new String("Hello"); 
		
		System.out.println("Number of obj. Created in String pool: "+ 4);
		System.out.println("Number of obj. Created in Heap : "+ 3);
		
//		************ compare using equals **************
//		*********** o with l ************
		System.out.println();  // for line break only
		if(o.equals(l)) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** y with p ************
		if(y.equals(p)) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** t with o ************
		if(t.equals(o)) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** k with y ************
		if(k.equals(y)) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** p with y ************
		if(p.equals(y)) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
		
		
//		************** compare using == **************
		
//		*********** o with l ************
		System.out.println(); 	// for line break only
		if(o == l) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** y with p ************
		if(y == p) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** t with o ************
		if(t == o) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** k with y ************
		if(k == y) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
//		*********** p with y ************
		if(p == y) {
			System.out.println("true...");
		}else {
			System.out.println("false...");
		}
		
//		

	}

}
