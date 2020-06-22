package javaofficehours01;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
//		 Kullanýcadan 5 basamaklý tam sayý alalým ve bu sayýnýn baþtan 2 ve sonda 2 rakamlarýn
//		 basamak deðeri ile toplama sonucunu yazdýralým.  12345 => 12045
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bes basamakli bir sayi giriniz:");//abcde olsun
		int num=scan.nextInt();
		
		int e=num%10;
		int d=(num/10)%10;
		int c=(num/100)%10;
		int b=(num/1000)%10;
		int a=(num/10000)%10;
		System.out.println(""+a+b+0+d+e);
		
//		int ilkIki=num/1000;
//		System.out.println(ilkIki);
//		ilkIki=ilkIki*1000;
//		
//		
//		int sonIki= num%100;
//		System.out.println(sonIki);
//		
//		int sum = ilkIki + sonIki;
//		
//		System.out.println("Toplam:" +sum);

	}

}
