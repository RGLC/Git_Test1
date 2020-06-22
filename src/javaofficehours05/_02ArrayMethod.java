package javaofficehours05;

import java.util.Arrays;
import java.util.Scanner;

public class _02ArrayMethod {

	public static void main(String[] args) {
//      Bir String array method oluþturalým ve array
//	    elemanlarýnýn her birine istediðimiz eki ekleyebilelim.
//	    String [] arr ={"clever", "meek", "hurried", "nice"};  "ly";
		
		
		String [] arr ={"clever", "meek", "hurried", "nice"};
		String ek="ly";
		System.out.println(Arrays.toString(sonEk(arr,ek)));
	        }

	public static String[] sonEk(String[] arr,String ek) {
		
		String [] newarr= new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			newarr[i]=arr[i]+ek;
		      }
		return newarr;
		
	}

}
