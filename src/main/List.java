package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import main.classes.ClassType;
import main.races.RaceType;

public class List {

	private JComboBox<RaceType> raceList;
	private JComboBox<ClassType> classList;
	private RaceType currentRaceType;
	private ClassType currentClassType;
	private Gender selectedGender;
	private JComboBox<Gender> gender;

	public List() {
		raceList = new JComboBox<RaceType>(RaceType.values());
		raceList.setBounds(0, 40, 100, 40);
		raceList.addActionListener(new RaceListListener());
		classList = new JComboBox<ClassType>(ClassType.values());
		classList.setBounds(0, 80, 100, 40);
		classList.addActionListener(new ClassListListener());
		gender = new JComboBox<Gender>(Gender.values());
		gender.setBounds(0, 360, 100, 40);
		gender.addActionListener(new GenderListListener());
	}

	public JComboBox getRaceList() {
		JComboBox temp = raceList;
		return temp;
	}

	public JComboBox getClassList() {
		JComboBox temp = classList;
		return temp;
	}

	public JComboBox getGenderList() {
		JComboBox temp = gender;
		return temp;
	}

	public RaceType getRaceType() {
		RaceType temp = currentRaceType;
		return temp;
	}

	public ClassType getClassType() {
		ClassType temp = currentClassType;
		return temp;
	}

	public Gender getGender() {
		Gender temp = selectedGender;
		return temp;
	}

	private class RaceListListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			currentRaceType = (RaceType) raceList.getSelectedItem();
		}
	}

	private class ClassListListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			currentClassType = (ClassType) classList.getSelectedItem();
		}
	}

	private class GenderListListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			selectedGender = (Gender) gender.getSelectedItem();
		}
	}

	public boolean canConfirm() {
		// TODO Auto-generated method stub
		boolean temp = false;
		if(currentRaceType == RaceType.CHANGELING && selectedGender == Gender.FEMALE){
			temp = true;
		} else if(selectedGender == Gender.MALE || selectedGender == Gender.FEMALE){
			temp = true;
		}
		return temp;
	}
}
