package scjp;

public abstract class Animal1 
{
	public abstract void checkUp();

}

class Doggie extends Animal1
{

	@Override
	public void checkUp() 
	{
		System.out.println("dog Checkup");
	}
	
}

class Cattie extends Animal1
{

	@Override
	public void checkUp() 
	{
		System.out.println("cat Checkup");
	}
	
}

class Birdie extends Animal1
{

	@Override
	public void checkUp() 
	{
		System.out.println("bird Checkup");
	}
	
}
