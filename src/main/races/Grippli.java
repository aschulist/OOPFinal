package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Grippli extends Race{

	public Grippli() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Furtive frogfolk with the ability to camouflage themselves among fens and swamps, gripplis typically keep to their\n"
			+ " wetland homes, only rarely interacting with the outside world. Their chief motivation for leaving their marshy environs\n"
			+ " is to trade in metal and gems.";
	
	private static String description = 
			" Gripplis stand just over 2 feet tall and have mottled green-and-brown skin. Most gripplis are primitive hunter gatherers, living on large\n"
			+ " insects and fish found near their treetop homes, and are unconcerned about events outside their swamps. The rare grippli who leaves the\n"
			+ " safety of the swamp tends to be a ranger or alchemist seeking to trade for metals and gems.";

	private static String[] racialTraits = {" +2 Dexterity, +2 Wisdom, –2 Strength: Gripplis are nimble and alert, but spindly.",
			" Small: Gripplis are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their CMB and CMD, and a +4 size bonus on Stealth checks.",
			" Grippli: Gripplis are humanoids with the grippli subtype.",
			" Normal Speed: Gripplis have a base speed of 30 feet and a climb speed of 20 feet.",
			" Darkvision: Gripplis can see in the dark up to 60 feet.",
			" Camouflage: Gripplis receive a +4 racial bonus on Stealth checks in marshes and forested areas.",
			" Swamp Stride (Ex): A grippli can move through difficult terrain at its normal speed while within a swamp. Magically altered terrain affects a grippli normally.",
			" Weapon Familiarity: Gripplis are proficient with nets.",
			" Languages: Gripplis begin play speaking Common and Grippli. Gripplis with high Intelligence scores can choose from the following: Boggard, Draconic, Elven, Gnome, Goblin, and Sylvan."};
	
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
			baseFt = 1;
			baseIn = 7;
			break;
		case FEMALE:
			baseFt = 1;
			baseIn = 5;
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
			baseWeight = 25;
			break;
		case FEMALE:
			baseWeight = 20;
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
