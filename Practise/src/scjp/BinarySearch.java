package scjp;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

	public static void main(String[] args) 
	{
		String [] sa = {"one","two","three","four"};
		Arrays.sort(sa);
		for(String s : sa)
		{
			System.out.print(s + " ");
		}

		System.out.println("\none = "+Arrays.binarySearch(sa,"one"));
		System.out.println("now reverse sort");
		ReSortComaprator rs=new ReSortComaprator();
		Arrays.sort(sa,rs);
		for(String s :sa)
		{
			System.out.print(s + " ");
		}
		System.out.println("\none = "+Arrays.binarySearch(sa,"one"));
		System.out.println("one = "+Arrays.binarySearch(sa,"one",rs));
	}


}

class ReSortComaprator implements Comparator<String>
{

	public int compare(String a, String b)
	{
		return b.compareTo(a);
	}

}
