package javaofficehours05;

public class _06ArrayTekrarli {

	public static void main(String[] args) {
//		 Bir Array icerisinde tekrarlanan elemani bulan java kodu yaziniz
		
		int [] arr= {1,2,3,3,4,5,5,6};
		int flag=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && (i!=j)) {
					System.out.println("Tekrarlanan eleman:"+arr[i]);//i'de olur j'de
					flag++;
				}
			}
		}
      if(flag==0) {
    	  System.out.println("Tekrarlanan eleman yoktur!");
      }
	}

}
