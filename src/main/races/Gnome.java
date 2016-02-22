package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Gnome extends Race{
	
	public Gnome() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Expatriates of the strange land of fey, these small folk have a reputation for flighty and eccentric behavior. Many gnomes\n"
			+ " are whimsical artisans and tinkers, creating strange devices powered by magic, alchemy, and their quirky imagination.\n"
			+ " Gnomes have an insatiable need for new experiences that often gets them in trouble.";
	
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
