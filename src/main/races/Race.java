package main.races;

import main.Gender;
import main.GetInfo;
import main.classes.ClassType;

public abstract class Race implements GetInfo{
	
	private String basicDescription;
	private String description;
	private String[] racialTraits;
	private int age;
	private int heightFt;
	private int heightIn;
	private int weight;
	
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
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setHeight(int ft, int in){
		heightFt = ft;
		heightIn = in;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}

	public abstract void calculateAge(ClassType type);
	
	public abstract void calculateHeight(Gender g);
	
	public abstract void calculateWeight(Gender g, int addedInches);
	
	public String toString(){
		String toString = "";
		for(String r : racialTraits){
			toString += r;
			toString += "\n";
		}
		toString += getDetails();
		return toString;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getHeightFt(){
		return heightFt;
	}
	
	public int getHeightIn(){
		return heightIn;
	}
	
	public int getWeight(){
		return weight;
	}

	public String getDetails() {
		// TODO Auto-generated method stub
		String details = "";
		details += " Age: " + age + "; Height: " + heightFt + "' " + heightIn + "\"" + " Weight: " + weight + "lbs.";
		return details;
	}
}
