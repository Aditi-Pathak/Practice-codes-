package scjp;
import java.util.*;

class Maptest
{
	public static void main(String[] args)
	{
		Map<Object,Object> m = new HashMap<Object,Object>();

		m.put("k1", new UsingMaps("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT , "CAT key");
		
		UsingMaps um= new UsingMaps("clover");
		
		m.put(um, "Dog key");
		m.put(new Cat(), "Cat key");

		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(um));
		System.out.println(m.get(new Cat()));// this gives null as output bcz the Cat class does not override equals() and hashCode() methods 
											//and hence the value was lost in the map,,whereas the Dog class did and hence line 24 give a relevant output.
		System.out.println(m.size());
		
		um.name = "mangolia";//"o/p=null" as we changed the name we changed the hashCode and hence with the new hashCode we can't find the bucket.
		System.out.println(m.get(um));
		
		um.name = "clover";
		System.out.println(m.get(new UsingMaps("clover")));
		
		um.name = "arthur";
		System.out.println(m.get(new UsingMaps("clover")));//"o/p=null" bcz since the lenth of clover and arthur is same we pass the first
													    	//test(hashCode) but we fail the equals test as both are different values.
	}
}

class Cat
{

}

enum Pets{DOG, CAT, HORSE} //enums override equals() and hashCode() methods

