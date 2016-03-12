package main;

public class Name implements GetInfo{

	private String name;
	private String basicDescription = "The character's in name allows the your character to interact with the world to leave their name in history, leave behind a legacy, or etc,.";
	private String info = "Names are used in legal documents, applying for jobs, and anything that's expected in the to need a name in the real world";
	
	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return info;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
