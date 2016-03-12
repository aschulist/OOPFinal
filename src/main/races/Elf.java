package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Elf extends Race{

	public Elf() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Tall, noble, and often haughty, elves are long-lived and subtle masters of the wilderness. Elves excel in the arcane arts.\n"
			+ " Often they use their intrinsic link to nature to forge new spells and create wondrous items that, like their creators,\n"
			+ " seem nearly impervious to the ravages of time. A private and often introverted race, elves can give the impression they\n"
			+ " are indifferent to the plights of others.";
	
	private static String description = 
			"The long-lived elves are children of the natural world, similar in many superficial ways to fey creatures, though with key differences.\n"
			+ " While fey are truly linked to the flora and fauna of their homes, existing as the nearly immortal voices and guardians of the\n"
			+ " wilderness, elves are instead mortals who are in tune with the natural world around them. Elves seek to live in balance with the wild\n"
			+ " and understand it better than most other mortals. Some of this understanding is mystical, but an equal part comes from the elves' long\n"
			+ " lifespans, which in turn gives them long-ranging outlooks. Elves can expect to remain active in the same locale for centuries. By\n"
			+ " necessity, they must learn to maintain sustainable lifestyles, and this is most easily done when they work with nature, rather than\n"
			+ " attempting to bend it to their will. However, their links to nature are not entirely driven by pragmatism. Elves' bodies slowly change\n"
			+ " over time, taking on a physical representation of their mental and spiritual states, and those who dwell in a region for a long period\n"
			+ " of time find themselves physically adapting to match their surroundings, most noticeably taking on coloration that reflects the local\n"
			+ " environment. Elves value their privacy and traditions, and while they are often slow to make friends at both the personal and national\n"
			+ " levels, once an outsider is accepted as a comrade, the resulting alliances can last for generations. Elves take great joy in forging\n"
			+ " alliances with races that share or exceed their long lifetimes, and often work to befriend dragons, outsiders, and fey. Those elves\n"
			+ " who spend their lives among the short-lived races, on the other hand, often develop a skewed perception of mortality and become morose,\n"
			+ " the result of watching wave after wave of companions age and die before their eyes.\n\n"
			+ " Physical Description: Generally taller than humans, elves possess a graceful, slender physique that is accentuated by their long, pointed\n"
			+ " ears. It is a mistake, however, to consider them weak or feeble, as the thin limbs of an elf can contain surprising power. Their eyes are\n"
			+ " wide and almond-shaped, and filled with large, vibrantly colored pupils. The coloration of elves as a whole varies wildly, and is much more\n"
			+ " diverse than that of human populations. However, as their coloration often matches their surroundings, the elves of a single community may\n"
			+ " appear quite similar. Forest-dwelling elves often have variations of green, brown, and tan in their hair, eye, and even skin tones. While\n"
			+ " elven clothing often plays off the beauty of the natural world, those elves who live in cities tend to bedeck themselves in the latest\n"
			+ " fashions. Where city-dwelling elves encounter other urbanites, the elves are often fashion trendsetters.\n\n"
			+ " Society: Many elves feel a bond with nature and strive to live in harmony with the natural world. Although, like most, elves prefer\n"
			+ " bountiful lands where resources are plentiful, when driven to live in harsher climates, they work hard to protect and shepherd the region's\n"
			+ " bounty, and learn how to maximize the benefit they receive from what little can be harvested. When they can carve out a sustainable,\n"
			+ " reliable life in deserts and wastelands, they take pride as a society in the accomplishment. While this can make them excellent guides\n"
			+ " to outsiders they befriend who must travel through such lands, their disdain of those who have not learned to live off the scant land as\n"
			+ " they have makes such friends rare. Elves have an innate gift for craftsmanship and artistry, especially when working in wood, bone, ivory,\n"
			+ " or leather. Most, however, find manipulating earth and stone to be distasteful, and prefer to avoid forging, stonework, and pottery. When\n"
			+ " such work must be done within a community, a few elves may find themselves drawn to it, but regardless of their craftsmanship, such\n"
			+ " \"dirt-wrights\" are generally seen by other elves as being a bit off. In the most insular of elven societies, they may even be treated\n"
			+ " as lower class. Elves also have an appreciation for the written word, magic, and painstaking research. Their naturally keen minds and\n"
			+ " senses, combined with their inborn patience, make them particularly suited to wizardry. Arcane research and accomplishment are seen as both\n"
			+ " practical goals, in line with being a soldier or architect, and artistic endeavors as great as poetry or sculpture. Within elven society,\n"
			+ " wizards are held in extremely high regard as masters of an art both powerful and aesthetically valued. Other spellcasters are not disdained,\n"
			+ " but do not gain the praise lavished upon elven wizards.\n\n"
			+ " Relations: Elves are prone to dismissing other races, writing them off as rash and impulsive, yet on an individual level, they are excellent\n"
			+ " judges of character. In many cases an elf will come to value a specific member of another race, seeing that individual as deserving and\n"
			+ " respectable, while still dismissing the race as a whole. If called on this behavior, the elf often doesn't understand why his \"special friend\"\n"
			+ " is upset the elf has noticed the friend is \"so much better than the rest of his kind.\" Even elves who see such prejudice for what it is must\n"
			+ " constantly watch themselves to prevent such views from coloring their thinking. Elves are not foolish enough, however, to dismiss all aspects of\n"
			+ " other races and cultures. An elf might not want a dwarf neighbor, but would be the first to acknowledge dwarves' skill at smithing and their\n"
			+ " tenacity in facing orc threats. Elves regard gnomes as strange (and sometimes dangerous) curiosities, but regard their magical talent as being\n"
			+ " worthy of praise and respect. Halflings are often viewed with a measure of pity, for these small folk seem to the elves to be adrift, without\n"
			+ " a traditional home. Elves are fascinated with humans, who seem to live in a few short years as full a life as an elf manages in centuries.\n"
			+ " In fact, many elves become infatuated with humans, as evidenced by the number of half-elves in the world. Elves have difficulty accepting\n"
			+ " crossbreeds of any sort, however, and usually disown such offspring. They similarly regard half-orcs with distrust and suspicion, assuming\n"
			+ " they possess the worst aspects of orc and human personalities.\n\n"
			+ " Alignment & Religion: Elves are emotional and capricious, yet value kindness and beauty. Most elves are chaotic good, wishing all creatures\n"
			+ " to be safe and happy, but unwilling to sacrifice personal freedom or choice to accomplish such goals. serving as an example of personal\n"
			+ " artistry and freedom of expressions, rather than seeking some base physical gratification.\n\n"
			+ " Adventurers: Many elves embark on adventures out of a desire to explore the world, leaving their secluded realms to reclaim forgotten elven\n"
			+ " magic or search out lost kingdoms established millennia ago by their ancestors. This need to see a wider world is accepted by their societies\n"
			+ " as a natural part of becoming mature and experienced individuals. Such elves are expected to return in some few decades and take up lives in\n"
			+ " their homelands once more, enriched both in treasure and in worldview. For those elves raised among humans, however, life within their\n"
			+ " homes—watching friends and family swiftly age and die—is often stifling, and the ephemeral and unfettered life of an adventurer holds a\n"
			+ " natural appeal. Elves generally eschew melee because of their relative frailty, preferring instead to engage enemies at range. Most see\n"
			+ " combat as unpleasant even when needful, and prefer it be done as quickly as possible, preferably without getting close enough to smell their\n"
			+ " foes. This preference for making war at a distance, coupled with their natural accuracy and grasp of the arcane, encourages elves to pursue\n"
			+ " classes such as wizards and rangers.";
	
	private static String[] racialTraits= {
			" +2 Dexterity, +2 Intelligence, –2 Constitution: Elves are nimble, both in body and mind, but their form is frail.",
			" Medium: Elves are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Elves have a base speed of 30 feet.",
			" Low-Light Vision: Elves can see twice as far as humans in conditions of dim light.",
			" Elven Immunities: Elves are immune to magic sleep effects and gain a +2 racial saving throw bonus against enchantment spells and effects.",
			" Elven Magic: Elves receive a +2 racial bonus on caster level checks made to overcome spell resistance. In addition, elves receive a +2 racial bonus on Spellcraft skill checks made to identify the properties of magic items.",
			" Keen Senses: Elves receive a +2 racial bonus on Perception checks.",
			" Weapon Familiarity: Elves are proficient with longbows (including composite longbows), longswords, rapiers, and shortbows (including composite shortbows), and treat any weapon with the word \"elven\" in its name as a martial weapon.",
			" Languages: Elves begin play speaking Common and Elven. Elves with high Intelligence scores can choose from the following: Celestial, Draconic, Gnoll, Gnome, Goblin, Orc, and Sylvan."};
	
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
				addedInches += (rand.nextInt(8) + 1);
			}
			break;
		case FEMALE:
			baseFt = 5;
			baseIn = 4;
			for(int i = 0; i < 2; i++){
				addedInches += (rand.nextInt(6) + 1);
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
			baseWeight = 100;
			break;
		case FEMALE:
			baseWeight = 90;
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
