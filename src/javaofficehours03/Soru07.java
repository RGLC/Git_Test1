package javaofficehours03;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
// Kullanýcýdan alýnan Stringin son karakterini silip ekrana yazan Java kodunu yazýnýz.
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Lütfen kelime giriniz");
			String str =sc.nextLine();

			System.out.println(str.substring(0,str.length()-1));
			
	}

}
