package Actionsfuncs;

import Datastore.Database;

public class GasPumpedmsg1 extends GasPumpedmsg {

	@Override
	public void getGasPumpMessage(Database md) {
		// TODO Auto-generated method stub
		System.out.println("Total units of gas disposed is: "+ md.getG()+" The Total Amount is : "+md.getFloatTotal());
	}

}
