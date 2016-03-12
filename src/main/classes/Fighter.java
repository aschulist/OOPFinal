package main.classes;

public class Fighter extends CharacterClass{

	public Fighter() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}

	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +1; Fort save: +2; Ref Save: +0; Will Save: +0; Special: Bonus Feat",
			" Level 2 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +0; Will Save: +0; Special: Bonus Feat, Bravery +1",
			" Level 3 BAB(Base Attack Bonus): +3; Fort save: +3; Ref Save: +1; Will Save: +1; Special: Armor training 1",
			" Level 4 BAB(Base Attack Bonus): +4; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Bonus Feat",
			" Level 5 BAB(Base Attack Bonus): +5; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Weapon training 1",
			" Level 6 BAB(Base Attack Bonus): +6/+1; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Bonus Feat, Bravery +2",
			" Level 7 BAB(Base Attack Bonus): +7/+2; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Armor training 2",
			" Level 8 BAB(Base Attack Bonus): +8/+3; Fort save: +6; Ref Save: +2; Will Save: +2; Special: Bonus Feat",
			" Level 9 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +3; Will Save: +3; Special: Weapon training 2",
			" Level 10 BAB(Base Attack Bonus): +10/+5; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Bonus Feat, Rage power",
			" Level 11 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Armor training 3",
			" Level 12 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Bonus Feat",
			" Level 13 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Weapon training 3",
			" Level 14 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +9; Ref Save: +4; Will Save: +4; Special: Bonus Feat, Rage power",
			" Level 15 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +9; Ref Save: +5; Will Save: +5; Special: Armor training 4",
			" Level 16 BAB(Base Attack Bonus): +16/+11/+6/+1; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Bonus Feat",
			" Level 17 BAB(Base Attack Bonus): +17/+12/+7/+2; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Weapon training 4",
			" Level 18 BAB(Base Attack Bonus): +18/+13/+8/+3; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Bonus Feat, trap sense +6",
			" Level 19 BAB(Base Attack Bonus): +19/+14/+9/+4; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Armor mastery",
			" Level 20 BAB(Base Attack Bonus): +20/+15/+10/+5; Fort save: +12; Ref Save: +6; Will Save: +6; Special: Bonus Feat, Weapon mastery"};
	private int level = 1;
	private static int hitDie = 10;
	private static int numberOfSkills = 2;
	private static String basicDescription = 
			" Brave and stalwart, the fighter is a master of all manner of arms and armor.";
	

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
