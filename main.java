package deneme1;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  int n;

		  System.out.print("Enter number\n");
		  n = s.nextInt();

		  int fact ;
		  fact = factorial(n);

		  System.out.println("Factorial of "+n+" is "+fact);
	}

	public static int factorial(int a) {
		// TODO Auto-generated method stub
		
		if( a == 0 || a == 1)
		  {
		    return 1;
		  }
		  else
		  {
		    return a*factorial(a-1);
		  }
		
	}
}



