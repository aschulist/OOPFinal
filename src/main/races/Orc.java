package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Orc extends Race{

	public Orc() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Savage, brutish, and hard to kill, orcs are often the scourge of far-flung wildernesses and cavern deeps. Many orcs become\n"
			+ " fearsome barbarians, as they are muscular and prone to bloody rages. Those few who can control their bloodlust make\n"
			+ " excellent adventurers.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +4 Strength, –2 Intelligence, –2 Wisdom, –2 Charisma: Orcs are brutal and savage.",
			" Orc: Orcs are humanoids with the orc subtype.",
			" Medium: Orcs are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Orcs have a base speed of 30 feet.",
			" Darkvision: Orcs can see in the dark up to 60 feet.",
			" Light Sensitivity: Orcs are dazzled in areas of bright sunlight or within the radius of a daylight spell.",
			" Ferocity: Orcs can remain conscious and continue fighting even if their hit point totals fall below 0. Orcs are still staggered at 0 hit points or lower and lose 1 hit point each round as normal.",
			" Weapon Familiarity: Orcs are always proficient with greataxes and falchions, and treat any weapon with the word \"orc\" in its name as a martial weapon.",
			" Languages: Orcs begin play speaking Common and Orc. Orcs with high Intelligence scores can chose from the following: Dwarven, Giant, Gnoll, Goblin, Undercommon."};
	
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
			baseIn = 1;
			break;
		case FEMALE:
			baseFt = 4;
			baseIn = 9;
			break;
		}
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			addedInches += (rand.nextInt(12) + 1);
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
			baseWeight = 160;
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
