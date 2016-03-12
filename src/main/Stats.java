package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import main.races.Race;
import main.races.RaceType;

public class Stats implements GetInfo {

	private static String basicDescription = "" 
			+ " Stats explained with Tomatoes.\n"
			+ " Strength(Str) is being able to crush a tomato. Dexterity(Dex) is being able to dodge a tomato.\n"
			+ " Constitution(Con) is being able to eat a bad tomato. Intelligence(Int) is knowing a tomato is a fruit.\n"
			+ " Wisdom(Wis) is knowing not to put a tomato in a fruit salad. Charisma(Cha) is being able to sell a tomato based fruit salad.\n"
			+ " Total Points required to continue: 25";
	private HashMap<String, Integer> hm;
	private static String info = "";
	private int stat[] = { 10, 10, 10, 10, 10, 10 };
	private int statPoint[] = { 0, 0, 0, 0, 0, 0 };
	private int pointBuy;
	private String[] range = { "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" };
	private JComboBox<String> strength;
	private JComboBox<String> dexterity;
	private JComboBox<String> constitution;
	private JComboBox<String> intelligence;
	private JComboBox<String> wisdom;
	private JComboBox<String> charisma;
	private JTextField[] statTF;
	private RaceType racial;
	private JButton strB;
	private JButton dexB;
	private JButton conB;
	private JButton intB;
	private JButton wisB;
	private JButton chaB;
	private boolean[] statBonus = { false, false, false, false, false, false };
	private boolean statButtonWasUsed = false;
	
	public Stats(RaceType racial) {
		hm = new HashMap<String, Integer>();
		hm.put("Str", new Integer(0));
		hm.put("Dex", new Integer(1));
		hm.put("Con", new Integer(2));
		hm.put("Int", new Integer(3));
		hm.put("Wis", new Integer(4));
		hm.put("Cha", new Integer(5));
		this.racial = racial;
		int y = 120;
		strength = new JComboBox<String>(range);
		strength.setBounds(50, y, 50, 40);
		strength.setSelectedIndex(3);
		strength.addActionListener(new StatListener("Str", strength));
		y += 40;
		dexterity = new JComboBox<String>(range);
		dexterity.setBounds(50, y, 50, 40);
		dexterity.setSelectedIndex(3);
		dexterity.addActionListener(new StatListener("Dex", dexterity));
		y += 40;
		constitution = new JComboBox<String>(range);
		constitution.setBounds(50, y, 50, 40);
		constitution.setSelectedIndex(3);
		constitution.addActionListener(new StatListener("Con", constitution));
		y += 40;
		intelligence = new JComboBox<String>(range);
		intelligence.setBounds(50, y, 50, 40);
		intelligence.setSelectedIndex(3);
		intelligence.addActionListener(new StatListener("Int", intelligence));
		y += 40;
		wisdom = new JComboBox<String>(range);
		wisdom.setBounds(50, y, 50, 40);
		wisdom.setSelectedIndex(3);
		wisdom.addActionListener(new StatListener("Wis", wisdom));
		y += 40;
		charisma = new JComboBox<String>(range);
		charisma.setBounds(50, y, 50, 40);
		charisma.setSelectedIndex(3);
		charisma.addActionListener(new StatListener("Cha", charisma));
		int statNumber = 0;
		statTF = new JTextField[8];
		for (int i = 0; i < statTF.length; i++) {
			statTF[i] = new JTextField();
		}
		for (JTextField t : statTF) {
			t.setEditable(false);
			switch (statNumber) {
			case 0:
				t.setText("Str");
				t.setBounds(0, strength.getY(), 50, 40);
				statNumber++;
				break;
			case 1:
				t.setText("Dex");
				t.setBounds(0, dexterity.getY(), 50, 40);
				statNumber++;
				break;
			case 2:
				t.setText("Con");
				t.setBounds(0, constitution.getY(), 50, 40);
				statNumber++;
				break;
			case 3:
				t.setText("Int");
				t.setBounds(0, intelligence.getY(), 50, 40);
				statNumber++;
				break;
			case 4:
				t.setText("Wis");
				t.setBounds(0, wisdom.getY(), 50, 40);
				statNumber++;
				break;
			case 5:
				t.setText("Cha");
				t.setBounds(0, charisma.getY(), 50, 40);
				statNumber++;
				break;
			case 6:
				t.setText("Total Points : 0");
				t.setBounds(100, 440, 800, 40);
				statNumber++;
				break;
			case 7:
				t.setText("Click one of the buttons to apply racial bonus to the stat. Note changes from the buttons are only applied when a stat in changed");
				t.setBounds(100, 480, 800, 40);
				if (racial == RaceType.HUMAN || racial == RaceType.HALF_ELF || racial == RaceType.HALF_ORC) {

				} else {
					t.hide();
				}
				break;
			}
			strB = new JButton("Str");
			strB.setBounds(100, 520, 100, 40);
			strB.addActionListener(new StatButton(0));
			dexB = new JButton("Dex");
			dexB.setBounds(200, 520, 100, 40);
			dexB.addActionListener(new StatButton(1));
			conB = new JButton("Con");
			conB.setBounds(300, 520, 100, 40);
			conB.addActionListener(new StatButton(2));
			intB = new JButton("Int");
			intB.setBounds(400, 520, 100, 40);
			intB.addActionListener(new StatButton(3));
			wisB = new JButton("Wis");
			wisB.setBounds(500, 520, 100, 40);
			wisB.addActionListener(new StatButton(4));
			chaB = new JButton("Cha");
			chaB.setBounds(600, 520, 100, 40);
			chaB.addActionListener(new StatButton(5));
			if (racial == RaceType.HUMAN || racial == RaceType.HALF_ELF || racial == RaceType.HALF_ORC) {

			} else {
				strB.hide();
				dexB.hide();
				conB.hide();
				intB.hide();
				wisB.hide();
				chaB.hide();
			}
		}
	}

