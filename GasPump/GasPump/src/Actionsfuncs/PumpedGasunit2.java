package Actionsfuncs;

import Datastore.Database;

public class PumpedGasunit2 extends gaspumpUnit{

	@Override
	public void pumpGas(Database md) {
		// TODO Auto-generated method stub
		md.setG(md.getG()+1);

		
		md.setFloatTotal(md.get_GasPrice1()*md.getG());
	}

}
