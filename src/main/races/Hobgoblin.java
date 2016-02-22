package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Hobgoblin extends Race{

	public Hobgoblin() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These creatures are the most disciplined and militaristic of the goblinoid races. Tall, tough as nails, and strongly built,\n"
			+ " hobgoblins would be a boon to any adventuring group, were it not for the fact that they tend to be cruel and malicious, and\n"
			+ " often keep slaves.";
	
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
