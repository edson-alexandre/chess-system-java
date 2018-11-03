package boardgame;

public class Piece {
	protected Position position;
	private Board booard;
	
	public Piece(Board booard) {
		this.booard = booard;
		position=null;
	}

	protected Board getBooard() {
		return booard;
	}

	
}
