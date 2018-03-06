package genereicsparameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	
	

/*
 * 
 * This package shows how to pass parameters to a generic interface! 
 * 
 */

	public static void main(String[] args) {
		
		WeightLifter will = new WeightLifter("will",56,150);
		WeightLifter alex = new WeightLifter("alex",20,160);
		WeightLifter john = new WeightLifter("john",50,170);
		WeightLifter kyle = new WeightLifter("kyle",24,190);
		WeightLifter hodor = new WeightLifter("hodor",30,300);
		
		
		
		ArrayList<WeightLifter> lifters = new ArrayList<>();
		lifters.add(will);
		lifters.add(alex);
		lifters.add(john);
		lifters.add(kyle);
		lifters.add(hodor);
		
		Collections.sort(lifters, new ReverseComparator<>(new WeightLifterComparable()));
		
		final Iterator<WeightLifter> iterators = lifters.iterator();
		
		while(iterators.hasNext()) {
			final  WeightLifter lifter = iterators.next();
			System.out.println(lifter);
			
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
