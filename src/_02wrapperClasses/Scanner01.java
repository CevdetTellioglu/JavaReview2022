package _02wrapperClasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// Kullainici iki tam sayi versin
		// Program bu tamsayilarin toplaminin ve carpimini ekrana yazdirsin.

		Scanner scan = new Scanner(System.in); // import Scanner Class
		System.out.println("Entrez 2 numero svp : ");

		int nombre1 = scan.nextInt();
		int nombre2 = scan.nextInt();

		System.out.println(nombre1 + nombre2);
		System.out.println(nombre1 * nombre2);

		scan.close();
	}

}
