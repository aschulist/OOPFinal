package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Sulis extends Race{

	public Sulis() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Also called suli-jann, these humanoids are the descendants of mortals and jann. These strong and charismatic individuals\n"
			+ " manifest mastery over elemental power in their adolescence, giving them the ability to manipulate earth, fire, ice, or\n"
			+ " electricity. This elemental power tends to be reflected in the suli's personality as well.";
	
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
