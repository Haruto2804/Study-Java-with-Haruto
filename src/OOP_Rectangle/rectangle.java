package OOP_Rectangle;

import java.util.Scanner;

//Viết chương trình tính diện tích, chu vi hình chữ nhật.
//Hãy viết lớp HinhChuNhat gồm có:
//• Attributes: chiều dài, chiều rộng.
//• Phương thức thiết lập (set), và lấy (get) thông tin chiều dài, chiều rộng.
//• Phương thức tính diện tích, chu vi.
//• Phương thức toString gồm các thông tin dài, rộng, diện tích, chu vi.
//Xây dựng lớp chứa hàm main cho phần kiểm nghiệm. Chiều dài và chiều
//rộng có thể nhập từ bàn phím
//*********************************************************************************
//Write a program to calculate the area and perimeter of an updated rectangle.
//Write a HinhChuNhat class that includes:
//^ Attributes: length, width.
//^ Set method and get length and width information.
//^ Method to calculate product and perimeter.
//^ The toString method includes length, width, area, and perimeter information.
//Construct a class containing the main function for section testing. Length and direction
//can be entered from the keyboard
public class rectangle {
	private int length;
	private int width;
	Scanner scanner = new Scanner(System.in);

	public void setLength(int length) {
		this.length = length;
	}

	rectangle() {

	}

	public rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void inputInfo() {
		System.out.print("Enter your length of rectangle: ");
		length = scanner.nextInt();
		System.out.print("Enter your width of rectangle: ");
		width = scanner.nextInt();
	}

	public int Area() {
		return length * width;
	}

	public int Perimeter() {
		return (length + width) * 2;
	}

}
