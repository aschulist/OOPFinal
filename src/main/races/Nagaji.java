package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Nagaji extends Race{

	public Nagaji() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" It is believed that nagas created the nagaji as a race of servants and that the nagaji worship their creators as living gods.\n"
			+ " Due to their reptilian nature and strange mannerisms, these strange, scaly folk inspire fear and wonder in others not of their\n"
			+ " kind. They are resistant to both poison and mind-affecting magic.";
	
	private static String description = 
			" The nagaji are a race of ophidian humanoids with scaled skin that mimics the dramatic appearance of true nagas. Like serpents, they have\n"
			+ " forked tongues and lidless eyes, giving them an unblinking gaze that most other races find unnerving. Their physical forms are otherwise\n"
			+ " humanlike, raising wary speculation about their origins. It is widely believed that true nagas created them as a servitor race, through\n"
			+ " crossbreeding, magic, or both, and indeed nagaji revere nagas as living gods. Nagaji often inspire awe and fear among other humanoids,\n"
			+ " as much for their mysterious ancestry as for their talent for both swords and sorcery.";
	
	private static String[] racialTraits = {" +2 Strength, +2 Charisma, –2 Intelligence: Nagaji are strong and have forceful personalities, but tend to ignore logic and mock scholastic pursuits.",
			" Medium: Nagaji are Medium creatures and have no bonuses or penalties due to their size.",
			" Reptilian: Nagaji are humanoids with the reptilian subtype.",
			" Normal Speed: Nagaji have a base speed of 30 feet.",
			" Low-Light Vision: Nagaji can see twice as far as humans in conditions of dim light.",
			" Armored Scales: Nagaji have a +1 natural armor bonus from their scaly flesh.",
			" Resistant (Ex): Nagaji receive a +2 racial saving throw bonus against mind-affecting effects and poison.",
			" Serpent's Sense (Ex): Nagaji receive a +2 racial bonus on Handle Animal checks against reptiles, and a +2 racial bonus on Perception checks.",
			" Languages: Nagaji begin play speaking Common and Draconic. Nagaji with high Intelligence scores can choose from the following: any human tongue, Abyssal, Aklo, Celestial, Draconic, Giant, Infernal, and Sylvan."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 20;
		switch(type){
		case BARBARIAN:
		case ORACLE:
		case ROGUE:
		case SORCERER:
		case BLOODRAGER:
		case INVESTIGATOR:
		case NINJA:
			for(int i = 0; i < 1; i++){
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
			for(int i = 0; i < 2; i++){
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
			for(int i = 0; i < 3; i++){
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
			baseIn = 9;
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 6;
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
			baseWeight = 180;
			break;
		case FEMALE:
			baseWeight = 160;
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
