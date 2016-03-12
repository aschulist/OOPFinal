package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;

public class Gillmen extends Race{

	public Gillmen() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Survivors of a land-dwelling culture whose homeland was destroyed, gillmen were saved and transformed into an amphibious\n"
			+ " race by the aboleths. Though in many ways they appear nearly human, gillmen's bright purple eyes and gills set them apart\n"
			+ " from humanity. Reclusive and suspicious, gillmen know that one day the aboleths will call in the debt owed to them.";
	
	private static String description = 
			" Gillmen are the remnants of a race of surface-dwelling humanoids whose homeland was drowned in a great cataclysm at the hands of the aboleth.\n"
			+ " The aboleths rescued a few survivors, warping them into an amphibious race to serve as emissaries to the surface world. Modern gillmen remain\n"
			+ " reclusive and suspicious, scarred by both the loss of their ancient heritage and the sure knowledge that aboleths do nothing without expecting\n"
			+ " to profit from it. Physically gillmen have expressive brows, pale skin, dark hair, and bright purple eyes. Three slim gills mark each side of\n"
			+ " their necks, near the shoulder, but they are otherwise close enough in appearance to humans that they can pass as such (for a time) without\n"
			+ " fear of detection.";
	
	private static String[] racialTraits = {" ",
			" +2 Constitution, +2 Charisma, –2 Wisdom: Gillmen are vigorous and beautiful, but their domination by the aboleths has made them weak-willed.",
			" Medium: Gillmen are Medium creatures and have no bonuses or penalties due to their size.",
			" Aquatic: Gillmen are humanoids with the aquatic subtype.",
			" Normal Speed: Gillmen have a base speed of 30 feet on land. As aquatic creatures, they also have a swim speed of 30 feet, can move in water without making Swim checks, and always treat Swim as a class skill.",
			" Amphibious: Gillmen have the aquatic subtype, but can breathe both water and air.",
			" Enchantment Resistance: Gillmen gain a +2 racial saving throw bonus against non-aboleth enchantment spells and effects, but take a –2 penalty on such saving throws against aboleth sources.",
			" Water Dependent: A gillman's body requires constant submersion in fresh or salt water. Gillmen who spend more than 1 day without fully submerging themselves in water risk internal organ failure, painful cracking of the skin, and death within 4d6 hours.",
			" Languages: Gillmen begin play speaking Common and Aboleth. Gillmen with high Intelligence scores can choose from the following: Aklo, Aquan, Draconic, and Elven."};
	
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
