package randomCoding;

public class ThreadDemo 
{
	synchronized void a()
	{
		actBusy();
	}
	static synchronized void b()
	{
		actBusy();
	}
	static void actBusy()
	{
		try
		{
			Thread.sleep(1000);

		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		final ThreadDemo x = new ThreadDemo();
		final ThreadDemo y = new ThreadDemo();

		Runnable runnable = new Runnable(){
			public void run()
			{
				int option = (int) (Math.random()*4);
				System.out.println(option);
				switch(option)
				{
				case 0: x.a(); break;
				case 1: x.b(); break;
				case 2: y.a(); break;
				case 3: y.b(); break;
				}
			}
		};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("thread1");
		thread2.setName("thread2");

		thread1.start();
		thread2.start();

	}
}
