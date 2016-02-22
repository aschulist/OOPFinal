package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Tengus extends Race{

	public Tengus() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These crowlike humanoid scavengers excel in mimicry and swordplay. Flocking into densely populated cities, tengus\n"
			+ " occasionally join adventuring groups out of curiosity or necessity. Their impulsive nature and strange habits can often\n"
			+ " be unnerving to those who are not used to them.";
	
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
