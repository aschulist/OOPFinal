package main.classes;

public class Cavalier extends CharacterClass{

	public Cavalier() {
		super(hitDie, numberOfSkills, basicDescription);
		super.setInformation(createInfo());
		// TODO Auto-generated constructor stub
	}

	private String[] levelUnlocks = {
			" Level 1 BAB(Base Attack Bonus): +1; Fort save: +2; Ref Save: +0; Will Save: +0; Special: Challenge 1/day, Mount, Order, Tactician",
			" Level 2 BAB(Base Attack Bonus): +2; Fort save: +3; Ref Save: +0; Will Save: +0; Special: Order ability",
			" Level 3 BAB(Base Attack Bonus): +3; Fort save: +3; Ref Save: +1; Will Save: +1; Special: Cavalier's charge",
			" Level 4 BAB(Base Attack Bonus): +4; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Challenge 2/day, Expert trainer",
			" Level 5 BAB(Base Attack Bonus): +5; Fort save: +4; Ref Save: +1; Will Save: +1; Special: Banner",
			" Level 6 BAB(Base Attack Bonus): +6/+1; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Bonus feat",
			" Level 7 BAB(Base Attack Bonus): +7/+2; Fort save: +5; Ref Save: +2; Will Save: +2; Special: Challenge 3/day",
			" Level 8 BAB(Base Attack Bonus): +8/+3; Fort save: +6; Ref Save: +2; Will Save: +2; Special: Order ability",
			" Level 9 BAB(Base Attack Bonus): +9/+4; Fort save: +6; Ref Save: +3; Will Save: +3; Special: Greater tactician",
			" Level 10 BAB(Base Attack Bonus): +10/+5; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Challenge 4/day",
			" Level 11 BAB(Base Attack Bonus): +11/+6/+1; Fort save: +7; Ref Save: +3; Will Save: +3; Special: Mighty charge",
			" Level 12 BAB(Base Attack Bonus): +12/+7/+2; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Bonus feat, Demanding challenge",
			" Level 13 BAB(Base Attack Bonus): +13/+8/+3; Fort save: +8; Ref Save: +4; Will Save: +4; Special: Challenge 5/day",
			" Level 14 BAB(Base Attack Bonus): +14/+9/+4; Fort save: +9; Ref Save: +4; Will Save: +4; Special: Greater banner",
			" Level 15 BAB(Base Attack Bonus): +15/+10/+5; Fort save: +9; Ref Save: +5; Will Save: +5; Special: Order ability",
			" Level 16 BAB(Base Attack Bonus): +16/+11/+6/+1; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Challenge 6/day",
			" Level 17 BAB(Base Attack Bonus): +17/+12/+7/+2; Fort save: +10; Ref Save: +5; Will Save: +5; Special: Master tactician",
			" Level 18 BAB(Base Attack Bonus): +18/+13/+8/+3; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Bonus feat",
			" Level 19 BAB(Base Attack Bonus): +19/+14/+9/+4; Fort save: +11; Ref Save: +6; Will Save: +6; Special: Challenge 7/day",
			" Level 20 BAB(Base Attack Bonus): +20/+15/+10/+5; Fort save: +12; Ref Save: +6; Will Save: +6; Special: Surpreme charge"};
	private int level = 1;
	private static int hitDie = 10;
	private static int numberOfSkills = 4;
	private static String basicDescription = 
			" Mounted upon his mighty steed, the cavalier is a brave warrior, using his wit, charm, and strength at arms to rally his companions and\n"
			+ " achieve his goals.";
	
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
