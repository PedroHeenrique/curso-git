package estudos.java;

public class Heranca {

	double width;
	double height;

	void showDim() {
		System.out.println("With and are " + width + " and " + height);
	}

}

class Triangulo extends Heranca {

	String style;

	double area() {

		return (width * height) / 2;
		
	}
	
	void showStyle() {
		System.out.println("triangulo is " + style);
	}
}
