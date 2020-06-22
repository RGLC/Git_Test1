package javaofficehours02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// Kullanýdan alýnacak sayýnýn negatif pozitif yada notr olup olmadýðýný kontrol eden ternary yazalým.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int num = scan.nextInt();
		
		String result= num<0 ? num+" negatif sayi":num>0 ? num+" pozitif sayi":num+" notr sayi";
		System.out.println(result);
	}

}
