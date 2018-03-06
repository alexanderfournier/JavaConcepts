package loop1;

public class Main {

	public static void main(String[] args) {
		
		
		for(int a = 1; a<=6;a++) {
			for(int b = 1; b<=a;b++) {
				System.out.print(b);
			}
			for(int c= 6; c>a;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	
	}