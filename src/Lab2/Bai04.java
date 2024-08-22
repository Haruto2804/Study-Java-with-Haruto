package Lab2;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
//		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//		System.out.println("++ ----------------------------------------- ++");
//		System.out.println("| 1. Giải phương trình bậc nhất |");
//		System.out.println("| 2. Giải phương trình bậc hai |");
//		System.out.println("| 3. Tính số tiền điện |");
//		System.out.println("| 4. Kết thúc |");
//		System.out.println("++ ------------------ ++");
		System.out.println(">>LỰA CHỌN TÍNH NĂNG<<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| Nhập số bất kì để kết thúc chương trình! |");
		System.out.println("++ ----------------------------------------- ++");
		System.out.print("Hãy lựa chọn tính năng: ");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		switch (choose) {
		case 1: {
			float a, b;
			System.out.println("Bạn đã chọn chức năng giải phương trình bậc nhất!");
			System.out.println("Phương trình bậc nhất có dạng ax+b=0.");
			System.out.print("Mời bạn nhập a = ");
			a = scanner.nextInt();
			System.out.print("Mời bạn nhập b = ");
			b = scanner.nextInt();
			System.out.println("Phương trình bậc nhất " + a + "^2 + " + b + "x = 0 co dap an nhu sau...");
			if (a == 0 & b == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			} else if (a == 0 & b != 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else {
				float x = -b / a;
				System.out.println("Phương trình có nghiệm x = " + x);
			}

		}
			break;
		case 2: {
			System.out.println("Bạn đã chọn chức năng giải phương trình bậc hai!");
			System.out.println("Phương trình bậc hai có dạng ax^2+bx+c = 0");
			System.out.print("Mời bạn nhập a = ");
			int a = scanner.nextInt();
			System.out.print("Mời bạn nhập b = ");
			int b = scanner.nextInt();
			System.out.print("Mời bạn nhập c = ");
			int c = scanner.nextInt();
			System.out.println("Phương trình bậc hai: " + a + "x^2 + " + b + "x + " + c + " = 0 có đáp án như sau...");
			if (a == 0) {
				System.out.println("Đây không phải là phương trình bậc hai mà là phương trình bậc nhất. Vui lòng thử lại sau!");

			} else {
				double x1, x2;
				double delta = Math.pow(b, 2) - (4 * a * c);
				if (delta < 0) {
					System.out.println("Phương trình vô nghiệm!");
				} else if (delta == 0) {
					x1 = -b / (2 * a);
					System.out.printf("Phương trình có nghiệm kép x1=x2= %.3f", x1);
				} else {
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.printf("Phương trình có hai nghiệm phân biệt x1= %.3f và x2= %.3f", x1, x2);
				}
			}

		}
			break;
		case 3: {
			int Giatien = 0;
			System.out.println("Bạn đã chọn tính năng tính số tiền điện!");
			System.out.print("Mời bạn nhập số điện bạn đã dùng: ");
			int soDien = scanner.nextInt();
			System.out.print("Mời bạn nhập số tiền trên mỗi số điện (<=100): ");
			int soTien = scanner.nextInt();
			System.out.print("Mời bạn nhập số tiền trên mỗi số điện khi vượt quá mức cho phép (>100): ");
			int soTien2 = scanner.nextInt();
			if (soDien <= 100) {
				Giatien = soDien * soTien;
				System.out.println("Số tiền điện mà bạn cần phải trả trong tháng này là " + Giatien);
			} else {
				Giatien = (100 * soTien) + (soDien - 100) * soTien2;
				System.out.println("Số tiền điện mà bạn cần phải trả trong tháng này là " + Giatien);
			}

		}
			break;
		default: {
			System.out.println("Kết thúc chương trình!");
		}
		}
		scanner.close();

	}

}
