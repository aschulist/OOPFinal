package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Gnome extends Race{
	
	public Gnome() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Expatriates of the strange land of fey, these small folk have a reputation for flighty and eccentric behavior. Many gnomes\n"
			+ " are whimsical artisans and tinkers, creating strange devices powered by magic, alchemy, and their quirky imagination.\n"
			+ " Gnomes have an insatiable need for new experiences that often gets them in trouble.";
	
	private static String description = 
			" Gnomes are distant relatives of the fey, and their history tells of a time when they lived in the fey's mysterious realm, a place\n"
			+ " where colors are brighter, the wildlands wilder, and emotions more primal. Unknown forces drove the ancient gnomes from that realm\n"
			+ " long ago, forcing them to seek refuge in this world; despite this, the gnomes have never completely abandoned their fey roots or adapted\n"
			+ " to mortal culture. Though gnomes are no longer truly fey, their fey heritage can be seen in their innate magic powers, their\n"
			+ " oft-capricious natures, and their outlooks on life and the world. Gnomes can have the same concerns and motivations as members of\n"
			+ " other races, but just as often they are driven by passions and desires that non-gnomes see as eccentric at best, and nonsensical\n"
			+ " at worst. A gnome may risk his life to taste the food at a giant's table, to reach the bottom of a pit just because it would be the\n"
			+ " lowest place he's ever been, or to tell jokes to a dragon—and to the gnome those goals are as worthy as researching a new spell,\n"
			+ " gaining vast wealth, or putting down a powerful evil force. While such apparently fickle and impulsive acts are not universal among\n"
			+ " gnomes, they are common enough for the race as a whole to have earned a reputation for being impetuous and at least a little mad.\n"
			+ " Combined with their diminutive sizes, vibrant coloration, and lack of concern for the opinions of others, these attitudes have caused\n"
			+ " gnomes to be widely regarded by the other races as alien and strange. Gnomes, in turn, are often amazed how alike other common,\n"
			+ " civilized races are. It seems stranger to a gnome that humans and elves share so many similarities than that the gnomes do not.\n"
			+ " Indeed, gnomes often confound their allies by treating everyone who is not a gnome as part of a single, vast non-gnome collective race.\n\n"
			+ " Physical Description: Gnomes are one of the smallest of the common races, generally standing just over 3 feet in height. Despite\n"
			+ " their small frames, however, gnomes are extremely resilient, and not as weak as many of their foes assume. Though their diminutive\n"
			+ " stature reduces their ability to move quickly, gnomes often train to take advantage of their size, especially when fighting foes much\n"
			+ " larger than themselves. The coloration of gnomes varies so wildly that many outsiders assume gnomes commonly use dyes and illusions\n"
			+ " to change their skin and hair tones. While gnomes are certainly not above cosmetic enhancement (and may wish to change their appearance\n"
			+ " just to see how outlandish they can look), their natural hues truly range over a rainbow of coloration. Their hair tends toward vibrant\n"
			+ " colors such as the fiery orange of autumn leaves, the verdant green of forests at springtime, or the deep reds and purples of\n"
			+ " wildflowers in bloom. Similarly, their flesh tones range from earthy browns to floral pinks, and gnomes with black, pastel blue,\n"
			+ " or even green skin are not unknown. Gnomes' coloration has little regard for heredity, with the color of a gnome's parents and\n"
			+ " other kin having no apparent bearing on the gnome's appearance. Gnomes possess highly mutable facial characteristics, and their\n"
			+ " proportions often don't match the norm of other humanoid races. Many have overly large mouths and eyes, an effect which can be\n"
			+ " both disturbing and stunning, depending on the individual. Others may have extremely small features spread over an otherwise blank\n"
			+ " expanse of face, or may mix shockingly large eyes with a tiny, pursed mouth and a pert button of a nose. Gnomes rarely take pride\n"
			+ " in or show embarrassment about their features, but members of other races often fixate on a gnome's most prominent feature and attempt\n"
			+ " to use it as the focus of insults or endearments.\n\n"
			+ " Society: Unlike most races, gnomes do not generally organize themselves within classic societal structures. Gnome cities are\n"
			+ " unusual and gnome kingdoms almost unknown. Further, gnomes have no particular tendency to gather in specific neighborhoods even when\n"
			+ " a large number of them live among other races. While specific laws meant to contain the potential impact of gnomes on a society may\n"
			+ " require a \"gnome quarter,\" and societal pressure sometimes causes all non-gnomes to move away from areas with high gnome populations,\n"
			+ " left to their own devices, gnomes tend to spread evenly throughout communities that allow them. However, even when gnomes are common\n"
			+ " within a community as a group, individual gnomes tend to be always on the move. Whimsical creatures at heart, they typically travel alone\n"
			+ " or with temporary companions, ever seeking new and more exciting experiences. They rarely form enduring relationships among themselves\n"
			+ " or with members of other races, instead pursuing crafts, professions, or collections with a passion that borders on zealotry. If a\n"
			+ " gnome does settle in an area or stay with a group for a longer period, it is almost always the result of some benefit that area gives\n"
			+ " to a vocation or obsession to which the gnome had dedicated himself. Despite their extremely varied backgrounds and lack of a unifying\n"
			+ " homeland, gnomes do possess some common cultural traits. Male gnomes have a strange fondness for unusual hats and headgear, often\n"
			+ " wearing the most expensive and ostentatious head-covering they can afford (and that their chosen careers will allow them to wear\n"
			+ " without causing problems). Females rarely cover their heads, but proudly wear elaborate and eccentric hairstyles that often include\n"
			+ " intricate jeweled combs and headpieces.\n\n"
			+ " Relations: Gnomes have difficulty interacting with the other races, on both emotional and physical levels. In many ways the very\n"
			+ " fact other races see gnomes as odd is itself the thing gnomes find most odd about other races, and this leads to a strong lack of\n"
			+ " common ground upon which understanding and relationships can be built. When two gnomes encounter one another, they generally assume\n"
			+ " some mutually beneficial arrangement can be reached, no matter how different their beliefs and traditions may be. Even if this turns\n"
			+ " out not to be the case, the gnomes continue to look for commonalities in their dealings with each other. The inability or unwillingness\n"
			+ " of members of other races to make the same effort when dealing with gnomes is both frustrating and confusing to most gnomes. In many\n"
			+ " ways, it is gnomes' strong connection to a wide range of apparently unconnected ideas that makes it difficult for other races to build\n"
			+ " relationships with them. Gnome humor, for example, is often focused on physical pranks, nonsensical rhyming nicknames, and efforts to\n"
			+ " convince others of outrageous lies that strain all credibility. Gnomes find such efforts hysterically funny, but their pranks often\n"
			+ " come across as malicious or senseless to other races, while gnomes in turn tend to think of the taller races as dull and lumbering\n"
			+ " giants. Gnomes get along reasonably well with halflings and humans, who at least have some traditions of bizarre, gnomelike humor.\n"
			+ " Gnomes generally feel dwarves and half-orcs need to lighten up, and attempt to bring levity into their lives with tricks, jokes, and\n"
			+ " outrageous tales the more dour races simply cannot see the sense of. Gnomes respect elves, but often grow frustrated with the slow\n"
			+ " pace at which members of the long-lived race make decisions. To gnomes, action is always better than inaction, and many gnomes carry\n"
			+ " several highly involved projects with them at all times to keep themselves entertained during rest periods.\n\n"
			+ " Alignment and Religion: Although gnomes are impulsive tricksters, with sometimes inscrutable motives and equally confusing methods,\n"
			+ " their hearts are generally in the right place. What may seem a malicious act to a non-gnome is more likely an effort to introduce new\n"
			+ " acquaintances to new experiences, however unpleasant the experiences may be. Gnomes are prone to powerful fits of emotion, and find\n"
			+ " themselves most at peace within the natural world.\n\n"
			+ " Adventurers: Gnomes' propensity for wanderlust, deep curiosity, and desire to master odd or esoteric skills and languages make them\n"
			+ " natural adventurers. They often become wanderers to experience new aspects of life, for nothing is as novel as the uncounted dangers\n"
			+ " facing adventurers. Many gnomes see adventuring as the only worthwhile purpose in life, and seek out adventures for no other motive than\n"
			+ " to experience them. Other gnomes desire to find some lost lore or material that has ties to their chosen vocation and believe only dragon\n"
			+ " hoards and ancient ruins can contain the lore they need, which can result in gnomes who think of themselves as bakers or weavers being just\n"
			+ " as accomplished adventurers as those who declare themselves to be mages or scouts. Gnomes are physically weak compared to many races, and see\n"
			+ " this as a simple fact of life to be planned for accordingly. Most adventuring gnomes make up for their weakness with a proclivity for sorcery\n"
			+ " or bardic music, while others turn to alchemy or exotic weapons to grant them an edge in conflicts.";
	
	private static String[] racialTraits = {
			" +2 Constitution, +2 Charisma, –2 Strength: Gnomes are physically weak but surprisingly hardy, and their attitude makes them naturally agreeable.",
			" Small: Gnomes are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their Combat Maneuver Bonus and Combat Maneuver Defense, and a +4 size bonus on Stealth checks.",
			" Slow Speed: Gnomes have a base speed of 20 feet.",
			" Low-Light Vision: Gnomes can see twice as far as humans in conditions of dim light.",
			" Defensive Training: Gnomes gain a +4 dodge bonus to AC against monsters of the giant subtype.",
			" Gnome Magic: Gnomes add +1 to the DC of any saving throws against illusion spells that they cast. Gnomes with Charisma scores of 11 or higher also gain the following spell-like abilities: 1/day—dancing lights, ghost sound, prestidigitation, and speak with animals. The caster level for these effects is equal to the gnome's level. The DC for these spells is equal to 10 + the spell's level + the gnome's Charisma modifier.",
			" Hatred: Gnomes receive a +1 bonus on attack rolls against humanoid creatures of the reptilian and goblinoid subtypes because of their special training against these hated foes.",
			" Illusion Resistance: Gnomes gain a +2 racial saving throw bonus against illusion spells and effects.",
			" Keen Senses: Gnomes receive a +2 racial bonus on Perception checks.",
			" Obsessive: Gnomes receive a +2 racial bonus on a Craft or Profession skill of their choice.",
			" Weapon Familiarity: Gnomes treat any weapon with the word \"gnome\" in its name as a martial weapon.",
			" Languages: Gnomes begin play speaking Common, Gnome, and Sylvan. Gnomes with high Intelligence scores can choose from the following: Draconic, Dwarven, Elven, Giant, Goblin, and Orc."};

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
			for(int i = 0; i < 9; i++){
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
			baseIn = 0;
			break;
		case FEMALE:
			baseFt = 2;
			baseIn = 10;
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
			baseWeight = 35;
			break;
		case FEMALE:
			baseWeight = 30;
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
