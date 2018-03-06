package objectholder;

public class PlayerList  {
	private Player[] thelist = new Player[5];
	private int x = 0;
	
	public void add(Player d) {
		if(x < thelist.length) {
			thelist[x]=d;
			System.out.println("player added at index " + x);
			x++;
		}
	}

}
