package javaofficehours05;

import java.util.Arrays;

public class _04ArrayMethod {

	public static void main(String[] args) {
		//Array i�erisindeki tek say�lar� 1 art�r�p �ift say�lar� 1 azaltan 
		//java methodu yazal�m

		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(donusum(arr)));
		
	}
	public static int[] donusum(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				arr[i]-=1;
			}else {
				arr[i]+=1;
			}
		}
		return arr;
		
	}

}
