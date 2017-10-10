package scjp;
import java.util.Scanner;

public class Solution_String {
	public static void  printEvenSpaceOdd(char[] myCharArray){
		int len = myCharArray.length;
		for(int i = 0; i<len; i=i+2){
			System.out.print(myCharArray[i]);
		}
		System.out.print(" ");
		for(int i = 1; i<len; i=i+2){
			System.out.print(myCharArray[i]);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int T=scan.nextInt();
		scan.nextLine();

		for(int i=1; i<=T; i++){
			String str=scan.next();
			printEvenSpaceOdd(str.toCharArray());

		}

		scan.close();
	}

}
