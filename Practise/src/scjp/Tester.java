package scjp;

public class Tester {

	public static void main(String args[]){
		/*PlayerPiece player1=new PlayerPiece();
		GameShape player2=new PlayerPiece();
		Object o= player1;
		GameShape shape= player1;
		Animatable mover= player1;*/
	
		/*player1.displayShape();
		player2.displayShape();*/
		
		/*Example1 e1= new Example1();
		e1.testing();*/
		
		/*Label l1= new Label();
		l1.testing();*/
		
		/*String s1=new String("abc");
		String s2=new String("abc");*/
		
		A a1=new A("abc");
		//A a2=new A("abc");
		A a2=a1;
		
		/*String s1="abc";
		String s2="abcd";*/
		
		
		/*System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());*/
		
		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
