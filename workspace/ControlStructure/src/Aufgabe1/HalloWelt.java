package aufgabe1;

/**
 * Class HalloWelt only contains a main-method and prints a hello-world-example in two different
 * ways into the console.
 * 
 * @author Ahmed Ebrahim Aldekal, 3357598, aldekalahmed@gmail.com
 * @author Marco Scheffel, 3331983, uni@topmas.de
 * @author Fatih Yokus, 3321155, fatih.yokus@gmx.de
 *
 */

public class HalloWelt {
	
	/**
	 * main method to print "Hallo Welt!<br>Java ist auch eine Insel." in two different ways with
	 * the same result into the console. 	 * First time it will be printed directly, second time
	 * by using variables.
	 * 

	 * 
	 */
	public static void main(String[] args) {
		
		/* exercise 1a */
		System.out.println("Hallo Welt!");
		System.out.println("Java ist auch eine Insel.");
		
		/* exercise 1b */
		String hallo = "Hallo Welt!";
		String java = "Java ist auch eine Insel.";
		System.out.print(hallo + "\n" + java);
	}

}
