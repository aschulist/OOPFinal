package main.classes;

public class Brawler extends CharacterClass{

	public Brawler() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}

	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +1; Fort save: +2; Ref Save: +2; Will Save: +0; Unarmed Damage: 1d6; Special: Brawler's cunning, Martial flexibility, Martial training, Unarmed strike",
			" Level 2 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +3; Will Save: +0; Unarmed Damage: 1d6; Special: Bonus combat feat, Brawler's flurry (Two-weapon fighting)",
			" Level 3 BAB(Base Attack Bonus): +3; Fort save: +3; Ref Save: +3; Will Save: +1; Unarmed Damage: 1d6; Special: Maneuver training 1",
			" Level 4 BAB(Base Attack Bonus): +4; Fort save: +4; Ref Save: +4; Will Save: +1; Unarmed Damage: 1d8; Special: AC bonus +1, Knockout 1/day",
			" Level 5 BAB(Base Attack Bonus): +5; Fort save: +4; Ref Save: +4; Will Save: +1; Unarmed Damage: 1d8; Special: Bonus combat feat, Brawler's strike (Magic), close weapon mastery",
			" Level 6 BAB(Base Attack Bonus): +6/+1; Fort save: +5; Ref Save: +5; Will Save: +2; Unarmed Damage: 1d8; Special: Martial flexibility (swift action)",
			" Level 7 BAB(Base Attack Bonus): +7/+2; Fort save: +5; Ref Save: +5; Will Save: +2; Unarmed Damage: 1d8; Special: Maneuver training 2",
			" Level 8 BAB(Base Attack Bonus): +8/+3; Fort save: +6; Ref Save: +6; Will Save: +2; Unarmed Damage: 1d10; Special: Bonus combat feat, Brawler's flurry (Improved two-weapon fighting)",
			" Level 9 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +6; Will Save: +3; Unarmed Damage: 1d10; Special: AC bonus +2, Brawler's strimke (Cold iron and silver)",
			" Level 10 BAB(Base Attack Bonus): +10/+5; Fort save: +7; Ref Save: +7; Will Save: +3; Unarmed Damage: 1d10; Special: Martial flexibility (free action), Knockout 2/day",
			" Level 11 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +7; Ref Save: +7; Will Save: +3; Unarmed Damage: 1d10; Special: Bonus combat feat, Maneuver training 3",
			" Level 12 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +8; Ref Save: +8; Will Save: +4; Unarmed Damage: 2d6; Special: Brawler's strike (Alignment), Martial Flexibility (Immediate action)",
			" Level 13 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +8; Ref Save: +8; Will Save: +4; Unarmed Damage: 2d6; Special: AC bonus +3",
			" Level 14 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +9; Ref Save: +9; Will Save: +4; Unarmed Damage: 2d6; Special: Bonus combat feat",
			" Level 15 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +9; Ref Save: +9; Will Save: +5; Unarmed Damage: 2d6; Special: Brawler's flurry (Greater two-weapon fighting), Maneuver training 4",
			" Level 16 BAB(Base Attack Bonus): +16/+11/+6/+1; Fort save: +10; Ref Save: +10; Will Save: +5; Unarmed Damage: 2d8; Special: Awesome blow, Knockout 3/day",
			" Level 17 BAB(Base Attack Bonus): +17/+12/+7/+2; Fort save: +10; Ref Save: +10; Will Save: +5; Unarmed Damage: 2d8; Special: Bonus combat feat, blawler's strike (Adamantine)",
			" Level 18 BAB(Base Attack Bonus): +18/+13/+8/+3; Fort save: +11; Ref Save: +11; Will Save: +6; Unarmed Damage: 2d8; Special: AC bonus +4",
			" Level 19 BAB(Base Attack Bonus): +19/+14/+9/+4; Fort save: +11; Ref Save: +11; Will Save: +6; Unarmed Damage: 2d8; Special: Maneuver training 5",
			" Level 20 BAB(Base Attack Bonus): +20/+15/+10/+5; Fort save: +12; Ref Save: +12; Will Save: +6; Unarmed Damage: 2d10; Special: Bonus combat feat, Improved awesome blow, Martial flexibility (any number)"};
	private int level = 1;
	private static int hitDie = 10;
	private static int numberOfSkills = 4;
	private static String basicDescription = 
			" Focusing on hand-to-hand combat, the brawler mixes the martial artistry of the monk with the specialist training of the fighter.";
	
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
