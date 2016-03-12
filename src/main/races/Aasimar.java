package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Aasimar extends Race {

	public Aasimar() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = " Creatures blessed with a celestial bloodline, aasimars seem human except for some exotic quality that betrays their\n"
			+ " otherworldly origin. While aasimars are nearly always beautiful, something simultaneously a part of and apart from\n"
			+ " humanity, not all of them are good, though very few are evil.";

	private static String description = 
			" Aasimars are humans with a significant amount of celestial or other good outsider blood in their ancestry. While not always\n"
			+ " benevolent, aasimars are more inclined toward acts of kindness rather than evil, and they gravitate toward faiths or organizations\n"
			+ " associated with celestials. Aasimar heritage can lie dormant for generations, only to appear suddenly in the child of two\n"
			+ " apparently human parents. Most societies interpret aasimar births as good omens, though it must be acknowledged that some aasimars\n"
			+ " take advantage of the reputation of their kind, brutally subverting the expectations of others with acts of terrifying cruelty or\n"
			+ " abject venality. \"It's always the one you least suspect\" is the axiom these evil aasimars live by, and they often lead double lives\n"
			+ " as upstanding citizens or false heroes, keeping their corruption well hidden. Thankfully, these few are the exception and not the rule.\n\n"
			+ " Physical Description: Aasimars look mostly human except for some minor physical trait that reveals their unusual heritage. Typical\n"
			+ " aasimar features include hair that shines like metal, jewel-toned eyes, lustrous skin color, or even glowing, golden halos.\n\n"
			+ " Society: Aasimars cannot truly be said to have an independent society of their own. As an offshoot of humanity, they adopt the societal\n"
			+ " norms around them, though most find themselves drawn to those elements of society that work for the redress of injustice and the\n"
			+ " assuagement of suffering. This sometimes puts them on the wrong side of the law in more tyrannical societies, but aasimars can be careful\n"
			+ " and cunning when necessary, able to put on a dissembling guise to divert the attention of oppressors elsewhere. While corrupt aasimars\n"
			+ " may be loners or may establish secret societies to conceal their involvement in crime, righteous aasimars are often found congregating\n"
			+ " in numbers as part of good-aligned organizations, especially (though not always) churches and religious orders.\n\n"
			+ " Relations: Aasimars are most common and most comfortable in human communities. This is especially true of those whose lineage is more\n"
			+ " distant and who bear only faint marks of their heavenly ancestry. It is unclear why the touch of the celestial is felt so much more\n"
			+ " strongly in humanity than other races, though it may be that humanity's inherent adaptability and affinity for change is responsible\n"
			+ " for the evolution of aasimars as a distinct race. Perhaps the endemic racial traits of other races are too deeply bred, too strongly\n"
			+ " present, and too resistant to change. Whatever dalliances other races may have had with the denizens of the upper planes, the progeny\n"
			+ " of such couplings are vanishingly rare and have never bred true. However, even if they generally tend toward human societies, aasimars\n"
			+ " can become comfortable in virtually any environment. They have an easy social grace and are disarmingly personable. They get on well\n"
			+ " with half-elves, who share a similar not-quite-human marginal status, though their relations are often less cordial with half-orcs,\n"
			+ " who have no patience for aasimars' overly pretty words and faces. Elven courtiers sometimes dismiss aasimars as unsophisticated, and\n"
			+ " criticize them for relying on natural charm to overcome faux pas. Perhaps of all the known races, gnomes find aasimars most fascinating,\n"
			+ " and have an intense appreciation for their varied appearances as well as the mystique surrounding their celestial heritage.\n\n"
			+ " Alignment and Religion: Aasimars are most often of good alignment, though this isn't necessarily universal, and aasimars that have\n"
			+ " turned their back on righteousness may fall into an unfathomable abyss of depravity. For the most part, however, aasimars favor deities\n"
			+ " of honor, valor, protection, healing, and refuge, or simple and prosaic faiths of home, community, and family. Some also follow the paths\n"
			+ " of art, music, and lore, finding truth and wisdom in beauty and learning.\n\n"
			+ " Adventurers: Aasimars frequently become adventurers, as they often do not quite feel at home in human society and feel the pull of\n"
			+ " some greater destiny. Clerics, oracles, and paladins are most plentiful in their ranks, though bards, sorcerers, and summoners are\n"
			+ " not uncommon among those with a fondness for arcane magic. Aasimar barbarians are rare, but when born into such tribes they often\n"
			+ " rise to leadership and encourage their clans to embrace celestial totems.";

	private static String[] racialTraits = {
			" +2 Wisdom, +2 Charisma: Aasimars are insightful, confident, and personable.",
			" Native Outsider: Aasimars are outsiders with the native subtype.",
			" Medium: Aasimars are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Aasimars have a base speed of 30 feet.",
			" Darkvision: Aasimars can see in the dark up to 60 feet.",
			" Skilled: Aasimars have a +2 racial bonus on Diplomacy and Perception checks.",
			" Spell-Like Ability: Aasimars can use daylight once per day as a spell-like ability (caster level equal to the aasimar's class level).",
			" Celestial Resistance: Aasimars have acid resistance 5, cold resistance 5, and electricity resistance 5.",
			" Languages: Aasimars begin play speaking Common and Celestial. Aasimars with high Intelligence scores can choose from the following languages: Draconic, Dwarven, Elven, Gnome, Halfling, and Sylvan."};

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
			baseFt = 5;
			baseIn = 2;
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 0;
			break;
		}
		int addedInches = 0;
		Random rand = new Random();
		for(int i = 0; i < 2; i++){
			System.out.println(addedInches);
			addedInches += (rand.nextInt(8) + 1);
		}
		System.out.println(addedInches);
		calculateWeight(g, addedInches);
		int heightFt = 0;
		heightFt += baseFt;
		int heightIn = 0;
		heightIn += baseIn + addedInches;
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
			baseWeight = 110;
			break;
		case FEMALE:
			baseWeight = 90;
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
