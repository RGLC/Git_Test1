package javaofficehours02;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
//		 Kullanýcýdan bir harf isteyelim ve bunun büyük harf küçük harf ya da
//		hatalý gibi olma durumunu ternary ile kontrol edelim.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz:");
		
		char ch=scan.next().charAt(0);
		
		String result = ch>='a'  && ch<='z' ? "kucuk harf" : ch>='A' && ch<='Z'?
				"BUYUK Harf" : "Hatali giris";
		System.out.println(result);
		
		

	}

}
