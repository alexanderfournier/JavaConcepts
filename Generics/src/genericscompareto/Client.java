package genericscompareto;

import java.util.Objects;

public class Client {
	private final int Age;
	private final String Name;
	
	
	public Client(int Age,String Name) {
		Objects.requireNonNull(Name);
		this.Name = Name;
		this.Age = Age;
	}
	
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	
	
	@Override
	public String toString() {
		return "Customer{Name:"
				+ Name + '|' + "Age:" + Age + "}";
	}
	
	
	@Override 
	public int hashCode() {
		int result = Name.hashCode();
		result = 31 * result + Age;
		return result;
		
	}
	
	
	

}
