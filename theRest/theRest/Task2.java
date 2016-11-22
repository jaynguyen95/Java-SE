import java.util.*;
import java.util.Scanner;

public class Task2
{
	public static void main(String[] args)
	{
		System.out.println("How many lines do you want to print?");
		Scanner s = new Scanner(System.in);
		int userInput = s.nextInt();

		String star = "";
		for (int i=0; i<userInput; i++)
		{
			star+="*";
			System.out.println(star);
		}
	}

}