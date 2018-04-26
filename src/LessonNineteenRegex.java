import java.util.regex.*;

public class LessonNineteenRegex {

	public static void main(String[] args) {

		String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		//[A-F] Any characters you want
		//[0-9] Any characters you want
		//[^A-G] An characters not A-G
		// \\s Will match white space
		// \\S Will match anything that is not whitespace
		// {n,m} Will match ranges
		
		//Find a word that is 2 to 20 characters in length
		//[A-Za-z]{2,20} \\w{2,20}
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		//Zip Code 5 digits long
		
		regexChecker("\\s\\d{5}\\s", longString);
		
		//2 characters that start with a C or A
		
		regexChecker("A[KLRZ]|C[AOT]", longString);
		
		//String that contains 1 or more character
		regexChecker("(\\{{1,})", strangeString);
		
		//Search for email address
		regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);
		
		//Phone number search 412-555-1234 412 555-1234
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		
		regexReplace(longString);
		
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		//Patter to search
		Pattern checkRegex = Pattern.compile(theRegex);
		//Outputs matches found
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		//While matches found
		while (regexMatcher.find()) {
			if(regexMatcher.group().length()!=0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index: "+regexMatcher.start());
			System.out.println("End index: "+regexMatcher.end());
		}
	}
	
	/**
	 * Adds a comma to all spaces
	 * @param str2Replace
	 */
	public static void regexReplace(String str2Replace) {
		
		Pattern replace = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
	}

	
	
	
	
	
}