	public void calculatePointBuy() {
		String temp = RacialBonus();
		pointBuy = statPoint[0] + statPoint[1] + statPoint[2] + statPoint[3] + statPoint[4] + statPoint[5];
		statTF[6].setText("Total Points : " + pointBuy + "; Str: " + stat[0] + "; Dex: " + stat[1] + "; Con: " + stat[2]
				+ "; Int: " + stat[3] + "; Wis: " + stat[4] + "; Cha: " + stat[5] + temp);
	}

	private String RacialBonus() {
		// TODO Auto-generated method stub
		String racialBonus = " Racial Bonuses";
		switch (racial) {
		case AASIMAR:
			racialBonus += " Wis +2, Cha +2";
			break;
		case CATFOLK:
		case FETCHLING:
		case IFRIT:
		case VISHKANYA:
			racialBonus += " Dex +2, Cha +2, Wis -2";
			break;
		case CHANGELING:
			racialBonus += " Wis +2, Cha +2, Con -2";
			break;
		case DHAMPIR:
		case DROW:
			racialBonus += " Dex +2, Cha +2, Con -2";
			break;
		case DUERGAR:
			racialBonus += " Con +2, Wis +2, Cha -4";
			break;
		case DWARF:
			racialBonus += " Con +2, Wis +2, Cha -2";
			break;
		case GILLMAN:
			racialBonus += " Con +2, Cha +2, Wis -2";
			break;
		case GNOME:
			racialBonus += " Con +2, Cha +2, Str -2";
			break;
		case GOBLIN:
			racialBonus += " Dex +4, Str -2, Cha -2";
			break;
		case HALF_ELF:
		case HALF_ORC:
		case HUMAN:
			if (statBonus[0]) {
				racialBonus += " Str +2";
			} else if (statBonus[1]) {
				racialBonus += " Dex +2";
			} else if (statBonus[2]) {
				racialBonus += " Con +2";
			} else if (statBonus[3]) {
				racialBonus += " Int +2";
			} else if (statBonus[4]) {
				racialBonus += " Wis +2";
			} else if (statBonus[5]) {
				racialBonus += " Cha +2";
			} else {
				racialBonus += " (Not Selected Yet)";
			}
			break;
		case HOBGOBLIN:
			racialBonus += " Dex +2, Con +2";
			break;
		case HALFLING:
		case KITSUNE:
			racialBonus += " Dex +2, Cha +2, Str -2";
			break;
		case KOBOLD:
			racialBonus += " Dex +2, Str -4, Con -2";
			break;
		case MERFOLK:
			racialBonus += " Dex +2, Wis +2, Cha +2";
			break;
		case NAGAJI:
			racialBonus += " Str +2, Cha +2, Int -2";
			break;
		case ORC:
			racialBonus += " Str +4, Int -2, Wis -2, Cha -2";
			break;
		case OREAD:
			racialBonus += " Str +2, Wis +2, Cha -2";
			break;
		case RATFOLK:
			racialBonus += " Dex +2, Int +2, Str -2";
			break;
		case SAMSARAN:
			racialBonus += " Int +2, Wis +2, Con -2";
			break;
		case STRIX:
			racialBonus += " Dex +2, Cha -2";
			break;
		case SULI:
			racialBonus += " Str +2, Cha +2, Int -2";
			break;
		case SVIRFNEBLIN:
			racialBonus += " Dex +2, Wis +2, Str -2, Cha -4";
			break;
		case ELF:
		case SYLPH:
			racialBonus += " Dex +2, Int +2, Con -2";
			break;
		case TENGU:
			racialBonus += " Dex +2, Wis +2, Con -2";
			break;
		case TIEFLING:
		case WAYANG:
			racialBonus += " Dex +2, Int +2, Wis -2";
			break;
		case GRIPPLI:
		case UNDINE:
			racialBonus += " Dex +2, Wis +2, Str -2";
			break;
		case VANARA:
			racialBonus += " Dex +2, Wis +2, Cha -2";
			break;
		}
		return racialBonus;
	}
	
