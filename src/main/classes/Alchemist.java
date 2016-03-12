package main.classes;

public class Alchemist extends CharacterClass{

	public Alchemist(){
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}
	
	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +0; Fort save: +2; Ref Save: +2; Will Save: +0; Special: Alchemy, Bomb 1d6, Brew potion, Mutagen, Throw anything",
			" Level 2 BAB(Base Attack Bonus): +1; Fort save: +3; Ref Save: +3; Will Save: +0; Special: Discovery, Poison resistance +2, Poison use",
			" Level 3 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +3; Will Save: +1; Special: Bomb 2d6, Swift alchemy",
			" Level 4 BAB(Base Attack Bonus): +3; Fort save: +4; Ref Save: +4; Will Save: +1; Special: Discovery",
			" Level 5 BAB(Base Attack Bonus): +3; Fort save: +4; Ref Save: +4; Will Save: +1; Special: Bomb 3d6, Poison resistnace +4",
			" Level 6 BAB(Base Attack Bonus): +4; Fort save: +5; Ref Save: +5; Will Save: +2; Special: Discovery, Swift poison",
			" Level 7 BAB(Base Attack Bonus): +5; Fort save: +5; Ref Save: +5; Will Save: +2; Special: Bomb 4d6",
			" Level 8 BAB(Base Attack Bonus): +6/+1; Fort save: +6; Ref Save: +6; Will Save: +2; Special: Discovery, Poison resistnace +6",
			" Level 9 BAB(Base Attack Bonus): +6/+1; Fort save: +6; Ref Save: +6; Will Save: +3; Special: Bomb 5d6",
			" Level 10 BAB(Base Attack Bonus): +7/+2; Fort save: +7; Ref Save: +7; Will Save: +3; Special: Discovery, Poison immunity",
			" Level 11 BAB(Base Attack Bonus): +8/+3; Fort save: +7; Ref Save: +7; Will Save: +3; Special: Bomb 6d6",
			" Level 12 BAB(Base Attack Bonus): +9/+4; Fort save: +8; Ref Save: +8; Will Save: +4; Special: Discovery",
			" Level 13 BAB(Base Attack Bonus): +9/+4; Fort save: +8; Ref Save: +8; Will Save: +4; Special: Bomb 7d6",
			" Level 14 BAB(Base Attack Bonus): +10/+5; Fort save: +9; Ref Save: +9; Will Save: +4; Special: Discovery, Persistent mutagen",
			" Level 15 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +9; Ref Save: +9; Will Save: +5; Special: Bomb 8d6",
			" Level 16 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +10; Ref Save: +10; Will Save: +5; Special: Discovery",
			" Level 17 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +10; Ref Save: +10; Will Save: +5; Special: Bomb 9d6",
			" Level 18 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +11; Ref Save: +11; Will Save: +6; Special: Discovery, Instant alchemy",
			" Level 19 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +11; Ref Save: +11; Will Save: +6; Special: Bomb 10d6",
			" Level 20 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +12; Ref Save: +12; Will Save: +6; Special: Grand discovery"};
	private String[] spells = {
			" Level 1 Extracts Per Day Lvl 1: 1;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 2 Extracts Per Day Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 3 Extracts Per Day Lvl 1: 3;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 4 Extracts Per Day Lvl 1: 3;Lvl 2: 1;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 5 Extracts Per Day Lvl 1: 4;Lvl 2: 2;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 6 Extracts Per Day Lvl 1: 4;Lvl 2: 3;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 7 Extracts Per Day Lvl 1: 4;Lvl 2: 3;Lvl 3: 1;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 8 Extracts Per Day Lvl 1: 4;Lvl 2: 4;Lvl 3: 2;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 9 Extracts Per Day Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 10 Extracts Per Day Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: 1;Lvl 5: -;Lvl 6: -;",
			" Level 11 Extracts Per Day Lvl 1: 5;Lvl 2: 4;Lvl 3: 4;Lvl 4: 2;Lvl 5: -;Lvl 6: -;",
			" Level 12 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: -;Lvl 6: -;",
			" Level 13 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: 1;Lvl 6: -;",
			" Level 14 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 2;Lvl 6: -;",
			" Level 15 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 3;Lvl 6: -;",
			" Level 16 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 3;Lvl 6: 1;",
			" Level 17 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 4;Lvl 6: 2;",
			" Level 18 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 5;Lvl 5: 4;Lvl 6: 3;",
			" Level 19 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 5;Lvl 5: 5;Lvl 6: 4;",
			" Level 20 Extracts Per Day Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 5;Lvl 5: 5;Lvl 6: 5;"};
	private int level = 1;
	private static int hitDie = 8;
	private static int numberOfSkills = 4;
	private static String basicDescription = 
			" The alchemist is the master of alchemy, using extracts to grant him great power, mutagens to enhance his form, and bombs to destroy his\n"
			+ " enemies.";
	
	private static String information = "";

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return information;
	}
	
	private String createInfo(){
		String info = "";
		info += "Hit Die: " + hitDie;
		info += "Skills: " + numberOfSkills + " + Int mod";
		for(String s : levelUnlocks){
			info += s;
			info += "\n";
		}
		for(String s : spells){
			info += s;
			info += "\n";
		}
		return info;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toString = "";
		for(int i = 0; i < level; i ++){
			toString += levelUnlocks[i];
			toString += "\n";
		}
		toString += spells[(level - 1)];
		return toString;
	}
}
