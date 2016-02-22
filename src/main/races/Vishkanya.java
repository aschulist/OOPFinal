package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Vishkanya extends Race{

	public Vishkanya() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Strangely beautiful on the outside and poisonous on the inside, vishkanyas see the world through slitted serpent eyes.\n"
			+ " Vishkanyas possess a serpent's grace and ability to writhe out of their enemies' grasp with ease. Vishkanyas have a\n"
			+ " reputation for being both seductive and manipulative. They can use their saliva or blood to poison their weapons.";
	
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
