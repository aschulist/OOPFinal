package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Ratfolk extends Race{

	public Ratfolk() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" These small, ratlike humanoids are clannish and nomadic masters of trade. Often tinkers and traders, they are more\n"
			+ " concerned with accumulating interesting trinkets than amassing wealth. Ratfolk often adventure to find new and interesting\n"
			+ " curiosities rather than coin.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Intelligence, –2 Strength: Ratfolk are agile and clever, yet physically weak.",
			" Ratfolk: Ratfolk are humanoids with the ratfolk subtype.",
			" Small: Ratfolk are Small and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty on combat maneuver checks and to their CMD, and a +4 size bonus on Stealth checks.",
			" Slow Speed: Ratfolk have a base speed of 20 feet.",
			" Darkvision: Ratfolk can see in the dark up to 60 feet.",
			" Rodent Empathy: Ratfolk gain a +4 racial bonus on Handle Animal checks made to influence rodents.",
			" Swarming: Ratfolk are used to living and fighting communally, and are adept at swarming foes for their own gain and their foes' detriment. Up to two ratfolk can share the same square at the same time. If two ratfolk in the same square attack the same foe, they are considered to be flanking that foe as if they were in two opposite squares.",
			" Tinker: Ratfolk gain a +2 racial bonus on Craft (alchemy), Perception, and Use Magic Device checks.",
			" Languages: Ratfolk begin play speaking Common. Ratfolk with high Intelligence scores can choose from the following: Aklo, Draconic, Dwarven, Gnoll, Gnome, Goblin, Halfling, Orc, and Undercommon."};
	
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
			baseFt = 3;
			baseIn = 7;
			break;
		case FEMALE:
			baseFt = 3;
			baseIn = 4;
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
			baseWeight = 65;
			break;
		case FEMALE:
			baseWeight = 50;
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
