package scjp;

public class DogShow 
{
	public static void main(String[] args)
	{
		new DogShow().go();
	}
	void go()
	{
			new Hound().bark();
			((Dog) new Hound()).bark();
			//((Dog) new Hound()).sniff();//dog ki definition mein jitna hai use rakhega baaki hata dega
			((Hound) new Dog()).sniff();//compiler check karta hai lhs mein jitna method hai wo rhs mein hai ya nai agar nai
			                            //hai toh wo cast kar k extra method cut short kar deta hai
			//Hound h=new Dog();//constructor run time mein call hota hai
			//Dog hr=new Hound();
			

			/*long t= 0;
			int s=(int) t;*/
			
	}

}
