package Variables;

public class Variables01 {

	public static void main(String[] args) {
		int salaire = 3000;
		char lettre = 'S';

		System.out.println(salaire);
		System.out.println(lettre);

		boolean isOld = true; // pour les boolean tu peux juste utilise true or false
		System.out.println(isOld);

		byte profondeur = -128;
		System.out.println(profondeur);

		short populationMolsheim = 28000;
		System.out.println(populationMolsheim);

		long piecesOrganism = 1234567845645645646l; // Quand tu depasse la limit de int il faut mettre l a la fin
		System.out.println(piecesOrganism);

		double pi = 3.1434234023923409; // java accepte toutes les fractions décimales comme doubles.
		System.out.println(pi);

		float money = 5.25f; // Si vous voulez faire une fraction décimale décimale, nous devons mettre f ou
								// F à la fin
		System.out.println(money);

		String nomEtudiant = "Cevdet Tellioglu";
		System.out.println(nomEtudiant);
		
		
		//Veri Tipleri
		byte byteDeger = 4;
        short shortDeger = 7;
        int integerDeger = 234;
        long longDeger = 12332;

        float floatDeger = 34.5f;
        double doubleDeger = 345.2;

        char charDeger1 = 65;
        char charDeger2 = 'A';

        boolean dogruDeger = true;
        boolean yanlisDeger = false;

        System.out.println("Byte Değer: " + byteDeger);
        System.out.println("Short Değer: " + shortDeger);
        System.out.println("Integer Değer: " + integerDeger);
        System.out.println("Long Değer: " + longDeger);

        System.out.println("Float Deger: " + floatDeger);
        System.out.println("Double Deger: " + doubleDeger);

        System.out.println("Char Deger 1: " + charDeger1);
        System.out.println("Char Deger 2: " + charDeger2);

        System.out.println("Boolean Dogru: " + dogruDeger);
        System.out.println("Boolean Yanlis: " + yanlisDeger);


		/*
		 * BOOLEAN: Java mantıksal değerlerini saklamak için boolean veri tipi
		 * kullanılmaktadır. Boolean veri tipi true ve false olmak üzere iki farklı
		 * değer alabilmektedir. boolean veri tipi genellikle koşul belirtirken veya bir
		 * döngüde kullanılabilir. Kod geliştirirken boolean anahtar kelimesi ile
		 * tanımlama yapılır.
		 */

		boolean booleanDogru = true;
		System.out.println(booleanDogru);
		boolean booleanYanlis = false;
		System.out.println(booleanYanlis);

		/*
		 * Tam Sayılar Reel Sayılar Karakterler Mantıksal Değerler byte float char
		 * boolean short double integer long Java Veri Tipleri ve Değişkenler ‘in
		 * detaylı anlatımlarına geçmeden önce genel olarak bir değişkenin nasıl
		 * tanımlandığını göstermeye çalışalım. MainClass.javaJava veriTipi değişkenAdi
		 * = değişkenDeğeri; 1 veriTipi değişkenAdi = değişkenDeğeri; Veri tipleri
		 * yukarıdaki tabloda gördüğünüz byte, short, int, long, float, double, char
		 * veya boolean olabilir. Değişken adı tamamen geliştiriciye kalmış değişkene
		 * verilen isimdir.
		 */

		/*
		 * BYTE: byte en küçük tam sayı tipidir. Büyüklüğü 8 bit tir ve -128 ile +127
		 * arası değer alır. Kod geliştirirken byte anahtar kelimesi ile tanımlama
		 * yapılır.|
		 */

		byte byteDeger1 = 45;
		System.out.println(byteDeger1);

		/*
		 * Yukarıda görmüş olduğunuz kod satırında byte veri tipiyle değeri 45 olan
		 * “byteDeger” değişken adıyla bir tanımlama yapılmıştır. Yukarıda tanımlanan
		 * byteDeger değişkenine -128’den küçük veya +127’den büyük bir değer
		 * tanımlandığı takdirde geliştirme anında hata ile karşılaşılacaktır.
		 * 
		 */

		/*
		 * CHAR: Java da karakterler char veri tipi içinde saklanır. C/C++ gibi yazılım
		 * dillerinde char veri tipi 8 bitlik büyüklüğe sahipken, Java’da 16 bitlik
		 * büyüklüğe sahiptir. Bunun sebebi Java’nın Unicode karakter setini kullanıyor
		 * olmasıdır. Ayrıca Java ASCII kod yapısını da desteklemektedir. Kod
		 * geliştirirken char anahtar kelimesi ile tanımlama yapılır.
		 */

		char charDeger11 = 65;
		System.out.println(charDeger11);
		char charDeger21 = 'A';
		System.out.println(charDeger21);

		// Yukarıda tanımlanan değişkenlerin ikisi de A karakterini belirtmektedir.

		/*
		 * DOUBLE: double veri tipi 64 bitlik büyüklüğe sahiptir ve 4.9×10^-324 ile
		 * 1.8×10^308 arasında bir değer tanımlanabilir. Kod geliştirirken double
		 * anahtar kelimesi ile tanımlama yapılır.
		 */

		double doubleDeger1 = 34.5;
		System.out.println(doubleDeger1);

		/*
		 * FLOAT: float veri tipi 32 bitlik büyüklüğe sahiptir ve 1.4×10^-45 ile
		 * 3.4×10^38 aralığında bir değer tanımlanabilir. float olarak belirlenmiş olan
		 * veri tipine integer bir değer atandığı takdirde java tarafından direk olarak
		 * 1.0 şeklinde algılanır. Geliştirme aşamasında hata oluşmaz. Fakat float veri
		 * tanımlarken (.) noktadan sonra değişken değerinin sonuna “f” veya “F”
		 * koyulmadığı takdirde geliştirme esnasında hata alınacaktır. Sebebi ise
		 * javanın bu değişkeni double olarak algılayacak olmasıdır. Aşağıdaki
		 * örneklerle konuya biraz daha açıklık getirmeye çalışalım.
		 */

		float floatDeger1 = 35.4f; // dogru tanim
		System.out.println(floatDeger1);
		float floatDeger2 = 4.5F; // dogru tanim
		System.out.println(floatDeger2);
		float floatDeger3 = 67; // dogru tanim
		System.out.println(floatDeger3);
		// float floatDeger4 = 45.0; //hatali tanim
		// float floatDeger5 = 34.65; //hatali tanim

		/*
		 * float veri tipinin sonuna “f” veya “F” koyulmadığında Java bu tanımlamadaki
		 * veri tipini double olarak algılayacağı için geliştirme anında hata
		 * verecektir. Kod geliştirirken float anahtar kelimesi ile tanımlama yapılır.
		 */

		/*
		 * INTEGER: En çok kullanılan veri tipidir. 32 bitlik veri tipi, -2.147.483.648
		 * ile 2.147.483.647 arasında bir değer alabilir. Kod geliştirirken int anahtar
		 * kelimesi ile tanımlama yapılır.
		 */

		int integerDeger1 = 75;
		System.out.println(integerDeger1);

		/*
		 * Yukarıda görmüş olduğunuz kod satırında integer veri tipiyle değeri 75 olan,
		 * “integerDeger” değişken adıyla bir tanımlama yapılmıştır. Eğer yukarıda
		 * belirttiğimiz değer aralığından daha küçük veya daha büyük bir tanımlama
		 * yapılırsa geliştirme anında hata ile karşılaşılır.
		 */
		
		   /*
        LONG: En büyük tam sayı değeridir. 64 bitlik büyüklüğe sahiptir
        ve -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasında
        bir değer alabilir. Kod geliştirirken long anahtar kelimesi ile
        tanımlama yapılır. Integer veri tipinin yetersiz olduğu durumlarda
        kullanılabilir. Bu duruma en güzel örnek ise bilimsel hesaplamalar
        veya Türkiye Cumhuriyeti Vatandaşlık Numarası tanımlamaları verilebilir.
         */

        long longDeger1 =234;
        System.out.println(longDeger1);

        /*
        Elbetteki bu tipleri sahip oldukları değer aralıklarına göre kullanmak
         çok mantıklı olmayacaktır. Bunun yerine tecrübe ettikçe hangi işlem
         için hangi veri tipi kullanılır rahatlıkla karar verebilirsiniz.
          Örneğin programda kullanıcının yaşıyla işlem yapacaksanız
          int veya bir dosyadaki verileri okuyacaksanız byte veri tipini
          kullanmanız en mantıklı yöntem olacaktır.
         */
        
        /*
        SHORT: Büyüklüğü 16 bit olan short veri tipi -32768 ile
         +32767 arasında bir değer alabilir. Kod geliştirirken
         short anahtar kelimesi ile tanımlama yapılır.
         */
        short shortDeger1 =64;

        /*
        Yukarıda görmüş olduğunuz kod satırında short veri tipiyle değeri
        64 olan “shortDeger” değişken adıyla bir tanımlama yapılmıştır.
        Eğer değer olarak -32769 veya 32678 verseydik geliştirme anında
         hata ile karşılaşacaktık.
         */

	}

}