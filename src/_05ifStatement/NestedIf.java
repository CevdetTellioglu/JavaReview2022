package _05ifStatement;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {

		// kullanicidan bir sayi alin
		// Bu sayi pozitif ise 9 dan buyuk mu diye kontrol edin, 9 dan buyukse ekrana
		// "Sayi" yazdirin
		// 9 dan kucuk esit ve 0'dan buyuk ise ekrana "Rakam" yazdirin
		// bu sayi negatif ise ekrana "sayi" yazdirin/

		Scanner scan = new Scanner(System.in);
		System.out.print("Bir tam sayi giriniz : ");

		int num = scan.nextInt();
		if (num >=0) {
			if (num >= 9) {
				System.out.println(num + " Sayi");
			} else if (num <= 9 && num >= 0) {
				System.out.println(num + " Rakam");
			}
		} else if (num < 0) {
			System.out.println(num + "Sayi");
		}

	}

}
