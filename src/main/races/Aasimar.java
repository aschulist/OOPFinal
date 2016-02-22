package main.races;

import main.classes.ClassType;
import main.races.Race;

public class Aasimar extends Race {

	public Aasimar() {
		super(basicDescription, description, racialTraits);
		// TODO Auto-generated constructor stub
	}

	private static String basicDescription = " Creatures blessed with a celestial bloodline, aasimars seem human except for some exotic quality that betrays their\n"
			+ " otherworldly origin. While aasimars are nearly always beautiful, something simultaneously a part of and apart from\n"
			+ " humanity, not all of them are good, though very few are evil.";

	private static String description = "";

	private static String[] racialTraits = {};

	@Override
	public void calculateAge(ClassType type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateHeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateWeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getBasicDescription() {
		// TODO Auto-generated method stub
		return basicDescription;
	}

}
