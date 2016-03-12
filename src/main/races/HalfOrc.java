package main.races;

import java.util.Random;

import main.Gender;
import main.classes.ClassType;
import main.races.Race;

public class HalfOrc extends Race{

	public HalfOrc() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = 
			" Often fierce and savage, sometimes noble and resolute, half-orcs can manifest the best and worst qualities of their parent\n"
			+ " races. Many half-orcs struggle to keep their more bestial natures in check in order to epitomize the most heroic values of\n"
			+ " humanity. Unfortunately, many outsiders see half-orcs as hopeless abominations devoid of civility, if not monsters unworthy\n"
			+ " of pity or parley.";
	
	private static String description = 
			" As seen by civilized races, half-orcs are monstrosities, the result of perversion and violence—whether or not this is actually true.\n"
			+ " Half-orcs are rarely the result of loving unions, and as such are usually forced to grow up hard and fast, constantly fighting for\n"
			+ " protection or to make names for themselves. Half-orcs as a whole resent this treatment, and rather than play the part of the victim,\n"
			+ " they tend to lash out, unknowingly confirming the biases of those around them. A few feared, distrusted, and spat-upon half-orcs\n"
			+ " manage to surprise their detractors with great deeds and unexpected wisdom—though sometimes it's easier just to crack a few skulls.\n"
			+ " Some half-orcs spend their entire lives proving to full-blooded orcs that they are just as fierce. Others opt for trying to blend into\n"
			+ " human society, constantly demonstrating that they aren't monsters. Their need to always prove themselves worthy encourages half-orcs\n"
			+ " to strive for power and greatness within the society around them. Society: Unlike half-elves, where at least part of society's\n"
			+ " discrimination is born out of jealousy or attraction, half-orcs get the worst of both worlds: physically weaker than their orc kin,\n"
			+ " they also tend to be feared or attacked outright by humans who don't bother making the distinction between full orcs and halfbloods.\n"
			+ " Even on the best of terms, half-orcs in civilized societies are not exactly accepted, and tend to be valued only for their physical\n"
			+ " abilities. On the other hand, orc leaders have been known to deliberately spawn half-orcs, as the halfbreeds make up for their lack\n"
			+ " of physical strength with increased cunning and aggression, making them natural leaders and strategic advisors. Within orc tribes,\n"
			+ " half-orcs find themselves constantly striving to prove their worth in battle and with feats of strength. Half-orcs raised within orc\n"
			+ " tribes are more likely to file their tusks and cover themselves in tribal tattoos. Tribal leaders quietly recognize that half-orcs\n"
			+ " are often more clever than their orc cousins and often apprentice them to the tribe's shaman, where their cunning might eventually\n"
			+ " strengthen the tribe. Apprenticeship to a shaman is a brutal and often short-lived distinction, however, and those half-orcs who\n"
			+ " survive it either become influential in the tribe or are eventually driven to leave. Half-orcs have a much more mixed experience in\n"
			+ " human society, where many cultures view them as little more than monsters. They often are unable even to get normal work, and are\n"
			+ " pressed into service in the military or sold into slavery. In these cultures, half-orcs often lead furtive lives, hiding their nature\n"
			+ " whenever possible. The dark underworld of society is often the most welcoming place, and many half-orcs wind up serving as enforcers\n"
			+ " for thieves guilds or other types of organized crime. Less commonly, human cities may allow half-orcs a more normal existence, even\n"
			+ " enabling them to develop small communities of their own. These communities are usually centered around the arena districts, the\n"
			+ " military, or mercenary organizations where their brute strength is valued and their appearance is more likely to be overlooked. Even\n"
			+ " surrounded by their own kind, half-orc life isn't easy. Bullying and physical confrontation comes easy to a people who have been raised\n"
			+ " with few other examples of behavior. It is, however, one of the best places for young half-orcs to grow up without prejudice, and these\n"
			+ " small enclaves are one of the few places where half-orc marriages and children are truly accepted and sometimes cherished. Even more\n"
			+ " rarely, certain human cultures come to embrace half-orcs for their strength. There are stories of places where people see half-orc\n"
			+ " children as a blessing and seek out half-orc or orc lovers. In these cultures, half-orcs lead lives not much different from full-blooded\n"
			+ " humans.\n\n"
			+ " Relations: Elves and dwarves tend to be the least accepting of half-orcs, seeing in them too great a resemblance to their racial enemies,\n"
			+ " and other races aren't much more understanding. A lifetime of persecution leaves the average half-orc wary and quick to anger, yet people\n"
			+ " who break through his savage exterior might find a well-hidden core of empathy. Human societies with few orc problems tend to be the most\n"
			+ " accommodating, and half-orcs dwelling there can often find work as mercenaries and enforcers. Even in places where there is a general\n"
			+ " tolerance for half-orcs, however, many humans mistreat them when they can get away with it. Half-orcs are envious of the measure of\n"
			+ " acceptance half-elves have within human and elven society and resent their physical beauty, which contrasts starkly to the half-orcs'\n"
			+ " brutish appearance. While half-orcs avoid antagonizing their half-breed cousins directly, they won't hesitate to undermine them if the\n"
			+ " opportunity presents itself. Of all the other races, half-orcs are most sympathetic with halflings, who often have an equally rough lot\n"
			+ " in life. Half-orcs respect the halfling's ability to blend in and disappear and admire their perpetually cheerful outlook on life in\n"
			+ " spite of hardships. Halflings fail to appreciate this fact because they usually are too busy avoiding the large, intimidating half-orcs.\n\n"
			+ " Alignment and Religion: Forced to live either among brutish orcs or as lonely outcasts in civilized lands, most half-orcs are bitter,\n"
			+ " violent, and reclusive. Evil comes easily to them, but they are not evil by nature—rather, most half-orcs are chaotic neutral, having\n"
			+ " been taught by long experience that there's no point doing anything but that which directly benefits themselves. Half-orcs worship the\n"
			+ " human or orc gods venerated in the area where they were raised. Those who live alongside humans most often worship human gods of war,\n"
			+ " freedom, or destruction. Half-orcs raised in orc tribes find themselves most drawn to the gods of blood, fire, and iron—depending more\n"
			+ " on what god the tribe worships rather than the half-orcs' personal preference. Many half-orcs are contrary about religion, either\n"
			+ " ignoring it entirely, or getting deeply involved in it and trying to find meaning in a life filled with hate and misunderstanding\n"
			+ " even a half-orc divine spellcaster may wrestle with doubt and anger about religion and faith.\n\n"
			+ " Adventurers: Staunchly independent, many half-orcs take to lives of adventure out of necessity, seeking to escape their painful pasts\n"
			+ " or improve their lot through force of arms. Others, more optimistic or desperate for acceptance, take up the mantle of crusaders in order\n"
			+ " to prove their worth to the world. Half-orcs raised in orc societies often take up the brutish ways of those around them, becoming\n"
			+ " fighters, barbarians, or rangers. Half-orcs who survive their shaman training may eventually succeed their masters as tribal shamans,\n"
			+ " or flee the tribe and practice their magic as outcasts or explorers. Half-orcs are just as likely to have children that possess an innate\n"
			+ " talent for sorcery as any other race, with the abyssal, destined, and elemental fire bloodlines being the most common types of sorcerers.\n"
			+ " Half-orcs are fascinated by alchemy, and its destructive capabilities make its usefulness obvious in any orc tribe. Half-orc alchemists\n"
			+ " treat themselves as living experiments, even to the point of trying to separate their orc and human halves through alchemy. Other\n"
			+ " alchemists use their powers to enhance their physical abilities and thus increase their status within orc communities. In human societies,\n"
			+ " half-orcs have a few more options. Many find it easy to take advantage of the brute strength and work as mercenaries or caravan guards.\n"
			+ " Crime is another easy route for half-orcs, as there are plenty of criminals looking for a strong arm. Half-orc clerics in human\n"
			+ " communities are fairly rare the more religious half-orcs more often turn to (or get pushed to) the martial aspects of religious service\n"
			+ " and become paladins or inquisitors. Half-orcs usually lack the patience and money required to become a wizard.";
	
