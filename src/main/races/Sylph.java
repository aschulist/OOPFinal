package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Sylph extends Race{

	public Sylph() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ethereal folk of elemental air, sylphs are the result of human blood mixed with that of airy elemental folk. Like ifrits,\n"
			+ " oreads, and undines, they can become powerful elemental sorcerers with command over their particular elemental dominion.\n"
			+ " They tend to be beautiful and lithe, and have a knack for eavesdropping.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Intelligence, –2 Constitution: Sylphs are quick and insightful, but slight and delicate.",
			" Native Outsider: Sylphs are outsiders with the native subtype.",
			" Medium: Sylphs are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Sylphs have a base speed of 30 feet.",
			" Darkvision: Sylphs can see in the dark up to 60 feet.",
			" Spell-Like Ability: Feather fall 1/day (caster level equals the sylph's total level).",
			" Energy Resistance: Sylphs have electricity resistance 5.",
			" Air Affinity: Sylph sorcerers with the elemental (air) bloodline treat their Charisma score as 2 points higher for all sorcerer spells and class abilities. Sylph spellcasters with the Air domain use their domain powers and spells at +1 caster level.",
			" Languages: Sylphs begin play speaking Common and Auran. Sylphs with high Intelligence scores can choose from the following: Aquan, Dwarven, Elven, Gnome, Halfling, Ignan, and Terran."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 60;
		switch(type){
		case BARBARIAN:
		case ORACLE:
		case ROGUE:
		case SORCERER:
		case BLOODRAGER:
		case INVESTIGATOR:
		case NINJA:
			for(int i = 0; i < 4; i++){
				age += rand.nextInt(6) + 1;
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
			for(int i = 0; i < 6; i++){
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
			for(int i = 0; i < 8; i++){
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
			baseIn = 2;
			break;
		case FEMALE:
			baseFt = 5;
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
			baseWeight = 110;
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
