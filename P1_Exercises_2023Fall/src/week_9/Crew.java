package week_9;

import java.util.ArrayList;

public class Crew {

	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {

	}

	public void addCrewMember(Sailor sailor) {

		sailorList.add(sailor);
	}

	public String toString() {

		String format = "";

		for (Sailor sailor : sailorList) {
			format += sailor.getName() + " (" + sailor.getEmail() + ")\n";
		}

		return format;
	}
}