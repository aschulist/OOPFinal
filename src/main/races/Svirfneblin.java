package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Svirfneblin extends Race{

	public Svirfneblin() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Gnomes who guard their hidden enclaves within dark tunnels and caverns deep under the earth, svirfneblin are as serious as\n"
			+ " their surface cousins are whimsical. They are resistant to the magic of the foul creatures that share their subterranean\n"
			+ " environs, and wield powerful protective magic. Svirfneblin are distrustful of outsiders and often hide at their approach.";
	
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
