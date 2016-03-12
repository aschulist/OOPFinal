package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Hobgoblin extends Race{

	public Hobgoblin() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These creatures are the most disciplined and militaristic of the goblinoid races. Tall, tough as nails, and strongly built,\n"
			+ " hobgoblins would be a boon to any adventuring group, were it not for the fact that they tend to be cruel and malicious, and\n"
			+ " often keep slaves.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Constitution: Hobgoblins are fast and hardy.",
			" Goblinoid: Hobgoblins are humanoids with the goblinoid subtype.",
			" Medium: Hobgoblins are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Hobgoblins have a base speed of 30 feet.",
			" Darkvision: Hobgoblins can see in the dark up to 60 feet.",
			" Sneaky: Hobgoblins receive a +4 racial bonus on Stealth checks.",
			" Languages: Hobgoblins begin play speaking Common and Goblin. Hobgoblins with high Intelligence scores can choose from the following: Draconic, Dwarven, Infernal, Giant, and Orc."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 14;
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
			baseIn = 2;
			break;
		case FEMALE:
			baseFt = 4;
			baseIn = 0;
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
			baseWeight = 165;
			break;
		case FEMALE:
			baseWeight = 145;
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
