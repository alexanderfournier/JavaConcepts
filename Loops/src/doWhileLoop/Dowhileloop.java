package doWhileLoop;

public class Dowhileloop {

	public static void main(String[] args) {
		int counter = 0;
		
		do {
			System.out.println(counter);
			counter++;
		}while(counter<=10);

	}

}

	
/* this looks like while loop... why is this different?*/
/* while loop runs it when test is true
do runs it and then checks... do/while runs it once at least*/