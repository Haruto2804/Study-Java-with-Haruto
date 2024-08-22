package Lab2;

import java.util.Scanner;

public class Bai03 {
//	Viết chương trình tính số tiền điện (in kết quả ra console)
//	Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//	- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//	- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so dien da dung: ");
		int soDien = scanner.nextInt();
		int Giatien = 0;
		if (soDien <= 100) {
			Giatien = soDien * 1000;
			System.out.println("Gia tien cua thang nay la " + Giatien);
		} else if (soDien > 100) {
			Giatien = (100 * 1000) + (soDien - 100) * 1500;
			System.out.println("Gia tien cua thang nay la " + Giatien);
		}
		scanner.close ();
	}

}
