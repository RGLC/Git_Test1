package javaofficehours04;

import java.util.Scanner;

public class _01DortIslem {
	public static void main(String[] args) {
		// Kullanýcýdan iki sayý girmesini ve ardýndan iþlem seçmesi istenecek.
		// Tüm iþlemler methodlarda yapýlacak.
		// toplama , çýkartma, çarpma ve bölme

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen birinci sayiyi giriniz:");
		double a = scan.nextDouble();
		System.out.println("Lutfen ikinci sayiyi giriniz:");
		double b = scan.nextDouble();
		System.out.println("Lutfen dort islemden birini seciniz:topla,cikar,carp,bol");
		String sec = scan.next().toLowerCase();//Burada ne

		islem(sec, a, b);
		scan.close();

	}

	public static void islem(String sec, double a, double b) {

		switch (sec) {
		case "topla":
			topla(a, b);
			break;
		case "cikar":
			cikar(a, b);
			break;
		case "carp":
			carp(a, b);
			break;
		case "bol":
			bol(a, b);
			break;
		default:
			System.out.println("Yanlis islem yapildi");
		}

	}

	public static void topla(double a, double b) {
		System.out.println(a + b);
	}

	public static void cikar(double a, double b) {
		System.out.println(a - b);
	}

	public static void carp(double a, double b) {
		System.out.println(a * b);
	}

	public static void bol(double a, double b) {
		System.out.println(a / b);
	}

}
