
public class TravelCostCalculator {

	public static void main(String[] args) {
		
		/* Bu program, verileri baştan hazır verilmiş bir seyahat için aşağıdaki hesapları yapar; 
			1-Tüketilecek toplam yakıt
			2-Toplam yakıt maliyeti
			3-Otoyol ücreti dahil toplam yolculuk maliyeti
			4-Kişi başına düşen yolculuk maliyeti
		ve tüm sonuçları ekrana yazdırır.*/ 
		
	//Başlangıç Değerleri//
	final int DISTANCE=450;
	final double CONSUMPTION_PER_100_KM=7.5;
	final double FUEL_PRICE=52;
	final double HIGHWAY_FEE=250;
	final int NUMBER_OF_PEOPLE=3;
	
		double totalFuelConsumption=(DISTANCE*CONSUMPTION_PER_100_KM)/100;
		double fuelCost=totalFuelConsumption*FUEL_PRICE;
		double totalTravelCost=fuelCost+HIGHWAY_FEE;
		double costPerPerson=totalTravelCost/NUMBER_OF_PEOPLE;
	
	System.out.println("Total Fuel Consumption:" + totalFuelConsumption + "lt");
	System.out.println("Fuel Cost:" + fuelCost + "TL");
	System.out.println("Total Travel Cost:" + totalTravelCost + "TL");	
	System.out.println("Cost Per Person:" + costPerPerson + "TL");
		
		
	}

}
