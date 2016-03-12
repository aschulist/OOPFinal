package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Oread extends Race{

	public Oread() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Creatures of human ancestry mixed with the blood of creatures from the Plane of Earth, oreads are as strong and solid\n"
			+ " as stone. Often stubborn and steadfast, their unyielding nature makes it hard for them to get along with most races other\n"
			+ " than dwarves. Oreads make excellent warriors and sorcerers who can manipulate the raw power of stone and earth.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Strength, +2 Wisdom, –2 Charisma: Oreads are strong, solid, stable, and stoic.",
			" Native Outsider: Oreads are outsiders with the native subtype.",
			" Medium: Oreads are Medium creatures and have no bonuses or penalties due to their size.",
			" Slow Speed: Oreads have a base speed of 20 feet.",
			" Darkvision: Oreads can see in the dark up to 60 feet.",
			" Spell-Like Ability: Magic stone 1/day (caster level equals the oread's total level; DC 11 + Charisma modifier).",
			" Energy Resistance: Oreads have acid resistance 5.",
			" Earth Affinity: Oread sorcerers with the elemental (earth) bloodline treat their Charisma score as 2 points higher for all sorcerer spells and class abilities. Oread clerics with the Earth domain use their domain powers and spells at +1 caster level.",
			" Languages: Oreads begin play speaking Common and Terran. Oreads with high Intelligence scores can choose from the following: Aquan, Auran, Dwarven, Elven, Gnome, Halfling, Ignan, and Undercommon."};
	
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
			baseFt = 4;
			baseIn = 0;
			break;
		case FEMALE:
			baseFt = 3;
			baseIn = 9;
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
			baseWeight = 150;
			break;
		case FEMALE:
			baseWeight = 120;
			break;
		}
		int weight = baseWeight + (addedInches * 7);
		super.setWeight(weight);
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
