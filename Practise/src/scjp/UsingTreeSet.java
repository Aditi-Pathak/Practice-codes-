package scjp;
import java.util.*;

public class UsingTreeSet 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		
		
		// LEGACY CODE
		
		/*TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet<Integer>)times.headSet(1600);
		System.out.println("last before 4 pm is "+subset.last());
		
		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet<Integer>)times.tailSet(2000);
		System.out.println("first after 8 pm is "+sub2.first());*/
		
		System.out.println("last before 4 pm is "+times.lower(1600)); //new lower and higher methods 
		System.out.println("first after 8 pm is "+times.higher(2000));//to find out the last before and first after limits
		
		
	}

}
