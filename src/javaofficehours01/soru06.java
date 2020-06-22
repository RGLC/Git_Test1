package javaofficehours01;

import java.util.Scanner;

public class soru06 {

	public static void main(String[] args) {
		// Kullanýcýdan 5 basamanklý pozitif tam sayý alalým ve her rakanýný yazdýralým
 
		Scanner scan=new Scanner(System.in);
		System.out.println("Bes basamakli bir sayi giriniz=");
		int num=scan.nextInt();//This number is:abcde
		
		int e=num%10;
		int d=(num/10)%10;
		int c=(num/100)%10;
		int b=(num/1000)%10;
		int a=(num/10000)%10;
		System.out.println("Birler Basamagi:"+e);
		System.out.println("Onlar Basamagi:"+d);
		System.out.println("Yuzler Basamagi:"+c);
		System.out.println("Binler Basamagi:"+b);
		System.out.println("Onbinler Basamagi:"+a);
		
		}

}
