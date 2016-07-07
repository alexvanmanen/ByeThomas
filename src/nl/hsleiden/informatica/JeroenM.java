package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JeroenM implements Colleague{

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
		return "Beste Martijn, onwijs bedankt voor het afgelopen jaar. Ik wil je bedanken voor je behulpzaamheid en zorg die je hebt getoond aan mij als junior docent en je meervoudige poging om me naar SE te trekken :). Dank je wel!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Allereerst heel veel geluk. Ik hoop dat jij en je gezin het naar jullie zin zullen hebben in Zwolle. Ik wens je ook een zekere mate van rust toe. Nu je niet meer als spacialisatie coördinator de boel draaiende hoeft te houden hoop ik dat je je studie snel kan afronden. Ga ervan genieten en het aller beste!";
	}

}