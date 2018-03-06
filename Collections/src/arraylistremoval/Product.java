package arraylistremoval;

	public class Product {
		private final String Name;
		private final int Price;
		
		public Product(String Name, int Price) {
			this.Name = Name;
			this.Price = Price;
		}


		
		public int getPrice() {
			return Price;
		}
		
		public String getName() {
			return Name;
		}

		
		@Override
		public String toString() {
			return "Product{" + "name'"+ Name + '\''  + ", price=" + Price + '}';
			
		}
	}


