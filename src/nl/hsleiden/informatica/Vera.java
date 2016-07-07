package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Vera implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		return new Date(84, 5, 31);
	}

	@Override
	public String getFarewellMessage() {
		return "Een andere baan\n" + "een nieuw bestaan\n" + "Veranderingen horen bij het leven\n"
				+ "Bedankt voor alles dat je me hebt gegeven\n" + "Ik wens je heel veel succes\n"
				+ "Kom nog eens langs, doe dat expres!";
	}

	@Override
	public String getWishForTheFuture() {
		return "Heel veel werkplezier in je nieuwe baan.";
	}

}