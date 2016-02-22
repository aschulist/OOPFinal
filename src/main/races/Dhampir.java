package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Dhampir extends Race{

	public Dhampir() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" The accursed spawn of vampires, dhampirs are living creatures tainted with the curse of undeath, which causes them to take\n"
			+ " damage from positive energy and gain healing from negative energy. While many members of this race embrace their dark\n"
			+ " sides, others are powerfully driven to rebel against their taint and hunt down and destroy vampires and their ilk.";
	
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
