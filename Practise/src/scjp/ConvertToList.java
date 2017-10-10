package scjp;

import java.util.Arrays;
import java.util.List;

public class ConvertToList 
{
	public static void main(String[] args) 
	{
		String [] sa = {"one","two","three","four"};
		List<String> sList = Arrays.asList(sa);
		System.out.println("size "+sList.size());
		System.out.println("idx2 "+sList.get(2));

		sList.set(3, "six");
		sa[1]= "five"; //if we make any changes to the array or the list the changes will get reflected in both of them
		for(String s:sa)
		{
			System.out.print(s + " ");
		}
		System.out.println("\nsl[1] "+sList.get(1));
	}

}