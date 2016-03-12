package main;

import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import main.races.RaceType;

public class RaceImage extends JComponent{

	private HashMap<RaceType, String> hm;
	private Image img;
	
	public RaceImage(){
		hm = new HashMap<RaceType, String>();
		hm.put(RaceType.DWARF, "/images/Dwarf.jpg");
		hm.put(RaceType.ELF, "/images/Elf.jpg");
		hm.put(RaceType.GNOME, "/images/Gnome.jpg");
		hm.put(RaceType.HALF_ELF, "/images/HalfElf.jpg");
		hm.put(RaceType.HALF_ORC, "/images/HalfOrc.jpg");
		hm.put(RaceType.HALFLING, "/images/Halfling.jpg");
		hm.put(RaceType.HUMAN, "/images/Human.jpg");
		hm.put(RaceType.AASIMAR, "/images/Aasimar.jpg");
		hm.put(RaceType.CATFOLK, "/images/Catfolk.jpg");
		hm.put(RaceType.DHAMPIR, "/images/Dhampir.jpg");
		hm.put(RaceType.DROW, "/images/Drow.jpg");
		hm.put(RaceType.FETCHLING, "/images/Fetchling.jpg");
		hm.put(RaceType.GOBLIN, "/images/Goblin.jpg");
		hm.put(RaceType.HOBGOBLIN, "/images/Hobgoblin.jpg");
		hm.put(RaceType.IFRIT, "/images/Ifrit.jpg");
		hm.put(RaceType.KOBOLD, "/images/Kobold.jpg");
		hm.put(RaceType.ORC, "/images/Orc.jpg");
		hm.put(RaceType.OREAD, "/images/Oread.jpg");
		hm.put(RaceType.RATFOLK, "/images/Ratfolk.jpg");
		hm.put(RaceType.SYLPH, "/images/Sylph.jpg");
		hm.put(RaceType.TENGU, "/images/Tengu.jpg");
		hm.put(RaceType.TIEFLING, "/images/Tiefling.jpg");
		hm.put(RaceType.UNDINE, "/images/Undine.jpg");
		hm.put(RaceType.CHANGELING, "/images/Changeling.jpg");
		hm.put(RaceType.DUERGAR, "/images/Duergar.jpg");
		hm.put(RaceType.GILLMAN, "/images/Gillman.jpg");
		hm.put(RaceType.GRIPPLI, "/images/Grippli.jpg");
		hm.put(RaceType.KITSUNE, "/images/Kitsune.jpg");
		hm.put(RaceType.MERFOLK, "/images/Merfolk.jpg");
		hm.put(RaceType.NAGAJI, "/images/Nagaji.jpg");
		hm.put(RaceType.SAMSARAN, "/images/Samsaran.jpg");
		hm.put(RaceType.STRIX, "/images/Strix.jpg");
		hm.put(RaceType.SULI, "/images/Suli.jpg");
		hm.put(RaceType.SVIRFNEBLIN, "/images/Svirfneblin.jpg");
		hm.put(RaceType.VANARA, "/images/Vanara.jpg");
		hm.put(RaceType.VISHKANYA, "/images/Vishkanya.jpg");
		hm.put(RaceType.WAYANG, "/images/Wayang.jpg");
	}
	
	public void setImage(RaceType t){
		if(t != null){
			img = new ImageIcon(this.getClass().getResource(hm.get(t))).getImage();
			
		} else {
			img = new ImageIcon(this.getClass().getResource("/images/testImage.png")).getImage();
		}
		this.setSize(img.getWidth(null), img.getHeight(null));
		this.setLocation(100, 440);
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawImage(img, 0, 0, null);
	}
}
