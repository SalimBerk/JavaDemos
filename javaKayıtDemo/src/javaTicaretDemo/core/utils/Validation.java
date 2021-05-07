package javaTicaretDemo.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static boolean validateEmail(String email) {
		String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(emailPattern , Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(email);
	    
	    return matcher.find();
	}

}
