package scjp;

import java.util.ArrayList;
import java.util.List;

public class TestRental {

	public static void main(String[] args) 
	{
		Car c1 = new Car();
		Car c2 = new Car();
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		
		RentalCustomizedGenerics<Car> rcg = new RentalCustomizedGenerics<>(2, carList);
		
		Car carToRent = rcg.getRental();
		System.out.println(carToRent.toString());
		rcg.returnRental(carToRent);
		
		

	}

}
