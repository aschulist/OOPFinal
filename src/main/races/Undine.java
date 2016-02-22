package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Undine extends Race{

	public Undine() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Like their cousins, the ifrits, oreads, and sylphs, undines are humans touched by planar elements. They are the scions\n"
			+ " of elemental water, equally graceful both on land and in water. Undines are adaptable and resistant to cold, and have\n"
			+ " an affinity for water magic.";
	
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
