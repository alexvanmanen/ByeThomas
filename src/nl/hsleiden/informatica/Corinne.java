package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Corinne implements Colleague {

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
		return "Hi Thomas!\n"
				+ "Ik wens je een hele voorspoedige verhuizing met heel veel woonplezier en geluk samen in jullie nieuwe nest!\n"
				+ "En veel succes in je nieuwe job. Dat je maar net zo’n gezellig team mag treffen als dat van ons J! Groet, Corinne";
	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}