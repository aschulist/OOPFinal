package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import main.races.*;


public class PrimaryFrame extends JFrame {

	private static final long serialVersionUID = 7864765209266502318L;
	Race r;
	Button b;
	JComboBox<RaceType> raceList;
	TextArea bD, d;
	
	public PrimaryFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		b = new Button("Get Information");// creating instance of JButton
		b.setBounds(0, 140, 100, 40);// x axis, y axis, width, height
		b.setActionCommand("Move");
		b.addActionListener(new MyButtonListener());
		this.add(b);// adding button in JFrame
		
		bD = new TextArea();
		bD.setEditable(false);
		bD.setBounds(0, 0, 725, 100);
		bD.setBackground(Color.WHITE);
		bD.setText("This will change as you look though the playable races.");
		d = new TextArea();
		d.setEditable(false);
		d.setBounds(100, 100, 725, 500);
		d.setBackground(Color.WHITE);
		
		raceList = new JComboBox<RaceType>(RaceType.values());
		raceList.setBounds(0, 100, 100, 40);
		raceList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				switch(raceList.getSelectedIndex()){
				case 0:
					r = new Dwarf();
					break;
				case 1:
					r = new Elf();
					break;
				case 2:
					r = new Gnome();
					break;
				case 3:
					r = new HalfElf();
					break;
				case 4:
					r = new HalfOrc();
					break;
				case 5:
					r = new Halfling();
					break;
				case 6:
					r = new Human();
					break;
				case 7:
					r = new Aasimar();
					break;
				case 8:
					r = new Catfolk();
					break;
				case 9:
					r = new Dhampir();
					break;
				case 10:
					r = new Drow();
					break;
				case 11:
					r = new Fetchling();
					break;
				case 12:
					r = new Goblin();
					break;
				case 13:
					r = new Hobgoblin();
					break;
				case 14:
					r = new Ifrit();
					break;
				case 15:
					r = new Kobold();
					break;
				case 16:
					r = new Orc();
					break;
				case 17:
					r = new Oread();
					break;
				case 18:
					r = new Ratfolk();
					break;
				case 19:
					r = new Sylph();
					break;
				case 20:
					r = new Tengus();
					break;
				case 21:
					r = new Tiefling();
					break;
				case 22:
					r = new Undine();
					break;
				case 23:
					r = new Changeling();
					break;
				case 24:
					r = new Duergar();
					break;
				case 25:
					r = new Gillmen();
					break;
				case 26:
					r = new Grippli();
					break;
				case 27:
					r = new Kitsune();
					break;
				case 28:
					r = new Merfolk();
					break;
				case 29:
					r = new Nagaji();
					break;
				case 30:
					r = new Samsaran();
					break;
				case 31:
					r = new Strix();
					break;
				case 32:
					r = new Sulis();
					break;
				case 33:
					r = new Svirfneblin();
					break;
				case 34:
					r = new Vanaras();
					break;
				case 35:
					r = new Vishkanya();
					break;
				case 36:
					r = new Wayang();
					break;
				}
				bD.setText(r.getBasicDescription());
			}
		});
		
		this.add(bD);
		this.add(d);
		this.add(raceList);
		this.setSize(840, 1000);// 400 width and 500 height
		this.setLayout(null);// using no layout managers (not recommended for standard swing, but useful for our purposes in CSC150
		this.setVisible(true);// making the frame visible
		
		
	}

	private class MyButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button clicked, inner class: " + LocalDateTime.now());
			d.setText(r.getDescription());
		}
	}
}

