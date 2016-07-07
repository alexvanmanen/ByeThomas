package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PeterVanVliet implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		return "peter@uitdehoogte.nl";
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		 return new Date( Math.round( Math.random() * 75 ));
	}

    public static int getEuShoeSize()
    {
       return  (int) Math.floor( 45.99999 );
    }

	
	@Override
	public String getFarewellMessage() {
		 return "Leuk te horen dat je met je gezien weer terug gaat naar je 'roots'! Een frisse start, met zo te horen allemaal leuke dingen in het verschiet. Enne... vergeet niet een biertje te drinken met je oud collega's als je in de buurt bent.";
	}

	@Override
	public String getWishForTheFuture() throws NotImplementedException {
		 return "Ik wens je veel rust, plezier, succes en ruimte toe.";

	}

}
