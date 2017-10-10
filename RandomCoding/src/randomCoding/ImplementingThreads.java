package randomCoding;

public class ImplementingThreads 
{
	public static void main(String[] args)
	{
		Runnable tp = new ThreadPractise();
		Thread even = new Thread(tp);
		Thread odd = new Thread(tp);
		even.setName("even");
		odd.setName("odd");

		odd.start();
		try 
		{
			even.wait();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		even.start();
		try 
		{
			odd.wait();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

	}
}
