package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Samsaran extends Race{

	public Samsaran() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ghostly servants of karma, samsarans are creatures reincarnated hundreds if not thousands of times in the hope of reaching"
			+ "\n true enlightenment. Unlike humans and other races, these humanoids remember much of their past lives.";
	
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
