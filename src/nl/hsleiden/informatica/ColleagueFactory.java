package nl.hsleiden.informatica;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class ColleagueFactory {
	// Deze class is een Singleton.
	private static ColleagueFactory instance = new ColleagueFactory();
	private static final String packageName = "nl.hsleiden.informatica";
	
	
	private ColleagueFactory() {
	}

	public static ColleagueFactory getInstance() {
		return instance;
	}

	public List<String> getColleagueNames() {
		List<String> result = new LinkedList<String>();

		for (Class c: getColleagueImplementations()) {
			result.add(c.getName().replace(packageName+".", ""));
		}
		return result;
	}
	
	public List<Class> getColleagueImplementations(){
		List<Class> result = new LinkedList<Class>();
		try {
			Class[] classes = new ReflectionUtillity().getClasses(packageName);
			for(Class c: classes){
				if(Arrays.asList(c.getInterfaces()).contains(Colleague.class)){
					result.add(c);
				}
				
				
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Colleague createColleague(String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName(packageName+"." + name);
		return (Colleague) c.newInstance();
	}
	


}
