package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Dwarf extends Race{

	public Dwarf() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			    " These short and stocky defenders of mountain fortresses are often seen as stern and humorless. Known for mining the\n"
			  + " earth's treasures and crafting magnificent items from ore and gemstones, they have an unrivaled affinit for the bounties\n"
			  + " of the deep earth. Dwarves also have a tendency toward traditionalism and isolation that sometimes manifests as xenophobia.";
	
	//full description will not include the basic
	private static String description = 
			" Dwarves are a stoic but stern race, ensconced in cities carved from the hearts of mountains and fiercely determined to repel\n"
			+ " the depredations of savage races like orcs and goblins. More than any other race, the dwarves have acquired a reputation as\n"
			+ " dour and humorless craftsmen of the earth. It could be said that dwarven history shapes the dark disposition of many dwarves,\n"
			+ " for they reside in high mountains and dangerous realms below the earth, constantly at war with giants, goblins, and other\n"
			+ " such horrors. Dwarves are lovers of history and tradition, and their long lifespan leads to far less in the way of generational\n"
			+ " shifts in attitudes, styles, fashions, and trends than shorter-lived races exhibit. If a thing is not broken, they do not fix\n"
			+ " it or change it; and if it is broken, they fix it rather than replace it. Thrifty as a rule, dwarves are loath to discard\n"
			+ " anything unless it is truly ruined and unable to be fixed. At the same time, dwarves' meticulous, near-obsessive attention to\n"
			+ " detail and durability in their craftsmanship makes that a rare occurrence, as the things they make are built to last. As a result,\n"
			+ " buildings, artwork, tools, housewares, garments, weapons, and virtually everything else made by dwarves still sees regular use\n"
			+ " at an age when such items would be relegated to museum pieces, dusty antique shelves, or junkyard fodder by other races. Taken\n"
			+ " together, these traits create the impression that dwarves are a race frozen in time. Nothing could be further from the truth,\n"
			+ " however, as dwarves are both thoughtful and imaginative, willing to experiment, if always keen to refine and perfect a new\n"
			+ " technique or product before moving on to the next one. Dwarves have achieved feats of metallurgy, stonework, and engineering\n"
			+ " that have consistently outpaced the technological advances of other races, though some non-dwarven races have used magic to\n"
			+ " supplement and perfect their own creations to achieve the same ends through mystical rather than mundane means. They are also a\n"
			+ " race typified by stubborn courage and dedication to seeing tasks through to completion, whatever the risks. These traits haven\n"
			+ " led dwarves to explore and settle in extreme environments that would cause other races to quail and retreat. From the darkest\n"
			+ " depths of the underworld to the highest mountain peaks, from rusting iron citadels along desolate rocky coasts to squat jungle\n"
			+ " ziggurats, dwarves have established their enclaves and redoubts, holding them against all comers or perishing to the last and\n"
			+ " leaving only their enduring monuments to stand as their legacy. While it is said that dwarves are not venturesome or inventive,\n"
			+ " it would be more accurate to say that they maintain a focus on and dedication to each task they undertake and every change they\n"
			+ " adopt, vetting such changes thoroughly before adopting them wholeheartedly. When faced with new circumstances and new needs, they\n"
			+ " react by applying tried and true tools and techniques systematically, using existing methods whenever possible rather than trying\n"
			+ " to invent novel solutions for every situation. If necessity requires, however, they throw themselves with equal vigor into\n"
			+ " developing the next perfect procedure for demolishing the obstacles that get in their way. Once their desired goal is obtained,\n"
			+ " they focus on consolidating each new piece of territory or conceptual advance. Dwarves thus rarely overextend themselves, but they\n"
			+ " also may miss opportunities to seize the initiative and maximize the advantages they create.\n\n"
			+ " Physical Description: Dwarves are a short and stocky race, and stand about a foot shorter than most humans, with wide, compact\n"
			+ " bodies that account for their burly appearance. Male and female dwarves pride themselves on the length of their hair, and men\n"
			+ " often decorate their beards with a variety of clasps and intricate braids. A clean-shaven male dwarf is a sure sign of madness,\n"
			+ " or worse—no one familiar with their race trusts a beardless dwarf.\n\n"
			+ " Society Description: The great distances between their mountain citadels account for many of the cultural differences that\n"
			+ " exist within dwarven society. Despite these schisms, dwarves throughout the world are characterized by their love of stonework,\n"
			+ " their passion for stone- and metal-based craftsmanship and architecture, and a fierce hatred of giants, orcs, and goblinoids\n\n."
			+ "	Relation Description: Dwarves and orcs have long dwelt in proximity, theirs a history of violence as old as both their races.\n"
			+ " Dwarves generally distrust and shun half-orcs. They find halflings, elves, and gnomes to be too frail, flighty, or \"pretty\"\n"
			+ " to be worthy of proper respect. It is with humans that dwarves share the strongest link, for humans' industrious nature and hearty\n"
			+ " appetites come closest to matching those of the dwarven ideal.\n\n"
			+ " Alignment and Relation: Dwarves are driven by honor and tradition, and while they are often satirized as standoffish, they have\n"
			+ " a strong sense of friendship and justice, and those who win their trust understand that, while they work hard, they play even\n"
			+ " harder—especially when good ale is involved. Most dwarves are lawful good.\n\n"
			+ " Adventurers: Although dwarven adventurers are rare compared to humans, they can be found in most regions of the world. Dwarves\n"
			+ " often leave the confines of their redoubts to seek glory for their clans, to find wealth with which to enrich the fortress-homes\n"
			+ " of their birth, or to reclaim fallen dwarven citadels from racial enemies. Dwarven warfare is often characterized by tunnel fighting\n"
			+ " and melee combat, and as such most dwarves tend toward classes such as fighters and barbarians.";
	
	private static String[] racialTraits = {
			" +2 Constitution, +2 Wisdom, –2 Charisma: Dwarves are both tough and wise, but also a bit gruff." ,
			" Medium: Dwarves are Medium creatures and receive no bonuses or penalties due to their size.",
			" Darkvision: Dwarves can see in the dark up to 60 feet.",
			" Defensive Training: Dwarves gain a +4 dodge bonus to AC against monsters of the giant subtype.", 
			" Greed: Dwarves gain a +2 racial bonus on Appraise checks made to determine the price of nonmagical goods that contain precious metals or gemstones.",
			" Hatred: Dwarves gain a +1 racial bonus on attack rolls against humanoid creatures of the orc and goblinoid subtypes because of their special training against these hated foes.",
			" Hardy: Dwarves gain a +2 racial bonus on saving throws against poison, spells, and spell-like abilities.",
			" Stability: Dwarves gain a +4 racial bonus to their Combat Maneuver Defense when resisting a bull rush or trip attempt while standing on the ground.",
			" Stonecunning: Dwarves gain a +2 bonus on Perception checks to notice unusual stonework, such as traps and hidden doors located in stone walls or floors. They receive a check to notice such features whenever they pass within 10 feet of them, whether or not they are actively looking.",
			" Weapon Familiarity: Dwarves are proficient with battleaxes, heavy picks, and warhammers, and treat any weapon with the word \"dwarven\" in its name as a martial weapon.",
			" Languages: Dwarves begin play speaking Common and Dwarven. Dwarves with high Intelligence scores can choose from the following: Giant, Gnome, Goblin, Orc, Terran, and Undercommon."};
	
	@Override
	public String getBasicDescription(){
		return basicDescription;
	}
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 40;
		switch(type){
		case BARBARIAN:
		case ORACLE:
		case ROGUE:
		case SORCERER:
		case BLOODRAGER:
		case INVESTIGATOR:
		case NINJA:
			for(int i = 0; i < 3; i++){
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
			for(int i = 0; i < 5; i++){
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
			for(int i = 0; i < 7; i++){
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
			baseFt = 3;
			baseIn = 9;
			break;
		case FEMALE:
			baseFt = 3;
			baseIn = 7;
			break;
		}
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			addedInches += (rand.nextInt(4) + 1);
		}
		System.out.println(addedInches);
		calculateWeight(g, addedInches);
		int heightFt = baseFt;
		int heightIn = baseIn + addedInches;
		while(heightIn >= 12){
			heightIn -= 12;
			heightFt += 1;
		}
		System.out.println(heightFt);
		System.out.println(heightIn);
		super.setHeight(heightFt, heightIn);
	}

	@Override
	public void calculateWeight(Gender g, int addedInches) {
		// TODO Auto-generated method stub
		int baseWeight = 0;
		switch(g){
		case MALE:
			baseWeight = 150;
			break;
		case FEMALE:
			baseWeight = 120;
			break;
		}
		int weight = baseWeight + (addedInches * 7);
		super.setWeight(weight);
	}
}
