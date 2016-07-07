package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jos implements Colleague{

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
		return "Dag Thomas, dank voor de vele jaren samenwerking. Het lief en leed wat we als coordinatoren hebben mogen delen. De sparringsessies over Hogeschool, maatschappij en gezin. Ik ga ze missen!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Thomas, ik wens je alle goeds in Zwolle: Heel veel succes bij Windesheim. Dat je gezin goed mag aarden daar en dat je de SP-afdeling Zwolle maar tot grote hoogte weet te stuwen. Het ga je goed!!! Jos";
	}

}