package main.races;

import main.classes.ClassType;

public class Ifrit extends Race{

	public Ifrit() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ifrits are a race descended from mortals and the strange inhabitants of the Plane of Fire. Their physical traits and\n"
			+ " personalities often betray their fiery origins, and they tend to be restless, independent, and imperious. Frequently driven\n"
			+ " from cities for their ability to manipulate flame, ifrits make powerful fire sorcerers and warriors who can wield flame\n"
			+ " like no other race.";
	
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
