import java.util.Scanner;

public class CircleCalculator {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int r = scanner.nextInt();
	System.out.print("Dairenin yarı çapını giriniz: ");
	double pi = 3.14;
	double alan = pi * r * r;
	double cevre = 2* pi * r;
	System.out.print("Dairenin alanı: " + alan);
	System.out.print("Dairenin çevresi: " + cevre);
	}
}
