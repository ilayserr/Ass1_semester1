/*
Assignment number : 1.3
File Name : Amicable.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/* checks if two numbers are amicable
 * Two numbers are said to be amicable if each number equals the sum of 
 * all divisors of the other number.
 * 220 and 284 are amicable numbers since:
      220=1+2+4+71+142
      284=1+2+4+5+10+11+20+22+44+55+110
 */

public class Amicable { 

	public static void main(String [] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum1 = 1;
		int sum2 = 1;
		String s1 = a + "= 1";
		String s2 = b + "= 1";
		// adds string 2 the next dividable number. 
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				sum1 = sum1 + i;
				s2 = s2 + " + " + i;
			}
		}
		// adds string 1 the next dividable number. 
		for (int j = 2; j <= b / 2; j++) {
			if (b % j == 0) {
				sum2 = sum2 + j;
				s1 = s1 + " + " + j;
			}
		}
		// check the conditions
		if ((sum1 == b) && (sum2 == a)) {
			System.out.println(a + " and " + b + " are amicable numbers since ");
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println(a + " and " + b + " are not amicable numbers");
		}
	}
}
