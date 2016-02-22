package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Halfling extends Race{

	public Halfling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Members of this diminutive race find strength in family, community, and their own innate and seemingly inexhaustible luck.\n"
			+ " While their fierce curiosity is sometimes at odds with their intrinsic common sense, halflings are eternal optimists and\n"
			+ " cunning opportunists with an incredible knack for getting out the worst situations.";
	
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
