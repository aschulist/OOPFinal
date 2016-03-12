package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Tiefling extends Race{

	public Tiefling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Diverse and often despised by humanoid society, tieflings are mortals stained with the blood of fiends. Other races rarely\n"
			+ " trust them, and this lack of empathy usually causes tieflings to embrace the evil, depravity, and rage that seethe within\n"
			+ " their corrupt blood. A select few see the struggle to smother such dark desires as motivation for grand heroism.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Intelligence, –2 Charisma: Tieflings are quick in body and mind, but are inherently strange and unnerving.",
			" Native Outsider: Tieflings are outsiders with the native subtype.",
			" Medium: Tieflings are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Tieflings have a base speed of 30 feet.",
			" Darkvision: Tieflings see in the dark for up to 60 feet.",
			" Skilled: Tieflings gain a +2 racial bonus on Bluff and Stealth checks.",
			" Spell-Like Ability: Tieflings can use darkness once per day as a spell-like ability. The caster level for this ability equals the tiefling's class level.",
			" Fiendish Resistance: Tieflings have cold resistance 5, electricity resistance 5, and fire resistance 5.",
			" Fiendish Sorcery: Tiefling sorcerers with the Abyssal or Infernal bloodlines treat their Charisma score as 2 points higher for all sorcerer class abilities.",
			" Languages: Tieflings begin play speaking Common and either Abyssal or Infernal. Tieflings with high intelligence scores can choose from the following: Abyssal, Draconic, Dwarven, Elven, Gnome, Goblin, Halfling, Infernal, and Orc."};
	
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
			baseWeight = 120;
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
