package main.races;

import main.classes.ClassType;

public class Changeling extends Race{

	public Changeling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" The offspring of hags and their mortal lovers, changelings are abandoned and raised by foster parents. Always female,\n"
			+ " changelings all hear a spiritual call during puberty to find their true origins. Tall and slender, with dark hair and\n"
			+ " eyes mismatched in color, changelings are eerily attractive.";
	
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