	public void calculatePointBuyFinal() {
		String temp = applyRacialBonus();
		pointBuy = statPoint[0] + statPoint[1] + statPoint[2] + statPoint[3] + statPoint[4] + statPoint[5];
		statTF[6].setText("Total Points : " + pointBuy + "; Str: " + stat[0] + "; Dex: " + stat[1] + "; Con: " + stat[2]
				+ "; Int: " + stat[3] + "; Wis: " + stat[4] + "; Cha: " + stat[5] + temp);
	}
	
	private String applyRacialBonus() {
		// TODO Auto-generated method stub
		String racialBonus = " Racial Bonuses";
		switch (racial) {
		case AASIMAR:
			racialBonus += " (Applied) Wis +2, Cha +2";
			stat[4] += 2;
			stat[5] += 2;
			break;
		case CATFOLK:
		case FETCHLING:
		case IFRIT:
		case VISHKANYA:
			racialBonus += " (Applied) Dex +2, Cha +2, Wis -2";
			stat[1] += 2;
			stat[5] += 2;
			stat[4] -= 2;
			break;
		case CHANGELING:
			racialBonus += " (Applied) Wis +2, Cha +2, Con -2";
			stat[4] += 2;
			stat[5] += 2;
			stat[2] -= 2;
			break;
		case DHAMPIR:
		case DROW:
			racialBonus += " (Applied) Dex +2, Cha +2, Con -2";
			stat[1] += 2;
			stat[5] += 2;
			stat[3] -= 2;
			break;
		case DUERGAR:
			racialBonus += " (Applied) Con +2, Wis +2, Cha -4";
			stat[2] += 2;
			stat[4] += 2;
			stat[5] -= 4;
			break;
		case DWARF:
			racialBonus += " (Applied) Con +2, Wis +2, Cha -2";
			stat[2] += 2;
			stat[4] += 2;
			stat[5] -= 2;
			break;
		case GILLMAN:
			racialBonus += " (Applied) Con +2, Cha +2, Wis -2";
			stat[2] += 2;
			stat[5] += 2;
			stat[4] -= 2;
			break;
		case GNOME:
			racialBonus += " (Applied) Con +2, Cha +2, Str -2";
			stat[3] += 2;
			stat[5] += 2;
			stat[0] -= 2;
			break;
		case GOBLIN:
			racialBonus += " (Applied) Dex +4, Str -2, Cha -2";
			stat[1] += 4;
			stat[0] -= 2;
			stat[5] -= 2;
			break;
		case HALF_ELF:
		case HALF_ORC:
		case HUMAN:
			if (statBonus[0]) {
				stat[0] += 2;
				racialBonus += " (Applied) Str +2";
			} else if (statBonus[1]) {
				stat[1] += 2;
				racialBonus += " (Applied) Dex +2";
			} else if (statBonus[2]) {
				stat[2] += 2;
				racialBonus += " (Applied) Con +2";
			} else if (statBonus[3]) {
				stat[3] += 2;
				racialBonus += " (Applied) Int +2";
			} else if (statBonus[4]) {
				stat[4] += 2;
				racialBonus += " (Applied) Wis +2";
			} else if (statBonus[5]) {
				stat[5] += 2;
				racialBonus += " (Applied) Cha +2";
			} else {
				racialBonus += " (Not Selected Yet)";
			}
			break;
		case HOBGOBLIN:
			racialBonus += " (Applied) Dex +2, Con +2";
			stat[1] += 2;
			stat[2] += 2;
			break;
		case HALFLING:
		case KITSUNE:
			racialBonus += " (Applied) Dex +2, Cha +2, Str -2";
			stat[1] += 2;
			stat[5] += 2;
			stat[0] -= 2;
			break;
		case KOBOLD:
			racialBonus += " (Applied) Dex +2, Str -4, Con -2";
			stat[1] += 2;
			stat[0] -= 4;
			stat[2] -= 2;
			break;
		case MERFOLK:
			racialBonus += " (Applied) Dex +2, Wis +2, Cha +2";
			stat[2] += 2;
			stat[4] += 2;
			stat[5] += 2;
			break;
		case NAGAJI:
			racialBonus += " (Applied) Str +2, Cha +2, Int -2";
			stat[0] += 2;
			stat[5] += 2;
			stat[3] -= 2;
			break;
		case ORC:
			racialBonus += " (Applied) Str +4, Int -2, Wis -2, Cha -2";
			stat[0] += 4;
			stat[3] -= 2;
			stat[4] -= 2;
			stat[5] -= 2;
			break;
		case OREAD:
			racialBonus += " (Applied) Str +2, Wis +2, Cha -2";
			stat[0] += 2;
			stat[4] += 2;
			stat[5] -= 2;
			break;
		case RATFOLK:
			racialBonus += " (Applied) Dex +2, Int +2, Str -2";
			stat[1] += 2;
			stat[3] += 2;
			stat[0] -= 2;
			break;
		case SAMSARAN:
			racialBonus += " (Applied) Int +2, Wis +2, Con -2";
			stat[3] += 2;
			stat[4] += 2;
			stat[2] -= 2;
			break;
		case STRIX:
			racialBonus += " (Applied) Dex +2, Cha -2";
			stat[1] += 2;
			stat[5] -= 2;
			break;
		case SULI:
			racialBonus += " (Applied) Str +2, Cha +2, Int -2";
			stat[0] += 2;
			stat[5] += 2;
			stat[3] -= 2;
			break;
		case SVIRFNEBLIN:
			racialBonus += " (Applied) Dex +2, Wis +2, Str -2, Cha -4";
			stat[1] += 2;
			stat[4] += 2;
			stat[0] -= 2;
			stat[5] -= 4;
			break;
		case ELF:
		case SYLPH:
			racialBonus += " (Applied) Dex +2, Int +2, Con -2";
			stat[1] += 2;
			stat[3] += 2;
			stat[2] -= 2;
			break;
		case TENGU:
			racialBonus += " (Applied) Dex +2, Wis +2, Con -2";
			stat[1] += 2;
			stat[4] += 2;
			stat[2] -= 2;
			break;
		case TIEFLING:
		case WAYANG:
			racialBonus += " (Applied) Dex +2, Int +2, Wis -2";
			stat[1] += 2;
			stat[3] += 2;
			stat[4] -= 2;
			break;
		case GRIPPLI:
		case UNDINE:
			racialBonus += " (Applied) Dex +2, Wis +2, Str -2";
			stat[1] += 2;
			stat[4] += 2;
			stat[0] -= 2;
			break;
		case VANARA:
			racialBonus += " (Applied) Dex +2, Wis +2, Cha -2";
			stat[1] += 2;
			stat[4] += 2;
			stat[5] -= 2;
			break;
		}
		return racialBonus;
	}

