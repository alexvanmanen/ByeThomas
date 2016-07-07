package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JeroenR implements Colleague{

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
		return "Hallo Thomas! Na nog maar een jaar samen te hebben gewerkt moeten we helaas alweer afscheid nemen. Ik hoop dat je bij  je nieuwe baan net zo vaak de uitweg uit glades mag vinden, natuurlijk op de meest efficiënte manier. Laten we als je in de buurt bent samen nog even genieten van een film(Scorch trials?)!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Veel geluk en wijsheid en dat toekomstige studenten ook de weg kunnen vinden uit de glade!";
	}

}