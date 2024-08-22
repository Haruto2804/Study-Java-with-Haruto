package Lab1;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] agrs) {
//		Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//		In ra màn hình với định dạng:
//		<tên_sinh_viên> có điểm = <điểm>
//		Ví dụ: "Eric" có điểm = 9.6
//		<tên sinh viên>: Eric
//		<điểm> : 10
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap ten sinh vien: ");
		String name = scanner.nextLine();
		System.out.printf("Nhap tuoi cua sinh vien: ");
		int age = scanner.nextInt();
		System.out.println("Ten cua sinh vien la: " + name);
		System.out.println("Tuoi cua sinh vien la: " + age);
		scanner.close();

	}

}
