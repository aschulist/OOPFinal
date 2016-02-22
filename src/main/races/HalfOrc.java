package main.races;

import main.classes.ClassType;
import main.races.Race;

public class HalfOrc extends Race{

	public HalfOrc() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Often fierce and savage, sometimes noble and resolute, half-orcs can manifest the best and worst qualities of their parent\n"
			+ " races. Many half-orcs struggle to keep their more bestial natures in check in order to epitomize the most heroic values of\n"
			+ " humanity. Unfortunately, many outsiders see half-orcs as hopeless abominations devoid of civility, if not monsters unworthy\n"
			+ " of pity or parley.";
	
	private static String description = "";
	
	private static String[] racialTraits = {};
	
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
