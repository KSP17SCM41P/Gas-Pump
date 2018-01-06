package Actionsfuncs;

import Datastore.Database;

public class CashStore2 extends CashStore{

	@Override
	public void storeCash(Database md) {
		// TODO Auto-generated method stub
		md.setIntCash(md.getIntTemp_Cash());
		System.out.println("Cash Stored in Data Store " +md.getIntCash());
	}

}
