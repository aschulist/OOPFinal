package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Merfolk extends Race{

	public Merfolk() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These creatures have the upper torso of a well-built and attractive humanoid and a lower half consisting of a finned tail.\n"
			+ " Though they are amphibious and extremely strong swimmers, their lower bodies make it difficult for them to move on land.\n"
			+ " Merfolk can be shy and reclusive. Typically keeping to themselves, they are distrustful of land-dwelling strangers.";
	
	private static String description = 
			" Merfolk have the upper torsos of well-built and attractive humans and lower halves consisting of the tail and fins of a great fish.\n"
			+ " Their hair and scales span a wide range of hues, with merfolk in a given region closely resembling each other. Merfolk can breathe\n"
			+ " air freely but move on dry land only with difficulty, and rarely spend long periods out of water. As a race, merfolk are insular and\n"
			+ " distrustful of strangers, but individuals, especially adventuring merfolk, break the mold and can be quite garrulous. Merfolk concern\n"
			+ " themselves more with nature and the arts than with morality and ethical debates, and have a strong inclination toward neutral alignments.";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Constitution, +2 Charisma: Merfolk are graceful, hale, and beautiful.",
			" Medium: Merfolk are Medium creatures and have no bonuses or penalties due to their size.",
			" Slow Speed: Merfolk have a base speed of 5 feet. They have a swim speed of 50 feet.",
			" Aquatic: Merfolk are humanoids with the aquatic subtype.",
			" Amphibious: Merfolk are amphibious, but prefer not to spend long periods out of the water.",
			" Low-Light Vision: Merfolk have low-light vision.",
			" Armor: Merfolk have a +2 natural armor bonus.",
			" Legless: Merfolk have no legs, and cannot be tripped.",
			" Languages: Merfolk begin play speaking Common and Aquan. Merfolk with high Intelligence scores can choose from the following: Aboleth, Aklo, Draconic, Elven, and Sylvan."};
	
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
			baseFt = 5;
			baseIn = 10;
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 8;
			break;
		}
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			addedInches += (rand.nextInt(10) + 1);
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
			baseWeight = 145;
			break;
		case FEMALE:
			baseWeight = 135;
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
