package javaofficehours01;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {			
//	    Kullan�c�dan 3 tane pozitif tam say� alal�m. bu say�larla ��gen olup olamayaca��n�
//	    kontrol edelim. ��gen ise e�it kenar ��gen mi?
//				a+b>c>a-b     1
//				a+c>b>a-c     1
//				b+c>a>b-c     1
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kenar uzunlugu giriniz:");
		int a=scan.nextInt();
		System.out.println("Bir kenar uzunlugu giriniz:");
		int b=scan.nextInt();
		System.out.println("Bir kenar uzunlugu giriniz:");
		int c=scan.nextInt();
		
		int count=0;
		if(a+b>c && c>a-b) {
			count++;
			if(count>0 && a==b && b==c) {
				System.out.println("Eskenar Ucgen");
			}else {
				System.out.println("Eskenar Ucgen Degil");
			}
		}else {
			System.out.println("Boyle bir ucgen cizilemezzz");
		}
		
		
	scan.close();	
	}

}
