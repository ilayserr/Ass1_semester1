/*
Assignment number : 1.6
File Name : SheshBeshStats.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/* 
 * calculate the average number of times that took until the user got sheshbesh (5,6)/(6,5)
 * calculate for T rounds of throws.
 */

public class SheshBeshStats {

	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		double avg = 0;
		int num1;
		int num2;
		int count;
		boolean temp = false;
		// running T times on the code
		for (int j = 0; j < T; j++) {
			count = 0;
			num1 = 0;
			num2 = 0;
			temp = false;
			while (temp == false) {
				// random two numbers
				num1 = 1 + (int) (Math.random() * 6);
				num2 = 1 + (int) (Math.random() * 6);
				count++;
				// checking the condition and changing the boolean term if sheshbesh
				if (((num1 == 6) && (num2 == 5)) || ((num1 == 5) && (num2 == 6))) {
					temp = true;
				}
			}
			// adding the total sum
			avg = avg + count;
		}
		// calculating the average and printing
		avg = avg / T;	
		System.out.println("it took " + avg + " tries on average to get Shesh-Besh.");
	}

}
