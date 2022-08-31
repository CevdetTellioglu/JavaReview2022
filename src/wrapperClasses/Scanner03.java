package wrapperClasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir sayi giriniz ");

		int aKup = scan.nextInt();
		System.out.println(aKup * aKup * aKup);

		// --------
		/*
		 * Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve
		 * cevresini hesaplayıp ekrana yazdıran bir program yazınız. Not: Alan: Boy x En
		 * Not: Çevre: 2x (Boy + En)
		 * 
		 */

		System.out.println("Uzun ve Kisa kenari giriniz");

		int uzunKenar = scan.nextInt();
		int kisaKenar = scan.nextInt();

		System.out.println("Dikdortgen alan.." + uzunKenar * kisaKenar);
		System.out.println("Dikdorgen cevre.. " + 2 * (uzunKenar + kisaKenar));

		/*
		 * Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan bir
		 * program yazınız. (float kullanınız) Not 1: pi sayısı: 3.14159 Not 2: Alan:
		 * 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius
		 */

		System.out.println("Lutfen Yaricapi giriniz");

		double radius = scan.nextDouble();
		double piSayisi = 3.14159;

		System.out.println("Dairenin alani = " + piSayisi * radius * radius);
		System.out.println("Dairenin cevresi = " + 2 * piSayisi * radius);

		/*
		 * Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini
		 * hesaplayan bir program yazınız. Not: Dikdörtgenler Prizmasının Hacmi: En x
		 * Boy x Yükseklik
		 */

		System.out.println("dikdortgen icin en boy ve yukseklik giriniz");

		int enDikdortgen = scan.nextInt();
		int boyDikdortgen = scan.nextInt();
		int hDikdortgen = scan.nextInt();

		System.out.println("Dikdortenin alani = " + enDikdortgen * boyDikdortgen * hDikdortgen);
		/*
		 * Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan bir
		 * program yazınız. (float kullanınız) Not 1: pi sayısı: 3.14159 Not 2: Alan:
		 * 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius
		 */

		System.out.println("Dairenin yari capini giriniz");

		double pi = 3.14159;

		float radius1 = scan.nextFloat();

		System.out.println("Daire'nin alani = " + pi * radius1 * radius1);
		System.out.println("Daire'nin cevresi = " + 2 * pi * radius1);
		/*
		 * Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir
		 * Program yazınız. (byte kullanınız) Not 1: Üçgenin Cevresi: a + b + c
		 */

		System.out.println("Ucgenin a kenar uzunlugunu giriniz.");
		byte kenar1 = scan.nextByte();

		System.out.println("Ucgenin b kenar uzunlugunu giriniz.");
		byte kenar2 = scan.nextByte();

		System.out.println("Ucgenin c kenar uzunlugunu giriniz.");
		byte kenar3 = scan.nextByte();

		System.out.println("Ucgenin cevresi = " + (kenar1 + kenar2 + kenar3));
		// Mil’i kilometreye çeviren bir program yazınız. (double kullanınız) Not 1: km
		// = mile x 1.6

		System.out.println("Km ye cevirmek istediginiz mil uzunlugu:");

		int mil = scan.nextInt();

		System.out.println((mil * 1.6) + " km eder.");

		// Saati saniyeye çeviren bir program yazınız. (long kullanınız) Not 1: Saniye =
		// Saat x 60 x 60

		System.out.print("Saniyesini bulmak istediginiz saat'i giriniz : ");

		long saat = scan.nextLong();

		System.out.println((saat * 60 * 60) + " kadar saniye eder.");

		scan.close();
		//test

	}
}
