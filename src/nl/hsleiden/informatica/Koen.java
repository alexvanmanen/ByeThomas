package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by koen on 30-06-16.
 */
public class Koen implements Colleague {

	private String ikBen = "Koen";
	private boolean gaatThomas = true;
	private String fareWell = "Beste Thomas, ik zal je missen!. Jouw nuchtere oordelen, jouw inzichten en je humor "
			+ "(die ik overigens niet altijd begreep, maar dat doet er niet toe :-). Probeer het een jaartje in Zwolle, "
			+ "concludeer dat het in Leiden toch veel leuker was, en kom dan gewoon terug. We proberen een plaatsje voor "
			+ "je vrij te houden.";
	private String wish = "Maar nu zonder gekheid: ik wens je een hele goede tijd toe in Zwolle. Nieuwe kansen, nieuwe "
			+ "mogelijkheden. (En misschien eindelijk eens de tijd om gestructureerd te leren programmeren :-). Het ga je "
			+ "goed, het wordt vast een mooie tijd in de stad van de Peperbus. En laten we proberen contact te houden. "
			+ "Wellicht een paar maal per jaar met een aantal ex-Leidencollega's bij elkaar komen; biertje, pizzaatje, zoiets.";

	public String getIkBen() {
		return this.ikBen;
	}

	public String getFarewellMessage() {

		return getIkBen() + ": " + this.fareWell;
	}

	public String getWishForTheFuture() {

		return getIkBen() + ": " + this.wish;
	}

	public String ikGaNaarZwolle(boolean ikGa) throws ZwolleException {

		if (!ikGa) {
			return "Goed zo! Je blijft.";
		} else {
			throw new ZwolleException("Dus je gaat? Dit is niet het antwoord dat we willen horen, Thomas!");
		}
	}

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		throw new NotImplementedException();
	}

	
}
