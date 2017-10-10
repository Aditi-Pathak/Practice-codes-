package scjp;

import java.util.ArrayList;
import java.util.List;

public class ConvertToArray 
{
	public static void main(String[] args) 
	{
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x<20; x++)
		{
			iL.add(x);
			
		}
		Object [] oa= iL.toArray();      // list can contain different type of objects so first we convert the list into object array
		Integer[] ia = new Integer[3];  //create a new Integer type array to store all integer data in the list
		ia= iL.toArray(ia);            //put all integer data into the integer array
		
		for(int sa : ia)
		{
			System.out.println(sa);
			
		}
	}

}
