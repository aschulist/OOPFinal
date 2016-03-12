package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;

public class Duergar extends Race{

	public Duergar() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Gray skinned, deep-dwelling dwarves who hate their lighter skinned cousins, duergar view life as constant toil ending only\n"
			+ " in death. Though these dwarves are typically evil, honor and keeping one's word means everything to them, and a rare few\n"
			+ " make loyal adventuring companions.";
	
	private static String description = 
			" Duergar dwell in subterranean caverns far from the touch of light. They detest all races living beneath the sun, but that hatred pales\n"
			+ " beside their loathing of their surface-dwarf cousins. Dwarves and duergar once were one race, but the dwarves left the deeps for their\n"
			+ " mountain strongholds. Duergar still consider themselves the only true dwarves, and the rightful heirs of all beneath the world's surface.\n"
			+ " In appearance, duergar resemble gray-skinned dwarves, bearded but bald, with cold, lightless eyes. They favor taking captives in battle\n"
			+ " over wanton slaughter, save for surface dwarves, who are slain without hesitation. Duergar view life as ceaseless toil ended only by\n"
			+ " death. Though few can be described as anything other than vile and cruel, duergar still value honor and rarely break their word.";
	
	private static String[] racialTraits = {" ",
			" +2 Constitution, +2 Wisdom, –4 Charisma: Duergar are hearty and observant, but also belligerent.",
			" Medium: Duergar are Medium creatures and have no bonuses or penalties due to their size.",
			" Dwarf: Duergar are humanoids with the dwarf subtype.",
			" Slow and Steady: Duergar have a base speed of 20 feet, but their speed is never modified by armor or encumbrance.",
			" Superior Darkvision: Duergar can see in the dark up to 120 feet.",
			" Duergar Immunities: Duergar are immune to paralysis, phantasms, and poison. They gain a +2 racial bonus on saves against spells and spell-like abilities.",
			" Stability: Duergar receive a +4 racial bonus to their CMD against bull rush or trip attempts while on solid ground.",
			" Spell-Like Abilities: A duergar can use enlarge person and invisibility once each per day, using its character level as its caster level and affecting itself only.",
			" Light Sensitivity: Duergar are dazzled in areas of bright light.",
			" Languages: Duergar begin play speaking Common, Dwarven, and Undercommon. Duergar with high Intelligence scores can choose from the following: Aklo, Draconic, Giant, Goblin, Orc, and Terran."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 40;
		switch(type){
		case BARBARIAN:
		case ORACLE:
		case ROGUE:
		case SORCERER:
		case BLOODRAGER:
		case INVESTIGATOR:
		case NINJA:
			for(int i = 0; i < 3; i++){
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
			for(int i = 0; i < 5; i++){
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
			for(int i = 0; i < 7; i++){
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
			baseFt = 3;
			baseIn = 9;
			break;
		case FEMALE:
			baseFt = 3;
			baseIn = 7;
			break;
		}
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
