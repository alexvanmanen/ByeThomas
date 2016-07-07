package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jaap implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		throw new NotImplementedException();
	}
	
	@Override
	public String getFarewellMessage() {
		return "Trmvra wr xraavf ra reinevat zrg vasbezngvpn tnna jr urynnf rra fgrexr xenpug va urg grnz zvffra. Qnneannfg mny urg bbx va qr qbpragraxnzre wbhj nsjrmvturvq jbeqra bctrzrexg…";
	}

	@Override
	public String getWishForTheFuture(){
		return "Urry irry fhpprf zrg wr avrhjr hvgqntvat ra jryyvpug gbg jrremvraf!";
	}

}