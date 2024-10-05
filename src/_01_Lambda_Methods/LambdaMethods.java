package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String output = "";
			for(int i = s.length() - 1; i >= 0; i--)
			{
				output += s.charAt(i);
			}
			System.out.println(output);
		}, "reverse");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			Random rand = new Random();
			String output = "";
			for(int i = 0; i < s.length(); i++)
			{
				if (rand.nextBoolean())
				{
					output += Character.toUpperCase(s.charAt(i));
				}
				else
				{
					output += Character.toLowerCase(s.charAt(i));
				}
			}
			System.out.println(output);
		}, "Mixed Cases");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String output = "";
			for (int i = 0; i < s.length(); i++)
			{
				output += s.charAt(i) + (i < s.length() - 1 ? "." : "");
			}
			System.out.println(output);
		}, "Period between each character");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String regex = "[aeiou]";
			s = s.replaceAll(regex, "");
			System.out.println(s);
		}, "can you remove all vowels from a string");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
