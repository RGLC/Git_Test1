package javaofficehours05;

import java.util.Arrays;

public class _03ArrayMatematik {

	public static void main(String[] args) {
//	Array elemanlarının matematiğe göre tersini yapan java kodunu yazınız.
//  1,2,3,-4,5===>-1,-2,-3,4,-5
		
		int[] arr = {1,2,3,-4,5};
		System.out.println(Arrays.toString(zitti(arr)));

	}
     public static int[] zitti(int[] arr) {
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=arr[i]*(-1);
          }
     return arr;
   
     }
     
}
