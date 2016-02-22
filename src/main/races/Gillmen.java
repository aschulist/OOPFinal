package main.races;

import main.classes.ClassType;

public class Gillmen extends Race{

	public Gillmen() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Survivors of a land-dwelling culture whose homeland was destroyed, gillmen were saved and transformed into an amphibious\n"
			+ " race by the aboleths. Though in many ways they appear nearly human, gillmen's bright purple eyes and gills set them apart\n"
			+ " from humanity. Reclusive and suspicious, gillmen know that one day the aboleths will call in the debt owed to them.";
	
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
