package Actionsfuncs;

import Datastore.Database;

public class GasPumpedmsg2 extends GasPumpedmsg {

	@Override
	public void getGasPumpMessage(Database md) {
		// TODO Auto-generated method stub
		System.out.println("The number of gas unitsd disposed is: "+ md.getL()+" The Total Amount is : "+md.getTotal());
	}

}
