import java.util.Scanner;

public class StringManipulationPactice {

	public static void main(String[] args) {
		//Primitive types (data only) int,float,boolean (lowercase)
		//String is a method type
		
		String s1 = "Fife";
		String s2 = "College";
		Scanner console = new Scanner(System.in);
		// the + operator (concatenation)
		String s3 = s1 + " " + s2;
		
		System.out.println(s3);
		
		//Mixing strings and integers
		s3 = s1 + s2 + 2;
		System.out.println(s3); // 2 is inferred as being used as a String
		
		// the concat Method
		// s3 = s1.concat(s2);
		s3 = s1.concat(" ".concat(s2));
		System.out.println(s3);
		
		//Upper/lowercase conversion
		String name;
		System.out.println("Enter your name");
		name = console.nextLine();
		//Returns new String
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		//Original will be the same value
		System.out.println(name);
	}

}
