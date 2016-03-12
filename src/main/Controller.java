package main;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import main.classes.*;
import main.races.*;

public class Controller {

	private PrimaryFrame f;
	private RaceImage rI;
	private Race race;
	private CharacterClass cClass;
	private List l;
	private Stats s;
	private Character c;
	private Name n;
	private Button randButton;
	private boolean randBWasPushed = false;
	private JTextField jtf;
	private int age;
	private int heightFt;
	private int heightIn;
	private int weight;
	
	public Controller() {
		f = new PrimaryFrame();
		rI = new RaceImage();
		l = new List();
		f.add(rI);
		f.add(l.getRaceList());
		//no recursion since I need this to run until set goals are met
		do {
			String temp = "";
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				createRace(l.getRaceType());
				for(String s : race.getRacialTraits()){
					temp += s + "\n";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			rI.setImage(l.getRaceType());
			f.setInfo(race);
			f.setRacialTraits(temp);
			//this allows the confirm button to continue by making sure that the race was selected
			if(race != null){
				f.setCanConfirm(true);
			}
		} while (!f.getWasConfirmed());
		f.resetWasConfirmed();
		jtf = new JTextField();
		String enumValue = "";
		enumValue += l.getRaceType();
		jtf.setText(enumValue);
		jtf.setEditable(false);
		jtf.setBounds(l.getRaceList().bounds());
		f.add(jtf);
		f.remove(l.getRaceList());
		rI.hide();
		f.add(l.getClassList());
		f.repaint();
		do{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				createCClass(l.getClassType());
			} catch (Exception e) {
				e.printStackTrace();
			}
			f.setInfo(cClass);
			//this allows the confirm button to continue by making sure that the class was selected
			if(cClass != null){
				f.setCanConfirm(true);
			}
		} while(!f.getWasConfirmed());
		f.resetWasConfirmed();
		jtf = new JTextField();
		enumValue = "";
		enumValue += l.getClassType();
		jtf.setText(enumValue);
		jtf.setEditable(false);
		jtf.setBounds(l.getClassList().bounds());
		f.add(jtf);
		f.remove(l.getClassList());
		s= new Stats(l.getRaceType());
		for(JComboBox<String> stat : s.getStatComboBox()){
			f.add(stat);
		}
		for(JTextField stat : s.getStatTF()){
			f.add(stat);
		}
		for(JButton stat : s.getStatButtons()){
			f.add(stat);
		}
		f.repaint();
		do{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f.setInfo(s);
			if(s.getRequirementsMet()){
				f.setCanConfirm(true);
			}
		} while(!f.getWasConfirmed());
		for(int i = 0; i < s.getStats().length; i++){
			String temp = "";
			temp += s.getStats()[i];
			jtf = new JTextField();
			jtf.setText(temp);
			jtf.setEditable(false);
			jtf.setBounds(s.getStatComboBox()[i].getBounds());
			f.add(jtf);
			s.getStatComboBox()[i].hide();
			f.remove(s.getStatComboBox()[i]);
		}
		f.add(l.getGenderList());
		f.repaint();
		s.calculatePointBuyFinal();
		f.resetWasConfirmed();
		n = new Name();
		do{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f.setInfo(n);
			n.setName(f.getNameInfo());
			if(!n.getName().equals("") && l.canConfirm()){
				f.setCanConfirm(true);
			}
		} while(!f.getWasConfirmed());
		f.resetWasConfirmed();
		String temp = "";
		temp += l.getGender();
		jtf = new JTextField();
		jtf.setText(temp);
		jtf.setBounds(l.getGenderList().getBounds());
		jtf.setEditable(false);
		l.getGenderList().hide();
		f.remove(l.getGenderList());
		f.add(jtf);
		System.out.println(l.getGender());
		randButton = new Button("Calculate Details");
		randButton.setBounds(0, 480, 100, 40);
		randButton.addActionListener(new buttonListener());
		f.add(randButton);
		jtf = new JTextField();
		jtf.setBounds(100, 480, 800, 40);
		jtf.setEditable(false);
		f.add(jtf);
		f.repaint();
		do{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(randBWasPushed){
				f.setCanConfirm(true);
			}
		} while(!f.getWasConfirmed());
		c = new Character(race, l.getRaceType(), l.getClassType(), cClass, s, n, l.getGender());
		c.writeToFile();
	}

