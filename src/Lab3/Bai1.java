package Lab3;

import java.util.Scanner;

public class Bai1 {
	public static boolean SNT(int snt) {
		for (int i = 2; i < Math.sqrt(snt); i++) {
			if (snt % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả
		// số đấy là số
		// nguyên tố hay không ?
		// Gợi ý:
		// - Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
		// - Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số
		// nguyên tố
		// - Sử dụng toán tử % để biết có chia hết hay không ?
		//
		Scanner scanner = new Scanner(System.in);
		int snt;
		System.out.println("=======Chuong trinh kiem tra so nguyen to=======");
		do {
			System.out.print("Moi ban nhap vao mot so nguyen to: ");
			snt = scanner.nextInt();
			if (snt < 2) {
				System.out.println("So ban vua nhap khong phai la so nguyen to. Moi ban nhap lai:");
			}

		} while (snt < 2);
		if (SNT(snt)) {
			System.out.println(snt + " la so nguyen to.");
		} else {
			System.out.println(snt + " khong phai la so nguyen to.");
		}

		scanner.close();
	}

}
