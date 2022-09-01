package _05ifStatement;

import java.util.Scanner;

public class IfElseIFStatement {

	public static void main(String[] args) {

		// Kullanicidan yasini alin
		// yas 13 den az ise ekrana "Calisamaz" yazdirin
		// yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
		// yas 65 den buyuk ise ekrana "Emekli" yazdirin
		// Negatif sayi girerse "yas negatif olamaz" desin.

		// BOUNDRY ANALYSE \\

		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");

		int age = scan.nextInt();
		if (age < 0) {
			System.out.println("Yas negatif olamaz");
		} else if (age < 13) {
			System.out.println("Calisamaz");
		} else if (age <= 65 && age >= 13) {
			System.out.println("Calisabilir");
		} else {
			System.out.println("Emekli");
		}
		// Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		// Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		// 0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		// 50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		// 80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin

		System.out.println("Lutfen sinav notunu giriniz : ");

		int note = scan.nextInt();

		if (note < 0) {
			System.out.println("Yanlis deger girdiniz");
		} else if (note > +0 && note < 50) {
			System.out.println("Kaldiniz");
		} else if (note >= 50 && note < 80) {
			System.out.println("Gectiniz");
		} else if (note >= 80 && note <= 100) {
			System.out.println("Tebrikler");
		} else {
			System.out.println("Yanlis deger girdiniz");
		}

		// Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir.
		// Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 bir
		// jackpot oyunu icin program yaziniz
		// 000000 - 000001 -000002 - ..... - 999998-999999-100000

		System.out.println("6 Basamakli bir sayi giriniz 0 basta olabilir");
		int num = scan.nextInt();

		if (num < 200000) {
			System.out.println("KAZANDINIZ");
		} else if (num < 500000) {
			System.out.println("AMORTI- TEKRAR DENEYINIZ");
		} else {
			System.out.println("KAYBETTINIZ");
		}

		scan.close();

	}

}
