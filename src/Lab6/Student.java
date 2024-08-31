//Ví dụ 1: Nhập username và password từ bàn phím. Nếu username = "haruto2804" và
//password > 6 ký tự thì hợp lệ
//gợi ý: sử dụng equals để so sánh; length để check chiều dài
//Ví dụ 2: Ứng dụng quản lý sinh viên
//- Tạo class Student với thuộc tính name, id
//- Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
//eg: new Student("Nam", 1); new Student("Eric", 2);
//Yêu cầu: tìm và xuất ra:
//- các student có tên bắt đầu là "Miami"
//=======================================================================
//Example 1: Enter username and password from the keyboard. If username = "hoidanit" and
//password > 6 characters is valid
//hint: use equals to compare; length to check the length
//Example 2: Student management application
//- Create class Student with name and id attributes
//- In the main function, create 5 students with different names (using constructor)
//eg: new Student("Nam", 1); new Student("Eric", 2);
//Request: find and output:
//- students whose names start with "Minami"
package Lab6;

import java.util.Scanner;

public class Student {
	private String name;
	private String ID;
	private String username;
	private String password;
	String trim1,trim2; // trim2 is password and trim1 is username;
	Scanner scanner = new Scanner (System.in);
	Student () {
		
	}
	public Student (String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	
	
	public void ID_and_Password () {
		do {
			System.out.print("Username: ");
			username = scanner.nextLine ();
			System.out.print("Password: ");
			password = scanner.nextLine ();
			trim1 = username.trim ();
			trim2 = password.trim ();
			
			if (trim2.length() > 6  && trim1.equals("haruto2804") ) { //username: haruto, password > 6 characters
				System.out.println("You have logged into your account.");
				break;
			}
			else {
				System.out.println("Username or password is invalid, please try again.");
			}
			
		}while (true);
	}
	
	
	public String getUserName () {
		return username;
	}
	
	
	public void setUserName (String username) {
		this.username = username;
	}
	
	
	public String getPassword () {
		return password;
	}
	
	
	public void setPassword (String password) {
		this.password = password;
	}

	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getID() {
		return ID;
	}
	
	
	public void setID(String iD) {
		this.ID = ID;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + "]";
	}
	
	
}
