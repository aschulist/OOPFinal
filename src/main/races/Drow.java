package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Drow extends Race{

	public Drow() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Dark reflections of surface elves, drow are shadowy hunters who strive to snuff out the world's light. Drow are powerful\n"
			+ " magical creatures who typically serve demons, and only their chaotic nature stops them from becoming an even greater\n"
			+ " menace. A select few forsake their race's depraved and nihilistic society to walk a heroic path.";
	
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
