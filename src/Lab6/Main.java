package Lab6;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Student stu = new Student ();
		stu.ID_and_Password();//username: haruto2804 and password > 6 characters
		Student stu1 = new Student ("Eimi Fukuda","DH52300932");
		Student stu2 = new Student ("Yua Mikami","DH59588479");
		Student stu3 = new Student ("Karen Kaede","DH59359235");
		Student stu4 = new Student ("Kana Momonogi","DH99923323");
		Student stu5 = new Student ("Minami Aizawa","DH234502314");
		Student stu6 = new Student ("Haruto Ngo","DH66699969");
		ArrayList <Student> listOfStudents = new ArrayList <Student> ();
		listOfStudents.add(stu1);
		listOfStudents.add(stu2);
		listOfStudents.add(stu3);
		listOfStudents.add(stu4);
		listOfStudents.add(stu5);
		listOfStudents.add(stu6);
		System.out.print("Enter the first name that you want to find: ");
		String firstname = scanner.nextLine ();
		boolean found=false;
		for (int i=0;i<listOfStudents.size();i++) {
			if (listOfStudents.get(i).getName().startsWith(firstname)) {
				System.out.println("Start with "+firstname+": "+listOfStudents.get(i));
				found = true;
			}
		}
		if (!found) {
			System.out.println("There are no valid student in the list, try again!");
		
		
	}
		scanner.close ();
		
}
}
