package main.classes;

public class Arcanist extends CharacterClass{

	public Arcanist() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}
	
	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +0; Fort save: +0; Ref Save: +0; Will Save: +2; Special: Arcane reservoir, Arcanist exploit, Cantrips, Consume spells",
			" Level 2 BAB(Base Attack Bonus): +1; Fort save: +0; Ref Save: +0; Will Save: +3; Special: ",
			" Level 3 BAB(Base Attack Bonus): +1; Fort save: +1; Ref Save: +1; Will Save: +3; Special: Arcanist exploit",
			" Level 4 BAB(Base Attack Bonus): +2; Fort save: +1; Ref Save: +1; Will Save: +4; Special: ",
			" Level 5 BAB(Base Attack Bonus): +2; Fort save: +1; Ref Save: +1; Will Save: +4; Special: Arcanist exploit",
			" Level 6 BAB(Base Attack Bonus): +3; Fort save: +2; Ref Save: +2; Will Save: +5; Special: ",
			" Level 7 BAB(Base Attack Bonus): +3; Fort save: +2; Ref Save: +2; Will Save: +5; Special: Arcanist exploit",
			" Level 8 BAB(Base Attack Bonus): +4; Fort save: +2; Ref Save: +2; Will Save: +6; Special: ",
			" Level 9 BAB(Base Attack Bonus): +4; Fort save: +3; Ref Save: +3; Will Save: +6; Special: Arcanist exploit",
			" Level 10 BAB(Base Attack Bonus): +5; Fort save: +3; Ref Save: +3; Will Save: +7; Special: ",
			" Level 11 BAB(Base Attack Bonus): +5; Fort save: +3; Ref Save: +3; Will Save: +7; Special: Arcanist exploit",
			" Level 12 BAB(Base Attack Bonus): +6/+1; Fort save: +4; Ref Save: +4; Will Save: +8; Special: ",
			" Level 13 BAB(Base Attack Bonus): +6/+1; Fort save: +4; Ref Save: +4; Will Save: +8; Special: Arcanist exploit",
			" Level 14 BAB(Base Attack Bonus): +7/+2; Fort save: +4; Ref Save: +4; Will Save: +9; Special: ",
			" Level 15 BAB(Base Attack Bonus): +7/+2; Fort save: +5; Ref Save: +5; Will Save: +9; Special: Arcanist exploit",
			" Level 16 BAB(Base Attack Bonus): +8/+3; Fort save: +5; Ref Save: +5; Will Save: +10; Special: ",
			" Level 17 BAB(Base Attack Bonus): +8/+3; Fort save: +5; Ref Save: +5; Will Save: +10; Special: Arcanist exploit",
			" Level 18 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +6; Will Save: +11; Special: ",
			" Level 19 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +6; Will Save: +11; Special: Arcanist exploit",
			" Level 20 BAB(Base Attack Bonus): ++10/+5; Fort save: +6; Ref Save: +6; Will Save: +12; Special: Mighty rage, Rage power"};
	private String[] spells = {
			" Level 1 Spells Per Day Lvl 0: unlimited;Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 4;Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 2 Spells Per Day Lvl 0: unlimited;Lvl 1: 3;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 5;Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 3 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 5;Lvl 1: 3;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 4 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 2;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 6;Lvl 1: 3;Lvl 2: 1;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 5 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 3;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 6;Lvl 1: 4;Lvl 2: 2;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 6 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 2;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 7;Lvl 1: 4;Lvl 2: 2;Lvl 3: 1;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 7 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 3;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 7;Lvl 1: 5;Lvl 2: 3;Lvl 3: 2;Lvl 4: -;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 8 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 2;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 8;Lvl 1: 5;Lvl 2: 3;Lvl 3: 2;Lvl 4: 1;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 9 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 3;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 8;Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: 2;Lvl 5: -;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 10 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 2;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: 2;Lvl 5: 1;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 11 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 3;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: 2;Lvl 6: -; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 12 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 2; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: 2;Lvl 6: 1; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 13 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: -; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 3;Lvl 6: 2; Lvl 7: -; Lvl 8: -; Lvl 9: -;",
			" Level 14 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 2; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 3;Lvl 6: 2; Lvl 7: 1; Lvl 8: -; Lvl 9: -;",
			" Level 15 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 3; Lvl 8: -; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: 2; Lvl 8: -; Lvl 9: -;",
			" Level 16 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 4; Lvl 8: 2; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: 2; Lvl 8: 1; Lvl 9: -;",
			" Level 17 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 4; Lvl 8: 3; Lvl 9: -; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: 3; Lvl 8: 2; Lvl 9: -;",
			" Level 18 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 4; Lvl 8: 4; Lvl 9: 2; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: 3; Lvl 8: 2; Lvl 9: 1;",
			" Level 19 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 4; Lvl 8: 4; Lvl 9: 3; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 6: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: 3; Lvl 8: 3; Lvl 9: 2;",
			" Level 20 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 4; Lvl 7: 4; Lvl 8: 4; Lvl 9: 4; Known Spells Lvl 0: 9;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 4;Lvl 6: 3; Lvl 7: 3; Lvl 8: 3; Lvl 9: 3;"};
	private int level = 1;
	private static int hitDie = 6;
	private static int numberOfSkills = 2;
	private static String basicDescription = 
			" Blending the power of the sorcerer with the versatility of the wizard, the arcanist draws upon a reservoir of power to bend magic to\n"
			+ " her will.";
	
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
