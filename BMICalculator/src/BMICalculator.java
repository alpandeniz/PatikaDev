import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		//BMI = Body Mass Index/Vücut Kitle İndeksi
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen kilonuzu giriniz: ");
		int kg = scanner.nextInt();
		System.out.print("Lütfen boyunuzu(Metre olarak) giriniz: ");
		double height = scanner.nextDouble();
		double BMI = kg / height * height;
		System.out.print("Vücut kitle indeksiniz: " + BMI);
	
	}

}
