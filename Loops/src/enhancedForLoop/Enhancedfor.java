package enhancedForLoop;

public class Enhancedfor {

	public static void main(String[] args) {
		int lister [] = {1,3,5,6};
		int sum=0;
		
		for(int x: lister) {
			sum+=x;
		}
System.out.println(sum);
	}
}


/* Purpose of this loop is to either sum everything or sum as you go*/