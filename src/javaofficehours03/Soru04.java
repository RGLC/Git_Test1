package javaofficehours03;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
// Girilen String de�er i�inde istenen s�radaki karakteri bulan Java kodunu yaz�n�z.

               Scanner scan = new Scanner(System.in);
               System.out.println("Kelime Giriniz");
               String str = scan.nextLine();
               System.out.println("index Giriniz");
               int in = scan.nextInt();
               
               System.out.println(str.charAt(in));
	}
}
