package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Vincent implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		return new Date(84, 5, 31);
	}

	@Override
	public String getFarewellMessage() {
		return "Veel succes met je nieuwe uitdaging en het vinden van onderdak!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Ik hoop dat je in het noordoosten de rust vindt waar je naar op zoek bent.";
	}

}