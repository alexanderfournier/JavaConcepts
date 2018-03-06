package averageprogram;
import java.util.Scanner;


public class averageprogram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		double average;
		int counter = 0;
		int countGrades = 9;
		
		while(countGrades< 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
	average = total/countGrades;

	System.out.println("Your average is: " + average);
}

}