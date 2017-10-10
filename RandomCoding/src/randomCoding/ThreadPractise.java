package randomCoding;

public class ThreadPractise implements Runnable
{
	public void run() 
	{	
		for(int i=2; i<=10; i=i+2)
		{
			if(Thread.currentThread().getName().equals("even"))
			{
				System.out.println("running Thread name inside if is  "+Thread.currentThread().getName());
				System.out.println(i);

			}
		}

		for(int i=1; i<=10; i=i+2)
		{
			if(Thread.currentThread().getName().equals("odd"))
			{
				System.out.println("running Thread name inside else is  "+Thread.currentThread().getName());
				System.out.println(i);
			}
		}
	}

}