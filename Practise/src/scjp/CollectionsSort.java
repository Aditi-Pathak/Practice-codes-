package scjp;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort 
{
	public static void main(String[] args)
	{
		ArrayList<String> stuff=new ArrayList<String>();
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Rohan");
		stuff.add("Sunny");
		stuff.add("Preeti");
		stuff.add("Molu");
		stuff.add("Sebastian");
		System.out.println("unsorted "+stuff);
		Collections.sort(stuff);
		System.out.println("sorted "+stuff);
		
	}
}
