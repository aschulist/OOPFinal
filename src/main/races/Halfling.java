package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class Halfling extends Race{

	public Halfling() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Members of this diminutive race find strength in family, community, and their own innate and seemingly inexhaustible luck.\n"
			+ " While their fierce curiosity is sometimes at odds with their intrinsic common sense, halflings are eternal optimists and\n"
			+ " cunning opportunists with an incredible knack for getting out the worst situations.";
	
	private static String description = 
			" Though their curiosity drives them to seek out new places and experiences, halflings possess a strong sense of hearth and home, often\n"
			+ " spending above their means to enhance the comforts of domestic life. Without a doubt, halflings enjoy luxury and comfort, but they\n"
			+ " have equally strong reasons to make their homes a showcase. Halflings consider this urge to devote time, money, and energy toward\n"
			+ " improving their dwellings a sign of both respect for strangers and affection for their loved ones. Whether for their own blood kin,\n"
			+ " cherished friends, or honored guests, halflings make their homes beautiful in order to express their feelings toward those they welcome\n"
			+ " inside. Even traveling halflings typically decorate their wagons or carry a few cherished keepsakes to adorn their campsites.\n\n"
			+ " Physical Description: Halflings rise to a humble height of 3 feet. They prefer to walk barefoot, leading the bottoms of their feet\n"
			+ " to become roughly calloused. Tufts of thick, curly hair warm the tops of their broad, tanned feet. Their skin tends toward a rich\n"
			+ " cinnamon color and their hair toward light shades of brown. A halfling's ears are pointed, but proportionately not much larger than\n"
			+ " those of a human. Halflings prefer simple and modest clothing. Though willing and able to dress up if the situation demands it, their\n"
			+ " racial urge to remain quietly in the background makes them rather conservative dressers in most situations. Halfling entertainers, on\n"
			+ " the other hand, make their livings by drawing attention, and tend to go overboard with gaudy and flashy costumes.\n\n"
			+ " Society: Rather than place their faith in empires or great causes, many halflings prefer to focus on the simpler and humbler virtues of\n"
			+ " their families and local communities. Halflings claim no cultural homeland and control no settlements larger than rural assemblies\n"
			+ " of free towns. Most often, they dwell at the knees of their human cousins in human cities, eking out livings as they can from the scraps\n"
			+ " of larger societies. Many halflings lead perfectly fulfilling lives in the shadow of their larger neighbors, while some prefer more\n"
			+ " nomadic lives, traveling the world and experiencing all it has to offer. Halflings rely on customs and traditions to maintain their\n"
			+ " own culture. They have an extensive oral history filled with important stories about folk heroes who exemplify particular halfling\n"
			+ " virtues, but otherwise see little purpose in studying history in and of itself. Given a choice between a pointless truth and a useful\n"
			+ " fable, halflings almost always opt for the fable. This tendency helps to explain at least something of the famous halfling adaptability.\n"
			+ " Halflings look to the future and find it very easy to cast off the weight of ancient grudges or obligations that drag down so many other\n"
			+ " races.\n\n"
			+ " Relations: A typical halfling prides himself on his ability to go unnoticed by other races—a trait that allows many halflings to excel\n"
			+ " at thievery and trickery. Most halflings know full well the stereotypical view other races take of them as a result, and go out of their\n"
			+ " way to be forthcoming and friendly to the bigger races when they're not trying to go unnoticed. They get along fairly well with gnomes,\n"
			+ " although most halflings regard these eccentric creatures with a hefty dose of caution. Halflings respect elves and dwarves, but these\n"
			+ " races often live in remote regions far from the comforts of civilization that halflings enjoy, thus limiting opportunities for interaction.\n"
			+ " By and large, only half-orcs are shunned by halflings, for their great size and violent natures are a bit too intimidating for most\n"
			+ " halflings to cope with. Halflings coexist well with humans as a general rule, but since some of the more aggressive human societies\n"
			+ " value halflings as slaves, they try not to grow too complacent. Halflings strongly value their freedom, especially the ability to\n"
			+ " travel in search of new experiences and the autonomy this requires. However, practical and flexible as always, enslaved halflings seldom\n"
			+ " fight back directly against their masters. When possible, they wait for the perfect opportunity and then simply slip away. Sometimes, if\n"
			+ " enslaved for long enough, halflings even come to adopt their owners as their new families. Though they still dream of escape and liberty,\n"
			+ " these halflings also make the best of their lives.\n\n"
			+ " Alignment and Religion: Halflings are loyal to their friends and families, but since they dwell in a world dominated by races twice as\n"
			+ " large as themselves, they have come to grips with the fact that sometimes they need to scrape and scrounge for survival. Most halflings\n"
			+ " are neutral as a result. Though they usually make a show of respecting the laws and endorsing the prejudices of their communities,\n"
			+ " halflings place an even greater emphasis on the innate common sense of the individual. When a halfling disagrees with society at large,\n"
			+ " he will do what he thinks is best. Always practical, halflings frequently worship the deity most favored by their larger and more powerful\n"
			+ " neighbors. The goddess of both luck and travel seems a natural fit for most halflings and offering her a quick prayer every now and then\n"
			+ " is only common sense.\n\n"
			+ " Adventurers: Their inherent luck coupled with their insatiable wanderlust makes halflings ideal candidates for lives of adventure.\n"
			+ " Though perfectly willing to pocket any valuables they come across, halflings often care more for the new experiences adventuring brings\n"
			+ " them than for any material reward. Halflings tend to view money as a means of making their lives easier and more comfortable, not as\n"
			+ " an end in and of itself. Other such vagabonds often put up with this curious race in hopes that some of their mystical luck will rub\n"
			+ " off. Halflings see nothing wrong with encouraging this belief, not just in their traveling companions, but also in the larger world.\n"
			+ " Many try to use their reputation for luck to haggle for reduced fare when traveling by ship or caravan, or even for an overnight stay\n"
			+ " at an inn. They meet with mixed success, but there are just enough stories circulating about the good fortune that befalls people\n"
			+ " traveling with halflings to give even the most skeptical pause. Of course, some suspect that halflings deliberately spread these\n"
			+ " reports for just that reason.";
	
	private static String[] racialTraits = {
			" +2 Dexterity, +2 Charisma, –2 Strength: Halflings are nimble and strong-willed, but their small stature makes them weaker than other races.",
			" Small: Halflings are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their CMB and CMD, and a +4 size bonus on Stealth checks.",
			" Slow Speed: Halflings have a base speed of 20 feet.",
			" Fearless: Halflings receive a +2 racial bonus on all saving throws against fear. This bonus stacks with the bonus granted by halfling luck.",
			" Halfling Luck: Halflings receive a +1 racial bonus on all saving throws.",
			" Keen Senses: Halflings receive a +2 racial bonus on Perception checks.",
			" Sure-Footed: Halflings receive a +2 racial bonus on Acrobatics and Climb checks.",
			" Weapon Familiarity: Halflings are proficient with slings and treat any weapon with the word \"halfling\" in its name as a martial weapon.",
			" Languages: Halflings begin play speaking Common and Halfling. Halflings with high Intelligence scores can choose from the following: Dwarven, Elven, Gnome, and Goblin."};
	
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
			for(int i = 0; i < 2; i++){
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
			for(int i = 0; i < 3; i++){
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
			for(int i = 0; i < 4; i++){
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
			baseFt = 2;
			baseIn = 8;
			break;
		case FEMALE:
			baseFt = 2;
			baseIn = 6;
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
			baseWeight = 30;
			break;
		case FEMALE:
			baseWeight = 25;
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
