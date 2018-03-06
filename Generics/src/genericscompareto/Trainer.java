package genericscompareto;

import java.util.Objects;

public class Trainer {
	
	private final String Name;
	private  final int Experience;
	
	public Trainer(int Experience, String Name) {
		Objects.requireNonNull(Name);
		this.Name = Name;
		this.Experience = Experience;
	}
	public String getName() {
		return Name;
	}

	public int getExperience() {
		return Experience;
	}

	
	
	
	
	
	@Override 
	public int hashCode() {
	int result = Name.hashCode();
	result = 31 * result + Experience;
	return result;
	}
	
	@Override
	public String toString() {
		return "Person{" + "name:" + Name + '\'' + 
				", experience=" + Experience +
				'}';
	}
	


}

