package scjp;

import java.util.*;

public class UsingIterator 
{
	public static void main(String[] args) 
	{
		List<Dog1> d = new ArrayList<Dog1>();
		Dog1 dg=new Dog1("Aiko");
		d.add(dg);
		d.add(new Dog1("Clover"));
		d.add(new Dog1("Sebastian"));
		d.add(new Dog1("Bruno"));
		d.add(new Dog1("Cutie"));
		
		Iterator<Dog1> it= d.iterator();
		
		while(it.hasNext())
		{
			Dog1 d2 = it.next();
			System.out.println(d2.name);
		}
		System.out.println("size " +d.size());
		System.out.println("get1 "+ d.get(1).name);
		System.out.println("Aiko "+ d.indexOf(dg));
		d.remove(2);
		Object[] oa = d.toArray();
		for(Object o : oa)
		{
			Dog1 d3 = (Dog1) o;
			System.out.println("oa "+ d3.name);
		}
	}


}
class Dog1
{
	public String name;
	Dog1(String n) 
	{
		name=n;
	}
	
}
