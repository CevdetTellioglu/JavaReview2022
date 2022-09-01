package _02wrapperClasses;

import java.util.Scanner;

public class Wrapper02 {
	public static void main(String[] args) {
		// Kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz/
		// (String kullaniniz)

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen adinizi ve soyadinizi giriniz");

		String isim = scan.nextLine(); // next() veya nextLine kullanirsiniz strinleri almak icin
										// next() tek kelimelik Stringler icin kullanilir
										// nextLine() girilen tum String i almak icin kullanilir
		System.out.println(isim);

		System.out.println("Lutfen soyadinizi giriniz");

		String soyisim = scan.nextLine();

		System.out.println(isim);
		System.out.println(soyisim);

		// Kullanicidan ad ve soyadini alalim ekrana yazdiralim
		// Kullanicidan adresini alalim ekrana yazdiralim (2.cadde bakirkoy istanbul
		// Turkiye)
		// Kullanicidan yasini alalim ekrana yazdiralim
		// Kullaniciya "Turkiye'de yasiyorum. Dogru/Yanlis" diye soralim cevabini ekrana
		// yazdiralim.

		System.out.println("Lutfen adinizi  ve soyadinizi giriniz");
		String adSoyad = scan.nextLine();

		System.out.println("Lutfen adresinizi giriniz");
		String adres = scan.nextLine();

		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();

		System.out.println("Turkiye'de yasiyorum. dogru/yanlis");
		boolean konum = scan.nextBoolean();

		System.out.println("Isim soysim = " + adSoyad);
		System.out.println("Adres =" + adres);
		System.out.println("yas = " + yas);
		System.out.println("Turkiye'de mi? = " + konum);

		int num1 = 5 / 2;
		System.out.println(num1);

		float num2 = 5f / 2f;
		System.out.println(num2);

		double num3 = 5d / 2d;
		System.out.println(num3);

		int num4 = 5 / 3;
		System.out.println(num4);

		float num5 = 5f / 3f;
		System.out.println(num5);

		double num6 = 5d / 3d;
		System.out.println(num6);

		// Niçin hata veriyor?
		// Bu hatayı iki farklı yolla çözünüz.

		/*
		 * public static void main(String[] args) {
		 * 
		 * float num1 = 3.23 ; double num2 = 3.23 ;
		 * 
		 */

		float num10 = 3.23f;
		double num20 = (double) num10;

		System.out.println(num10);

		System.out.println(num20);

		// double 100.235 i int’e çevirip ekrana yazdiriniz.

		double num11 = 100.235;
		int num12 = (int) num11;

		System.out.println(num12);

		// int data type’ında oluşturulan 5 sayısı ile double data type’ında
		// oluşturulan 6.2 sayısını toplayıp sonucu ekrana yazdırınız.

		int numx = 5;
		double numy = 6.2;
		double numz = (double) numx;

		System.out.println(numy + numz);

		scan.close();
	}

}
