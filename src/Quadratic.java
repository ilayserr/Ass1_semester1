/*
Assignment number : 1.2
File Name : Quadratic.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/*
 * calculate a quadratic equation
 */

public class Quadratic {

	public static void main(String [] args) {
		double a = Double.parseDouble (args[0]);
		double b = Double.parseDouble (args[1]);
		double c = Double.parseDouble (args[2]);
		double calculate = 0;
		// doing the distunce equation
		double s1 = (-1) * b;
		double s2 = (-1) * b;
		calculate = (((b) * (b)) - (4 * a * c));
		if (calculate < 0) {
			System.out.println( " there are no solutions ");
		} else {
			// printing the solution / solutions
			calculate = Math.sqrt(calculate);
			s1 = (s1 + calculate) / (2 * a);
			s2 = (s2 - calculate) / (2 * a);
			if (s1 == s2) System.out.println( "the solution is: " + s1);
			else System.out.println( "the solutions are: " + s1 + " , " + s2);
		}
	}

}
