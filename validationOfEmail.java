package searchElement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;  

public class validationOfEmail {
	private static final String regex="^(.+)@(.+)$";
	public static void main(String[] args) {
		List<String>emails=new ArrayList<String>();
		emails.add("asramohd@example.com");
		emails.add("asra.mohd@example.com");
		emails.add("asra.mohd@example.com");
		emails.add("asra,example.com");
		emails.add("mohd$example.com");
		emails.add("@example.me.org");
		Pattern pattern=Pattern.compile(regex);
		for(String value : emails) {
			Matcher matcher = pattern.matcher(value);
			System.out.println("the email address" +value+ "is"+(matcher.matches()? "valid" : "invalid"));
			
		}
		

	}

}
