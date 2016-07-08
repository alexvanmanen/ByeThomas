package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Thomas implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		// TODO Auto-generated method stub
		return "thomas@boose.nl";
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		// TODO Using Deprecated code is allowed for dates
		// before the Gulf war.
		return new Date("11-11-1972");
	}

	@Override
	public String getFarewellMessage() throws NotImplementedException {
		// TODO Auto-generated method stub
		return "Lieve (ex) Collega's\n\n" +
				"Ik ga jullie allemaal missen.\n\n" +
				"Let een beetje op de nestor, geef hem regelmatig\n" +
				"fruit en gerstennat. Gun hem een lokaal met kinderen\n" +
				"Een fundamenteel onderwerp, niet te concreet\n" +
				"Maar zeker niet te vaag,\n" +
				"en je hebt er nog jaren plezier van.\n\n" +
				"Wees voorzichtig met de enthousiaste instroom.\n" +
				"Of ze nu nat achter de oren van school komen of\n" +
				"gepokt en gemazeld uit een bedrijf. De nieuwe docent\n" +
				"is de motor van de reflectie en reflectie is het fundament\n" +
				"van het onderwijs. Niemand benadert de student dichter.\n" +
				"Bij gebrek aan moedige studenten, koesteren\n" +
				"en vertroetelen wij 'De nieuwe docent'.\n\n" +
				"En al die lieve collega's ertussenin verdienen\n" +
				"elkaars aandacht en verbazing. Jullie verzorgen inspirerend\n" +
				"onderwijs en betrouwbare ondersteuning met de student als\n" +
				"belangrijkste klant. Vergeet niet om nu en dan naar al dat moois\n" +
				"te kijken en je te laten verrassen.\n\n" +
				"Het ga jullie goed. We houden contact.\n\n";

	}

	@Override
	public String getWishForTheFuture() throws NotImplementedException {
		// TODO Auto-generated method stub
		return "Hou je haaks.";
	}

}
