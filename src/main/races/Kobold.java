package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Kobold extends Race{

	public Kobold() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Considering themselves the scions of dragons, kobolds have diminutive statures but massive egos. A select few can take on\n"
			+ " more draconic traits than their kin, and many are powerful sorcerers, canny alchemists, and cunning rogues.";
	
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
