package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Edward implements Colleague{

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
		return "Hallo Thomas,\n"+
		"\n"+
		"We hebben elkaar leren kennen bij de lessen iond en ieth. Jij als student en ik als docent bij 'Onderzoeksmethoden' en 'Ethiek en Techniek'. \n"+
		"Ik kan me niet herinneren dat je aanwezig bent geweest bij de lessen van ieth, bij iond wel je hebt dan ook een V voor aanwezigheid bij iond (volgens Osiris). \n"+
		"\n"+
		"Het doet mij als docent dan ook deugd om te zien dat je de bij iond geleerde kennis en vaardigheden in een beroepssituatie gaat toepassen. Echt de Next Level!\n"+
		"\n"+
		"Over ethiek maak ik mij geen zorgen dat zit bij jou meer dan goed. Wel vraag ik mij af of je de 5 criteria van een goede probleemstelling nog weet. Deze kennis is volgens mij tijdens je coördinatorschap SE wat naar de achtergrond verdwenen.\n"+
		"\n"+
		"Ik wens je veel succes toe in je nieuwe baan en omgeving en wil je bedanken voor de fijne samenwerking, \n"+
		"Edward";
	}

	@Override
	public String getWishForTheFuture() throws NotImplementedException {
		throw new NotImplementedException();

	
	}

}
