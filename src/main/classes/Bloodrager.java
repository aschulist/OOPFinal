package main.classes;

public class Bloodrager extends CharacterClass{

	public Bloodrager() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}
	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +1; Fort save: +2; Ref Save: +0; Will Save: +0; Special: Bloodline, Bloodline power, Bloodrage, Fast movement",
			" Level 2 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +0; Will Save: +0; Special: Uncanny dodge",
			" Level 3 BAB(Base Attack Bonus): +3; Fort save: +3; Ref Save: +1; Will Save: +1; Special: Blood sanctuary",
			" Level 4 BAB(Base Attack Bonus): +4; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Blood casting, Bloodline power, Eschew Materials",
			" Level 5 BAB(Base Attack Bonus): +5; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Improved uncanny dodge",
			" Level 6 BAB(Base Attack Bonus): +6/+1; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Bloodline feat",
			" Level 7 BAB(Base Attack Bonus): +7/+2; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Bloodline spell, Damage reduction 1/-",
			" Level 8 BAB(Base Attack Bonus): +8/+3; Fort save: +6; Ref Save: +2; Will Save: +2; Special: Bloodline power",
			" Level 9 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +3; Will Save: +3; Special: Bloodline feat",
			" Level 10 BAB(Base Attack Bonus): +10/+5; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Bloodline spell, Damage reduction 2/-",
			" Level 11 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Greater bloodrage",
			" Level 12 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Bloodline feat, Bloodline power",
			" Level 13 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Bloodline spell, Damage reduction 3/-",
			" Level 14 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +9; Ref Save: +4; Will Save: +4; Special: Indomitable will",
			" Level 15 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +9; Ref Save: +5; Will Save: +5; Special: Bloodline feat",
			" Level 16 BAB(Base Attack Bonus): +16/+12/+7/+1; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Bloodline spell, Bloodline power, Damage reduction 4/-",
			" Level 17 BAB(Base Attack Bonus): +17/+12/+7/+2; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Tireless bloodrage",
			" Level 18 BAB(Base Attack Bonus): +18/+13/+8/+3; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Bloodline feat",
			" Level 19 BAB(Base Attack Bonus): +19/+14/+9/+4; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Damage reduction 5/-",
			" Level 20 BAB(Base Attack Bonus): +20/+15/+10/+5; Fort save: +12; Ref Save: +6; Will Save: +6; Special: Bloodline power, Mighty bloodrage"};
	private String[] spells = {
			" Level 1 Spells Per Day Lvl 1: -;Lvl 2: -;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: -;Lvl 2: -;Lvl 3: -;Lvl 4: -;",
			" Level 2 Spells Per Day Lvl 1: -;Lvl 2: -;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: -;Lvl 2: -;Lvl 3: -;Lvl 4: -;",
			" Level 3 Spells Per Day Lvl 1: -;Lvl 2: -;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: -;Lvl 2: -;Lvl 3: -;Lvl 4: -;",
			" Level 4 Spells Per Day Lvl 1: 1;Lvl 2: -;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;",
			" Level 5 Spells Per Day Lvl 1: 1;Lvl 2: -;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: 3;Lvl 2: -;Lvl 3: -;Lvl 4: -;",
			" Level 6 Spells Per Day Lvl 1: 1;Lvl 2: -;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: 4;Lvl 2: -;Lvl 3: -;Lvl 4: -;",
			" Level 7 Spells Per Day Lvl 1: 1;Lvl 2: 1;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: 4;Lvl 2: 2;Lvl 3: -;Lvl 4: -;",
			" Level 8 Spells Per Day Lvl 1: 1;Lvl 2: 1;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: 4;Lvl 2: 3;Lvl 3: -;Lvl 4: -;",
			" Level 9 Spells Per Day Lvl 1: 2;Lvl 2: 1;Lvl 3: -;Lvl 4: -; Known Spells Lvl 1: 5;Lvl 2: 4;Lvl 3: -;Lvl 4: -;",
			" Level 10 Spells Per Day Lvl 1: 2;Lvl 2: 1;Lvl 3: 1;Lvl 4: -; Known Spells Lvl 1: 5;Lvl 2: 4;Lvl 3: 2;Lvl 4: -;",
			" Level 11 Spells Per Day Lvl 1: 2;Lvl 2: 1;Lvl 3: 1;Lvl 4: -; Known Spells Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: -;",
			" Level 12 Spells Per Day Lvl 1: 2;Lvl 2: 2;Lvl 3: 1;Lvl 4: -; Known Spells Lvl 1: 6;Lvl 2: 5;Lvl 3: 4;Lvl 4: -;",
			" Level 13 Spells Per Day Lvl 1: 3;Lvl 2: 2;Lvl 3: 1;Lvl 4: 1; Known Spells Lvl 1: 6;Lvl 2: 5;Lvl 3: 4;Lvl 4: 2;",
			" Level 14 Spells Per Day Lvl 1: 3;Lvl 2: 2;Lvl 3: 1;Lvl 4: 1; Known Spells Lvl 1: 6;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;",
			" Level 15 Spells Per Day Lvl 1: 3;Lvl 2: 2;Lvl 3: 2;Lvl 4: 1; Known Spells Lvl 1: 6;Lvl 2: 6;Lvl 3: 5;Lvl 4: 4;",
			" Level 16 Spells Per Day Lvl 1: 3;Lvl 2: 3;Lvl 3: 2;Lvl 4: 1; Known Spells Lvl 1: 6;Lvl 2: 6;Lvl 3: 5;Lvl 4: 4;",
			" Level 17 Spells Per Day Lvl 1: 4;Lvl 2: 3;Lvl 3: 2;Lvl 4: 1; Known Spells Lvl 1: 6;Lvl 2: 6;Lvl 3: 5;Lvl 4: 4;",
			" Level 18 Spells Per Day Lvl 1: 4;Lvl 2: 3;Lvl 3: 2;Lvl 4: 2; Known Spells Lvl 1: 6;Lvl 2: 6;Lvl 3: 6;Lvl 4: 5;",
			" Level 19 Spells Per Day Lvl 1: 4;Lvl 2: 3;Lvl 3: 3;Lvl 4: 2; Known Spells Lvl 1: 6;Lvl 6: 6;Lvl 3: 6;Lvl 4: 5;",
			" Level 20 Spells Per Day Lvl 1: 4;Lvl 2: 4;Lvl 3: 3;Lvl 4: 2; Known Spells Lvl 1: 6;Lvl 2: 6;Lvl 3: 6;Lvl 4: 5;"};
	
	private int level = 1;
	private static int hitDie = 10;
	private static int numberOfSkills = 4;
	private static String basicDescription = 
			" Fusing the frenzy of the barbarian with the bloodline might of the sorcerer, the bloodrager calls upon innate power to give himself\n"
			+ " extraordinary abilities.";

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