	private class StatListener implements ActionListener {

		private String stats;
		private JComboBox comboBox;
		
		public StatListener(String stats, JComboBox<String> comboBox) {
			// TODO Auto-generated constructor stub
			this.stats = stats;
			this.comboBox = comboBox;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			switch ((String) comboBox.getSelectedItem()) {
			case "7":
				statPoint[hm.get(stats)] = -4;
				stat[hm.get(stats)] = 7;
				break;
			case "8":
				statPoint[hm.get(stats)] = -2;
				stat[hm.get(stats)] = 8;
				break;
			case "9":
				statPoint[hm.get(stats)] = -1;
				stat[hm.get(stats)] = 9;
				break;
			case "10":
				statPoint[hm.get(stats)] = 0;
				stat[hm.get(stats)] = 10;
				break;
			case "11":
				statPoint[hm.get(stats)] = 1;
				stat[hm.get(stats)] = 11;
				break;
			case "12":
				statPoint[hm.get(stats)] = 2;
				stat[hm.get(stats)] = 12;
				break;
			case "13":
				statPoint[hm.get(stats)] = 3;
				stat[hm.get(stats)] = 13;
				break;
			case "14":
				statPoint[hm.get(stats)] = 5;
				stat[hm.get(stats)] = 14;
				break;
			case "15":
				statPoint[hm.get(stats)] = 7;
				stat[hm.get(stats)] = 15;
				break;
			case "16":
				statPoint[hm.get(stats)] = 10;
				stat[hm.get(stats)] = 16;
				break;
			case "17":
				statPoint[hm.get(stats)] = 13;
				stat[hm.get(stats)] = 17;
				break;
			case "18":
				statPoint[hm.get(stats)] = 17;
				stat[hm.get(stats)] = 18;
				break;
			}
			calculatePointBuy();
		}
	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return info;
	}

