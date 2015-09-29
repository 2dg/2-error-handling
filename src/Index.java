public class Index {
	public static void main(String[] args) {
		System.out.println("Raphael Mu, 2D Graphics, Period 1");

		try {
			new Triangle(12, 12, 12);
			System.out.println("Success: [12, 12, 12]");
		}
		catch (Triangle.IllegalTriangleException e) {
			System.out.println("Failure: [12, 12, 12]");
			e.printStackTrace();
		}

		try {
			new Triangle(1, 1, 3);
			System.out.println("Success: [1, 1, 3]");
		}
		catch (Triangle.IllegalTriangleException e) {
			System.out.println("Failure: [1, 1, 3]");
			e.printStackTrace();
		}
	}
}
