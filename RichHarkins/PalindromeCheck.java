package PalindromeCheck.RichHarkins;

import java.lang.String;
import java.lang.Character;

public class PalindromeCheck {

	public void ValidatePalindrome(String PotentialPalindromeString)
	{
		String ConvertedToLowerCase = PotentialPalindromeString.toLowerCase();
		String NoSpaces = "";
		String NoSpacesReversed = "";
		//char PalindromeCharacter = ' ';
		//Character PotentialPalindromeCharacter = ' ';
		System.out.println(Character.isLetter('a'));

		for (int i = 0; i < PotentialPalindromeString.length(); i++)
		{
			//PalindromeCharacter = PotentialPalindromeString.charAt(i);
			System.out.println(PotentialPalindromeString.charAt(i));
			System.out.println(Character.isLetter(PotentialPalindromeString.charAt(i)));
			if (Character.isLetter(PotentialPalindromeString.charAt(i)) == true)
			{
				NoSpaces = NoSpaces + PotentialPalindromeString.charAt(i);
			}
		}
		NoSpaces = NoSpaces.toLowerCase();

		for (int j = NoSpaces.length() - 1; j >= 0; j--)
		{
			NoSpacesReversed = NoSpacesReversed + NoSpaces.charAt(j);
		}
		
		if (NoSpaces.equals(NoSpacesReversed))
		{
			System.out.println(NoSpaces + " = " + NoSpacesReversed + " and is a Palindrome");
		}
		else
		{
			System.out.println(NoSpaces + " != " + NoSpacesReversed + " and is not a Palindrome");
		}
		System.out.println(PotentialPalindromeString.charAt(3));
		System.out.println("PotentialPalindromeString = " + PotentialPalindromeString);
		System.out.println("PotentialPalindromeString length = " + PotentialPalindromeString.length());
		System.out.println("ConvertedToLowerCase = " + ConvertedToLowerCase);
		System.out.println("ConvertedToLowerCase length = " + ConvertedToLowerCase.length());
		System.out.println("NoSpaces = " + NoSpaces);
		System.out.println("NoSpaces length = " + NoSpaces.length());
		System.out.println("NoSpacesReversed = " + NoSpacesReversed);
		System.out.println("NoSpaces length = " + NoSpacesReversed.length());
	}
}
