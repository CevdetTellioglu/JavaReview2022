package _05ifStatement;

import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		// password dogru ise ekrana “Password dogru” yazdirin
		// password yanlis ise ekrana “Password yanlis tekrar deneyin” yazdirin
		// Dogru password = Java2022

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen password girin ");

		String password = scan.next();

		// Stringlerin esitligini kontrol ederken
		// asla "==" kullanmayin
		// Onun yerine
		// "equals()" kullanin

		// "==" String'in degerini ve adresini kontrol eder
		// "equals()" method ise sadece degerleri kontrol eder.

		if (password.equals("Java2022")) {
			System.out.println("Password Dogru");
		} else {
			System.out.println("password Yanlis tekrar deneyiniz ");
		}

		//
		// Kullanicidan bir tamsayi isteyin ve o tamsayinin
		// mutlak degerini ekrana yazdirin
		// mutlak deger bir sayinin kendi isareti ile carpilmasi demektir
		// Ornek: -3 un mutlak degeri: -1.-3 = 3
		// Ornek: +5 in mutlak degeri: +1.+5 = 5
		// 0 in mutlak degeri sifirdir

		System.out.println("lutfen bir tam sayi giriniz : ");
		int num1 = scan.nextInt();

		if (num1 > 0) {
			System.out.println(num1 + " Pozitif sayinin mutlak degeri " + num1 * 1);
		} else {
			System.out.println(num1 + " Negatif sayinin mutlak degeri " + num1 * -1);

		}
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin

		System.out.println("Lutfen satin alacaginiz urun fiyatini giriniz");
		double price = scan.nextDouble();
		System.out.println("Lutfen satin alacaginiz urun adedini giriniz");
		double pcs = scan.nextDouble();

		if (pcs >= 1000) {
			System.out.println("%20 indirimden sonra toplam odeme tutariniz " + (pcs * (price * 80) / 100) + "Euro");
		} else {
			System.out.println("Odeme tutari :" + (price * pcs) + "Euro");
		}
		scan.close();
	}

}
