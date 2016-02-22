package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Nagaji extends Race{

	public Nagaji() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" It is believed that nagas created the nagaji as a race of servants and that the nagaji worship their creators as living gods.\n"
			+ " Due to their reptilian nature and strange mannerisms, these strange, scaly folk inspire fear and wonder in others not of their\n"
			+ " kind. They are resistant to both poison and mind-affecting magic.";
	
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
