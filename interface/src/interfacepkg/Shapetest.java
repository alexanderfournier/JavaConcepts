package interfacepkg;

public class Shapetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {
				new Circle(10),
				new Square(10),
				new Rectangle(10)};
			System.out.println("sum of areas: " + Shape.sumAreas(shapes));
		}

	}


