package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Svirfneblin extends Race{

	public Svirfneblin() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Gnomes who guard their hidden enclaves within dark tunnels and caverns deep under the earth, svirfneblin are as serious as\n"
			+ " their surface cousins are whimsical. They are resistant to the magic of the foul creatures that share their subterranean\n"
			+ " environs, and wield powerful protective magic. Svirfneblin are distrustful of outsiders and often hide at their approach.";
	
	private static String description = 
			" In the dark below earth, svirfneblin protect their enclaves, keeping their small communities safe from the terrors of the lightless depths.\n"
			+ " Serious creatures with slate-gray skin, these gnomes vary greatly from their surface cousins by choosing to live in the shadowy depths\n"
			+ " and protect the world above from the foul creatures sharing their chambers, vaults, and tunnels.";
	
	private static String[] racialTraits = {" –2 Strength, +2 Dexterity, +2 Wisdom, –4 Charisma: Svirfneblin are fast and observant but relatively weak and emotionally distant.",
			" Gnome: Svirfneblin are humanoids with the gnome subtype.",
			" Small: Svirfneblin are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their CMB and CMD, and a +4 size bonus on Stealth checks.",
			" Slow Speed: Svirfneblin have a base speed of 20 feet.",
			" Defensive Training: Svirfneblin gain a +2 dodge bonus to Armor Class.",
			" Senses: Svirfneblin have darkvision 120 ft. and low-light vision.",
			" Fortunate: Svirfneblin gain a +2 racial bonus on all saving throws.",
			" Skilled: Svirfneblin gain a +2 racial bonus on Stealth checks; this improves to a +4 bonus underground. They gain a +2 racial bonus on Craft (alchemy) checks and Perception checks.",
			" Hatred: Svirfneblin receive a +1 bonus on attack rolls against humanoid creatures of the reptilian and dwarf subtypes due to training against these hated foes.",
			" Stonecunning: Svirfneblin gain a +2 bonus on Perception checks to notice unusual stonework, such as traps and hidden doors located in stone walls or floors. They receive a check to notice such features whenever they pass within 10 feet of them, whether or not they are actively looking.",
			" Spell Resistance: Svirfneblin have SR equal to 11 + their class levels.",
			" Svirfneblin Magic: Svirfneblin add +1 to the DC of any illusion spells they cast. Svirfneblin also gain the following spell-like abilities: Constant—nondetection; 1/day—blindness/deafness (DC 12 + Charisma modifier), blur, disguise self; caster level equals the svirfneblin's class levels.",
			" Languages: Svirfneblin begin play speaking Gnome and Undercommon. Those with high Intelligence scores can choose from the following: Aklo, Common, Draconic, Dwarven, Elven, Giant, Goblin, Orc, and Terran."};
	
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
			for(int i = 0; i < 9; i++){
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
			baseIn = 0;
			break;
		case FEMALE:
			baseFt = 2;
			baseIn = 10;
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
			baseWeight = 35;
			break;
		case FEMALE:
			baseWeight = 30;
			break;
		}
		int weight = baseWeight + (addedInches * 1);
		super.setWeight(weight);
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
