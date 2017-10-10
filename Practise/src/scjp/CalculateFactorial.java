package scjp;

import java.util.Scanner;

public class CalculateFactorial {

	public static int factorial(int number)
	{
		int count=number;
		for(int i=1; i< count; i++){
			number=number*i;
		}
		return number;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		if(n>=2 & n<=12)
		{
			int solution=factorial(n);
			System.out.println(solution);
		}
		in.close();
	}
}
