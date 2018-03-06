package forloopexamples;

public class RateCalculator {
	public static void main(String[] args) {
		double amount;
		double start = 100000;
		double rate = .07;
		
		
		
		for(int day=1; day <= 20; day++) {
			amount = start * Math.pow(1 +rate , day);
			
System.out.println(day + "     " + amount);

	}

}
