package genericscompareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	

		
		/*
		 * 
		 * 
		 * 
		 * This package shows how to create an array collection and use the sort method and a comparator class
		 * 
		 * 
		 */
	
	Client james = new Client(15,"john");
	Client jon = new Client(45,"jan");
	Client ramsey = new Client(56,"ramsey");
	Client josh = new Client(55,"josh");
	
	ArrayList<Client> clients = new ArrayList<>();
	clients.add(jon);
	clients.add(james);
	clients.add(ramsey);
	clients.add(josh);
	Collections.sort(clients,new AgeComparator());

	final Iterator<Client> iterator1 = clients.iterator();
	
	
	while(iterator1.hasNext()) {
		final Client client = iterator1.next();
		System.out.println(client);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
