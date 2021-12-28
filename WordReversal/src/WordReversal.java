import java.util.*;
public class WordReversal {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Type a word to reverse: ");
		String word = input.nextLine();
		System.out.println("Is this your word: \"" + word + "\"? If so, please answer yes or no:");
		String answer = input.nextLine();
		input.close();
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Good, the program will output its results below");
			int wordLength = word.length();
			char[] wordArray = word.toCharArray();
			for (int i = wordLength; i > 0; i--)
			{
				System.out.print(wordArray[i-1]);
			}
		}
		else
		{
			System.out.println("Run the program again");
		}	
	}

}


