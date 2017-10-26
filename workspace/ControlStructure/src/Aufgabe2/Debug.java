package aufgabe2;

import java.util.Random;

/**
 * Debug class to test methods of IfElseSwitch class. This class is not part of
 * the exercise.
 * 
 * @author Ahmed Ebrahim Aldekal, 3357598, aldekalahmed@gmail.com
 * @author Marco Scheffel, 3331983, uni@topmas.de
 * @author Fatih Yokus, 331155, fatih.yokus@gmx.de
 * @see IfElseSwitch
 * 
 */
public class Debug {

	/**
	 * 
	 * main method to test IfElseSwitch class methods.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Random randomGenerator = new Random(); // new object to generate random numbers
		int n1 = randomGenerator.nextInt(10);
		int n2 = randomGenerator.nextInt(10);
		int n3 = randomGenerator.nextInt(10);
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("Jetzt wird sotiert:");
		IfElseSwitch.compare3Numbers(n1, n2, n3); // compute and print exercise 2a
		System.out.println("----------------------------\nJahreszahlzeug:"); // exercise 2b
		System.out.println("1200: " + IfElseSwitch.isLeapYear(1200)); // false
		System.out.println("1900: " + IfElseSwitch.isLeapYear(1900)); // false
		System.out.println("1996: " + IfElseSwitch.isLeapYear(1996)); // true
		System.out.println("2000: " + IfElseSwitch.isLeapYear(2000)); // true
		System.out.println("3200: " + IfElseSwitch.isLeapYear(3200)); // false
		System.out.println("----------------------------\nLösungen Mitternachtsformel:");
		IfElseSwitch.computeRealSolution(9.4, 1.3, -1); // compute and print exercise 2c
		System.out.println("----------------------------\nNotenausgabe:");
		int punkte = randomGenerator.nextInt(100); // get a random value for points
		System.out.println("Punktezahl: " + punkte);
		System.out.println("Note: " + IfElseSwitch.computeGrade(punkte)); // compute and print grade based on points
	}

}
