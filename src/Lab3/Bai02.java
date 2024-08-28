package Lab3;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
//		Viết bảng cửu chương của 1 số nguyên bất kỳ
//		Gợi ý:
//		- Dùng vòng lặp từ 1 tới 10
//		sysout(" %d x %d = %d ", x, i, x*i
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====Chuong trinh viet bang cuu chuong=====");
		System.out.print("Moi ban nhap so nguyen bat ki de viet bang cuu chuong: ");
		int n = scanner.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
		scanner.close();

	}

}
