package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Vishkanya extends Race{

	public Vishkanya() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Strangely beautiful on the outside and poisonous on the inside, vishkanyas see the world through slitted serpent eyes.\n"
			+ " Vishkanyas possess a serpent's grace and ability to writhe out of their enemies' grasp with ease. Vishkanyas have a\n"
			+ " reputation for being both seductive and manipulative. They can use their saliva or blood to poison their weapons.";
	
	private static String description = 
			" Vishkanyas are a race of exotic humanoids with poisonous blood. Possessed of an alien beauty, these graceful humanoids see the world through\n"
			+ " serpentine eyes of burnished gold. Their supple skin is covered with tiny scales, often of a light green, which are sometimes arrayed in\n"
			+ " patterns not unlike those of a serpent. They cannot be generalized as good or evil, but since they truly speak with forked tongues, they\n"
			+ " are content to accept the gold they're offered and leave questions of morality to others.";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Wisdom: Vishkanyas are graceful and elegant, but they are often irrational.",
			" Vishkanya: Vishkanyas are humanoids with the vishkanya subtype.",
			" Medium: Vishkanyas are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Vishkanyas have a base speed of 30 feet.",
			" Low-Light Vision: Vishkanyas can see twice as far as humans in conditions of dim light.",
			" Keen Senses: Vishkanyas receive a +2 racial bonus on Perception checks.",
			" Limber: Vishkanyas receive a +2 racial bonus on Escape Artist and Stealth checks.",
			" Poison Resistance: A vishkanya has a racial bonus on saving throws against poison equal to its Hit Dice.",
			" Poison Use: Vishkanyas are skilled in the use of poison and never accidentally poison themselves when using or applying poison.",
			" Toxic: A number of times per day equal to his Constitution modifier (minimum 1/day), a vishkanya can envenom a weapon that he wields with his toxic saliva or blood (using blood requires the vishkanya to be injured when he uses this ability). Applying venom in this way is a swift action. Vishkanya Venom: Injury; save Fort DC 10 + 1/2 the vishkanya's Hit Dice + the vishkanya's Constitution modifier; frequency 1/round for 6 rounds; effect 1d2 Dex; cure 1 save.",
			" Weapon Familiarity: Vishkanyas are always proficient with blowguns, kukri, and shuriken.",
			" Languages: Vishkanyas begin play speaking Common and Vishkanya. Vishkanyas with high Intelligence scores can choose from the following: Aklo, Draconic, Elven, Goblin, Sylvan, and Undercommon."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 15;
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
			baseIn = 3;
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 1;
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
			baseWeight = 85;
			break;
		case FEMALE:
			baseWeight = 75;
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
