package scjp;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard {
	
	public void addAnimal(List<? super Doggie> animals)// anything that is either doggie or superclass of doggie is allowed 
	{													//as the argument for addAnimal.
		animals.add(new Doggie());
		System.out.println(animals.get(0));
	}

	public static void main(String[] args) 
	{
		List<Animal1> am = new ArrayList<Animal1>();
		am.add(new Doggie());
		//am.add(new Cattie());
		//am.add(new Birdie());

		GenericsWildcard gw = new GenericsWildcard();
		gw.addAnimal(am);

	}

}


