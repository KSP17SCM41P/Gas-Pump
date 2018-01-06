package Actionsfuncs;

import Datastore.Database;

public class PayType1 extends PayType {

	@Override
	public void setW(Database md) {
		// TODO Auto-generated method stub
		md.setPaytype(md.getTemp_Paytype());
		
		System.out.println("PayType Stored using Paytype class as " +md.getPaytype() );
	}

}
