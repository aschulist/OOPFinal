package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class HalfElf extends Race{

	public HalfElf() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Often caught between the worlds of their progenitor races, half-elves are a race of both grace and contradiction. Their dual\n"
			+ " heritage and natural gifts often create brilliant diplomats and peacemakers, but half-elves are often susceptible to an\n"
			+ " intense and even melancholic isolation, realizing that they are never truly part of elven or human society.";
	
	private static String description = 
			" Elves have long drawn the covetous gazes of other races. Their generous lifespans, magical affinity, and inherent grace each contribute\n"
			+ " to the admiration or bitter envy of their neighbors. Of all their traits, however, none so entrance their human associates as their\n"
			+ " beauty. Since the two races first came into contact with each other, humans have held up elves as models of physical perfection, seeing\n"
			+ " in these fair folk idealized versions of themselves. For their part, many elves find humans attractive despite their comparatively\n"
			+ " barbaric ways, and are drawn to the passion and impetuosity with which members of the younger race play out their brief lives. Sometimes\n"
			+ " this mutual infatuation leads to romantic relationships. Though usually short-lived, even by human standards, such trysts may lead\n"
			+ " to the birth of half-elves, a race descended from two cultures yet inheritor of neither. Half-elves can breed with one another, but\n"
			+ " even these \"pureblood\" half-elves tend to be viewed as bastards by humans and elves alike. Caught between destiny and derision,\n"
			+ " half-elves often view themselves as the middle children of the world.\n\n"
			+ " Physical Description: Half-elves stand taller than humans but shorter than elves. They inherit the lean build and comely features of\n"
			+ " their elven lineage, but their skin color is normally dictated by their human side. While half-elves retain the pointed ears of elves,\n"
			+ " theirs are more rounded and less pronounced. Their eyes tend to be humanlike in shape, but feature an exotic range of colors from amber\n"
			+ " or violet to emerald green and deep blue. This pattern changes for half-elves of drow descent, however. Such elves are almost\n"
			+ " unfailingly marked with the white or silver hair of the drow parent, and more often than not have dusky gray skin that takes on a\n"
			+ " purplish or bluish tinge in the right light, while their eye color usually favors that of the human parent.\n\n"
			+ " Society: Their lack of a unified homeland and culture forces half-elves to remain versatile, able to conform to nearly any environment.\n"
			+ " While often considered attractive to both races for the same reasons as their parents, half-elves rarely fit in with either humans\n"
			+ " or elves, as both races see too much evidence of the other in them. This lack of acceptance weighs heavily on many half-elves, yet\n"
			+ " others are bolstered by their unique status, seeing in their lack of a formalized culture the ultimate freedom. As a result, half-elves\n"
			+ " are incredibly adaptable, capable of adjusting their mind-sets and talents to whatever societies they find themselves in. Even\n"
			+ " half-elves welcomed by one side of their heritage often find themselves caught between cultures, as they are encouraged, cajoled, or\n"
			+ " even forced into taking on diplomatic responsibilities between human and elven kind. Many half-elves rise to the occasion of such\n"
			+ " service, seeing it as a chance to prove their worth to both races. Others, however, come to resent the pressures and presumptions foisted\n"
			+ " upon them by both races and turn any opportunity to broker power, make peace, or advance trade between humans and elves into an\n"
			+ " exercise in personal profit.\n\n"
			+ " Relations: Half-elves understand loneliness, and know that character is often less a product of race than of life experience. As such,\n"
			+ " they are often open to friendships and alliances with other races, and less likely than most to rely on first impressions when forming\n"
			+ " opinions of new acquaintances. While many races join together to produce mixed offspring of notable power, such as half-orcs,\n"
			+ " half-dragons, and half-fiends, half-elves seem to have a unique position in the eyes of their progenitors and the rest of the world.\n"
			+ " Those humans who admire elvenkind see half-elves as a living link or bridge between the two races. But this attitude often foists unfair\n"
			+ " expectations and elevated standards upon half-elves, and quickly turns to derision when they do not live up to the grand destinies that\n"
			+ " others set for them. Additionally, those half-elves raised by or in the company of elves often have the human half of their parentage\n"
			+ " dubbed a mere obstacle, something to be overcome with proper immersion and schooling in the elven ways, and even the most well-meaning\n"
			+ " elven mentors often push their half-elven charges to reject a full half of themselves in order to \"better\" themselves. The exception is\n"
			+ " those few half-elves born of humans and drow. Not unlike most half-orcs, such unions are commonly born out of violence and savagery that\n"
			+ " leaves the child unwanted by its mother if not killed outright. Moreover, as the physical features of half-drow clearly mark their parentage,\n"
			+ " crafting a reputation founded on deeds and character instead of heritage is more challenging for them. Even the most empathetic of other\n"
			+ " half-elves balk at the sight of a half-drow. Among other races, half-elves form unique and often unexpected bonds. Dwarves, despite their\n"
			+ " traditional mistrust of elves, see a half-elf's human parentage as something hopeful, and treat them as half-humans rather than half-elves.\n"
			+ " Additionally, while dwarves are long-lived, the lifespan of the stout folk is closer to a half-elf's own than that of either of her parents.\n"
			+ " As a result, half-elves and dwarves often form lasting bonds, be they ones of friendship, business, or even competitive rivalry. Gnomes and\n"
			+ " halflings often see half-elves as a curiosity. Those half-elves who have seen themselves pushed to the edges of society, truly without a home,\n"
			+ " typically find gnomes and halflings frivolous and worthy of disdain, but secretly envy their seemingly carefree ways. Clever and enterprising\n"
			+ " gnomes and halflings sometimes partner with a half-elf for adventures or even business ventures, using the half-elf's participation to\n"
			+ " lend their own endeavors an air of legitimacy that they cannot acquire on their own. Perhaps the most peculiar and dichotomous relations\n"
			+ " exist between half-elves and half-orcs. Those half-orcs and half-elves who were raised among their non-human kin normally see one another\n"
			+ " as hated and ancient foes. However, half-elves who have been marginalized by society feel a deep, almost instant kinship with half-orcs,\n"
			+ " knowing their burdens are often that much harder because of their appearance and somewhat brutish nature. Not all half-orcs are inclined\n"
			+ " or able to understand such empathy, but those who do often find themselves with a dedicated diplomat, liaison, and apologist. For their\n"
			+ " own part, half-orcs usually return the favor by acting as bodyguards or intimidators, and take on other roles uniquely suited to their\n"
			+ " brawny forms.\n\n"
			+ " Alignment and Religion: Half-elves' isolation strongly influences their characters and philosophies. Cruelty does not come naturally\n"
			+ " to them, nor does blending in or bending to societal convention—as a result, most half-elves are chaotic good. Half-elves' lack of a\n"
			+ " unified culture makes them less likely to turn to religion, but those who do generally follow the common faiths of their homeland.\n"
			+ " Others come to religion and worship later in their lives, especially if they have been made to feel part of a community through faith\n"
			+ " or the work of clerical figures. Some half-elves feel the pull of the divine but live beyond the formal religious instruction of society.\n"
			+ " Such individuals often worship ideas and concepts like freedom, harmony, or balance, or the primal forces of the world. Still others\n"
			+ " gravitate toward long-forgotten gods, finding comfort and kinship in the idea that even deities can be overlooked.\n\n"
			+ " Adventurers: Half-elves tend to be itinerants, wandering the lands in search of a place they might finally call home. The desire to\n"
			+ " prove themselves to the community and establish a personal identity—or even a legacy—drives many half-elf adventurers to lives of bravery.\n"
			+ " Some half-elves claim that despite their longevity, they perceive the passage of time more like humans than elves, and are driven to\n"
			+ " amass wealth, power, or fame early on in life so they may spend the rest of their years enjoying it.";
	
	private static String[] racialTraits = {
			" +2 to One Ability Score: Half-elf characters gain a +2 bonus to one ability score of their choice at creation to represent their varied nature.",
			" Medium: Half-elves are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Half-elves have a base speed of 30 feet.",
			" Low-Light Vision: Half-elves can see twice as far as humans in conditions of dim light.",
			" Adaptability: Half-elves receive Skill Focus as a bonus feat at 1st level.",
			" Elf Blood: Half-elves count as both elves and humans for any effect related to race.",
			" Elven Immunities: Half-elves are immune to magic sleep effects and gain a +2 racial saving throw bonus against enchantment spells and effects.",
			" Keen Senses: Half-elves receive a +2 racial bonus on Perception checks.",
			" Multitalented: Half-elves choose two favored classes at first level and gain +1 hit point or +1 skill point whenever they take a level in either one of those classes.",
			" Languages: Half-elves begin play speaking Common and Elven. Half-elves with high Intelligence scores can choose any languages they want (except secret languages, such as Druidic)."};
	
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
			for(int i = 0; i < 1; i++){
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
			for(int i = 0; i < 2; i++){
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
			for(int i = 0; i < 3; i++){
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
			baseWeight = 110;
			break;
		case FEMALE:
			baseWeight = 100;
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
