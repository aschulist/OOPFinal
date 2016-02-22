package main.races;

import main.classes.ClassType;

public class Kitsune extends Race{

	public Kitsune() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These shapeshifting, foxlike folk share a love of mischief, art, and the finer things in life. They can appear as a single\n"
			+ " human as well as their true form, that of a foxlike humanoid. Kitsune are quick-witted, nimble, and gregarious, and\n"
			+ " because of this, a fair number of them become adventurers.";
	
	private static String description = "";
	
	private static String[] racialTraits = { };
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateHeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
