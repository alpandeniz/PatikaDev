import java.util.Scanner;

public class Greengrocer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double kg;
		double pear=2.14, apple=3.67, tomato=1.11, banana=0.95, aubergine=5;
		System.out.println("Toplam fiyatı öğrenmek için istediğiniz ürünlerin kilolarını giriniz.");
		System.out.print("Armut : " );
		kg = scanner.nextDouble();
		double pearTotal = kg * pear;
		System.out.print("Elma : " );
		kg = scanner.nextDouble();
		double appleTotal = kg * apple;
		System.out.print("Muz : " );
		kg = scanner.nextDouble();
		double bananaTotal = kg * banana;
		System.out.print("Patlıcan : " );
		kg = scanner.nextDouble();
		double aubergineTotal = kg * aubergine;
		System.out.print("Domates : " );
		kg = scanner.nextDouble();
		double tomatoTotal = kg * tomato;
		double total = tomatoTotal+ bananaTotal + appleTotal + pearTotal + aubergineTotal; 
		System.out.println("Ödeyeceğiniz tutar: " + total);
	}

}
