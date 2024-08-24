//Bài 1:
//- Tạo class với yêu cầu ở trên, đặt tên là Product.java
//- khai báo các thuộc tính: name, price, tax
//- Tạo thêm 2 method cho class trên:
//+ nhapThongTin(): void (dùng để nhập thông tin object)
//+ xuatThongTin(): void (in ra thông tin object đã tạo)
//+ getTaxPrice(): double
//số tiền sau thuế = (tax/100)*price
//- tạo một hàm main riêng và chạy chương trình:
//=> sử dụng constructor
//+ getter/setter
//+ sử dụng keyword private
//==============================================================
//- Create a class with the above requirements, name it Product.java
//- declare attributes: name, price, tax
//- Create 2 more methods for the above class:
//+ inputInfo(): void (used to enter object information)
//+ outputInfo(): void (prints information about created object)
//+ getTaxPrice(): double ==>total amount = (tax/100)*price

//- create a separate main function and run the program:
//=> use constructor
//+ getter/setter
//+ use private keyword
package Lab4;

import java.util.Scanner;

public class Product2 {
	private String name;
	private double tax, price;
	Scanner scanner = new Scanner(System.in);

	public void inputInfo() {
		System.out.print("Please enter your product's name: ");
		name = scanner.nextLine();
		do {
			System.out.print("Please enter your product's price: ");
			price = scanner.nextInt();
			if (price < 0) {
				System.out.println("Your price of product is valid. Please try again!");
			}
		} while (price < 0);
		do {
			System.out.print("Please enter your product's tax: ");
			tax = scanner.nextInt();
			if (tax < 0) {
				System.out.println("Your tax of product is valid. Please try again!");
			}
		} while (tax < 0);

	}

	public void outputInfo() {
		System.out.println("Product: " + getName());
		System.out.println("Price: " + getPrice());
		System.out.println("Tax: " + getTax());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxPrice() {
		return ((100 + tax) / 100) * price;
	}

}
