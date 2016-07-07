package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Remco implements Colleague {

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
		return "Zwolle volgt in de alfabetordening op Leiden, precies zoals dat ook voor het ertussengelegen Mooier geldt.\n\n"
				+ "Succes, ook met de kinderen en het huis!\n";
	}

	@Override
	public String getWishForTheFuture() {
		return "Morgen en nadien minstens evenveel plezier, maar minder kopzorgen komen je rechtmatig toe.";
	}

}