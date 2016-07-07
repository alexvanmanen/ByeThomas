package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jeroen implements Colleague {

	@Override
	public String getMyPersonalEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getMyBirthDate() {
		throw new NotImplementedException();
	}

	@Override
	public String getFarewellMessage() {
		return "Vaarwel Thomas. Groetjes Jeroen";
	}

	@Override
	public String getWishForTheFuture() {
		// TODO Auto-generated method stub
		return null;
	}

}
