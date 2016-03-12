package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Undine extends Race{

	public Undine() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Like their cousins, the ifrits, oreads, and sylphs, undines are humans touched by planar elements. They are the scions\n"
			+ " of elemental water, equally graceful both on land and in water. Undines are adaptable and resistant to cold, and have\n"
			+ " an affinity for water magic.";
	
	private static String description = 
			" ";
	
	private static String[] racialTraits = {" +2 Dexterity, +2 Wisdom, –2 Strength: Undines are both perceptive and agile, but tend to adapt rather than match force with force.",
			" Native Outsider: Undines are outsiders with the native subtype.",
			" Medium: Undines are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Undines have a base speed of 30 feet on land. They also have a swim speed of 30 feet, can move in water without making Swim checks, and always treat Swim as a class skill.",
			" Darkvision: Undines can see in the dark up to 60 feet.",
			" Spell-Like Ability: Hydraulic push 1/day (caster level equals the undine's level).",
			" Energy Resistance: Undines have cold resistance 5.",
			" Water Affinity: Undine sorcerers with the elemental (water) bloodline treat their Charisma score as 2 points higher for all sorcerer spells and class abilities. Undine clerics with the Water domain cast their Water domain powers and spells at +1 caster level.",
			" Languages: Undines begin play speaking Common and Aquan. Undines with high Intelligence scores can choose from the following: Auran, Dwarven, Elven, Gnome, Halfling, Ignan, and Terran."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 60;
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
