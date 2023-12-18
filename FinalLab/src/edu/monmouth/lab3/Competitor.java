package edu.monmouth.lab3;

public class Competitor implements Comparable<Competitor>{
	
	String name;
	int score;
	
	public Competitor(String name, int score) {
		setName(name);
		setScore(score);
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Competitor)) {
			return false;
		}
		Competitor that = (Competitor) obj;
		return this.score == that.score;
	}

	@Override
	public String toString() {
		return "Competitor [name=" + name + ", score=" + score + "]";
	}
	
	@Override
	public int compareTo(Competitor competitor) {
		return this.score - competitor.score; 
	}
	
}
