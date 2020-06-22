package javaofficehours02;

import java.util.Scanner;

public class Soru06StringMethod1 {

	public static void main(String[] args) {
		// IndexOf Karakterin yerini belirler. Karakter sayýmý 0 dan baþlar.
		// istanbul kelimesindeki u harfini indexi nedir.

//				String str ="Istanbul";
//				System.out.println(str.indexOf('u'));

		// last IndexOf methodu aradýðýmýz karakterin string içindeki son görünümunun
		// indexini verir.

		String srt1 = "sarikayalar";
		System.out.println(srt1.lastIndexOf('a'));

		// lenght () String uzunluðunu verir. Saymaya 1 den baþlar.

		// Kullanýcýdan kelime alalým son harflerini yazdýralým.

//				Scanner sc= new Scanner (System.in);
//				System.out.println("Lütfen bir kelime giriniz.");
//				
//				String str = sc.next();
//				System.out.println(str.charAt(str.length()-1));

		// contains() string de aranan karakter var ise true yok ise false döner.

		String soz = "Java öðrenmek bizim iþimiz.";
		System.out.println(soz.contains("biz"));
		System.out.println(soz.contains("son"));

		// isEmpty stringde karakter var ise false yok ise true,

		String se = " ";
		System.out.println(se.isEmpty());

		// trim() methodu Stringin baþ ve sonundaki boþluklarý alýyor.

		String str3 = " ankara ";

		System.out.println(str3.trim());

		// startsWith () istenen harf ile baþlayýp baþlamadýðýn kontrol eder.
		// true yada false döner.

		String srt4 = "Can Ali";
		System.out.println(srt4.startsWith("A"));
		System.out.println(srt4.startsWith("C"));

		// substring methodu stringin belli bir bölümünü kesip almamýza yarar.

		String str4 = "istanbullular";

		System.out.println(str4.substring(4));
		System.out.println(str4.substring(4, 7)); // [4,7)
		// kullanýcýsan tek kelime alalým ve ilk harfi ile son harfini yerdeðiþtirelim.

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen tek  kelime giriniz.");
		String str5 = sc.next();

		char ilk = str5.charAt(0);
		char son = str5.charAt(str5.length() - 1);

		System.out.println(son + str5.substring(1, str5.length() - 1) + ilk);

		// concat() methodu concatination yapmamýzý saðlar. Yani stringleri birleþtirir

		String str6 = "ankara";
		String str7 = "van";
		System.out.println(str6.concat(str7));
		System.out.println(str6 + str7);
		// replace() String deki istenilen karekterin baþkabir karakter ile
		// deðiþtirmemizi saðlar.

		String str8 = "karete";
		System.out.println(str8.replace("a", "o"));

		// valueOf() 2 farklý kullanýmý var.
		// 1. String içindeki int karakterlere matematiksel iþlem yapmamýzý saðlar.

		String butce1 = "12000";
		String butce2 = "13000";
		System.out.println(Integer.valueOf(butce1) + Integer.valueOf(butce2));

		// 2. Ýnt içindeki karaterlere String özelliði katar.

		int yas1 = 12;
		int yas2 = 15;
		System.out.println(yas1 + yas2);
		System.out.println(String.valueOf(yas1) + String.valueOf(yas2));

	}

}
