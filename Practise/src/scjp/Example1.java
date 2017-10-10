package scjp;

public class Example1 {

	public void testing()
	{
		
			for (int i=0; i<10 ;i++)
			{
				System.out.println("inside loop");
				if(doStuff()==5)
				{
					//continue;
					break;
				}

				System.out.println("After if");
				//break;
			}

			System.out.println("Out of loop");
			
		
	}
	public int doStuff()
	{
		return 5;
	}
	
}
