package main.races;

import main.classes.ClassType;

public abstract class Race {
	
	private String basicDescription;
	private String description;
	private String[] racialTraits;
	
	public Race(String basicDescription, String description, String[] racialTraits){
		this.basicDescription = basicDescription;
		this.description = description;
		this.racialTraits = racialTraits;
	}
	
	
	public String getBasicDescription(){
		return basicDescription;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String[] getRacialTraits(){
		return racialTraits;
	}

	public abstract void calculateAge(ClassType type);
	
	public abstract void calculateHeight();
	
	public abstract void calculateWeight();
}
