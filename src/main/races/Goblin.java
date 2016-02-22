package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Goblin extends Race{

	public Goblin() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Crazy pyromaniacs with a tendency to commit unspeakable violence, goblins are the smallest of the goblinoid races.\n"
			+ " While they are a fun-loving race, their humor is often cruel and hurtful. Adventuring goblins constantly wrestle with\n"
			+ " their darkly mischievous side in order to get along with others. Few are truly successful.";
	
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
