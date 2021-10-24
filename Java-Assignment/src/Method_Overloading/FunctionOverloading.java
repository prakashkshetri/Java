package Method_Overloading;

//	create three function in class
//   1). 	- create Method of return type int
//			-	add two numbers

//	 2). 	- create Method of return type float
//			-	calculate the area of the circle

//	3). 	- create method of return type int
//			- calculate the area of the rectangle


public class FunctionOverloading {

//	********************** Method of return type integer ***********************
	public int calculate(int num1, int num2) {
		return num1+num2;
	}
//	********************** Method of return type float ***********************
	public float calculate(float radius) {
		return (3.14f*radius*radius);
	}
//	********************** Method of return type Integer ***********************
	public int calculate(int length, long width) {
		return length*(int)(width);
	}
	
	public static void main(String[] args) {
		FunctionOverloading funcOver = new FunctionOverloading();
		System.out.println("Addition of Two Numbers :" + funcOver.calculate(111, 222));
		System.out.println("Area of Circle :" + funcOver.calculate(5));
		System.out.println("Area of Rectangle :" + funcOver.calculate(20, 10l));
	}

}
