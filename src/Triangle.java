/**
 * Triangle
 * #2: Error Handling
 * @author Raphael Mu
 * 9/2/15
 */
public class Triangle {
	protected double a = 1;
	protected double b = 1;
	protected double c = 1;

	/**
	 * Creates an equilateral triangle of k=1.
	 */
	public Triangle() {}

	/**
	 * Creates a triangle with the specified side lengths.
	 * @param a side 1
	 * @param b side 2
	 * @param c side 3
	 * @throws IllegalTriangleException if one length is longer than the other two combined
	 */
	public Triangle(double a, double b, double c) throws IllegalTriangleException {
		if (a + b <= c ||
			a + c <= b ||
			b + c <= a) {
			throw new IllegalTriangleException();
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Describes a violation of the valid side length ratios of a triangle.
	 */
	public static class IllegalTriangleException extends IllegalArgumentException {
		public IllegalTriangleException() {
			super("No side length should be greater than or equal to the sum of the lengths of the other two sides.");
		}
	}
}
