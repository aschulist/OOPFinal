package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Wayang extends Race{

	public Wayang() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" The small wayangs are creatures of the Plane of Shadow. They are so attuned to shadow that it even shapes their philosophy,\n"
			+ " believing that upon death they merely merge back into darkness. The mysteries of their shadowy existence grant them the\n"
			+ " ability to gain healing from negative energy as well as positive energy.";
	
	private static String description = 
			" The wayangs are a race of small supernatural humanoids who trace their ancestry to the Plane of Shadows. They are extremely gaunt, with\n"
			+ " pixielike stature and skin the color of deep shadow. Deeply spiritual, they follow a philosophy known as \"The Dissolution,\" which\n"
			+ " teaches that in passing they may again merge into the shadow. They readily express their beliefs through ritual scarification and skin\n"
			+ " bleaching, marking their bodies with raised white dots in ornate spirals and geometric patterns. Shy and elusive, they live in small,\n"
			+ " interdependent tribes. Wayangs rarely associate with outsiders.";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Intelligence, –2 Wisdom: Wayang are nimble and cagey, but their perception of the world is clouded by shadows.",
			" Wayang: Wayangs are humanoids with the wayang subtype.",
			" Small: Wayangs are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty on their CMB and to CMD, and a +4 size bonus on Stealth checks.",
			" Slow Speed: Wayangs have a base speed of 20 feet.",
			" Darkvision: Wayangs can see in the dark up to 60 feet.",
			" Light and Dark (Su): Once per day as an immediate action, a wayang can treat positive and negative energy effects as if she were an undead creature, taking damage from positive energy and healing damage from negative energy. This ability lasts for 1 minute once activated.",
			" Lurker: Wayangs gain a +2 racial bonus on Perception and Stealth checks.",
			" Shadow Magic: Wayangs add +1 to the DC of any saving throws against spells of the shadow subschool that they cast. Wayangs with a Charisma score of 11 or higher also gain the following spell-like abilities: 1/day—ghost sound, pass without trace, and ventriloquism. The caster level for these effects is equal to the wayang's level. The DC for these spells is equal to 10 + the spell's level + the wayang's Charisma modifier.",
			" Shadow Resistance: Wayangs get a +2 racial bonus on saving throws against spells of the shadow subschool.",
			" Languages: Wayangs begin play speaking Common and Wayang. Wayangs with high Intelligence scores can choose from the following: any human language, Abyssal, Aklo, Draconic, Goblin, Infernal, Nagaji, Samsaran, and Tengu."};
	
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
			for(int i = 0; i < 6; i++){
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
