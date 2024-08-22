package Lab1;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[]  args) {
//		Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//		Tính và xuất ra thể tích của hình lập phương.
//		Gợi ý:
//		thể tích = cạnh x cạnh x cạnh = cạnh^3 = Math.pow(canh, 3)
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap canh cua khoi lap phuong: ");
		int canh = scanner.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("The tich cua hinh lap phuong la: " + thetich);
		scanner.close();
	}

}
