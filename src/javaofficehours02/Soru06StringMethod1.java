package javaofficehours02;

import java.util.Scanner;

public class Soru06StringMethod1 {

	public static void main(String[] args) {
		// IndexOf Karakterin yerini belirler. Karakter say�m� 0 dan ba�lar.
		// istanbul kelimesindeki u harfini indexi nedir.

//				String str ="Istanbul";
//				System.out.println(str.indexOf('u'));

		// last IndexOf methodu arad���m�z karakterin string i�indeki son g�r�n�munun
		// indexini verir.

		String srt1 = "sarikayalar";
		System.out.println(srt1.lastIndexOf('a'));

		// lenght () String uzunlu�unu verir. Saymaya 1 den ba�lar.

		// Kullan�c�dan kelime alal�m son harflerini yazd�ral�m.

//				Scanner sc= new Scanner (System.in);
//				System.out.println("L�tfen bir kelime giriniz.");
//				
//				String str = sc.next();
//				System.out.println(str.charAt(str.length()-1));

		// contains() string de aranan karakter var ise true yok ise false d�ner.

		String soz = "Java ��renmek bizim i�imiz.";
		System.out.println(soz.contains("biz"));
		System.out.println(soz.contains("son"));

		// isEmpty stringde karakter var ise false yok ise true,

		String se = " ";
		System.out.println(se.isEmpty());

		// trim() methodu Stringin ba� ve sonundaki bo�luklar� al�yor.

		String str3 = " ankara ";

		System.out.println(str3.trim());

		// startsWith () istenen harf ile ba�lay�p ba�lamad���n kontrol eder.
		// true yada false d�ner.

		String srt4 = "Can Ali";
		System.out.println(srt4.startsWith("A"));
		System.out.println(srt4.startsWith("C"));

		// substring methodu stringin belli bir b�l�m�n� kesip almam�za yarar.

		String str4 = "istanbullular";

		System.out.println(str4.substring(4));
		System.out.println(str4.substring(4, 7)); // [4,7)
		// kullan�c�san tek kelime alal�m ve ilk harfi ile son harfini yerde�i�tirelim.

		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen tek  kelime giriniz.");
		String str5 = sc.next();

		char ilk = str5.charAt(0);
		char son = str5.charAt(str5.length() - 1);

		System.out.println(son + str5.substring(1, str5.length() - 1) + ilk);

		// concat() methodu concatination yapmam�z� sa�lar. Yani stringleri birle�tirir

		String str6 = "ankara";
		String str7 = "van";
		System.out.println(str6.concat(str7));
		System.out.println(str6 + str7);
		// replace() String deki istenilen karekterin ba�kabir karakter ile
		// de�i�tirmemizi sa�lar.

		String str8 = "karete";
		System.out.println(str8.replace("a", "o"));

		// valueOf() 2 farkl� kullan�m� var.
		// 1. String i�indeki int karakterlere matematiksel i�lem yapmam�z� sa�lar.

		String butce1 = "12000";
		String butce2 = "13000";
		System.out.println(Integer.valueOf(butce1) + Integer.valueOf(butce2));

		// 2. �nt i�indeki karaterlere String �zelli�i katar.

		int yas1 = 12;
		int yas2 = 15;
		System.out.println(yas1 + yas2);
		System.out.println(String.valueOf(yas1) + String.valueOf(yas2));

	}

}
