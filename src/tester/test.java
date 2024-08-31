package tester;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class test {
	public static void main(String[] args)  {
		  String regex = "\\bcat\\b"; // Tìm từ "cat"
	        String input = "The cat sat on the mat";
	        String replacement = "uro";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        String result = matcher.replaceAll(replacement);
	        System.out.println(result);
	}
}
	
	      
