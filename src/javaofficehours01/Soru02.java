package javaofficehours01;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		// Kullanýcadan 2 sayý alalým ve bu sayýlarýn dört iþlem sonucudu ekrana yazdýralým.
		
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Lütfen 2 sayý giriniz.");
				
				double num1=sc.nextDouble();
				double num2=sc.nextDouble();
				
				double toplama=num1+num2;
				
				System.out.println("toplama: " + toplama);
				
				double cikartma = num1-num2;
				System.out.println("çýkatma:" + cikartma);
				
				double carpma =num1*num2;
				System.out.println("çarpma: " + carpma);
				
				double bolme=num1/num2;
				
				System.out.println("bölme: " + bolme);
	}

}