	private void createRace(RaceType t) {
		if (t != null) {
			switch (t) {
			case DWARF:
				race = new Dwarf();
				break;
			case ELF:
				race = new Elf();
				break;
			case GNOME:
				race = new Gnome();
				break;
			case HALF_ELF:
				race = new HalfElf();
				break;
			case HALF_ORC:
				race = new HalfOrc();
				break;
			case HALFLING:
				race = new Halfling();
				break;
			case HUMAN:
				race = new Human();
				break;
			case AASIMAR:
				race = new Aasimar();
				break;
			case CATFOLK:
				race = new Catfolk();
				break;
			case DHAMPIR:
				race = new Dhampir();
				break;
			case DROW:
				race = new Drow();
				break;
			case FETCHLING:
				race = new Fetchling();
				break;
			case GOBLIN:
				race = new Goblin();
				break;
			case HOBGOBLIN:
				race = new Hobgoblin();
				break;
			case IFRIT:
				race = new Ifrit();
				break;
			case KOBOLD:
				race = new Kobold();
				break;
			case ORC:
				race = new Orc();
				break;
			case OREAD:
				race = new Oread();
				break;
			case RATFOLK:
				race = new Ratfolk();
				break;
			case SYLPH:
				race = new Sylph();
				break;
			case TENGU:
				race = new Tengu();
				break;
			case TIEFLING:
				race = new Tiefling();
				break;
			case UNDINE:
				race = new Undine();
				break;
			case CHANGELING:
				race = new Changeling();
				break;
			case DUERGAR:
				race = new Duergar();
				break;
			case GILLMAN:
				race = new Gillmen();
				break;
			case GRIPPLI:
				race = new Grippli();
				break;
			case KITSUNE:
				race = new Kitsune();
				break;
			case MERFOLK:
				race = new Merfolk();
				break;
			case NAGAJI:
				race = new Nagaji();
				break;
			case SAMSARAN:
				race = new Samsaran();
				break;
			case STRIX:
				race = new Strix();
				break;
			case SULI:
				race = new Sulis();
				break;
			case SVIRFNEBLIN:
				race = new Svirfneblin();
				break;
			case VANARA:
				race = new Vanaras();
				break;
			case VISHKANYA:
				race = new Vishkanya();
				break;
			case WAYANG:
				race = new Wayang();
				break;
			}
		}
	}
	
	private void createCClass(ClassType t) {
		if (t != null) {
			switch (t) {
			case BARBARIAN:
				cClass = new Barbarian();
				break;
			case BARD:
				cClass = new Bard();
				break;
			case CLERIC:
				cClass = new Cleric();
				break;
			case DRUID:
				cClass = new Druid();
				break;
			case FIGHTER:
				cClass = new Fighter();
				break;
			case MONK:
				cClass = new Monk();
				break;
			case PALADIN:
				cClass = new Paladin();
				break;
			case RANGER:
				cClass = new Ranger();
				break;
			case ROGUE:
				cClass = new Rogue();
				break;
			case SORCERER:
				cClass = new Sorcerer();
				break;
			case WIZARD:
				cClass = new Wizard();
				break;
			case ALCHEMIST:
				cClass = new Alchemist();
				break;
			case CAVALIER:
				cClass = new Cavalier();
				break;
			case INQUISITOR:
				cClass = new Inquisitor();
				break;
			case ORACLE:
				cClass = new Oracle();
				break;
			case SUMMONER:
				cClass = new Summoner();
				break;
			case WITCH:
				cClass = new Witch();
				break;
			case ARCANIST:
				cClass = new Arcanist();
				break;
			case BLOODRAGER:
				cClass = new Bloodrager();
				break;
			case BRAWLER:
				cClass = new Brawler();
				break;
			case HUNTER:
				cClass = new Hunter();
				break;
			case INVESTIGATOR:
				cClass = new Investigator();
				break;
			case SHAMAN:
				cClass = new Shaman();
				break;
			case SKALD:
				cClass = new Skald();
				break;
			case SLAYER:
				cClass = new Slayer();
				break;
			case SWASHBUCKLER:
				cClass = new Swashbuckler();
				break;
			case WARPRIEST:
				cClass = new Warpriest();
				break;
			case KINETICIST:
				cClass = new Kineticist();
				break;
			case MEDIUM:
				cClass = new Medium();
				break;
			case MESMERIST:
				cClass = new Mesmerist();
				break;
			case OCCULTIST:
				cClass = new Occultist();
				break;
			case PSYCHIC:
				cClass = new Psychic();
				break;
			case SPIRITUALIST:
				cClass = new Spiritualist();
				break;
			case GUNSLINGER:
				cClass = new Gunslinger();
				break;
			case NINJA:
				cClass = new Ninja();
				break;
			case SAMURAI:
				cClass = new Samurai();
				break;
			case MAGNUS:
				cClass = new Magnus();
				break;
			}
		}
	}
	
	private class buttonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			race.calculateAge(l.getClassType());
			race.calculateHeight(l.getGender());
			String temp = race.getDetails();
			jtf.setText(temp);
			randBWasPushed = true;
		}
		
	}
}
