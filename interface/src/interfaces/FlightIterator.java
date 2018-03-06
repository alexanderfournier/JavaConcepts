package interfaces;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person>{
	private PrimaryPilot [] Ppilot;
	private SecondaryPilot [] Spilot;
	private int index = 0;
	
	public FlightIterator(PrimaryPilot [] Ppilot, SecondaryPilot [] Spilot) {
		this.Ppilot = Ppilot;
		this.Spilot = Spilot;
	}
	
	
	@Override
	public boolean hasNext() {
		return index < (Ppilot.length + Spilot.length);

	}
	@Override
	public Person next() {
		Person p = (index < Ppilot.length) ?
				Ppilot[index] : Spilot[index - Ppilot.length];
				index++;
				return p;
				
				
	}
	
	
}
