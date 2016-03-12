package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Tengu extends Race{

	public Tengu() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These crowlike humanoid scavengers excel in mimicry and swordplay. Flocking into densely populated cities, tengus\n"
			+ " occasionally join adventuring groups out of curiosity or necessity. Their impulsive nature and strange habits can often\n"
			+ " be unnerving to those who are not used to them.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Wisdom, –2 Constitution: Tengus are fast and observant, but relatively fragile and delicate.",
			" Tengu: Tengus are humanoids with the tengu subtype.",
			" Medium: Tengus are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Tengus have a base speed of 30 feet.",
			" Senses: Tengus have low-light vision.",
			" Sneaky: Tengus gain a +2 racial bonus on Perception and Stealth checks.",
			" Gifted Linguist: Tengus gain a +4 racial bonus on Linguistics checks, and learn 2 languages each time they gain a rank in Linguistics rather than 1 language.",
			" Swordtrained: Tengus are trained from birth in swordplay, and as a result are automatically proficient with swordlike weapons (including bastard swords, daggers, elven curve blades, falchions, greatswords, kukris, longswords, punching daggers, rapiers, scimitars, short swords, and two-bladed swords).",
			" Natural Weapon: A tengu has a bite attack that deals 1d3 points of damage.",
			" Languages: Tengus begin play speaking Common and Tengu. Tengus with high Intelligence scores can choose any languages they want (except for secret languages, such as Druidic)."};
	
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
			baseIn = 0;
			break;
		case FEMALE:
			baseFt = 3;
			baseIn = 10;
			break;
		}
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			addedInches += (rand.nextInt(6) + 1);
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
			baseWeight = 65;
			break;
		case FEMALE:
			baseWeight = 55;
			break;
		}
		int weight = baseWeight + (addedInches * 3);
		super.setWeight(weight);
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
