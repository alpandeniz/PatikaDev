import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen gitmek istediğiniz mesafeyi KM olarak giriniz: ");
		int distance = scanner.nextInt();

		double payment = 10 + (distance * 2.20);
		/*if (payment < 20) {
			System.out.println("Kısa mesafe ücreti 20TL.");
		} else {
			System.out.println("Ödenecek tutar: " + payment);
		}*/ 
		//    YADA
		payment = (payment < 20) ? 20 : payment;
		System.out.println("Ödenecek tutar: " + payment);
	}

}
