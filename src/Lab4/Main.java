package Lab4;

public class Main {
	public static void main(String[] args) {
		Product2 pr1 = new Product2();
		pr1.inputInfo();
		pr1.outputInfo();
		System.out.println("The price after tax of this product is " + pr1.getTaxPrice());

	}
}
