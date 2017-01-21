/*
Assignment number : 1.1
File Name : Triangle.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/* A function that state if it's possible to build a triangle 
 * from 3 edges represent by the numbers given.
 */

public class Triangle {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		boolean isTriangle = true;
		// checking the terms and changing the boolean value accordingly
		if (x + y < z) { 
			isTriangle = false;
		} else if (x + z < y) {
			isTriangle = false;
		} else if (y + z < x) {
			isTriangle = false;
		}
		// printing the answer
		System.out.println(isTriangle);
	}

}
