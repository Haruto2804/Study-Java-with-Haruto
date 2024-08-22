package Lab2;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
//		Cho phương trình ax + b = 0
//				Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//				trên
//				Gợi ý:
//				- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//				- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//				- Còn lại: x = -b/a => thông báo x = ?
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cho phuong trinh bac nhat co dang: ax+b=0.");
		System.out.printf("Nhap a= ");
		int a = scanner.nextInt();
		System.out.printf("Nhap b= ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem!");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			float x = -b / a;
			System.out.println("Phuong trinh co nghiem x = " + x);
		}
		scanner.close ();

	}

}