	private static String[] racialTraits = {
			" +2 to One Ability Score: Half-orc characters gain a +2 bonus to one ability score of their choice at creation to represent their varied nature.",
			" Medium: Half-orcs are Medium creatures and have no bonuses or penalties due to their size.",
			" Normal Speed: Half-orcs have a base speed of 30 feet.",
			" Darkvision: Half-orcs can see in the dark up to 60 feet.",
			" Intimidating: Half-orcs receive a +2 racial bonus on Intimidate checks due to their fearsome nature.",
			" Orc Blood: Half-orcs count as both humans and orcs for any effect related to race.",
			" Orc Ferocity: Once per day, when a half-orc is brought below 0 hit points but not killed, he can fight on for 1 more round as if disabled. At the end of his next turn, unless brought to above 0 hit points, he immediately falls unconscious and begins dying.",
			" Weapon Familiarity: Half-orcs are proficient with greataxes and falchions and treat any weapon with the word \"orc\" in its name as a martial weapon.",
			" Languages: Half-orcs begin play speaking Common and Orc. Half-orcs with high Intelligence scores can choose from the following: Abyssal, Draconic, Giant, Gnoll, and Goblin."};
	
	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int age = 14;
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
			addedInches += (rand.nextInt(12) + 1);
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
			baseWeight = 150;
			break;
		case FEMALE:
			baseWeight = 110;
			break;
		}
		int weight = baseWeight + (addedInches * 7);
		super.setWeight(weight);
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
