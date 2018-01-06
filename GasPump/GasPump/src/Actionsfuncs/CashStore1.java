package Actionsfuncs;

import Datastore.Database;

public class CashStore1 extends CashStore {

	@Override
	public void storeCash(Database md) {
		// TODO Auto-generated method stub
		md.setCash(md.getTemp_Cash());
		
		System.out.println("Cash Stored in the datastore ia " +md.getCash());
	}

}
