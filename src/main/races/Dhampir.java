package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Dhampir extends Race{

	public Dhampir() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" The accursed spawn of vampires, dhampirs are living creatures tainted with the curse of undeath, which causes them to take\n"
			+ " damage from positive energy and gain healing from negative energy. While many members of this race embrace their dark\n"
			+ " sides, others are powerfully driven to rebel against their taint and hunt down and destroy vampires and their ilk.";
	
	private static String description = "";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Charisma, –2 Constitution: Dhampirs are fast and seductive, but their racial bond to the undead impedes their mortal vigor.",
			" Dhampir: Dhampirs are humanoids with the dhampir subtype.",
			" Medium: Dhampirs are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Dhampirs have a base speed of 30 feet.",
			" Senses: Low-light vision and darkvision 60 feet.",
			" Manipulative: +2 racial bonus on Bluff and Perception.",
			" Undead Resistance: Dhampirs gain a +2 racial bonus on saving throws against disease and mind-affecting effects.",
			" Light Sensitivity: Dhampirs are dazzled in areas of bright sunlight or within the radius of a daylight spell.",
			" Negative Energy Affinity: Though a living creature, a dhampir reacts to positive and negative energy as if it were undead—positive energy harms it, while negative energy heals it.",
			" Spell-Like Ability: A dhampir can use detect undead three times per day as a spell-like ability. The caster level for this ability equals the dhampir's class level.",
			" Resist Level Drain (Ex): A dhampir takes no penalties from energy drain effects, though he can still be killed if he accrues more negative levels then he has Hit Dice. After 24 hours, any negative levels a dhampir takes are removed without the need for an additional saving throw.",
			" Languages: Dhampirs begin play speaking Common. Those with high Intelligence scores can choose any language it wants (except secret languages, such as Druidic)."};
	
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
