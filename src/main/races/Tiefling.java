package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Tiefling extends Race{

	public Tiefling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Diverse and often despised by humanoid society, tieflings are mortals stained with the blood of fiends. Other races rarely\n"
			+ " trust them, and this lack of empathy usually causes tieflings to embrace the evil, depravity, and rage that seethe within\n"
			+ " their corrupt blood. A select few see the struggle to smother such dark desires as motivation for grand heroism.";
	
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
