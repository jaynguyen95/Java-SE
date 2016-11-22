import java.util.*;

public class PascalsTriangle {

public static void print(int n) {
for (int i = 0; i < n; i++) {
for (int j = 0; j <= i; j++) {
System.out.print(pascal(i, j) + " ");
}
System.out.println();
}
}

public static int pascal(int i, int j) {
if (j == 0) {
return 1;
} else if (j == i) {
return 1;
} else {
return pascal(i - 1, j - 1) + pascal(i - 1, j);
}

}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
int row = scanner.nextInt();
print(row);
}
}

/*public class PascalsTriangle
{
	public int answer = 0;

	public static void main(String[] args)
	{
		// 1
		// 1 1	
		// 1 2 1
		// 1 3 3 1
		// 1 4 6 4 1
		// 1 5 10 10 5 1
		// 1 6 15 20 15 6 1

		// request how many rows to print
		// n = num of rows
		// row = 1 > prints 1
		// row = 2 > prints 1 1
		// row = n >= 3 > begin algorithm
			// for loop for powers of 11 for each row
			System.out.println("How many rows do you wish to calculate?");
			Scanner userInput = new Scanner(System.in);
			int n = userInput.nextInt();
			

			PascalsTriangle pT = new PascalsTriangle();
			System.out.println(pT.power(11, n));

	}

	public double power(int a, int b)
	{	
		int power = 0;

			if (power == 0) return 1;
			if (power == 1) return 11;

			return (a * power(a, --b));

			double pow = 1L;
    		if(b==0)
        		return 1;
    		if (b == 1)
        		return a;
    		if(b%2==0)
    		{
        		pow = power(a, b / 2);
        		return pow * pow;
    		} else{
        		pow = power(a,b/2);
        		return pow * pow * b;
   			}
	}

}*/