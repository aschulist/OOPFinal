package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Merfolk extends Race{

	public Merfolk() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These creatures have the upper torso of a well-built and attractive humanoid and a lower half consisting of a finned tail.\n"
			+ " Though they are amphibious and extremely strong swimmers, their lower bodies make it difficult for them to move on land.\n"
			+ " Merfolk can be shy and reclusive. Typically keeping to themselves, they are distrustful of land-dwelling strangers.";
	
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
