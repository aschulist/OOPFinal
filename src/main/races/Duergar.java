package main.races;

import main.classes.ClassType;

public class Duergar extends Race{

	public Duergar() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Gray skinned, deep-dwelling dwarves who hate their lighter skinned cousins, duergar view life as constant toil ending only\n"
			+ " in death. Though these dwarves are typically evil, honor and keeping one's word means everything to them, and a rare few\n"
			+ " make loyal adventuring companions.";
	
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
