package Actionsfuncs;

import Datastore.Database;

public class PrintReceipt2 extends PrintReceipt {

	@Override
	public void printReceipt(Database md) {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using Gaspump! Your Total bill is : "+ (md.getIntCash()-md.getFloatCash()));
	}

}
