package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Sulis extends Race{

	public Sulis() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Also called suli-jann, these humanoids are the descendants of mortals and jann. These strong and charismatic individuals\n"
			+ " manifest mastery over elemental power in their adolescence, giving them the ability to manipulate earth, fire, ice, or\n"
			+ " electricity. This elemental power tends to be reflected in the suli's personality as well.";
	
	private static String description = 
			" Sulis, or suli-jann, are the descendents of mortals and jann. They manifest their otherworldly heritage in adolescence, or when awakened\n"
			+ " by an encounter with a genie. Strong and attractive, these dynamic individuals can call forth elemental energies to augment their prowess\n"
			+ " in combat. Neither genie nor quite human, sulis stand in two worlds and often feel as if they don't belong to either.";
	
	private static String[] racialTraits = {" +2 Strength, +2 Charisma, –2 Intelligence: Sulis are brawny and charming, but slow-witted.",
			" Native Outsider: Sulis are outsiders with the native subtype.",
			" Medium: Sulis are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Sulis have a base speed of 30 feet.",
			" Low-Light Vision: Sulis can see twice as far as humans in dim light.",
			" Negotiator: Sulis are keen negotiators, and gain a +2 racial bonus on Diplomacy and Sense Motive checks.",
			" Elemental Assault (Su): Once per day as a swift action, a suli can shroud her arms in acid, cold, electricity, or fire. This lasts for one round per level, and can be dismissed as a free action. Unarmed strikes with her arms or hands (or attacks with weapons held in those hands) deal +1d6 points of damage of the appropriate energy type.",
			" Energy Resistance 5: Sulis have resistance to acid 5, cold 5, electricity 5, and fire 5.",
			" Languages: Sulis begin play speaking Common and one elemental language (Aquan, Auran, Ignan, or Terran). Sulis with high Intelligence scores can choose from the following: Aquan, Auran, Draconic, Ignan, and Terran."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 5;
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
			baseFt = 4;
			baseIn = 5;
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
