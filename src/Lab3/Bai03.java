package Lab3;

import java.util.Scanner;

public class Bai03 {
	public static void Max(int a[], int n) {
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[max] > a[i] & a[max] == a[i]) {
				continue;
			} else {
				max = a[i];
			}
		}
		System.out.println("\nGia tri lon nhat trong mang la " + max);
	}

	public static void XuatMang(int a[], int n) {
		System.out.print("Mang sau khi sap xep:");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);
		}
	}

	public static void Sort(int a[], int n) {
		// tang dan hoac giam dan (a[i] < a[j])
		// co the dung Arrayrs.Sort de sap xep
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
//		Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//			- Sắp xếp và xuất mảng vừa nhập ra màn hình
//			- Xuất phần tử có giá trị nhỏ nhất
//			- Xuất phần tử có giá trị lớn nhất
//			Gợi ý:
//			- Sử dụng Arrays.sort
//			- Sử dụng Math.min, Math.max
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====Chuong trinh nhap vao mot mang so nguyen  bat ki=====");
		System.out.print("Moi ban nhap so luong phan tu mang: ");
		int n = scanner.nextInt();
		int a[];
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Moi ban nhap vao phan tu a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}
		Sort(a, n);
		XuatMang(a, n);
		Max(a, n);
		scanner.close();
	}
}
