package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Oread extends Race{

	public Oread() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Creatures of human ancestry mixed with the blood of creatures from the Plane of Earth, oreads are as strong and solid\n"
			+ " as stone. Often stubborn and steadfast, their unyielding nature makes it hard for them to get along with most races other\n"
			+ " than dwarves. Oreads make excellent warriors and sorcerers who can manipulate the raw power of stone and earth.";
	
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
