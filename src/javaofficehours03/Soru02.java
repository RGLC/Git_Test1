package javaofficehours03;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
//		Girilecek kelimenin palindrom olup olmad���n� do�rulayacak bir Java Kodu yaz�n.
//   	kelimeyi tersten yazan  ve ilk hali ve son halini kar��la�t�ran java kodunu yaz�n�z.
//      madam ==> madam  12321 ==> 12321
		
		Scanner scan=new Scanner(System.in);
		  System.out.println("Metin Giriniz:");
		  String str = scan.nextLine();
		  
		  String ters="";
		  int count = str.length()-1;
		  for (; count>=0; count--) {
			ters = ters + str.charAt(count);
		}
		  
		if (str.equals(ters)) {
			System.out.println("palidrom");
		}else {
			System.out.println("palidrom degildir");
		}
	}

}







