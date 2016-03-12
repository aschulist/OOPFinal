package main.classes;

public class Oracle extends CharacterClass{

	public Oracle() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}

	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +1; Fort save: +2; Ref Save: +0; Will Save: +0; Special: Fast Movement, Rage",
			" Level 2 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +0; Will Save: +0; Special: Rage power, Uncanny dodge",
			" Level 3 BAB(Base Attack Bonus): +3; Fort save: +3; Ref Save: +1; Will Save: +1; Special: Trap sense +1",
			" Level 4 BAB(Base Attack Bonus): +4; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Rage Power",
			" Level 5 BAB(Base Attack Bonus): +5; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Improved uncanny dodge",
			" Level 6 BAB(Base Attack Bonus): +6/+1; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Rage power, Trap sense +2",
			" Level 7 BAB(Base Attack Bonus): +7/+2; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Damage reduction 1/-",
			" Level 8 BAB(Base Attack Bonus): +8/+3; Fort save: +6; Ref Save: +2; Will Save: +2; Special: Rage power",
			" Level 9 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +3; Will Save: +3; Special: Trap sense +3",
			" Level 10 BAB(Base Attack Bonus): +10/+5; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Damage reduction 2/-, Rage power",
			" Level 11 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Greater rage",
			" Level 12 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Rage Power, Trap sense +4",
			" Level 13 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Damage reduction 3/-",
			" Level 14 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +9; Ref Save: +4; Will Save: +4; Special: Indomitable will, Rage power",
			" Level 15 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +9; Ref Save: +5; Will Save: +5; Special: Trap sense +5",
			" Level 16 BAB(Base Attack Bonus): +16/+11/+6/+1; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Damage reduction 4/-, Rage power",
			" Level 17 BAB(Base Attack Bonus): +17/+12/+7/+2; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Tireless rage",
			" Level 18 BAB(Base Attack Bonus): +18/+13/+8/+3; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Rage power, trap sense +6",
			" Level 19 BAB(Base Attack Bonus): +19/+14/+9/+4; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Damage reduction 5/-",
			" Level 20 BAB(Base Attack Bonus): +20/+15/+10/+5; Fort save: +12; Ref Save: +6; Will Save: +6; Special: Mighty rage, Rage power"};
	private String[] spells = {
			" Level 1 Spells Per Day Lvl 0: unlimited;Lvl 1: 1;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 4;Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 2 Spells Per Day Lvl 0: unlimited;Lvl 1: 2;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 5;Lvl 1: 3;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 3 Spells Per Day Lvl 0: unlimited;Lvl 1: 3;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 4;Lvl 2: -;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 4 Spells Per Day Lvl 0: unlimited;Lvl 1: 3;Lvl 2: 1;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 4;Lvl 2: 2;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 5 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 2;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 4;Lvl 2: 3;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 6 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 3;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 4;Lvl 2: 4;Lvl 3: -;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 7 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 3;Lvl 3: 1;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 5;Lvl 2: 4;Lvl 3: 2;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 8 Spells Per Day Lvl 0: unlimited;Lvl 1: 4;Lvl 2: 4;Lvl 3: 2;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 9 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: -;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 5;Lvl 2: 4;Lvl 3: 4;Lvl 4: -;Lvl 5: -;Lvl 6: -;",
			" Level 10 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 4;Lvl 3: 3;Lvl 4: 1;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 2;Lvl 5: -;Lvl 6: -;",
			" Level 11 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 4;Lvl 3: 4;Lvl 4: 2;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: -;Lvl 6: -;",
			" Level 12 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: -;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: -;Lvl 6: -;",
			" Level 13 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 3;Lvl 5: 1;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 2;Lvl 6: -;",
			" Level 14 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 4;Lvl 4: 4;Lvl 5: 2;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 6;Lvl 3: 5;Lvl 4: 4;Lvl 5: 3;Lvl 6: -;",
			" Level 15 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 3;Lvl 6: -; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 6;Lvl 3: 5;Lvl 4: 4;Lvl 5: 4;Lvl 6: -;",
			" Level 16 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 3;Lvl 6: 1; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 6;Lvl 3: 5;Lvl 4: 5;Lvl 5: 4;Lvl 6: 2;",
			" Level 17 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 4;Lvl 5: 4;Lvl 6: 2; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 6;Lvl 3: 6;Lvl 4: 5;Lvl 5: 4;Lvl 6: 3;",
			" Level 18 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 5;Lvl 5: 4;Lvl 6: 3; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 6;Lvl 3: 6;Lvl 4: 5;Lvl 5: 4;Lvl 6: 4;",
			" Level 19 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 5;Lvl 5: 5;Lvl 6: 4; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 6: 6;Lvl 3: 6;Lvl 4: 5;Lvl 5: 5;Lvl 6: 4;",
			" Level 20 Spells Per Day Lvl 0: unlimited;Lvl 1: 5;Lvl 2: 5;Lvl 3: 5;Lvl 4: 5;Lvl 5: 5;Lvl 6: 5; Known Spells Lvl 0: 6;Lvl 1: 6;Lvl 2: 6;Lvl 3: 6;Lvl 4: 6;Lvl 5: 5;Lvl 6: 5;"};
	private int level = 1;
	private static int hitDie = 8;
	private static int numberOfSkills = 4;
	private static String basicDescription = 
			" Drawing upon divine mysteries, the oracle channels divine power through her body and soul, but at a terrible price.";
	
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
