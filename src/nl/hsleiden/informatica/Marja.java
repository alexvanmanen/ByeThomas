package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Marja implements Colleague {

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
		return "Geluk wordt meer bepaald door je geestestoestand,dan door gebeurtenissen van buitenaf. \n\n"
				+ "Succes, ook met de kinderen en het huis!\n" + "Hartelijke groet, Carla";
	}

	@Override
	public String getWishForTheFuture() {
		return "Wens je heel veel geluk bij Windesheim!Ik ben blij voor je. Een nieuwe stap, zet hem op!";
	}

}