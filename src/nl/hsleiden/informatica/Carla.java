package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Carla implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public String getFarewellMessage() {
		return "Je was en bent een gezellige collega, met veel oog voor de individuele student. "
				+ "In Zwolle zullen ze een goede aan je hebben!" + "\n" + "Succes, ook met de kinderen en het huis!\n"
				+ "Hartelijke groet, Carla";

	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}