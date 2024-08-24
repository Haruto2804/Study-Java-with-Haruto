package Lab4;

public class Main {
	public static void main(String[] args) {
		Product2 pr = new Product2();
		pr.inputInfo();
		pr.outputInfo();
		System.out.println("The price after tax of this product is " + pr.getTaxPrice());

	}
}
