package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Michelle implements Colleague {

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
		return "Via deze weg wil ik bedanken voor onze samenwerking, ook al was deze kort en niet heel intensief. Daarnaast wens ik je heel veel succes met je nieuwe baan!\n"
				+ "Groetjes,\n" + "Michelle";
	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}