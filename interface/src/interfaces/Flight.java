package interfaces;

import java.util.Iterator;

public class Flight implements Comparable<Flight>,Iterable<Person> {
	private int flightTime;
	private PrimaryPilot [] Ppilot;
	private SecondaryPilot [] Spilot;
	
	public int compareTo(Flight f) {
		Flight f = (Flight) o;
		return flightTime - f.flightTime;
	}

	public Iterator<Person> iterator() {
		return new FlightIterator(Ppilot,Spilot);
	}
	

}
