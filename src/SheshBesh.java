/*
Assignment number : 1.5
File Name : SheshBesh.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/*
 * Calculate the number of times the program "rolled" two dice and didnt got a sheshbesh.
 */
public class SheshBesh {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int count = 0;
		boolean temp = false;
		while (temp == false) {
			//random two numbers
			num1 = 1 + (int)(Math.random() * 6);
			num2 = 1 + (int)(Math.random() * 6);
			count++;
			// checking if the condition works and printing count.
			if (((num1 == 6) && (num2 == 5)) || ((num1 == 5) && (num2 == 6))) {
				System.out.println("Shesh-Besh appears... it took " + count + " tries.");
				temp = true;
			}
		}	
	}
}
