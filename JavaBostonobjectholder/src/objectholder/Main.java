package objectholder;

public class Main {

	public static void main(String[] args) {
		
		 
		
		
		PlayerList PL = new PlayerList();
		Player player = new Player("John",12);
		Player player1 = new Player("Alex", 10);
		Player player2 = new Player("carl", 10);
		Player player3 = new Player("John", 10);
		
		Coach coach = new Coach("ryan",15);
		People thelist[] = new People[2];
		
		thelist[0] = coach;
		thelist[1] = player;
		
	
		
		for(People p : thelist) {
			
		}

	}

}
