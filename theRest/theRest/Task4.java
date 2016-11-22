import java.util.Scanner;
import java.util.*;

public class Task4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type a word or sentence you want to reverse");
		String string = s.nextLine();

		StringBuilder sb = new StringBuilder(string).reverse();

		System.out.println(sb);
	}

}