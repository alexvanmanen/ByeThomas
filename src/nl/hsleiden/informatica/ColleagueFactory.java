package nl.hsleiden.informatica;

import java.util.Arrays;
import java.util.List;

public class ColleagueFactory {
	// Deze class is een Singleton.
	private static ColleagueFactory instance = new ColleagueFactory();

	public static final String Alex = "Alex";
	public static final String Carla = "Carla";
	public static final String Jos = "Jos";
	public static final String PeterW = "PeterW";
	public static final String Corinne = "Corinne";
	public static final String FredB = "FredB";
	public static final String Hans = "Hans";
	public static final String Jaap = "Jaap";
	public static final String Jacco = "Jacco";
	public static final String James = "James";
	public static final String Jeroen = "Jeroen";
	public static final String JeroenM = "JeroenM";
	public static final String JeroenR = "JeroenR";
	public static final String Koen = "Koen";
	public static final String Leontine = "Leontine";
	public static final String Marja = "Marja";
	public static final String Michelle = "Michelle";
	public static final String Michiel = "Michiel";
	public static final String Mischa = "Mischa";
	public static final String Vera = "Vera";
	public static final String Vincent = "Vincent";
	public static final String Remco = "Remco";
	public static final String Robbert = "Robbert";
	public static final String Rob = "Rob";

	private ColleagueFactory() {
	}

	public static ColleagueFactory getInstance() {
		return instance;
	}

	public List<String> getColleagueNames() {
		return Arrays.asList(Alex, Carla, Jos, PeterW, Corinne, FredB, Hans, Jaap, Jacco, James, Jeroen, JeroenM,
				JeroenR, Koen, Leontine, Marja, Michelle, Michiel, Mischa, Vera, Vincent, Remco, Robbert, Rob);
	}

	public Colleague createColleague(String name) {

		switch (name) {
		case "Alex":
			return new Alex();
		case "Carla":
			return new Carla();
		case "Jos":
			return new Jos();
		case "PeterW":
			return new PeterW();
		case "Corinne":
			return new Corinne();
		case "FredB":
			return new FredB();
		case "Hans":
			return new Hans();
		case "Jaap":
			return new Jaap();
		case "Jacco":
			return new Jacco();
		case "James":
			return new James();
		case "Jeroen":
			return new Jeroen();
		case "JeroenM":
			return new JeroenM();
		case "JeroenR":
			return new JeroenR();
		case "Koen":
			return new Koen();
		case "Leontine":
			return new Leontine();
		case "Marja":
			return new Marja();
		case "Michelle":
			return new Michelle();
		case "Michiel":
			return new Michiel();
		case "Mischa":
			return new Mischa();
		case "Vera":
			return new Vera();
		case "Vincent":
			return new Vincent();
		case "Remco":
			return new Remco();
		case "Robbert":
			return new Robbert();
		case "Rob":
			return new Rob();
		}

		return null;
	}

}
