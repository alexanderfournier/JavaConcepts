package genericstypebounds;

public class SortedPair<T extends Comparable> {
	
	private T first;
	private T second;
	
	public SortedPair(T left, T right) {
		if(left.compareTo(right)< 0) {
			first = left;
			second = right;
		}
		else
		{
			first=right;
			second=left;
		}
		
	
	}
	
	public T getSecond() {
		return second;
	}
	public T getFirst() {
		return first;
	}

}
