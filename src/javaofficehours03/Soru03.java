package javaofficehours03;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		//Girilen iki String veriyi kar��la�t�ran Java kodu yaz�n�z.
		//	ayn� ise True farkl� ise false return etsin
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Bir Metin Giriniz:");
		  String str1 = scan.nextLine();
		  
		  System.out.println("Bir Metin daha Giriniz:");
		  String str2 = scan.nextLine();
		  
		  System.out.println(str1.contains(str2));//daha kisa
//		  if(str1.equals(str2)) {
//			  System.out.println(true);
//		  }else {
//			  System.out.println(false);
//		  }
	}

}
