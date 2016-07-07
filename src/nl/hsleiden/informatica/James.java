package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class James implements Colleague{

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
		return "Beste Thomas, ik heb je als een deskundige, integere en toegankelijke collega ervaren en dank je hartelijk voor de prettige samenwerking die ik met je heb gehad!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Ik wens je veel succes in je nieuwe baan en verneem bij gelegenheid graag van je hoe het onderwijs bij Windesheim is, het ga je goed! Groeten en tot ziens, James.";
	}

}