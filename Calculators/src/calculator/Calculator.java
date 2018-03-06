package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double fnum;
		double snum;
		double answer;
		
		System.out.println("enter firstnumber: ");
		fnum = s.nextDouble();
		System.out.println("enter second number : ");
		snum = s.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
		

	}

}
