//Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa
//nhập và tính tổng của nó
//Gợi ý: sử dụng ArrayList<double> để lưu trữ
////nhập số lượng tùy thích
//While(true){
//Double x = scanner.nextDouble();
//list.add(x);
//sysout("Nhập thêm (Y/N))?
//if(scanner.nextLine().equals("N"){ // why using equals ?
//break;
//} }
//===================================================================
//Enter a list of double numbers with arbitrary quantities from the keyboard. Export a medium list
//Enter and calculate its total
//Suggestion: use ArrayList<double> for storage
////enter the desired quantity
//While(true){
//Double x = scanner.nextDouble();
//list.add(x);
//sysout("Enter more (Y/N))?
//if(scanner.nextLine().equals("N"){ // why using equals ?
//break;
//} }
//calculate sum = for loop
//tính tổng = vòng lặp for
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01_Cach1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> arrnumbers = new ArrayList<Double>();
		do {
			System.out.print("Enter the double number that you want to add: ");
			double num = scanner.nextDouble();
			arrnumbers.add(num);
			System.out.println("Continue? Y or N ??? ");
			String option = scanner.next();
			if (option.equalsIgnoreCase("N")) {
				break;
			}

		} while (true);
		System.out.println("Arr numbers: " + arrnumbers);

		scanner.close();
		int sum = 0;
		for (int i = 0; i < arrnumbers.size(); i++) {
			sum += arrnumbers.get(i);
		}
		System.out.println("Sum of array: " + sum);

	}
}
