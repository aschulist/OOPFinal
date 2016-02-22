package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Catfolk extends Race{

	public Catfolk() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" A race of graceful explorers, catfolk are both clannish and curious by nature. They tend to get along with races that treat\n"
			+ " them well and respect their boundaries. They love exploration, both physical and intellectual, and tend to be natural\n"
			+ " adventurers.";
	
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
