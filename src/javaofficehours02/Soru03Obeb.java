package javaofficehours02;

import java.util.Scanner;

public class Soru03Obeb {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi isteyin bu sayilarin obeb'ini buldurun
		Scanner sc=new Scanner(System.in);

		System.out.println("L�tfen 1. pozitif tam say� giriniz.");

		int num1= sc.nextInt();
		System.out.println("L�tfen 2. pozitif tam say� giriniz.");
		int num2 = sc.nextInt();

		int obeb=0;
		for (int i = 1; i <=num1 && i<=num2; i++) {
			
			if(num1%i==0 && num2%i==0) {
				obeb=i;
			}
			
		}System.out.println(num1 + " ve " + num2 + " ortak b�leni: " + obeb);
	}

}




