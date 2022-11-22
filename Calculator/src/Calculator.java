import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int select,conclusion;
	System.out.print("İlk sayıyı giriniz: ");
	int value = scanner.nextInt();
	System.out.print("İkinci sayıyı giriniz: ");
	int value1 = scanner.nextInt();
	
	System.out.println("1-Toplama\n2-Çıkarma\n3-Çarma\n4-Bölme");
	System.out.print("Seçiminiz: ");
	select = scanner.nextInt();
	if(value==0&&select==4) {
		System.out.println("Bu sayı sıfıra bölünemez!");
	}else if(value1==0&&select==4) {
		System.out.println("Bu sayı sıfıra bölünemez!");
	}else {
	switch(select) {
	case 1:
		System.out.println(conclusion = value+value1);
		System.out.println("Sonuç: " +conclusion);
		break;
	case 2:
		System.out.println(conclusion = value-value1);
		System.out.println("Sonuç: " +conclusion);
		break;
	case 3:
		System.out.println( conclusion= value*value1);
		System.out.println("Sonuç: " +conclusion);
		break;
	case 4:
	
		System.out.println(conclusion= value/value1);
		System.out.println("Sonuç: " +conclusion);
		
		break;
	default:
		System.out.println("Geçersiz seçenek.");
	}
	}
		
}
}
