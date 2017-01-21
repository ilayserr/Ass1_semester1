/*
Assignment number : 1.4
File Name : ToDecimal.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/* Convert a binary number into decimal
 */

public class ToDecimal {

	public static void main(String[] args) {
		// checking if illegal input
		if (args.length == 0) {
			System.out.println("illegal input");
		} else {	
			String s = (args[0]);
			int sum = 0;
			boolean f = true; // helps to separate the illegal value
			for (int i = 0; i <s.length() ; i++) {
				// checking if the args is only 1 and 0
				if ((s.charAt(i) != '0') && (s.charAt(i) != '1')) {
					System.out.println("illegal input");
					f = false;
					break;
				}
				//calculating the binary value
				if (s.charAt(i) == '1') {
					sum = sum + (int)(Math.pow(2, (s.length() - i - 1)));
				} 
			}
			// printing the sum
			if (f) System.out.println("the sum of the binary number " // prints only if the input is legal
										 + s + " is: " + sum);
		}	
	}
}
