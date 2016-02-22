package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Orc extends Race{

	public Orc() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Savage, brutish, and hard to kill, orcs are often the scourge of far-flung wildernesses and cavern deeps. Many orcs become\n"
			+ " fearsome barbarians, as they are muscular and prone to bloody rages. Those few who can control their bloodlust make\n"
			+ " excellent adventurers.";
	
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
