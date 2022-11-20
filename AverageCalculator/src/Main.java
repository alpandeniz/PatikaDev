import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int gecerNot = 55;
		int Matematik, Kimya, Fizik, Tarih, Turkce, Muzik;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Matematik notunuz: ");
		Matematik  = scanner.nextInt();
		
	 	/*if(Matematik < gecerNot) {
			System.out.println("Matematik dersinden kaldınız. Notunuz: " + Matematik);
		}*/
		System.out.print("Kimya notunuz: ");
		Kimya = scanner.nextInt();
		/*if(Kimya < gecerNot) {
			System.out.println("Kimya dersinden kaldınız. Notunuz: " + Kimya);
		}*/
		System.out.print("Fizik notunuz: ");
		Fizik = scanner.nextInt();
		/*if(Fizik < gecerNot) {
			System.out.println("Fizik dersinden kaldınız. Notunuz: " + Fizik);
		}*/
		System.out.print("Tarih notunuz: ");
		Tarih = scanner.nextInt();
		/*if(Tarih < gecerNot) {
			System.out.println("Tarih dersinden kaldınız. Notunuz: " + Tarih);
		}*/
		System.out.print("Türkçe notunuz: ");
		Turkce = scanner.nextInt();
		/*if(Turkce < gecerNot) {
			System.out.println("Türkçe dersinden kaldınız. Notunuz: " + Turkce);
		}*/
		System.out.print("Müzik notunuz: ");
		Muzik = scanner.nextInt();
		/*if(Muzik < gecerNot) {
			System.out.println("Muzik dersinden kaldınız. Notunuz: " + Muzik);
		}*/
		
		int toplam = (Matematik + Fizik  + Kimya + Turkce + Muzik + Tarih);
		double average = toplam / 6.0;
		/*if(average <= 64.9) {
			System.out.println("Kaldınız! Ortalamanız: " + average);
		}else {
		System.out.println("Tebrikler, geçtiniz! Ortalamanız: " + average);}*/
		
		
		System.out.println("Ortalamanız: " + average);
		String sonuc = average > 60 ? "Geçtiniz!" : "Kaldınız ! ";
		System.out.println(sonuc);
			
		
		}
		
		
		
	}


