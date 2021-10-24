package Java_Package1;

public class ClassM {

	private int intValue = 12345;
	long longValue = 123456789l;
	protected float floatValue = 12345.12345f;
	
//	-------- public method --------
	public void methodPublic() {
		System.out.println("Calling ClassM Public Method...");
	}
	
//	-------- Default Method -------- 
	void methodDefault() {
		System.out.println("Calling ClassM Default Method");
	}
	
	private void methodPrivate() {
		System.out.println("Calling ClassM Private Method");
	}
	
	protected void methodProtected() {
		methodPrivate();
		System.out.println("Calling ClassM Protected Method");
		System.out.println("ClassM Private Integer Value: "+ intValue);
	}
	
}
