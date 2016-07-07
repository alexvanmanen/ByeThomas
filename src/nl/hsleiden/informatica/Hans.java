package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Hans implements Colleague{

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
		return "De laatste specco met ervaring, we gaan je echt missen.";
	}

	@Override
	public String getWishForTheFuture(){
		return "a nice home in the eastern country";
	}

}