package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Human extends Race{

	public Human() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ambitious, sometimes heroic, and always confident, humans have an ability to work together toward common goals that makes\n"
			+ " them a force to be reckoned with. Though short-lived compared to other races, their boundless energy and drive allow them\n"
			+ " to accomplish much in their brief lifetimes.";
	
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
