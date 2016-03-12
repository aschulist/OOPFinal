package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Human extends Race{

	public Human() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Ambitious, sometimes heroic, and always confident, humans have an ability to work together toward common goals that makes\n"
			+ " them a force to be reckoned with. Though short-lived compared to other races, their boundless energy and drive allow them\n"
			+ " to accomplish much in their brief lifetimes.";
	
	private static String description = 
			" Humans possess exceptional drive and a great capacity to endure and expand, and as such are currently the dominant race in the world.\n"
			+ " Their empires and nations are vast, sprawling things, and the citizens of these societies carve names for themselves with the strength\n"
			+ " of their sword arms and the power of their spells. Humanity is best characterized by its tumultuousness and diversity, and human cultures\n"
			+ " run the gamut from savage but honorable tribes to decadent, devil-worshiping noble families in the most cosmopolitan cities. Humans'\n"
			+ " curiosity and ambition often triumph over their predilection for a sedentary lifestyle, and many leave their homes to explore the\n"
			+ " innumerable forgotten corners of the world or lead mighty armies to conquer their neighbors, simply because they can. Human society is\n"
			+ " a strange amalgam of nostalgia and futurism, being enamored of past glories and wistfully remembered \"golden ages,\" yet at the same\n"
			+ " time quick to discard tradition and history and strike off into new ventures. Relics of the past are kept as prized antiques and museum\n"
			+ " pieces, as humans love to collect things—not only inanimate relics but also living creatures—to display for their amusement or to serve\n"
			+ " by their side. Other races suggest this behavior is due to a deep-rooted urge to dominate and assert power in the human psyche, an urge\n"
			+ " to take, till, or tame the wild things and places of the world. Those with a more charitable view believe humans are simply collectors\n"
			+ " of experiences, and the things they take and keep, whether living, dead, or never alive, are just tokens to remind themselves of the\n"
			+ " places they have gone, the things they have seen, and the deeds they have accomplished. Their present and future value is just a bonus\n"
			+ " their real value is as an ongoing reminder of the inevitable progress of humanity. Humans in many places are fascinated by older races\n"
			+ " and cultures, though at times they grow frustrated or even contemptuous of ancient and (to their mind) outmoded traditions. Their\n"
			+ " attitudes toward other races are thus a curious mix of exoticism and even fetishism, though usually with a very superficial level of\n"
			+ " understanding and appreciation of those cultures, alongside a deeply rooted arrogance that means most humans have a hard time regarding\n"
			+ " themselves as anything other than the default standard of society. Human scholars engaged in the study of other races—who might be\n"
			+ " assumed to be the most cosmopolitan and well versed in their nature and culture—have often proved no better than the less-learned\n"
			+ " members of their race when it comes to genuine closing of the social distance. Humans are gregarious, often friendly, and willing to mix\n"
			+ " and interact with others, but their sheer obliviousness to their offhanded marginalization of others is what so chagrins other races\n"
			+ " when dealing with them. Of course, well-meaning, blundering ignorance and numerical superiority are not the only things that make other\n"
			+ " races suspicious of humans. Entirely too many examples can be found throughout history wherein human xenophobia and intolerance has led\n"
			+ " to social isolationism, civil oppression, bloody purges, inquisitions, mob violence, and open war. Humans are not the only race to hate\n"
			+ " what is different among them, but they seem to have a susceptibility to fear-mongering and suspicion, whether about race, language,\n"
			+ " religion, class, gender, or another difference. More moderate human citizens often sit idly by while their more extreme compatriots\n"
			+ " dominate the political and cultural conversation, yet there are also many who stand in opposition to extremists and embody a spirit\n"
			+ " of unity across the bounds of difference, transcending barriers and forming alliances and relationships both large and small across\n"
			+ " every color, creed, country, or species.\n\n"
			+ " Physical Description: The physical characteristics of humans are as varied as the world's climes. From the dark-skinned tribesmen of\n"
			+ " the southern continents to the pale and barbaric raiders of the northern lands, humans possess a wide variety of skin colors, body\n"
			+ " types, and facial features. Generally speaking, humans' skin color assumes a darker hue the closer to the equator they live. At the\n"
			+ " same time, bone structure, hair color and texture, eye color, and a host of facial and bodily phenotypic characteristics vary immensely\n"
			+ " from one locale to another. Cheekbones may be high or broad, noses aquiline or flat, and lips full or thin; eyes range wildly in hue,\n"
			+ " some deep set in their sockets, and others with full epicanthic folds. Appearance is hardly random, of course, and familial, tribal,\n"
			+ " or national commonalities often allow the knowledgeable to identify a human's place of origin on sight, or at least to hazard a good\n"
			+ " guess. Humans' origins are also indicated through their traditional styles of bodily decoration, not only in the clothing or jewelry\n"
			+ " worn, but also in elaborate hairstyles, piercing, tattooing, and even scarification.\n\n"
			+ " Society: Human society comprises a multitude of governments, attitudes, and lifestyles. Though the oldest human cultures trace their\n"
			+ " histories thousands of years into the past, when compared to the societies of other races like elves and dwarves, human society seems\n"
			+ " to be in a state of constant flux as empires fragment and new kingdoms subsume the old. In general, humans are known for their\n"
			+ " flexibility, ingenuity, and ambition. Other races sometimes envy humans their seemingly limitless adaptability, not so much biologically\n"
			+ " speaking but in their willingness to step beyond the known and press on to whatever might await them. While many or even most humans as\n"
			+ " individuals are content to stay within their comfortable routine, there is a dauntless spirit of discovery endemic to humans as a species\n"
			+ " that drives them in striving toward possibilities beyond every horizon. Relations: Humans are fecund, and their drive and numbers often\n"
			+ " spur them into contact with other races during bouts of territorial expansion and colonization. In many cases, this tendency leads to\n"
			+ " violence and war, yet humans are also swift to forgive and forge alliances with races who do not try to match or exceed them in violence.\n"
			+ " Proud, sometimes to the point of arrogance, humans might look upon dwarves as miserly drunkards, elves as flighty fops, halflings as craven\n"
			+ " thieves, gnomes as twisted maniacs, and half-elves and half-orcs as embarrassments—but the race's diversity among its own members also\n"
			+ " makes many humans quite adept at accepting others for what they are. Humans may become so absorbed in their own affairs that they remain\n"
			+ " ignorant of the language and culture of others, and some take this ignorance to a hateful extreme of intolerance, oppression, and rarely\n"
			+ " even extermination of others they perceive as dangerous, strange, or \"impure.\" Thankfully, while such incidents and movements may taint\n"
			+ " all of humanity in the eyes of some, they are more often the exception than the rule.\n\n"
			+ " Alignment and Religion: Humanity is perhaps the most diverse of all the common races, with a capacity for both great evil and boundless\n"
			+ " good. Some humans assemble into vast barbaric hordes, while others build sprawling cities that cover miles. Taken as a whole, most humans\n"
			+ " are neutral, yet they generally tend to congregate in nations and civilizations with specific alignments. Humans also have the widest range\n"
			+ " of gods and religions, lacking other races' ties to tradition and eager to turn to anyone offering them glory or protection.\n\n"
			+ " Adventurers: Ambition alone drives countless humans, and for many, adventuring serves as a means to an end, whether it be wealth, acclaim,\n"
			+ " social status, or arcane knowledge. A few pursue adventuring careers simply for the thrill of danger. Humans hail from myriad regions and\n"
			+ " backgrounds, and as such can fill any role within an adventuring party.";
	
	private static String[] racialTraits = {
			" +2 to One Ability Score: Human characters gain a +2 racial bonus to one ability score of their choice at creation to represent their varied nature.",
			" Medium: Humans are Medium creatures and receive no bonuses or penalties due to their size.",
			" Normal Speed: Humans have a base speed of 30 feet.",
			" Bonus Feat: Humans select one extra feat at 1st level.",
			" Skilled: Humans gain an additional skill rank at first level and one additional rank whenever they gain a level.",
			" Languages: Humans begin play speaking Common. Humans with high Intelligence scores can choose any languages they want (except secret languages, such as Druidic)."};
	
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
