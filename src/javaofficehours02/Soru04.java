package javaofficehours02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// Kullan�dan al�nacak say�n�n negatif pozitif yada notr olup olmad���n� kontrol eden ternary yazal�m.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int num = scan.nextInt();
		
		String result= num<0 ? num+" negatif sayi":num>0 ? num+" pozitif sayi":num+" notr sayi";
		System.out.println(result);
	}

}
