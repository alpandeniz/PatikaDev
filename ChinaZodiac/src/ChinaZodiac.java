import java.util.Scanner;

public class ChinaZodiac {public static void main(String[] args) {
	double yearOfBirth, calculate;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Doğum yılınızı giriniz: ");
	yearOfBirth = scanner.nextDouble();
	calculate = (yearOfBirth%12);
	if(calculate == 0 ) {
		System.out.println("Çin zodyağı burcun: Maymun ");
	}else if(calculate == 1 ) {
		System.out.println("Çin zodyağı burcun: Horoz ");
	}else if(calculate == 2 ) {
		System.out.println("Çin zodyağı burcun: Köpek ");
	}else if(calculate == 3 ) {
		System.out.println("Çin zodyağı burcun: Domuz ");
	}else if(calculate == 4 ) {
		System.out.println("Çin zodyağı burcun: Fare");
	}else if(calculate == 5 ) {
		System.out.println("Çin zodyağı burcun: Öküz ");
	}else if(calculate == 6 ) {
		System.out.println("Çin zodyağı burcun: Kaplan ");
	}else if(calculate == 7 ) {
		System.out.println("Çin zodyağı burcun: Tavşan ");
	}else if(calculate == 8 ) {
		System.out.println("Çin zodyağı burcun: Ejderha ");
	}else if(calculate == 9 ) {
		System.out.println("Çin zodyağı burcun: Yılan ");
	}else if(calculate == 10 ) {
		System.out.println("Çin zodyağı burcun: At ");
	}else if(calculate == 11 ) {
		System.out.println("Çin zodyağı burcun: Koyun ");
	}else {System.out.println("Hata.");}
	
	
}

}
