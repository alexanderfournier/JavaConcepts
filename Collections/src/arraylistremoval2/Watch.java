package arraylistremoval2;

public class Watch {
	
	private final int Price;
	private final String Maker;
	private final String Material;
	
	public Watch(int Price, String Maker, String Material) {
		this.Price = Price;
		this.Maker = Maker;
		this.Material = Material;
	}
	
	public String getMaker() {
		return Maker;
	}
	
	public String getMaterial() {
		return Material;
	}
	
	public int getPrice() {
		return Price;
	}
	
	@Override
	
	public String toString() {
		return "Watch{"+ "Name: '" + Maker + '\''   + " Price:'" + Price + '\'' + " Material: '" + Material + '}'; 
	}

}
