package javaofficehours05;

public class _05ArrayOrtalama {

	public static void main(String[] args) {
//		Array listesinin ortalamasini bulan java kodu yaziniz
		
		int[] nums= {20,30,25,32,-15,11}; 
        System.out.println(ortalama(nums));
	}
 
	public static double ortalama(int[] nums) {
		
		double sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		double ortalama = sum/6;
		return ortalama;
	}
}
