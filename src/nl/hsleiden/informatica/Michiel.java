package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Michiel implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		return new Date(84, 5, 31);
	}
	
	@Override
	public String getFarewellMessage() {
		return "Beste Thomas, In de afgelopen twee jaar heb ik veel van je geleerd en heb ik altijd met veel plezier met je samen gewerkt en voor je gewerkt. Ik probeer van je te kopiëren hoe je met studenten omgaat. Het plezier wat je in je werk hebt en de lol die je met studenten maakt. Ik probeer over te nemen hoeveel dingen je tegelijk kan doen - maar dat gaat me niet lukken. ik ga je missen meneer ! ";
	}

	@Override
	public String getWishForTheFuture(){
		return "Ik deel met je een achtergrond als docent op MBO. Ik deel nu ook een geschiedenis met je op HSL en waar jou toekomst Windesheim is, voelt dat soort van als mijn verleden ~ het is toch gelieerd aan de VU (wat ik als mijn thuisbasis beschouw) Als je dezelfde hoeveelheid kennis, onderzoek, wetenschap, inspiratie en plezier uit Windesheim haalt dan gaat dat helemaal goed komen.";
	}

}