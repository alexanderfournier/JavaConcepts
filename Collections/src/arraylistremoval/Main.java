package arraylistremoval;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;


		public class Main {

			public static void main(String[] args) {
				
				Product product1 = new Product("Afaa",150);
				Product product2 = new Product("Nasm",250);
				Product product3 = new Product("fuck me ", 1);
				System.out.println(product1);
				
				
				Collection<Product> products = new ArrayList<Product>(); 
				
				products.add(product1);
				products.add(product2);
				products.add(product3);
				
				final Iterator<Product> productIterator = products.iterator();
				
				while(
					productIterator.hasNext()) 
				{
					Product product =  productIterator.next();
					if(product.getPrice() < 100) 
					{
						System.out.println(product);
					}
					else 
					{
						productIterator.remove();
					}
					
					
				}
				System.out.println(products.size());
				System.out.println(products);

				
			

				
				
			}

		

	

}
