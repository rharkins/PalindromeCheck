package PalindromeCheck.RichHarkins;

import java.lang.String;

public class PalindromeCheckLauncher {

	public static void main(String[] args) 
	{
		// Create a new PalindromeCheck object
		PalindromeCheck myPalindromeCheck = new PalindromeCheck();
		// Define the string to pass into the ValidatePalindrome function 
		String PotentialPalindromeString  = "A man, a plan, a canal, Panama!";
		// Call the ValidatePalindrome method, passing the string to be validated
		myPalindromeCheck.ValidatePalindrome(PotentialPalindromeString);
	}
}
