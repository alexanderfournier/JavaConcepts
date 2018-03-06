package javaExampleSpace;

public class Mainclass {

	public static void main(String[] args) {
		Player[] players = new Player[4];
		players[0] = new Player("Demar Derozan",50.0);
		players[1] = new Player("Steph Curry",29.0);
		players[2] = new Player("John Wall",28.0);
		players[3] = new Player("Rajon Rondo",22.0);
		
		
		for( Player play: players  ) {
			
			System.out.println(play);
		}

	}

}
