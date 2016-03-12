package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Drow extends Race{

	public Drow() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Dark reflections of surface elves, drow are shadowy hunters who strive to snuff out the world's light. Drow are powerful\n"
			+ " magical creatures who typically serve demons, and only their chaotic nature stops them from becoming an even greater\n"
			+ " menace. A select few forsake their race's depraved and nihilistic society to walk a heroic path.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Constitution: Drow are nimble and manipulative.",
			" Elf: Drow are humanoids with the elf subtype.",
			" Medium: Drow are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Drow have a base speed of 30 feet.",
			" Darkvision: Drow can see in the dark up to 120 feet.",
			" Drow Immunities: Drow are immune to magic sleep effects and gain a +2 racial bonus on saving throws against enchantment spells and effects.",
			" Keen Senses: Drow gain a +2 racial bonus on Perception checks.",
			" Poison Use: Drow are skilled in the use of poison and never risk accidentally poisoning themselves.",
			" Spell Resistance: Drow possess spell resistance equal to 6 plus their class levels.",
			" Spell-Like Abilities: A drow can cast dancing lights, darkness, and faerie fire, once each per day, using her total character level as her caster level.",
			" Light Blindness: Abrupt exposure to bright light blinds drow for 1 round; on subsequent rounds, they are dazzled as long as they remain in the affected area.",
			" Weapon Familiarity: Drow are proficient with the hand crossbow, rapier, and short sword.",
			" Languages: Drow begin play speaking Elven and Undercommon. Drow with high Intelligence scores can choose from the following languages: Abyssal, Aklo, Aquan, Common, Draconic, Drow Sign Language, Gnome, or Goblin."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 110;
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
			for(int i = 0; i < 10; i++){
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
		Random rand = new Random();
		int addedInches = 0;
		switch(g){
		case MALE:
			baseFt = 5;
			baseIn = 4;
			for(int i = 0; i < 2; i++){
				addedInches += (rand.nextInt(6) + 1);
			}
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 4;
			for(int i = 0; i < 2; i++){
				addedInches += (rand.nextInt(8) + 1);
			}
			break;
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
			baseWeight = 90;
			break;
		case FEMALE:
			baseWeight = 100;
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
