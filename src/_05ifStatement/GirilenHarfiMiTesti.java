package _05ifStatement;

import java.util.Scanner;

public class GirilenHarfiMiTesti {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf”
		 * yazdırın. Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Karakter Giriniz");

		String harf = scan.next();

		if (harf.equalsIgnoreCase("a") || harf.equalsIgnoreCase("b") || harf.equalsIgnoreCase("c")
				|| harf.equalsIgnoreCase("ç") || harf.equalsIgnoreCase("d") || harf.equalsIgnoreCase("e")
				|| harf.equalsIgnoreCase("f") || harf.equalsIgnoreCase("g") || harf.equalsIgnoreCase("ğ")
				|| harf.equalsIgnoreCase("h") || harf.equalsIgnoreCase("ı") || harf.equalsIgnoreCase("i")
				|| harf.equalsIgnoreCase("j") || harf.equalsIgnoreCase("k") || harf.equalsIgnoreCase("l")
				|| harf.equalsIgnoreCase("m") || harf.equalsIgnoreCase("n") || harf.equalsIgnoreCase("o")
				|| harf.equalsIgnoreCase("ö") || harf.equalsIgnoreCase("p") || harf.equalsIgnoreCase("q")
				|| harf.equalsIgnoreCase("r") || harf.equalsIgnoreCase("s") || harf.equalsIgnoreCase("ş")
				|| harf.equalsIgnoreCase("t") || harf.equalsIgnoreCase("u") || harf.equalsIgnoreCase("ü")
				|| harf.equalsIgnoreCase("v") || harf.equalsIgnoreCase("w") || harf.equalsIgnoreCase("x")
				|| harf.equalsIgnoreCase("y") || harf.equalsIgnoreCase("z")) {
			System.out.println(harf + " = Harf");

		} else {
			System.out.println(harf + " = Harf degil");
		}

	}

}
