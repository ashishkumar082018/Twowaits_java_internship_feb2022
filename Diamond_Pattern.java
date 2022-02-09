import java.util.Scanner;

public class Diamond_Pattern {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.print("Enter Diamond Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Diamond Star Pattern");
		i = 1 ;
		do
		{
			j = 1 ;
			do
			{
				System.out.print(" ");	
			} while( j++ <= rows - i  ) ;
			k = 1 ;
			do
			{
				System.out.print("*");
			} while ( ++k <= i * 2 - 1 ) ;
			System.out.println();

		} while(++i <= rows ) ;
		
		i = rows - 1 ;
		do
		{
			j = 1 ;
			do
			{
				System.out.print(" ");
			} while (j++ <= rows - i ) ;
			k = 1 ;
			do
			{
				System.out.print("*");
			} while( ++k <= i * 2 - 1 ) ;
			System.out.println();
		} while( --i > 0 ) ;
	}
}