package Actionsfuncs;

import Datastore.Database;

public class PrintReceipt1 extends PrintReceipt{

	@Override
	public void printReceipt(Database md) {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using the gaspump 1! Your Total bill for the gas is : "+ md.getFloatTotal());	
	}

}
