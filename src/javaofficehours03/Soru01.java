package javaofficehours03;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
//       1. Girilen String de�eri tersten yazan Java kodunu yaz�n�z.
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Metin Giriniz:");
		  String str = scan.nextLine();
		  
		  StringBuilder strB = new StringBuilder(str);
		  System.out.println(strB.reverse());

	}

}
//                 2.YOLLL
//		Scanner sc=new Scanner(System.in);
//		System.out.println("L�tfen kelime giriniz.");
//		String str =sc.nextLine();
//		
//		int countStr =str.length();
//		
//		while (countStr>0) {
//			System.out.print(str.charAt(countStr-1));
//			
//			countStr--;
//		}
