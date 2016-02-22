package main.races;

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
			"The long-lived elves are children of the natural world, similar in many superficial ways to fey creatures, though with key differences. While fey are truly linked to the flora and fauna of their homes, existing as the nearly immortal voices and guardians of the wilderness, elves are instead mortals who are in tune with the natural world around them. Elves seek to live in balance with the wild and understand it better than most other mortals. Some of this understanding is mystical, but an equal part comes from the elves' long lifespans, which in turn gives them long-ranging outlooks. Elves can expect to remain active in the same locale for centuries. By necessity, they must learn to maintain sustainable lifestyles, and this is most easily done when they work with nature, rather than attempting to bend it to their will. However, their links to nature are not entirely driven by pragmatism. Elves' bodies slowly change over time, taking on a physical representation of their mental and spiritual states, and those who dwell in a region for a long period of time find themselves physically adapting to match their surroundings, most noticeably taking on coloration that reflects the local environment. Elves value their privacy and traditions, and while they are often slow to make friends at both the personal and national levels, once an outsider is accepted as a comrade, the resulting alliances can last for generations. Elves take great joy in forging alliances with races that share or exceed their long lifetimes, and often work to befriend dragons, outsiders, and fey. Those elves who spend their lives among the short-lived races, on the other hand, often develop a skewed perception of mortality and become morose, the result of watching wave after wave of companions age and die before their eyes. Physical Description: Generally taller than humans, elves possess a graceful, slender physique that is accentuated by their long, pointed ears. It is a mistake, however, to consider them weak or feeble, as the thin limbs of an elf can contain surprising power. Their eyes are wide and almond-shaped, and filled with large, vibrantly colored pupils. The coloration of elves as a whole varies wildly, and is much more diverse than that of human populations. However, as their coloration often matches their surroundings, the elves of a single community may appear quite similar. Forest-dwelling elves often have variations of green, brown, and tan in their hair, eye, and even skin tones. While elven clothing often plays off the beauty of the natural world, those elves who live in cities tend to bedeck themselves in the latest fashions. Where city-dwelling elves encounter other urbanites, the elves are often fashion trendsetters. Society: Many elves feel a bond with nature and strive to live in harmony with the natural world. Although, like most, elves prefer bountiful lands where resources are plentiful, when driven to live in harsher climates, they work hard to protect and shepherd the region's bounty, and learn how to maximize the benefit they receive from what little can be harvested. When they can carve out a sustainable, reliable life in deserts and wastelands, they take pride as a society in the accomplishment. While this can make them excellent guides to outsiders they befriend who must travel through such lands, their disdain of those who have not learned to live off the scant land as they have makes such friends rare. Elves have an innate gift for craftsmanship and artistry, especially when working in wood, bone, ivory, or leather. Most, however, find manipulating earth and stone to be distasteful, and prefer to avoid forging, stonework, and pottery. When such work must be done within a community, a few elves may find themselves drawn to it, but regardless of their craftsmanship, such \"dirt-wrights\" are generally seen by other elves as being a bit off. In the most insular of elven societies, they may even be treated as lower class. Elves also have an appreciation for the written word, magic, and painstaking research. Their naturally keen minds and senses, combined with their inborn patience, make them particularly suited to wizardry. Arcane research and accomplishment are seen as both practical goals, in line with being a soldier or architect, and artistic endeavors as great as poetry or sculpture. Within elven society, wizards are held in extremely high regard as masters of an art both powerful and aesthetically valued. Other spellcasters are not disdained, but do not gain the praise lavished upon elven wizards. Relations: Elves are prone to dismissing other races, writing them off as rash and impulsive, yet on an individual level, they are excellent judges of character. In many cases an elf will come to value a specific member of another race, seeing that individual as deserving and respectable, while still dismissing the race as a whole. If called on this behavior, the elf often doesn't understand why his \"special friend\" is upset the elf has noticed the friend is \"so much better than the rest of his kind.\" Even elves who see such prejudice for what it is must constantly watch themselves to prevent such views from coloring their thinking. Elves are not foolish enough, however, to dismiss all aspects of other races and cultures. An elf might not want a dwarf neighbor, but would be the first to acknowledge dwarves' skill at smithing and their tenacity in facing orc threats. Elves regard gnomes as strange (and sometimes dangerous) curiosities, but regard their magical talent as being worthy of praise and respect. Halflings are often viewed with a measure of pity, for these small folk seem to the elves to be adrift, without a traditional home. Elves are fascinated with humans, who seem to live in a few short years as full a life as an elf manages in centuries. In fact, many elves become infatuated with humans, as evidenced by the number of half-elves in the world. Elves have difficulty accepting crossbreeds of any sort, however, and usually disown such offspring. They similarly regard half-orcs with distrust and suspicion, assuming they possess the worst aspects of orc and human personalities. Alignment & Religion: Elves are emotional and capricious, yet value kindness and beauty. Most elves are chaotic good, wishing all creatures to be safe and happy, but unwilling to sacrifice personal freedom or choice to accomplish such goals. serving as an example of personal artistry and freedom of expressions, rather than seeking some base physical gratification. Adventurers: Many elves embark on adventures out of a desire to explore the world, leaving their secluded realms to reclaim forgotten elven magic or search out lost kingdoms established millennia ago by their ancestors. This need to see a wider world is accepted by their societies as a natural part of becoming mature and experienced individuals. Such elves are expected to return in some few decades and take up lives in their homelands once more, enriched both in treasure and in worldview. For those elves raised among humans, however, life within their homes�watching friends and family swiftly age and die�is often stifling, and the ephemeral and unfettered life of an adventurer holds a natural appeal. Elves generally eschew melee because of their relative frailty, preferring instead to engage enemies at range. Most see combat as unpleasant even when needful, and prefer it be done as quickly as possible, preferably without getting close enough to smell their foes. This preference for making war at a distance, coupled with their natural accuracy and grasp of the arcane, encourages elves to pursue classes such as wizards and rangers.";
	
	private static String[] racialTraits= {};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
	}

	@Override
	public void calculateHeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}
	
	
}
