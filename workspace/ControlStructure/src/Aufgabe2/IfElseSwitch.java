package aufgabe2;

/**
 * IfElseSwitch class to contain the methods for our PSE training. The methods
 * are described separately.
 * 
 * @author Ahmed Ebrahim Aldekal, 3357598, aldekalahmed@gmail.com
 * @author Marco Scheffel, 3331983, uni@topmas.de
 * @author Fatih Yokus, 3321155, fatih.yokus@gmx.de
 * 
 */
public class IfElseSwitch {

	/**
	 * Empty constructor, because there is none necessary.
	 * 
	 */
	public IfElseSwitch() {

	}

	/**
	 * Method compare3Numbers to compare three numbers and print them in descending
	 * order from maximum to minimum. Exercise 2a
	 * 
	 * @param n1
	 *            the first number
	 * @param n2
	 *            the second number
	 * @param n3
	 *            the third number
	 * 
	 */
	public static void compare3Numbers(int n1, int n2, int n3) {

		int max = 0; // variable for maximal value
		int middle = 0; // variable for middle value
		int min = 0; // variable for minimum value

		/*
		 * sort values
		 */

		/* routine if 2 or 3 values are equal */
		if (n1 == n2 || n1 == n3 || n2 == n3) {
			if (n1 == n2) {
				if (n1 > n3) { // n1 and n2 are equal and bigger than n3
					max = n1;
					middle = n2;
					min = n3;
				} else { // n1 and n2 are equal and smaller than n3
					max = n3;
					middle = n1;
					min = n2;
				}
			} else if (n1 == n3) {
				if (n1 > n2) { // n1 and n3 are equal and bigger than n2
					max = n1;
					middle = n3;
					min = n2;
				} else { // n1 and n3 are equal and smaller than n2
					max = n2;
					middle = n1;
					min = n3;
				}
			} else if (n2 == n3) {
				if (n2 > n1) { // n2 and n3 are equal and bigger than n1
					max = n2;
					middle = n3;
					min = n1;
				} else { // n2 and n3 are equal and smaller than n1
					max = n1;
					middle = n2;
					min = n3;
				}
			} else { // all 3 are equal
				max = n1;
				middle = n2;
				min = n3;
			}
		}

		/* routine if values are unique */
		else {

			/* find maximum */
			if ((n1 > n2) && (n1 > n3)) { // n1 is biggest
				max = n1;
			} else if ((n2 > n1) && (n2 > n3)) { // n2 is biggest
				max = n2;
			} else { // n3 is biggest
				max = n3;
			}

			/* find minimum */
			if ((n1 < n2) && (n1 < n3)) { // n1 is smallest
				min = n1;
			} else if ((n2 < n1) & (n2 < n3)) { // n2 is smallest
				min = n2;
			} else { // n3 is smallest
				min = n3;
			}

			middle = (n1 + n2 + n3) - (max + min); // compute middle value
		}

		/* print result on console */
		System.out.println("Max: " + max + "\nMiddle: " + middle + "\nMin: " + min);
	}

	/**
	 * Method isLeapYear to return a boolean value if given year is a leap year or
	 * not. Only leap years between 1470 and 2970 are processed. Exercise 2b
	 * 
	 * @param year
	 *            the year to be tested
	 * @return boolean true, if year is leap year and between 1470 and 2970
	 */
	public static boolean isLeapYear(int year) {

		boolean isLeapYear = false; // basic assumption: year is a leap year

		/* test if year is in range 1470 and 2970 else return false */
		if ((year >= 1470) && (year <= 2970)) {

			/* compute if year is a leap year or not */
			if (year % 400 == 0) {
				isLeapYear = true;
			} else if (year % 100 == 0) {
				isLeapYear = false;
			} else if (year % 4 == 0) {
				isLeapYear = true;
			}

		}

		/* return result */
		return isLeapYear;

	}

	/**
	 * Method computeRealSolution to calculate the/all solution(s) for the equation
	 * ax^2+bx+c=0 Parameter a must not be 0. Result will be printed in console.
	 * exercise 2c
	 * 
	 * @param a
	 *            value of a, must not be 0
	 * @param b
	 *            value of b, may be 0
	 * @param c
	 *            value of c, may be 0
	 */
	public static void computeRealSolution(double a, double b, double c) {

		double x1 = 0; // First solution x1
		double x2 = 0; // Second solution x2

		if (a == 0) {

			System.out.println("a darf nicht 0 sein. Versuche es noch einmal."); // a must not be 0, error output
																					// printed in console in de_DE

		} else {

			x1 = ((-b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a); // calculate x1
			x2 = ((-b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a); // calculate x2

			/* print x1 in de_DE */
			if (Double.isNaN(x1)) {
				System.out.println("Es gibt keinen Schnittpunkt x1 mit der x-Achse");
			} else {
				System.out.println("x1 = " + x1);
			}

			/* print x2 in de_DE */
			if (Double.isNaN(x2)) {
				System.out.println("Es gibt keinen Schnittpunkt x2 mit der x-Achse");
			} else {
				System.out.println("x2 = " + x2);
			}
		}
	}

	/**
	 * Method computeGrade returns a grade based on parameter points. Returns 0 if
	 * points has a wrong value. exercise 2d
	 * 
	 * @param points
	 *            achieved points between 0 an 100
	 * @return double grade between 1.0 and 5.0
	 */
	public static double computeGrade(int points) {
		double grade = 0.0;

		if (points >= 0 && points <= 100) {

			/* grade distribution */
			switch (points) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
				grade = 5.0;
				break;
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
				grade = 4.0;
				break;
			case 59:
			case 60:
			case 61:
			case 62:
				grade = 3.7;
				break;
			case 63:
			case 64:
			case 65:
			case 66:
				grade = 3.3;
				break;
			case 67:
			case 68:
			case 69:
			case 70:
				grade = 3.0;
				break;
			case 71:
			case 72:
			case 73:
				grade = 2.7;
				break;
			case 74:
			case 75:
			case 76:
				grade = 2.3;
				break;
			case 77:
			case 78:
			case 79:
			case 80:
				grade = 2.0;
				break;
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
				grade = 1.7;
				break;
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
				grade = 1.3;
				break;
			case 91:
			case 92:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
				grade = 1.0;
				break;
			default:
				break;
			}

			return grade;
		} else {
			return .0;
		}
	}
}