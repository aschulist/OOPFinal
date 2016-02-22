package main.races;

import main.classes.ClassType;
import main.races.Race;

public class HalfElf extends Race{

	public HalfElf() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Often caught between the worlds of their progenitor races, half-elves are a race of both grace and contradiction. Their dual\n"
			+ " heritage and natural gifts often create brilliant diplomats and peacemakers, but half-elves are often susceptible to an\n"
			+ " intense and even melancholic isolation, realizing that they are never truly part of elven or human society.";
	
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
