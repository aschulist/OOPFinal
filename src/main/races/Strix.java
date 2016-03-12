package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Strix extends Race{

	public Strix() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Hunted to dwindling numbers by humans, who see them as winged devils, strix are black-skinned masters of the nighttime sky.\n"
			+ " Their territorial conflicts have fueled their hatred for humans. This longstanding feud means that these nocturnal creatures\n"
			+ " often attack humans on sight.";
	
	private static String description = 
			" Human neighbors tell horrific tales of slaughter woven with frightened suspicion when speaking of strix. Strix, however, tell a tale of\n"
			+ " encroachment and a struggle for land and resources. For ages, humans invaded strix lands fighting bloody battles against the fierce,\n"
			+ " black-skinned creatures they thought to be winged devils. Over time, strix have developed a hatred for humankind and now fiercely\n"
			+ " protect their dwindling numbers.";
	
	private static String[] racialTraits = {" +2 Dexterity, -2 Charisma: Strix are swift and elusive, but tend to be stubborn and swift to anger.",
			" Strix: Strix are humanoids with the strix subtype.",
			" Medium: Strix are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Strix have a base speed of 30 feet on land. They also have a fly speed of 60 feet (average).",
			" Low-Light Vision: Strix can see twice as far as humans in conditions of dim light.",
			" Darkvision: Strix can see in the dark up to 60 feet.",
			" Hatred: Strix receive a +1 racial bonus on attack rolls against humanoid creatures with the human subtype because of their special training against these hated foes.",
			" Nocturnal: Strix gain a +2 racial bonus on Perception and Stealth checks in dim light or darkness.",
			" Suspicious: Strix receive a +2 racial bonus on saving throws against illusion spells and effects.",
			" Languages: Strix begin play speaking Strix. Those with high Intelligence scores can choose from the following: Auran, Common, Draconic, Giant, Gnome, Goblin, Infernal."};

	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 12;
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
			baseIn = 4;
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 2;
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
			baseWeight = 125;
			break;
		case FEMALE:
			baseWeight = 115;
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
