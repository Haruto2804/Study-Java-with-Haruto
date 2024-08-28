package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01_Cach2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> arrNumber = new ArrayList<Double>();
		while (true) {
			System.out.print("Enter your double number: ");
			double input = scanner.nextDouble();
			arrNumber.add(input);
			scanner.nextLine();
			System.out.print("Continue? Y or N???");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("Arr numbers: " + arrNumber);

		scanner.close();
		int sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}
		System.out.println("Sum of array: " + sum);

	}

}
