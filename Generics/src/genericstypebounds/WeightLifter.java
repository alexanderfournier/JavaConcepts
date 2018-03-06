package genericstypebounds;

public class WeightLifter {
	private final String Name;
	private final int Age;
	private final int Weight;
	
	public WeightLifter(String Name, int Age, int Weight) {
		this.Name = Name;
		this.Age = Age;
		this.Weight = Weight;
	
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public int getWeight() {
		return Weight;
	}

	
	
	
	@Override 
	public String toString() {
		return "WeightLifter{Name:" + Name + '|' + "Age:" + Age + '|' + "Weight:" + Weight
				+ "}";
				
		
	
	/*
	@Override 
	public String toString() {
		return "WeightLifter{Name:" + Name + '|' + "Age:" + Age + '|' + "Weight:" + Weight
				+ '|' + "WeightClass:" + WeightClass + "}";
				
	*/			
	} 
	
	
	
	
	
	
	
	

}
