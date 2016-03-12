package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;

public class Ifrit extends Race{

	public Ifrit() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ifrits are a race descended from mortals and the strange inhabitants of the Plane of Fire. Their physical traits and\n"
			+ " personalities often betray their fiery origins, and they tend to be restless, independent, and imperious. Frequently driven\n"
			+ " from cities for their ability to manipulate flame, ifrits make powerful fire sorcerers and warriors who can wield flame\n"
			+ " like no other race.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Wisdom: Ifrits are passionate and quick, but impetuous and destructive.",
			" Native Outsider: Ifrits are outsiders with the native subtype.",
			" Medium: Ifrits are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Ifrits have a base speed of 30 feet.",
			" Darkvision: Ifrits can see in the dark up to 60 feet.",
			" Spell-Like Ability: Burning hands 1/day (caster level equals the ifrit's level; DC 11 + Charisma modifier).",
			" Energy Resistance: Ifrits have fire resistance 5.",
			" Fire Affinity: Ifrit sorcerers with the elemental (fire) bloodline treat their Charisma score as 2 points higher for all sorcerer spells and class abilities. Ifrit spellcasters with the Fire domain use their domain powers and spells at +1 caster level.",
			" Languages: Ifrits begin play speaking Common and Ignan. Ifrits with high Intelligence scores can choose from the following: Aquan, Auran, Dwarven, Elven, Gnome, Halfling, and Terran."};
	
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
