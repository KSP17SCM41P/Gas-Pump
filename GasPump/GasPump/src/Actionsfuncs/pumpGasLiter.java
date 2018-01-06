package Actionsfuncs;

import Datastore.Database;

public class pumpGasLiter extends gaspumpUnit {

	@Override
	public void pumpGas(Database md) {
		// TODO Auto-generated method stub
		md.setL(md.getL()+1);
		md.setTotal(md.get_GasPrice()*md.getL());
		md.setFloatCash(md.getIntCash() - md.getTotal());
		
	}

}
