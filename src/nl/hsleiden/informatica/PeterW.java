package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PeterW implements Colleague {

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
		return "Ode aan Leiden\n" +

				"Daar waar een meeuw een Katwijkse duif is, en Rembrandt ooit zijn kwast heeft ontdekt.\n" +

				"Daar waar iedereen de ‘rambam’ kan krijgen, en het woord rabarber zo lekker bekt.\n" +

				"Daar waar 't altijd regent op 2 oktober, en iedereen feest viert op de markt in de gracht.\n" +

				"Daar waar corpsbal en glibbers versmelten, en samen op de reveille wacht. Ja dat is mijn stadje, dat is mijn Leiden, stad waar m'n wieg aan de Rijn heeft gestaan. La la la Leiden, la la la Leiden Stad waar ik nooit meer weg wil gaan. La la la Leiden, la la la Leiden, la la la Leiden, tra la la La la la Leiden, la la la Leiden, Stad waar ik nooit meer weg wil gaan.\n"
				+

				"Daar waar Sinterklaas een rollende R heeft, en Armin van Buuren in een Nexus begon.\n" +

				"Daar waar de peurbakken door de gracht varen, en Rubberen Robbie zijn liedjes verzon.\n" +

				"Daar waar luidruchtige gasten op een brommert meteen naar z'n bledder krijgt: ‘HOUD JE KOKER, JUH DARM’.\n"
				+

				"Daar waar iedereen haring en brood krijgt, maakt niet uit of je rijk bent of arm.\n" +

				"Ja dat is mijn stadje, dat is mijn Leiden, stad waar m'n wieg aan de Rijn heeft gestaan. La la la Leiden, la la la Leiden, stad waar ik nooit meer weg wil gaan. La la la Leiden, la la la Leiden, la la la Leiden, tra la la La la la Leiden, la la la Leiden, Stad waar ik nooit meer weg wil gaan.\n"
				+

				"Daar waar iedereen, oh god, blut is op 4 oktober, en men totaal naar de getver is.\n" +

				"Daar waar de markt, de markt, de markt, naar verrotte vis ruikt, en de grachten gevuld zijn met bier, hutspot en pis.\n"
				+

				"La la la Leiden, la la la Leiden, la la la Leiden, tra la la La la la Leiden, la la la Leiden, Stad waar ik nooit meer weg wil gaan. La la la Leiden, la la la Leiden, la la la Leiden, tra la la La la la Leiden, la la la Leiden, Stad waar ik nooit meer weg wil gaan.";
	}

	@Override
	public String getWishForTheFuture() {
		return "Je wor noait overreeje as van 'n strontkar";
	}

}