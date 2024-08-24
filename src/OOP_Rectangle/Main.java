package OOP_Rectangle;

// No toString 24/8/2024
public class Main {
	public static void main(String[] args) {
		rectangle rec = new rectangle();
		rec.inputInfo();
		System.out.println("The length of rectangle is " + rec.getLength());
		System.out.println("The width of rectangle is " + rec.getWidth());
		System.out.println("The area of rectangle is " + rec.Area());
		System.out.println("The area of rectangle is " + rec.Perimeter());
	}

}
