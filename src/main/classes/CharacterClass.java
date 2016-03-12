package main.classes;

import main.GetInfo;

public abstract class CharacterClass implements GetInfo{

	private int hitDie;
	private int numberOfSkills;
	private String basicDescription;
	private String information;
	
	public CharacterClass(int hitDie, int numberOfSkills, String basicDescription) {
		// TODO Auto-generated constructor stub
		this.hitDie = hitDie;
		this.numberOfSkills = numberOfSkills;
		this.basicDescription = basicDescription;
	}
	
	public String getDescription(){
		return information;
	}
	
	public void setInformation(String info){
		information = info;
	}
	
	public abstract String toString();

	public int getHitDie() {
		// TODO Auto-generated method stub
		return hitDie;
	}

	public int getNumberOfSkills() {
		// TODO Auto-generated method stub
		return numberOfSkills;
	}
}
