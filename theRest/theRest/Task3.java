import java.util.*;
import java.util.Scanner;

public class Task3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Type a word or sentence that you want to reverse.");
		String string = s.nextLine();

		for (int i = string.length() - 1; i >= 0; i--)
		{
			System.out.println(string.charAt(i));
		}

	}
}