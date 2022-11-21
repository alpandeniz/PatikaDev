import java.util.Scanner;

public class KdvCalculator {

	public static void main(String[] args) {
	
	double price,kdvTutar,newPrice, KDV;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Lütfen fiyatı giriniz: ");
	price = scanner.nextDouble();
	

		if(price <= 1000 && price >= 1) {
			 KDV = 0.18;
			 kdvTutar = price * KDV;
			 System.out.println("Alınan vergi: " + kdvTutar);
			 newPrice = kdvTutar + price;
			 System.out.println("KDV dahil fiyat: " + newPrice);
			 System.out.println("KDV oranı: " + KDV);
		}else if (price > 1000) {
			KDV = 0.08;
			 kdvTutar = price * KDV;
			 System.out.println("Alınan vergi: " + kdvTutar);
			 newPrice = kdvTutar + price;
			 System.out.println("KDV dahil fiyat: " + newPrice);
			 System.out.println("KDV oranı: " + KDV);
		}if(price == 0) {
				System.out.println("Hiçbir şey ücretsiz değildir! :(");
		}
		
	}
	
	
}





