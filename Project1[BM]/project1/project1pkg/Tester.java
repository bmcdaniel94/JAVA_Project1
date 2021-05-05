package project1pkg;
import java.util.Scanner;
/*
 * Benjamin McDaniel
 * Project1
 */

public class Tester {

	
	
	public static void main(String[] args) {
		int c = 1;
		
		Scanner scan = new Scanner(System.in);
		
		Patient s1 = new Patient();
		s1 = new Patient("Jack", "48723","neglect");
		
		do {
		System.out.println("Enter a trauma: ");
		String x = scan.next();
		s1.addACE(x);
		
		System.out.println("Enter 0 to quit...\n");
		scan.nextInt(c);
		}while(c != 0);
	}
}
