package _02wrapperClasses;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		//Kullanici karenin bir kenar uzunlugunu girsin 
		//karenin cevresini ve alanini ekrana yazdiralim 

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karenin bir uzunlugunu giriniz");
		
		int longeurUncote = scan.nextInt();
		System.out.println(longeurUncote*4);
		System.out.println(longeurUncote*longeurUncote);
		
		scan.close();
		
	}

}
