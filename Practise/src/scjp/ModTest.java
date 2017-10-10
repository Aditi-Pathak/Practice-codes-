package scjp;

public class ModTest 
{
	public int mod(int m, int n)
	{
		return (m%n);		
	}

	public static void main(String[] args) 
	{
		ModTest mt = new ModTest();
		System.out.println(mt.mod(0, 10));
		//System.out.println(10%0);
		//System.out.println(mt.mod(10, 0));
		System.out.println(mt.mod(1, 10));
		System.out.println(mt.mod(10, 1));
		System.out.println(mt.mod(20, 85));
		System.out.println(mt.mod(11650, 45));

	}

}
