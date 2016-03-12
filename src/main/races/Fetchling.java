package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Fetchling extends Race{

	public Fetchling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Long ago, fetchlings were humans exiled to the Shadow Plane, but that plane's persistent umbra has transformed them into\n"
			+ " a race apart. These creatures have developed an ability to meld into the shadows and have a natural affinity for shadow\n"
			+ " magic. Fetchlings—who call themselves kayal—often serve as emissaries between the inhabitants of the Shadow Plane and\n"
			+ " the Material Plane.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Wisdom: Fetchlings are quick and forceful, but often strange and easily distracted by errant thoughts.",
			" Native Outsider: Fetchlings are outsiders with the native subtype.",
			" Medium: Fetchlings are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Fetchlings have a base speed of 30 feet.",
			" Darkvision: Fetchlings can see in the dark up to 60 feet.",
			" Low-Light Vision: Fetchlings can see twice as far as humans in conditions of dim light.",
			" Skilled: Fetchlings have a +2 racial bonus on Knowledge (planes) and Stealth checks.",
			" Shadow Blending (Su): Attacks against a fetchling in dim light have a 50% miss chance instead of the normal 20% miss chance. This ability does not grant total concealment; it just increases the miss chance.",
			" Shadowy Resistance: Fetchlings have cold resistance 5 and electricity resistance 5.",
			" Spell-Like Abilities (Sp): A fetchling can use disguise self once per day as a spell-like ability. He can assume the form of any humanoid creature using this spell-like ability. When a fetchling reaches 9th level in any combination of classes, he gains shadow walk (self only) as a spell-like ability usable once per day, and at 13th level, he gains plane shift (self only, to the Shadow Plane or the Material Plane only) usable once per day. A fetchling's caster level is equal to his total Hit Dice.",
			" Languages: Fetchlings begin play speaking Common. Fetchlings with a high Intelligence scores can choose from the following: Aklo, Aquan, Auran, Draconic, D'ziriak (understanding only, cannot speak), Ignan, Terran, and any regional human tongue."};
	
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
			addedInches += (rand.nextInt(6) + 1);
		}
		calculateWeight(g, addedInches);
		int heightFt = baseFt;
		int heightIn = baseIn + addedInches;
		while(heightIn < 12){
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
			baseWeight = 90;
			break;
		case FEMALE:
			baseWeight = 80;
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
