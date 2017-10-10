package scjp;

public class PlayerPiece extends GameShape implements Animatable {
	
	public void displayShape(){
		System.out.println("Hello I am in displayShape method of PlayerPiece");
		
	}
	
	public void movePiece(){
		System.out.println("moving game piece");
	}

	@Override
	public void animate() {
		System.out.println("animating.....");
	}

}
