package Java_Package1;

public class ClassP {

	public static void main(String[] args) {
		new ClassM().methodPublic();
		new ClassM().methodDefault();
		new ClassM().methodProtected();
	}
	
	public void methodPublic() {
		System.out.println("Calling ClassP Public Method...");
	}
	
	void methodDefault() {
		System.out.println("Calling ClassP Default Method...");
	}
	
	private void methodPrivate() {
		System.out.println("Calling ClassP Private Method...");
	}
	
	protected void methodProtected() {
		methodPrivate();
		System.out.println("Calling ClassP Protected Method...");
	}

}
