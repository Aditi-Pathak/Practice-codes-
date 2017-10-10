package scjp;

import java.util.ArrayList;
import java.util.List;

public class AnimalDoctorGeneric {

	public void checkAnimals(List<Animal1> animals)
	{
		for(Animal1 a : animals)
		{
			a.checkUp();
		}
	}

	public static void main(String[] args) 
	{
		/*List<Doggie> doggies = new ArrayList<Doggie>();
		doggies.add(new Doggie());
		doggies.add(new Doggie());						  this won't work bcz the checkAnimals expect an argument of type
		List<Cattie> catties = new ArrayList<Cattie>();	  ArrayList<Animal1> and hence will not accept ArrayList<Cattie>etc.
		catties.add(new Cattie());
		catties.add(new Cattie());
		List<Birdie> birdies = new ArrayList<Birdie>();
		birdies.add(new Birdie());
		
		AnimalDoctorGeneric ag = new AnimalDoctorGeneric();
		ag.checkAnimals(doggies);
		ag.checkAnimals(catties);
		ag.checkAnimals(birdies);*/
		
// TO MAKE IT WORK
		
		List<Animal1> am = new ArrayList<Animal1>();
		am.add(new Doggie());
		am.add(new Cattie());
		am.add(new Birdie());
		
		AnimalDoctorGeneric ag = new AnimalDoctorGeneric();
		ag.checkAnimals(am);
		
	}

}