package Actionsfuncs;

import Datastore.Database;

public class PumpedGasunit extends gaspumpUnit {

	@Override
	public void pumpGas(Database md) {
		// TODO Auto-generated method stub
		md.setG(md.getG()+1);
		md.setTotal(md.get_GasPrice()*md.getG());
	}

}
