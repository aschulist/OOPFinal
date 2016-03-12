package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;

public class Kitsune extends Race{

	public Kitsune() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These shapeshifting, foxlike folk share a love of mischief, art, and the finer things in life. They can appear as a single\n"
			+ " human as well as their true form, that of a foxlike humanoid. Kitsune are quick-witted, nimble, and gregarious, and\n"
			+ " because of this, a fair number of them become adventurers.";
	
	private static String description = 
			" Kitsune, or fox folk, are vulpine shapeshifters known for their love of both trickery and art. Kitsune possess two forms: that of an\n"
			+ " attractive human of slender build with salient eyes, and their true form of an anthropomorphic fox. Despite an irrepressible penchant\n"
			+ " for deception, kitsune prize loyalty and make true companions. They delight in the arts, particularly riddles and storytelling, and\n"
			+ " settle in ancestral clans, taking their wisdom from both the living and spirits. Quick-witted and nimble, kitsune make excellent bards\n"
			+ " and rogues. It is not uncommon for one to pursue sorcery, while those few born with white fur and pale eyes usually become oracles.";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Strength: Kitsune are agile and companionable, but tend to be physically weak.",
			" Medium: Kitsune are Medium creatures and have no bonuses or penalties due to their size.",
			" Kitsune: Kitsune are humanoids with the kitsune and shapechanger subtypes.",
			" Normal Speed: Kitsune have a base speed of 30 feet.",
			" Low-Light Vision (Ex): Kitsune can see twice as far as humans in conditions of dim light.",
			" Change Shape (Su): A kitsune can assume the appearance of a specific single human form of the same sex. The kitsune always takes this specific form when she uses this ability. A kitsune in human form cannot use her bite attack, but gains a +10 racial bonus on Disguise checks made to appear human. Changing shape is a standard action. This ability otherwise functions as alter self, except that the kitsune does not adjust her ability scores and can remain in this form indefinitely.",
			" Agile (Ex): Kitsune receive a +2 racial bonus on Acrobatics checks.",
			" Kitsune Magic (Ex/Sp): Kitsune add +1 to the DC of any saving throws against enchantment spells that they cast. Kitsune with a Charisma score of 11 or higher gain the following spell-like ability: 3/day—dancing lights (caster level equals the kitsune's level).",
			" Natural Weapons (Ex): In her natural form, a kitsune has a bite attack that deals 1d4 points of damage.",
			" Languages: Kitsune begin play speaking Common and Sylvan. Kitsune with high Intelligence scores can choose from the following: any human language, Aklo, Celestial, Elven, Gnome, and Tengu."};
	
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
			baseWeight = 100;
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
