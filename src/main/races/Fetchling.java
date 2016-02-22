package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Fetchling extends Race{

	public Fetchling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Long ago, fetchlings were humans exiled to the Shadow Plane, but that plane's persistent umbra has transformed them into\n"
			+ " a race apart. These creatures have developed an ability to meld into the shadows and have a natural affinity for shadow\n"
			+ " magic. Fetchlings—who call themselves kayal—often serve as emissaries between the inhabitants of the Shadow Plane and\n"
			+ " the Material Plane.";
	
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
