package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;

public class Changeling extends Race{

	public Changeling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" The offspring of hags and their mortal lovers, changelings are abandoned and raised by foster parents. Always female,\n"
			+ " changelings all hear a spiritual call during puberty to find their true origins. Tall and slender, with dark hair and\n"
			+ " eyes mismatched in color, changelings are eerily attractive.";
	
	private static String description = 
			" Changelings are the offspring of hags and their lovers taken through magic or madness. Dropped off on doorsteps of prospective foster\n"
			+ " parents, changelings are raised by strangers. Typically tall, slender, dark haired, and attractive, changelings otherwise resemble\n"
			+ " their fathers' race. They are always female, and their mismatched colored eyes and abnormally pale skin hint at their true heritage.\n"
			+ " At puberty, changelings receive \"the call,\" a hypnotic spiritual voice that beckons them to travel and discover their true origins.\n"
			+ " Changelings who ignore this call choose their own destiny; those who heed it discover their \"mother\" and may come into great power\n"
			+ " by transforming into hags themselves.";
	
	private static String[] racialTraits = {" +2 Wisdom, +2 Charisma, –2 Constitution: Changelings are frail, but are clever and comely.",
			" Medium: Changelings are Medium creatures and have no bonuses or penalties due to their size.",
			" Humanoid: Changelings are humanoids with the changeling subtype.",
			" Normal Speed: Changelings have a base speed of 30 feet.",
			" Hag Racial Trait: The changeling inherits one of the following racial traits, depending on her mother's hag type:",
			" Hulking Changeling (Annis Hag): The changeling gains a +1 racial bonus on melee damage.",
			" Green Widow (Green Hag): The changeling gains a +2 racial bonus on Bluff checks against creatures that are sexually attracted to her.",
			" Sea Lungs (Sea Hag): The changeling may hold her breath for a number of rounds equal to three times her Constitution before she risks drowning.",
			" Claws: Changelings' fingernails are hard and sharp, granting them two claw attacks (1d4 points of damage each).",
			" Natural Armor: Changelings have a +1 natural armor bonus.",
			" Darkvision: Changelings can see in the dark up to 60 feet.",
			" Languages: Changelings begin play speaking Common and the primary language of their host society. Changelings with high Intelligence scores can choose from the following: Aklo, Draconic, Dwarven, Elven, Giant, Gnoll, Goblin, and Orc.",
			" Changelings MUST BE FEMALE."};
	
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
		int baseFt = 5;
		int baseIn = 2;
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			addedInches += (rand.nextInt(4) + 1);
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
		int baseWeight = 85;
		int weight = baseWeight + (addedInches * 5);
		super.setWeight(weight);
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