	public JComboBox<String>[] getStatComboBox() {
		JComboBox<String>[] stats = new JComboBox[6];
		JComboBox<String> temp = strength;
		stats[0] = temp;
		temp = dexterity;
		stats[1] = temp;
		temp = constitution;
		stats[2] = temp;
		temp = intelligence;
		stats[3] = temp;
		temp = wisdom;
		stats[4] = temp;
		temp = charisma;
		stats[5] = temp;
		return stats;
	}

	public JTextField[] getStatTF() {
		JTextField[] temp = statTF;
		return temp;
	}

	public JButton[] getStatButtons() {
		JButton[] stats = new JButton[6];
		JButton temp = strB;
		stats[0] = temp;
		temp = dexB;
		stats[1] = temp;
		temp = conB;
		stats[2] = temp;
		temp = intB;
		stats[3] = temp;
		temp = wisB;
		stats[4] = temp;
		temp = chaB;
		stats[5] = temp;
		return stats;
	}

	private class StatButton implements ActionListener {

		private int statNum;

		public StatButton(int statNum) {
			// TODO Auto-generated constructor stub
			this.statNum = statNum;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			for (boolean bool : statBonus) {
				bool = false;
			}
			statBonus[statNum] = true;
			statButtonWasUsed = true;
			
		}
	}

	public boolean getRequirementsMet() {
		// TODO Auto-generated method stub
		boolean temp = false;
		if(racial.equals(RaceType.HUMAN) || racial.equals(RaceType.HALF_ELF) || racial.equals(RaceType.HALF_ORC)){
			if(statButtonWasUsed && pointBuy == 25){
				temp = true;
			}
		}
		else if(pointBuy == 25){
			temp = true;
		}
		return temp;
	}
	
	public int[] getStats(){
		return stat;
	}
	
	@Override
	public String toString(){
		String toString = "";
		return toString;
	}
}
