package javaofficehours03;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
// Kullan�c�dan al�nan Stringin son karakterini silip ekrana yazan Java kodunu yaz�n�z.
			
			Scanner sc= new Scanner(System.in);
			System.out.println("L�tfen kelime giriniz");
			String str =sc.nextLine();

			System.out.println(str.substring(0,str.length()-1));
			
	}

}
