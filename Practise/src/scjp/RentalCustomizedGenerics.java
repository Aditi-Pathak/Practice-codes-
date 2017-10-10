package scjp;

import java.util.List;

public class RentalCustomizedGenerics<T> {
	
	private List<T> rentalPool;
	private int maxNum;
	
	public RentalCustomizedGenerics(int maxNum , List<T> rentalPool)
	{
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}
	
	public T getRental()
	{
		return rentalPool.get(0);
	}
	
	public void returnRental(T returnedThing)
	{
		rentalPool.add(returnedThing);
	}
}

