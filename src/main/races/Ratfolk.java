package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Ratfolk extends Race{

	public Ratfolk() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These small, ratlike humanoids are clannish and nomadic masters of trade. Often tinkers and traders, they are more\n"
			+ " concerned with accumulating interesting trinkets than amassing wealth. Ratfolk often adventure to find new and interesting\n"
			+ " curiosities rather than coin.";
	
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
