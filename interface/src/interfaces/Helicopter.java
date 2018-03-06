package interfaces;

public class Helicopter implements Comparable {
	private int Speed;
	private int Miles;
	@Override
	public int compareTo(Object o) {
		Helicopter h = (Helicopter) o;
				if(Speed < h.Speed )
		return -1;
				else if (Speed > h.Speed)
		return 1;
				else {
					if(Miles > h.Miles)
						return -1;
					
					else if(Miles < h.Miles)
						return 1;
					
					else
						return 0;
	
				}
				
				
				
	}
	
	public void setSpeedMiles(int Speed,int Miles) {
		this.Speed = Speed;
		this.Miles = Miles;
	}
	
	
	

}
