package multidimensional_array;

import java.util.Scanner;


// this class is no more in use.
// it's been included in the main class in multi_array.java
public class guessing {

	static Scanner test1=new Scanner(System.in);
	public static void test (int num1, int num2) {
		boolean accepted=false;
		

		while (accepted==false) {
			if (num1>num2) {
				System.out.println("you should give an integer number between 0 and "+num2);
				System.out.println("give a new value for please:");
				num1=test1.nextInt();
			}
			else {
				accepted=true;
				
			}
		
		}
		
		}
}