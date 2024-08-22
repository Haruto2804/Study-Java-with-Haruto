package Lab2;

import java.util.Scanner;

public class Bai02 {
//	Cho phương trình: ax^2 + bx + c = 0
//			Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//			trên
//			Gợi ý:
//			- Nếu a = 0 => làm tương tự ví dụ bài 1
//			- Nếu a # 0:
//			- Tính delta = b^2 - 4ac.
//			- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//			- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//			- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//			x1 = (-b + căn(delta))/(2*a)
//			x2 = (-b - căn(delta))/(2*a)
	public static void main(String[] args) {
		System.out.println("Cho phuong trinh bac hai ax^2+bx+c=0.");
		Scanner scanner = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.printf("Nhap vao bien a = ");
		a = scanner.nextInt();
		System.out.printf("Nhap vao bien b = ");
		b = scanner.nextInt();
		System.out.printf("Nhap vao bien c = ");
		c = scanner.nextInt();
		if (a == 0) {
			System.out.println("Khong phai phuong trinh bac hai! ");
		} else {
			delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.printf("Phuong trinh co nghiem kep x1=x2= %.3f", x1);
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có hai nghiệm phân biệt x1 = %.3f và x2 = %.3f", x1, x2);
			}
		}
		scanner.close();
	}

}
