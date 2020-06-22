package javaofficehours03;

public class Soru05SaatDakika {

	public static void main(String[] args) {
		
		//Saat ve Dakika girdigimizde bize saniye return eden methodu yaziniz
		System.out.println(saniyeDonusturucu(1,30));
	}
    
	public static int saniyeDonusturucu(int hours, int minutes) {
		
		int seconds = (hours*60*60)+(minutes*60);
		return seconds;
		
	}
}
