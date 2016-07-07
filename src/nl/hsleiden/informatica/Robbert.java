package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Robbert implements Colleague{

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
		return "Het ga je goed en veel succes!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Een goede reis naar, en landing in, het noorden en wellicht een positie in de groeiende SP fractie van Zwolle?";
	}

}