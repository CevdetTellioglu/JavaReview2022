package _05ifStatement;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {

		if (3 > 2) {

			System.out.println("if body calisti");

		}
		System.out.println("if body disi calismadi");

		// bir int variable olusturun ve ona bir deger atayin
		// eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
		// eger atadiginz deger negatif ise ekrana negatif yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		int num1 = scan.nextInt();
		if (num1 > 0) {
			System.out.println("Pozitif bir sayi girildi = " + num1);
			if (num1 < 0)
				System.out.println("Negatif bir sayi girildi = " + num1);
			if (num1 == 0)
				System.out.println("Notr bir sayi girildi = " + num1);

		}

		// bir char variable olusturun bir buyuk harf deger atayin
		// eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o
		// gunleri yazdirin
		// Eger atanan deger haftanin gunlerinden birisi degilse
		// ekrana "Boyle bir gun yok" yazdirin.

		char day = 'C';

		if (day == 'P') {
			System.out.println("Gunler = Pazar, Pazartesi, Persembe");
		}
		if (day == 'C') {
			System.out.println("Gunler = Carsamba, Cuma, Cumartesi");
		}
		if (day == 'S') {
			System.out.println("Gun = Sali");

		}
		// "P" olmamak VEYA "C" olmamak "S" olmamak ==> VEYA islemi icin ||
		// VEYA isleminden True sonu alabilmek icin bir tanesinin True olmasi yeterlidir
		// True || True = True
		// True || False = True
		// Fasle || False = False
		// VEYA Islemi toplama yapmaya benzer true eger 1 ise hep 1 olur

		// "P" olmamak VE "C" olmamak "S" olmamak ==> VE islemi icin &&
		// VE isleminden True sonucu alabilmek icin tum conditionlar true olmalidir
		// True && True = True
		// True && False = False
		// False && False = False
		// VE islemi carpmaya benzer True eger 1 ise T&&T=t olur diger her durumda F
		// olur

		if (day != 'P' && day != 'C' && day != 'S') {
			System.out.println("Boyle bir gun yok");
		}

		// Bir tane String variable olusturun ve bir gun ismini kucuk harflerle deger
		// olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana “hafta ici” yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana “hafta sonu” yazdirin.

		String day1 = "carsamba";

		if (day1.equals("pazartesi") || day1.equals("sali") || day1.equals("carsamba") || day1.equals("persembe")
				|| day1.equals("cuma")) {
			System.out.println(day1 + " bir haftaici gunudur.");
		}
		if (day1.equals("cumartesi") || day1.equals("pazar")) {
			System.out.println(day1 + " hafta sonu gunudur.");
		}

		// kullanicidan bir dikdortgenin en ve boyunu alin
		// en ve boy esit ise bu bir karedir yazdir
		// en ve boy farkli ise bu bir dikdortgendri yazdir

		System.out.println("Lutfen iki sayi giriniz");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();

		if (en == boy) {
			System.out.println("bu bir karedir");

		}
		if (en != boy) {
			System.out.println("Bu bir dikdortgendir");
		}

		// else ==> diger ihtimallerin tamami demek
		// en ile boy ya esittir ya degildir..

		if (en == boy) {
			System.out.println("Bu bir karedir");
		} else {
			System.out.println("Bu bir dikdortgendir");

		}
		scan.close();

	}

}
