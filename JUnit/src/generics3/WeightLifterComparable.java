package generics3;

import java.util.Comparator;

public class WeightLifterComparable implements Comparator<WeightLifter>{

	


	@Override
	public int compare(WeightLifter o1, WeightLifter o2) {
				return Integer.compare(o1.getWeight(), o2.getWeight());
	}



}
