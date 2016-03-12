package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Vanaras extends Race{

	public Vanaras() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These mischievous, monkeylike humanoids dwell in jungles and warm forests. Covered in soft fur and sporting prehensile\n"
			+ " tails and handlike feet, vanaras are strong climbers. These creatures are at home both on the ground and among the treetops.";
	
	private static String description = 
			" Vanaras are intelligent, monkeylike humanoids that live in deep, warm forests and lush jungles. A vanara's body is covered in a thin coat\n"
			+ " of soft fur, and individuals with chestnut, ivory, and even golden coats are common. Despite their fur, vanaras can grow lengthy hair\n"
			+ " on their head just as humans can, and both male and female vanaras take pains to wear elaborate hairstyles for important social functions.\n"
			+ " The hair on a vanara's head matches the color of its fur. All vanaras have long, prehensile tails and handlike feet capable of\n"
			+ " well-articulated movements. A vanara stands slightly shorter and weighs slightly less than a typical human.";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Wisdom, –2 Charisma. Vanaras are agile and insightful, but are also rather mischievous.",
			" Vanara: Vanaras are humanoids with the vanara subtype.",
			" Medium: Vanaras are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Vanaras have a base speed of 30 feet and a Climb speed of 20 feet.",
			" Low-Light Vision: A vanara can see twice as far as a human in dim light.",
			" Nimble: Vanaras have a +2 racial bonus on Acrobatics and Stealth checks.",
			" Prehensile Tail: A vanara has a long, flexible tail that she can use to carry objects. She cannot wield weapons with her tail, but the tail allows her to retrieve a small, stowed object carried on her person as a swift action.",
			" Languages: Vanaras begin play speaking Common and Vanaran. Vanaras with high Intelligence scores can choose from the following: Aklo, Celestial, Elven, Gnome, Goblin, and Sylvan."};
	
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
			baseIn = 8;
			break;
		case FEMALE:
			baseFt = 4;
			baseIn = 2;
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
			baseWeight = 105;
			break;
		case FEMALE:
			baseWeight = 90;
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
