package Actionsfuncs;

import Datastore.Database;

public class ReturnCash2 extends ReturnCash {

	@Override
	public void returnCash(Database md) {

		System.out.println("Please collect the Cash Returned : "+(md.getIntCash() - md.getTotal()));
		
		
	}

}
