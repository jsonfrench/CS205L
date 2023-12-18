package edu.monmouth.lab3;

import java.util.Comparator;

public class BowlerComparator implements Comparator<Competitor>{

	//11. flip the ordering of bowlers
	@Override
	public int compare(Competitor o1, Competitor o2) {
		return o1.compareTo(o2) * -1;
	}


}
