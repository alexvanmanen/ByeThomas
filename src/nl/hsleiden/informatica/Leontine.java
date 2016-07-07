package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Leontine implements Colleague {

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
		return "Ik wens je heel veel succes met je nieuwe baan en alle andere veranderingen voor jou en je familie. Ik hoop dat jullie snel je droomhuis in Zwolle vinden. Veel succes, plezier en gezondheid!"
				+ "Groetjes, Leontine";
	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}