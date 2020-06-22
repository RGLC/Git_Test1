package javaofficehours04;

import java.util.Scanner;

public class _03SayininTersi {

	public static void main(String[] args) {
		// Girilen sayinin tersini return eden java metodunu yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz:");
		int num= scan.nextInt();
		System.out.println(sayininTersi(num));//4321
	     }
	public static int sayininTersi(int num) {
		
		int tersi=0;
		while(num>0) {
			int kalan = num%10;
			num = num /10;
			tersi = tersi*10+kalan;
		       }
	 return tersi;
   	}
}
