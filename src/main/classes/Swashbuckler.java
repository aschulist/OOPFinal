package main.classes;

public class Swashbuckler extends CharacterClass{

	public Swashbuckler() {
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
	private int level = 1;
	private static int hitDie = 10;
	private static int numberOfSkills = 4;
	private static String basicDescription = 
			" Combining the prowess of the fighter with the determination of the gunslinger, the swashbuckler is an acrobatic melee combatant.";
	
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
		info += "Hit Die: " + hitDie + "\n";
		info += "Skills: " + numberOfSkills + " + Int mod\n";
		for(String s : levelUnlocks){
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
		return toString;
	}
}
