package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Grippli extends Race{

	public Grippli() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Furtive frogfolk with the ability to camouflage themselves among fens and swamps, gripplis typically keep to their\n"
			+ " wetland homes, only rarely interacting with the outside world. Their chief motivation for leaving their marshy environs\n"
			+ " is to trade in metal and gems.";
	
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
