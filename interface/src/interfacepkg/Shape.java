package interfacepkg;

public interface Shape {
	double getArea();
	
	public static double sumAreas(Shape[] shapes) {
		double sum 0;
		for(Shape s : shapes) {
			sum = sum + getArea();
		}
		return(sum);
	}

}
