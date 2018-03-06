package javaWorld;

public class motorcycle {
	private String name;
	private int topspeed;
	private double price;
	
	public motorcycle(String nameOfMoto,int speed, double cost) {
		name = nameOfMoto;
		topspeed = speed;
		price = cost;
	}
	
	public void setSpeed(int speed) {
		speed = this.topspeed;
	}
	
	public int getSpeed() {
		return topspeed;
	}
	public void setMotorcycle(String name) {
		name = this.name;
	}

	public String getMotorcycle() {
		return name;
	}
	
	public void printed() {
		System.out.println("type of motorcycle is " + getMotorcycle() );
	}
	
	public void printed2() {
		System.out.println("type of motorcycle is " + getMotorcycle() + " it's top speed is " + getSpeed());
	}
	
	public void setPrice(double price) {
		price = this.price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void printed3() {
		System.out.println( "cost of motorcyle" + getPrice());
}
}
