package arraylistremoval2;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class Main1 {

	public static void main(String[] args) {
		Watch watch1 = new Watch(50,"Nixon","GunMetal");
		Watch watch2 = new Watch(100,"Oracle", "GunMetal");
		Watch watch3 = new Watch(150,"Oracles","Leather");
		
		Collection<Watch> watches = new ArrayList<Watch>();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		
		
		final Iterator<Watch> itemIterator = watches.iterator();
		
		while(
			itemIterator.hasNext())
		{	
				Watch watch =  itemIterator.next();
		
				if(watch.getPrice() < 125) {
					System.out.println(watch);
				}
				else {
					itemIterator.remove();
				}
				
			}
		
		System.out.println(watches);
			
	}

}
