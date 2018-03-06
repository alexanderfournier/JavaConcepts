package genericscompareto;

import java.util.Comparator;

public class AgeComparator implements Comparator<Client>{
	
	public int compare(final Client o1, final Client o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
