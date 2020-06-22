package javaofficehours05;

import java.util.Scanner;

public class _01KelimeSayisi {

	public static void main(String[] args) {
		//Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden 
		//oluştuğunu dönen java methodu yazınız.  
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir String Giriniz:");
		String str=scan.nextLine();
		
		
		System.out.println();
		System.out.println(say(str));
		
	}
	
	public static int say(String str) {
		String str1[]=str.split(" ");
		return str1.length;
	}
}
//   2.yolllllllll nazmi bey yapti
//System.out.println("Metindeki kelime sayısı: " +kelimeSayisi(str));
//​
//   }
//   public static  int kelimeSayisi(String str){
//       int count=0;
//       for (int i=0;i<str.length();i++){
//           if(str.charAt(i)==' '){
//               count++;
//           }
//       }
//       count=count +1;
//       return count;
