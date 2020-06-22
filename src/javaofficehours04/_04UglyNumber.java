package javaofficehours04;

import java.util.Scanner;

public class _04UglyNumber {

	public static void main(String[] args) {
		//Girilen bir sayýnýn  ugly number olup olmadýðýný 
		// kontrol etmek için bir Java programý yazýn.
		//Sayý sisteminde,  ugly number  sadece asal faktörleri
		// 2, 3 veya 5 olan pozitif sayýlardýr. 
		//Ýlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. 
		// Kural olarak, 1 dahil.
		
		Scanner sc = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int n =sc.nextInt();
        
        if(n<=0) {
        	System.out.println("Sifirdan buyuk bir sayi giriniz:");
                 }
        
        int flag=0;
        while(n!=0) {
        	if(n%5==0)
        		 n/=5;
        	else if(n%3==0) 
        	     n/=3;
            else if(n%2==0) 
        	     n/=2;
            else 
        	     flag=1;
        	break;
             }
        if(flag==0) {
        	System.out.println("Ugly Sayidir");
        }else {
        	System.out.println("Ugly Sayi Degildir");
        }
        	
	}

}
