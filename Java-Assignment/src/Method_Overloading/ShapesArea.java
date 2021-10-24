package Method_Overloading;

// -- Want to calculate the area of the different shapes - square, rectangle, circle
//1. create 4 constructors - default + three consutrctors for the shapes
//(using constructor overloading)
//2. create 3 methods for (square, rectangle, circle) display which will display
//the value of the area calculated
//3. calcuate the area of the rhombus and triangle using the method overaloding concept 

public class ShapesArea {
	int length;
	int width;
	float radius;
	
	ShapesArea(){
//	 length = 10;
//	 width = 5;
//	 radius = 4;
//	 int areaOfSquare = length*length;
//	 int areaOfRectangle = length*width;
//	 int areaOfCircle = (int)(3.14*radius*radius);
//	 System.out.println("Area of Square: "+ areaOfSquare);
//	 System.out.println("Area of Rectangle: "+ areaOfRectangle);
//	 System.out.println("Area of circle: "+ areaOfCircle);
	}
	
	ShapesArea(int length){
		this.length = length;
		
		System.out.println("Area of Square: "+ length*length);
	}
	ShapesArea(int length, int width){
		this.length = length;
		this.width = width;
		System.out.println("Area of Rectangle: "+ length*width);
	}
	ShapesArea(float rad){
		radius = rad;
		System.out.println("Area of circle: "+ (3.14*radius*radius));
	}
	
	static void areaOfShapes(int len) {
		System.out.println("Area of Square :" + len * len);
		
	}
	static void areaOfShapes(double dia1, double dia2) {
		System.out.println("Area of Rhosmbus :"+ 0.5*dia1*dia2);
	}
	static void areaOfShapes(int len, int wid) {
		System.out.println("Area of Rectangle :"+ len * wid);
	}
	static void areaOfShapes(float rad) {
		System.out.println("Area of Circle :"+ 3.14*rad*rad);
	}
	static void areaOfShapes(float height, float base ) {
		System.out.println("Area of Triangle :"+ 0.5*height*base);
	}
	

	
	
	public static void main(String[] args) {
//		ShapesArea sa = new ShapesArea();
		ShapesArea sa1 = new ShapesArea(5);
		ShapesArea sa2 = new ShapesArea(20, 10);
		ShapesArea sa3 = new ShapesArea(6f);
		
		System.out.println("----------- Method Overloading ---------");
//	***************** Method Overload ******************
		areaOfShapes(5);
		areaOfShapes(5,10);
		areaOfShapes(5f);
		areaOfShapes(5f, 5f);
		areaOfShapes(5d, 5d);	
	}
}
