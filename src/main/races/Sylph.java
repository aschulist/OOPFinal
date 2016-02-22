package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Sylph extends Race{

	public Sylph() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ethereal folk of elemental air, sylphs are the result of human blood mixed with that of airy elemental folk. Like ifrits,\n"
			+ " oreads, and undines, they can become powerful elemental sorcerers with command over their particular elemental dominion.\n"
			+ " They tend to be beautiful and lithe, and have a knack for eavesdropping.";
	
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
