package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Tycho implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		throw new NotImplementedException();
	}

	public String getFarewellMessage() {
		return "De kantjes er vanaf werken, nooit humor en altijd optimistisch.\n"+
		"Gelukkig was jij daar als collega en liet je zien dat het ook anders kon.\n"+
		"Nu ga je weg, hoge verwachtingen achterlatend.\n"+
		"Ik vnd het jammer dat je gaat en ik hoop dat je geniet van je nieuwe toekomst.\n"+
		"Veel plezier ! --Tycho";
	}

	public String getWishForTheFuture() {
		return "Ik wens je een mooie toekomst,\n"+
		"	een fijn bestaan.\n"+
		"Veel zon, strand en SE\n"+
		"	neem je een geschiedenis van HSLeiden mee.\n"+
		"Een nieuw huis of kasteel\n"+
		"	Verras ons en stuur ons eens een fotootje of twee\n"+
		"Geniet van het nieuwe rustige bestaan\n"+
		"	en vergeet niet waarom je hier bent weggegaan. --Tycho";
	}

	

}
