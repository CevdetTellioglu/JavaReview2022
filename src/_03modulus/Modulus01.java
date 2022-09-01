package _03modulus;

import java.util.Scanner;

public class Modulus01 {
	public static void main(String[] args) {
		// 12835 sayisinin 23 e bolumunden kalani bulan program yaziniz.

		int sayi = 12835;
		int sayi2 = 23;

		System.out.println(sayi % sayi2); // Hard Coding: Code'un icinde dogrudan sayi kullanmaya denir.

		//// kullainicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
		//// veren program yazniniz.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int no1 = scan.nextInt();
		int onlar = no1 % 10;
		int binler = no1 / 1000;

		System.out.println(onlar + binler);

		// kullanicidan 3 basamakli bir tamsayi alin bu sayinin butun rakamlari
		// toplamini bulun

		System.out.println("3 basamakli bir tam sayi girin");

		int s = scan.nextInt();

		int sonRakam = s % 10;

		int v = s / 10;
		int ortaRakam = v % 10;

		int ilkRakam = s / 100; // 3 basamakli sayilarin ilk rakamini bulmak icin sayi 100 e bolunur
								// 4 basamakli sayilarin ilk rakamini bulmak icin sayi 1000 e bolunur vs....

		System.out.println(sonRakam + ortaRakam + ilkRakam);

		// Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
		// bulunuz
		// Kullanicinin girdigi 4 basamakli sayinin tum rakamlari toplamini bulunuz.

		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int no0 = scan.nextInt();

		int birlerBas = no0 % 10;
		int onlarBas = (no0 / 10) % 10;
		int yuzlerBas = (no0 / 100) % 10;
		int binlerBas = no0 / 1000;

		System.out.println("Ilk ve son rakamlari toplami = " + (birlerBas + binlerBas));
		System.out.println("Tum rakamlari toplami = " + (birlerBas + onlarBas + yuzlerBas + binlerBas));

		System.out.println(8.0 / 2);
		System.out.println(8 / 2.0);
		System.out.println(8.0 / 2.0);

		// Kullanicidan int aldiktan sonra String alamiyoruz.

		

		// java'da nextInt() kullandiktan sonra nextLine() kullanirsak kod calismiyor
		// nextInt() yerine nextLine() kullan sonra elde ettigin String'i
		// Integer.parseInt() kullanarak integer'a cevir.

		System.out.println("Yasinizi giriniz");
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas); // String'i tamsayiya cevirme metodu
												// Integer.parsenInt() sadece rakam iceren Stringler icin calisir.

		System.out.println(yeniYas);

		System.out.println("Adinizi ve soyadinizi giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		//Iki tane variable"in degerlerini yer degistiriniz.
		// sayi1 = 12, sayi2 = 30 ==> sayi1 = 30, say2=12 (Bu isleme swap denir)
	
	

		
		System.out.println("Yerlerini degistirmek icin iki sayi giriniz;");
		
		double sayiA = scan.nextDouble();
		double sayiB = scan.nextDouble();
		
		// 1.yol
		
		System.out.println("Yer degistirmeden once;");
		System.out.println(sayiA);
		System.out.println(sayiB);
	
		double gecici = 0.0;
		gecici = sayiA;
		sayiA = sayiB;
		sayiB = gecici;
		
		System.out.println("Yer degistirdikten sonra:");
		System.out.println(sayiA);
		System.out.println(sayiB);
		System.out.println(gecici);
		
		// 2.yol
		
		System.out.println("Yer degistirmek icin 2 sayi daha giriniz;");
		
		double sayiC = scan.nextDouble();
		double sayiD = scan.nextDouble();
		
		sayiC = sayiC + sayiD;
		sayiD = sayiC - sayiD;
		sayiC = sayiC - sayiD;
		
		
		System.out.println(sayiC);
		System.out.println(sayiD);
		

		scan.close();

	}
}
