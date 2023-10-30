package edu.monmouth.employee;

public class PieceEmployee implements Employee {
	
	private int rate_per_piece;
	private int pieces_made;
	
	public PieceEmployee(int rate_per_piece) {
		this.rate_per_piece = rate_per_piece;
	}

	public void setPiecesMade(int pieces_made) {
		this.pieces_made = pieces_made;
	}
	
	@Override
	public int getMonthlyPay() {
		return rate_per_piece * pieces_made; 
	}

	@Override
	public String toString() {
		return "PieceEmployee [rate_per_piece=" + rate_per_piece + ", pieces_made=" + pieces_made + "]";
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PieceEmployee)) {
			return false;
		}
		PieceEmployee that = (PieceEmployee) obj;
		return this.rate_per_piece == that.rate_per_piece
				&& this.pieces_made == that.pieces_made;
	}
	
}
