package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jacco implements Colleague {

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
		return "Janneke, Janneke, Janneke, Janneke, Janneke, Janneke, Janneke, janneke, Janneke, Janneke, Janneke, Janneke daar ben je nu vanaf."
				+ "Misschien ben ik wel jaloers op de stap die je maakt, heel veel plezier en maak het mooi!";
	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}