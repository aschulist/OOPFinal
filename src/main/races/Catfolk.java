package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Catfolk extends Race{

	public Catfolk() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}
	
	private static String basicDescription = 
			" A race of graceful explorers, catfolk are both clannish and curious by nature. They tend to get along with races that treat\n"
			+ " them well and respect their boundaries. They love exploration, both physical and intellectual, and tend to be natural\n"
			+ " adventurers.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Wisdom: Catfolk are sociable and agile, but often lack common sense.",
			" Catfolk: Catfolk are humanoids with the catfolk subtype.",
			" Medium: Catfolk are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Catfolk have a base speed of 30 feet.",
			" Low-Light Vision: In dim light, catfolk can see twice as far as humans.",
			" Cat's Luck (Ex): Once per day when a catfolk makes a Reflex saving throw, he can roll the saving throw twice and take the better result. He must decide to use this ability before the saving throw is attempted.",
			" Natural Hunter: Catfolk receive a +2 racial bonus on Perception, Stealth, and Survival checks.",
			" Sprinter: Catfolk gain a 10-foot racial bonus to their speed when using the charge, run, or withdraw actions.",
			" Languages: Catfolk begin play speaking Common and Catfolk. Catfolk with high Intelligence scores can choose from the following languages: Elven, Gnoll, Gnome, Goblin, Halfling, Orc, and Sylvan."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 15;
		switch(type){
		case BARBARIAN:
		case ORACLE:
		case ROGUE:
		case SORCERER:
		case BLOODRAGER:
		case INVESTIGATOR:
		case NINJA:
			for(int i = 0; i < 1; i++){
				age += rand.nextInt(4) + 1;
			}
			break;
		case BARD:
		case CAVALIER:
		case FIGHTER:
		case GUNSLINGER:
		case PALADIN:
		case RANGER:
		case SUMMONER:
		case WITCH:
		case BRAWLER:
		case HUNTER:
		case SHAMAN:
		case SLAYER:
		case SWASHBUCKLER:
		case SAMURAI:
			for(int i = 0; i < 1; i++){
				age += rand.nextInt(6) + 1;
			}
			break;
		case ALCHEMIST:
		case CLERIC:
		case DRUID:
		case INQUISITOR:
		case MAGNUS:
		case WIZARD:
		case ARCANIST:
		case SKALD:
		case WARPRIEST:
		case KINETICIST:
		case MEDIUM:
		case MESMERIST:
		case OCCULTIST:
		case PSYCHIC:
		case SPIRITUALIST:
			for(int i = 0; i < 2; i++){
				age += rand.nextInt(6) + 1;
			}
			break;
		}
		super.setAge(age);
	}

	@Override
	public void calculateHeight(Gender g) {
		// TODO Auto-generated method stub
		int baseFt = 0;
		int baseIn = 0;
		switch(g){
		case MALE:
			baseFt = 4;
			baseIn = 10;
			break;
		case FEMALE:
			baseFt = 4;
			baseIn = 5;
			break;
		}
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			addedInches += (rand.nextInt(8) + 1);
		}
		calculateWeight(g, addedInches);
		int heightFt = baseFt;
		int heightIn = baseIn + addedInches;
		while(heightIn >= 12){
			heightIn -= 12;
			heightFt += 1;
		}
		super.setHeight(heightFt, heightIn);
	}

	@Override
	public void calculateWeight(Gender g, int addedInches) {
		// TODO Auto-generated method stub
		int baseWeight = 0;
		switch(g){
		case MALE:
			baseWeight = 120;
			break;
		case FEMALE:
			baseWeight = 85;
			break;
		}
		int weight = baseWeight + (addedInches * 5);
		super.setWeight(weight);
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
