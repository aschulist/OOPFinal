package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Strix extends Race{

	public Strix() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Hunted to dwindling numbers by humans, who see them as winged devils, strix are black-skinned masters of the nighttime sky.\n"
			+ " Their territorial conflicts have fueled their hatred for humans. This longstanding feud means that these nocturnal creatures\n"
			+ " often attack humans on sight.";
	
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
