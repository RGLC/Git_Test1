package javaofficehours02;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		//Kullac�dan ya��n� ve kilosunu alal�m.
		//18 ya��ndan k���k ise kan ba��si yapamas�n.
		//18 ya��ndan b�y�k ve 50 kilodan zay�f ise kan ba���� yapamas�n
		//18 ya��ndan b�y�k ve 50 kilodan fazla ise kan ba���� yapabilsin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yas Giriniz:");
		int yas = scan.nextInt();
		System.out.println("Kilo Giriniz:");
		int kilo = scan.nextInt();
		
		if (yas<18) {
			System.out.println("Kan Bagisi yapamazsiniz");
			}else {
				if(kilo<50) {
					System.out.println("Kan Bagisi yapamazsiniz");
				}else {
					System.out.println("Kan Bagisi yapabilirsiniz");
				}
			}
		
//		2.YOL Ternary==>	
//		String result=yas<18 ? "Kan Bagisi yapamazsiniz":kilo<50 ? 
//				"Kan Bagisi yapamazsiniz":"Kan Bagisi yapabilirsiniz";
//		System.out.println(result);

	}

}
