package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Vanaras extends Race{

	public Vanaras() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These mischievous, monkeylike humanoids dwell in jungles and warm forests. Covered in soft fur and sporting prehensile\n"
			+ " tails and handlike feet, vanaras are strong climbers. These creatures are at home both on the ground and among the treetops.";
	
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
