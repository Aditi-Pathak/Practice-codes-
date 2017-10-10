package scjp;

public class Label {


	int age=14;
	public void testing() 
	{
		outer:
			while(age<=17)
			{
				age++;
				if(age>=16)
				{
					System.out.println("get your driver's license");
					continue outer;
				}
				System.out.println("Another year");
			}


	}

}
