package _04OperatorsDecrement_Increment_Concatenation;

public class Concatenation {

	public static void main(String[] args) {
		System.out.println("Ali" + "Can");
		System.out.println("Ali " + "Can");
		System.out.println("Ali" + " Can");
		System.out.println("Ali" + " " + "Can");

		System.out.println(3 + "4");// En az birisi String ise, toplama degil concatenation yapilir ==> 34
		// Concatenation islemini sonucu String tipindedir
		System.out.println("3" + 4 + 5);// 345
		System.out.println("3" + (4 + 5));// 39
		System.out.println(3 + 4 + "5");// 75
		System.out.println(3 + 4 + "5" + 6);// 756
		System.out.println(2 * 3 + "4" + 6 / 2);// 643
		System.out.println("2*3" + 4 + 5);

		// DECREMENT

		// int data tipinde bir variable olusturun
		// bu varible in degerini 3 yontemi de kullanarak her defasinda bir azaltin

		int num1 = 12;
		num1 = num1 - 1;
		num1 -= 1;
		num1--;

		System.out.println(num1);

		// INCREMENT

		// int data tipindde iki variable olustur
		// birinci 3, ikinciyi 7 artirin

		int sayi1 = 12;
		System.out.println(sayi1);

		sayi1 = sayi1 + 3;
		System.out.println(sayi1);

		int sayi2 = 20;
		sayi2 = sayi2 + 7;
		System.out.println(sayi2);

		// int data type'inda iki tane variable olusturun.
		// Birinicyi 3, ikinciyi 7 artirin.
		// Kisa yol kullanin.

		int sayi10 = 12;
		sayi10 += 3; // increment ==> II> Yol kisa yol
						// + ile = arasina bosluk birakmayin
		System.out.println(sayi10);// 15

		int sayi20 = 20;
		sayi20 = sayi20 + 7;// 20+7=27
		sayi20 += 7;// 27+7=34
		System.out.println(sayi20);// 34

		int numA = 2;
		int numB = 3;
		String str1 = "Cok";
		String str2 = "Çalış";

		// Aşağıdaki çıktıları ekrana yazdırmak icin program yazınız.
		// A) Çok Çalış B) 5 Çok C) Çalış23 D) Çok1

		System.out.println("A = " + str1 + " " + str2);
		System.out.println("B = " + (numA + numB) + " " + str1);
		System.out.println("C = " + str2 + numA + numB);
		System.out.println("D = " + str1 + (numB - numA));

		int numc = 4;
		int numd = 5;
		String strr = "Ali";
		System.out.println(numc + numd + strr);
		
		
		//OperatorSign

		boolean b1 = 12 == 20;

		System.out.println(b1);
		System.out.println(12 < 20);
		System.out.println(12 != 20);
		System.out.println(12 >= 20);
		System.out.println(12 <= 20);

	}

}
