import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		int km, age, oneWay, roundTrip, select;
		double price, discountPrice,doublePrice,noDiscount;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Yaşınızı giriniz: ");
		age = scanner.nextInt();
		System.out.print("Gideceğiniz mesafeyi giriniz: ");
		km = scanner.nextInt();
		price = (km * 0.10);
		System.out.print("=> 1-)Tek Yön\n=> 2-)Gidiş-Dönüş");
		select = scanner.nextInt();
		if (select == 1 && age >= 1 && age <=100 && km>=1) {
			System.out.println("Teşekkürler! Tek yönü seçtiniz.");
			if (age < 12) {
				discountPrice = price - ((price * 50) / 100);
				System.out.println("Ödeyeceğiniz indirimli tutar: " + discountPrice + " TL - " + "İndirimsiz tutar: " + price + "TL");

			} else if (age >= 12 && age <= 24) {
				discountPrice = price - ((price * 10) / 100);
				System.out.println("Ödeyeceğiniz indirimli tutar: " + discountPrice + " TL - " + "İndirimsiz tutar: " + price + "TL");

			}else if(age >=65 && age <= 100) {
				discountPrice = price - ((price * 30) / 100);
				System.out.println("Ödeyeceğiniz indirimli tutar: " + discountPrice + " TL - " + "İndirimsiz tutar: " + price + "TL");
			}else {
				System.out.println(" Ödeyeceğiniz tutar: "+ price);
			}
		
		}

		
		
		
		
		
		
		else if (select == 2 && age >= 1 && age <=100&& km>=1) {
			doublePrice = (price*2);
			noDiscount = price * 2;
			//discountForDoublePrice = doublePrice - (doublePrice * 20) / 100;
			System.out.println("Teşekkürler!Gidiş-Dönüş yönü seçtiniz.");
			
			if (age < 12) {
				doublePrice = doublePrice - ((doublePrice * 70) / 100);
				System.out.println("Ödeyeceğiniz indirimli tutar: " + doublePrice + " TL - " + "İndirimsiz tutar: " + noDiscount + "TL");

			} else if (age >= 12 && age <= 24) {
				doublePrice = doublePrice - ((doublePrice * 30) / 100);
				System.out.println("Ödeyeceğiniz indirimli tutar: " + doublePrice + " TL - " + "İndirimsiz tutar: " + noDiscount + "TL");

			}else if(age >=65 && age <= 100) {
				doublePrice = doublePrice - ((doublePrice * 50) / 100);
				System.out.println("Ödeyeceğiniz indirimli tutar: " + doublePrice + " TL - " + "İndirimsiz tutar: " + noDiscount + "TL");
			}else { noDiscount = doublePrice - (doublePrice*20) /100;
				System.out.println(" Ödeyeceğiniz tutar(%20 indirim yapılmıştır.): "+ noDiscount);
			}
			
	
			
			
			
		} else {
			System.out.print("Hata!");
		}

	}
}
