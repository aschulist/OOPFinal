package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Wayang extends Race{

	public Wayang() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" The small wayangs are creatures of the Plane of Shadow. They are so attuned to shadow that it even shapes their philosophy,\n"
			+ " believing that upon death they merely merge back into darkness. The mysteries of their shadowy existence grant them the\n"
			+ " ability to gain healing from negative energy as well as positive energy.";
	
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
