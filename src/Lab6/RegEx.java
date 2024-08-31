//Viết các hàm để check String:
//- Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc
//biệt
//Ví dụ hợp lệ: 099145697413
//không hợp lệ: 09914569741a (chứa ký tự là chữ số)
//- Mật khẩu: có ít nhất 6 ký tự
//ví dụ hợp lệ: 123456
//không hợp lệ: 12345 (chứa 5 ký tự)
//- Email : cần có ký tự @ và dấu chấm (.)
//ví dụ hợp lệ: eric@hoidanit.com.vn
//không hợp lệ: abc#blabla (không chứa @ và dấu chấm)
//=============================================================================
//Write functions to check String:
//- ID number: only includes numeric characters, contains 12 characters, does not contain digits or special characters
//separate
//Valid example: 099145697413
//invalid: 09914569741a (contains alphanumeric characters)
//- Password: has at least 6 characters
//valid example: 123456
//invalid: 12345 (contains 5 characters)
//- Email: requires @ character and dot (.)
//valid example: eric@hoidanit.com.vn
//invalid: abc#blabla (does not contain @ and dots)
package Lab6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx {
	public static void main(String[] args) {
		//=====REGEX=======
		String idPattern = "\\d{12}";
		String passwordPattern = "\\w{6,}";
		String emailPattern = "^([\\w.-]+)@([A-Za-z0-9.-]+\\.[A-Za-z]{2,}$)";
		//=====String=======
		String ID = "123456789012";
		String password = "Haruto2804";
		String email = "baokhongwibu2005@gmail.com";
		//=====PATTERN=======
		Pattern idRegex = Pattern.compile (idPattern);
		Pattern passwordRegex = Pattern.compile(passwordPattern);
		Pattern emailRegex = Pattern.compile(emailPattern);	
		//=====MATCHER=======
		Matcher idMatcher = idRegex.matcher (ID);
		Matcher passwordMatcher = passwordRegex.matcher (password);
		Matcher emailMatcher = emailRegex.matcher (email);
		if (idMatcher.find() ) {
			System.out.println("Your ID number is: "+idMatcher.group());
		}else {
			System.out.println("ID is incorrect.");
		}
		if (passwordMatcher.find () ) {
			System.out.println("Your password is: "+passwordMatcher.group());
		}else {
			
			System.out.println("Password is incorrect.");
		}
		if (emailMatcher.find () ) {
			System.out.println("Your email is: "+emailMatcher.group());
		}else {
			
			System.out.println("Your email is incorrect.");
		}
		System.out.println("================Matcher Group================");
		System.out.println("Username: "+emailMatcher.group(1));
		System.out.println("Domain: "+emailMatcher.group(2));
		
	}
}
