package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Goblin extends Race{

	public Goblin() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Crazy pyromaniacs with a tendency to commit unspeakable violence, goblins are the smallest of the goblinoid races.\n"
			+ " While they are a fun-loving race, their humor is often cruel and hurtful. Adventuring goblins constantly wrestle with\n"
			+ " their darkly mischievous side in order to get along with others. Few are truly successful.";
	
	private static String description = 
			" ";

	private static String[] racialTraits = {" +4 Dexterity, –2 Strength, –2 Charisma: Goblins are fast, but weak and unpleasant to be around.",
			" Goblinoid: Goblins are humanoids with the goblinoid subtype.",
			" Small: Goblins are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their CMB and CMD, and a +4 size bonus on Stealth checks.",
			" Fast: Goblins are fast for their size, and have a base speed of 30 feet.",
			" Darkvision: Goblins can see in the dark up to 60 feet.",
			" Skilled: +4 racial bonus on Ride and Stealth checks.",
			" Languages: Goblins begin play speaking Goblin. Goblins with high Intelligence scores can choose from the following: Common, Draconic, Dwarven, Gnoll, Gnome, Halfling, and Orc."};
	
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
			baseFt = 2;
			baseIn = 8;
			break;
		case FEMALE:
			baseFt = 2;
			baseIn = 6;
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
