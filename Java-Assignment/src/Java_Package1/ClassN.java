package Java_Package1;

public class ClassN {

	protected long longValue = 987654321l;
	public int intValue = 54321;
	double dblValue = 987654321.987654d;
	
	public void methodPublic() {
		System.out.println("Calling ClassN Public Method...");
	}
	
	void methodDefault() {
		System.out.println("Calling ClassN Default Method");
	}
	
	private void methodPrivate() {
		System.out.println("Calling ClassN Private Method");
	}
	
	protected void methodProtected() {
		methodPrivate();
		System.out.println("Calling ClassN Protected MethodS");
	}
	
}

