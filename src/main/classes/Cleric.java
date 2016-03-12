package main.classes;

public class Cleric extends CharacterClass{

	public Cleric() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}

	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +0; Fort save: +2; Ref Save: +0; Will Save: +2; Special: Aura, Channel energy 1d6, domains, orisons",
			" Level 2 BAB(Base Attack Bonus): +1; Fort save: +3; Ref Save: +0; Will Save: +3; Special: ",
			" Level 3 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +1; Will Save: +3; Special: Channel energy 2d6",
			" Level 4 BAB(Base Attack Bonus): +3; Fort save: +4; Ref Save: +1; Will Save: +4; Special: ",
			" Level 5 BAB(Base Attack Bonus): +3; Fort save: +4; Ref Save: +1; Will Save: +4; Special: Channel energy 3d6",
			" Level 6 BAB(Base Attack Bonus): +4; Fort save: +5; Ref Save: +2; Will Save: +5; Special: ",
			" Level 7 BAB(Base Attack Bonus): +5; Fort save: +5; Ref Save: +2; Will Save: +5; Special: Channel energy 4d6",
			" Level 8 BAB(Base Attack Bonus): +6/+1; Fort save: +6; Ref Save: +2; Will Save: +6; Special: ",
			" Level 9 BAB(Base Attack Bonus): +6/+1; Fort save: +6; Ref Save: +3; Will Save: +6; Special: Channel energy 5d6",
			" Level 10 BAB(Base Attack Bonus): +7/+2; Fort save: +7; Ref Save: +3; Will Save: +7; Special: ",
			" Level 11 BAB(Base Attack Bonus): +8/+3; Fort save: +7; Ref Save: +3; Will Save: +7; Special: Channel energy 6d6",
			" Level 12 BAB(Base Attack Bonus): +9/+4; Fort save: +8; Ref Save: +4; Will Save: +8; Special: ",
			" Level 13 BAB(Base Attack Bonus): +9/+4; Fort save: +8; Ref Save: +4; Will Save: +8; Special: Channel energy 7d6",
			" Level 14 BAB(Base Attack Bonus): +10/+5; Fort save: +9; Ref Save: +4; Will Save: +9; Special: ",
			" Level 15 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +9; Ref Save: +5; Will Save: +9; Special: Channel energy 8d6",
			" Level 16 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +10; Ref Save: +5; Will Save: +10; Special: ",
			" Level 17 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +10; Ref Save: +5; Will Save: +10; Special: Channel energy 9d6",
			" Level 18 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +11; Ref Save: +6; Will Save: +11; Special: ",
			" Level 19 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +11; Ref Save: +6; Will Save: +11; Special: Channel energy 10d6",
			" Level 20 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +12; Ref Save: +6; Will Save: +12; Special: "};
	private String[] spells = {
			" Level 1 Spells Per Day Lvl 0: 3; Lvl 1: 1 + 1;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 1
			" Level 2 Spells Per Day Lvl 0: 4;Lvl 1: 2 + 1;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 2
			" Level 3 Spells Per Day Lvl 0: 4;Lvl 1: 2 + 1;Lvl 2: 1 + 1;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 3
			" Level 4 Spells Per Day Lvl 0: 4;Lvl 1: 3 + 1;Lvl 2: 2 + 1;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 4
			" Level 5 Spells Per Day Lvl 0: 4;Lvl 1: 3 + 1;Lvl 2: 2 + 1;Lvl 3: 1 + 1;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 5
			" Level 6 Spells Per Day Lvl 0: 4;Lvl 1: 3 + 1;Lvl 2: 2 + 1;Lvl 3: 2 + 1;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 6
			" Level 7 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 3 + 1;Lvl 3: 2 + 1;Lvl 4: 1 + 1;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 7
			" Level 8 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 3 + 1;Lvl 3: 2 + 1;Lvl 4: 2 + 1;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 8
			" Level 9 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 3 + 1;Lvl 3: 3 + 1;Lvl 4: 2 + 1;Lvl 5: 1 + 1;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 9
			" Level 10 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 3 + 1;Lvl 4: 2 + 1;Lvl 5: 2 + 1;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 10
			" Level 11 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 3 + 1;Lvl 4: 3 + 1;Lvl 5: 2 + 1;Lvl 6: 1 + 1; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 11
			" Level 12 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 3 + 1;Lvl 5: 2 + 1;Lvl 6: 2 + 1; Lvl 7: -; Lvl 8: -; Lvl 9: -;",//lvl 12
			" Level 13 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 3 + 1;Lvl 5: 3 + 1;Lvl 6: 2 + 1; Lvl 7: 1 + 1; Lvl 8: -; Lvl 9: -;",//lvl 13
			" Level 14 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 3 + 1;Lvl 6: 2 + 1; Lvl 7: 2 + 1; Lvl 8: -; Lvl 9: -;",//lvl 14
			" Level 15 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 3 + 1;Lvl 6: 3 + 1; Lvl 7: 2 + 1; Lvl 8: 1 + 1; Lvl 9: -;",//lvl 15
			" Level 16 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 4 + 1;Lvl 6: 3 + 1; Lvl 7: 3 + 1; Lvl 8: 2 + 1; Lvl 9: -;",//lvl 16
			" Level 17 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 4 + 1;Lvl 6: 3 + 1; Lvl 7: 3 + 1; Lvl 8: 2 + 1; Lvl 9: 1 + 1;",//lvl 17
			" Level 18 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 4 + 1;Lvl 6: 4 + 1; Lvl 7: 3 + 1; Lvl 8: 3 + 1; Lvl 9: 2 + 1;",//lvl 18
			" Level 19 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 4 + 1;Lvl 6: 4 + 1; Lvl 7: 4 + 1; Lvl 8: 3 + 1; Lvl 9: 3 + 1;",//lvl 19
			" Level 20 Spells Per Day Lvl 0: 4;Lvl 1: 4 + 1;Lvl 2: 4 + 1;Lvl 3: 4 + 1;Lvl 4: 4 + 1;Lvl 5: 4 + 1;Lvl 6: 4 + 1; Lvl 7: 4 + 1; Lvl 8: 4 + 1; Lvl 9: 4 + 1;"};//lvl 20
	private int level = 1;
	private static int hitDie = 8;
	private static int numberOfSkills = 2;
	private static String basicDescription = 
			" A devout follower of a deity, the cleric can heal wounds, raise the dead, and call down the wrath of the gods.";
	

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
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
