package Lab1;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
//		Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//		Tính toán và in ra console:
//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật
//		Gợi ý:
//		chu vi = (dài + rộng) x 2
//		diện tích = dài x rộng
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap chieu dai cua hinh chu nhat: ");
		int chieudai = scanner.nextInt();
		System.out.printf("Nhap chieu rong cua hinh chu nhat: ");
		int chieurong = scanner.nextInt();
		int chuvi = (chieudai + chieurong) * 2;
		int dientich = chieudai * chieurong;
		int canhnhonhat = Math.min(chieudai, chieurong);
		System.out.println("Chu vi cua hinh chu nhat la: " + chuvi);
		System.out.println("Dien tich cua hinh chu nhat la: " + dientich);
		System.out.println("Canh nho nhat cua hinh chu nhat la: " + canhnhonhat);
		scanner.close();
	}

}
