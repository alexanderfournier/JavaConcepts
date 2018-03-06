package interfaces;

public class PrimaryPilot extends Person {
	
	private String Rank;
	private String Branch;
	
	public PrimaryPilot() {
		
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String Rank) {
		this.Rank = Rank;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String Branch) {
		this.Branch = Branch;
	}
	
	
}