package objectholder;

public class Player extends People {
	private String playername;
	private int playerage;
	
	public Player(String playername, int playerage) {
		this.playername = playername;
		this.playerage = playerage;
		
	}
	
	public void setPlayerAge(int playerage) {
		this.playerage = playerage;
	}

	public String getPlayerName() {
		return playername;
	}
	
	public void setPlayerName(String playername) {
		this.playername = playername;
	}
	
	public int getPlayerAge() {
		return playerage;
	}
	
	public void sportInv(){
		System.out.println("sport is lacrosse2");
		
		
	}
}
