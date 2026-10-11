
public class KargoDagitim {

	public static void main(String[] args) {
		// Bu program bir kargo şirketinin, teslimatlarını belirlenen kriterlere göre takip etmesini sağlar. 

		int teslimatMesafesi=5;
		double temelÜcret=0.0;
		double toplamGelir=0.0;
		
		for (int teslimat=1; teslimat<=10; teslimat++) {
			
			
			if (teslimatMesafesi<=10) {
			temelÜcret=50.0;
			}
		
		
			else if (teslimatMesafesi>=11 && teslimatMesafesi<=30) {
			temelÜcret=80.0;
			}
		
		
			else if (teslimatMesafesi>=30) {
				temelÜcret=120.0;
			}
				
		
			if (teslimat%3==0) {
				temelÜcret=temelÜcret+20.0;
				}

			
			if (teslimatMesafesi>=40) {
				temelÜcret=temelÜcret-(temelÜcret*0.1);
			}
			
			
	System.out.println (teslimat + ". Teslimat - Mesafe:" + teslimatMesafesi + "km - Ücret:" + temelÜcret + "TL");	
		
	toplamGelir=toplamGelir + temelÜcret;
	teslimatMesafesi=teslimatMesafesi+5;
		
		}
	
	System.out.println("Toplam Gelir: " + toplamGelir + " TL");
	
	}

}
