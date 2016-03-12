package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.beans.value.WritableIntegerValue;
import main.classes.*;
import main.races.*;

public class Character {

	private RaceType myRaceType;
	private Race myRace;
	private CharacterClass myClass;
	private ClassType myClassType;
	private Gender myGender;
	private Stats myStats;
	private Name myName;
	private File file;
	private FileWriter writer;
	private int hp;
	private int numberOfSkills;
	private int carryWeightLight;
	private int carryWeightMedium;
	private int carryWeightHeavy;
	private int carryWeightOverHead;
	private int carryWeightLift;
	private int carryWeightDrag;
	private int[] statMod;
	
	public Character(Race r, RaceType race, ClassType cClass, CharacterClass c, Stats s, Name n, Gender gender) {
		// TODO Auto-generated constructor stub
		myRace = r;
		myRaceType = race;
		myClassType = cClass;
		myClass = c;
		myGender = gender;
		myStats = s;
		myName = n;
		String fileName = myName.getName();
		fileName += ".txt";
		file = new File(fileName);
		
	}
	
	private void calculateAdditionalVarables(){
		for(int i = 0; i < statMod.length; i++){
			switch(myStats.getStats()[i]){
			case 2:
			case 3:
				statMod[i] = -4;
				break;
			case 4:
			case 5:
				statMod[i] = -3;
				break;
			case 6:
			case 7:
				statMod[i] = -2;
				break;
			case 8:
			case 9:
				statMod[i] = -1;
				break;
			case 10:
			case 11:
				statMod[i] = 0;
				break;
			case 12:
			case 13:
				statMod[i] = 1;
				break;
			case 14:
			case 15:
				statMod[i] = 2;
				break;
			case 16:
			case 17:
				statMod[i] = 3;
				break;
			case 18:
			case 19:
				statMod[i] = 4;
				break;
			case 20:
			case 21:
				statMod[i] = 5;
				break;
			case 22:
			case 23:
				statMod[i] = 6;
				break;
			}
		}
		
		System.out.println("Con mod" + statMod[2]);
		System.out.println("Class Hit Die" + myClass.getHitDie());
		hp = myClass.getHitDie() + statMod[2];
		numberOfSkills = myClass.getNumberOfSkills() + statMod[3];
		switch(myStats.getStats()[0]){
		case 2:
			carryWeightLight = 6;
			carryWeightMedium = 13;
			carryWeightHeavy = 20;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 3:
			carryWeightLight = 10;
			carryWeightMedium = 20;
			carryWeightHeavy = 30;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 4:
			carryWeightLight = 13;
			carryWeightMedium = 26;
			carryWeightHeavy = 40;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 5:
			carryWeightLight = 16;
			carryWeightMedium = 33;
			carryWeightHeavy = 50;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 6:
			carryWeightLight = 20;
			carryWeightMedium = 40;
			carryWeightHeavy = 60;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 7:
			carryWeightLight = 23;
			carryWeightMedium = 46;
			carryWeightHeavy = 70;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 8:
			carryWeightLight = 26;
			carryWeightMedium = 53;
			carryWeightHeavy = 80;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 9:
			carryWeightLight = 30;
			carryWeightMedium = 60;
			carryWeightHeavy = 90;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 10:
			carryWeightLight = 33;
			carryWeightMedium = 66;
			carryWeightHeavy = 100;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 11:
			carryWeightLight = 38;
			carryWeightMedium = 76;
			carryWeightHeavy = 115;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 12:
			carryWeightLight = 43;
			carryWeightMedium = 86;
			carryWeightHeavy = 130;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 13:
			carryWeightLight = 50;
			carryWeightMedium = 100;
			carryWeightHeavy = 150;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 14:
			carryWeightLight = 58;
			carryWeightMedium = 116;
			carryWeightHeavy = 175;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 15:
			carryWeightLight = 66;
			carryWeightMedium = 133;
			carryWeightHeavy = 200;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 16:
			carryWeightLight = 76;
			carryWeightMedium = 153;
			carryWeightHeavy = 230;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 17:
			carryWeightLight = 86;
			carryWeightMedium = 173;
			carryWeightHeavy = 260;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 18:
			carryWeightLight = 100;
			carryWeightMedium = 200;
			carryWeightHeavy = 300;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 19:
			carryWeightLight = 116;
			carryWeightMedium = 233;
			carryWeightHeavy = 350;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 20:
			carryWeightLight = 133;
			carryWeightMedium = 266;
			carryWeightHeavy = 400;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 21:
			carryWeightLight = 153;
			carryWeightMedium = 306;
			carryWeightHeavy = 460;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 22:
			carryWeightLight = 173;
			carryWeightMedium = 346;
			carryWeightHeavy = 520;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		case 23:
			carryWeightLight = 200;
			carryWeightMedium = 400;
			carryWeightHeavy = 600;
			carryWeightOverHead = carryWeightHeavy;
			carryWeightLift = carryWeightHeavy * 2;
			carryWeightDrag = carryWeightHeavy * 5;
			break;
		}
	}
	
	public void writeToFile(){
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		statMod = new int[6];
		String temp = "";
		temp += myRaceType;
		try {
			writer.write(" Race: " + temp + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculateAdditionalVarables();
		
		try {
			writer.write(myRace.toString() + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		temp = "";
		temp += myClassType;
		try {
			writer.write(" Class: " + temp + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			writer.write(myClass.toString() + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		temp = "";
		temp += myGender;
		try {
			writer.write(" Gender: " + temp + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			writer.write(" Hit Points: " + hp + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			writer.write(" Skills: " + numberOfSkills + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			writer.write(" Skills: " + numberOfSkills + "\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			writer.write(" Carry Weight\n Light Load " + carryWeightLight + "lbs.\n Medium Load " + carryWeightMedium + "lbs.\n Heavy Load " + carryWeightHeavy 
					+ "lbs.\n Lift Over Head " + carryWeightOverHead + "lbs.\n Lift " + carryWeightLift + "lbs.\n Drag " + carryWeightDrag + "lbs.");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
