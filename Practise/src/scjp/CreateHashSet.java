package scjp;
import java.util.*;

public class CreateHashSet {

	public static void main(String[] args) 
	{
		boolean [] ba= new boolean[5];
		Set s = new HashSet<>();
		
		ba[0]= s.add("a");
		ba[1]= s.add(new Integer(42));
		ba[2]= s.add("b");
		ba[3]= s.add("a");
		ba[4]= s.add(new Object());
		
		for(int x=0; x<ba.length; x++)
		{
			System.out.print(ba[x]+ " "); 
		}
		System.out.println("\n");
		for(Object o:s)
		{
			System.err.print(o+" ");// this prints random output and not in order bcz it is hashSet, 
									//has it been treeSet it would have given error stating that the items 
									//in the set are not comparable bcz they are of different type
		}
		
	}

}
