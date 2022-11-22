import java.util.Scanner;

public class EventForYou {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int temperature;
System.out.print("Lütfen hava sıcaklığını giriniz: ");
temperature= scanner.nextInt();
if( temperature < 5 ) {
	System.out.println(" Bu havada kayak yapabilir ya da evde oturup sıcak bir kahve içebilirsiniz, lakin dışarısı çok soğuk :)");
}else if(temperature <=5 && temperature <15) {
	System.out.println("Sinemeya gidebilir ya da evde ders çalışabilirsiniz.(2. seçenek çabuk elenecektir :)) )");
	
}else if(temperature >=15 && temperature <=25) {
	System.out.println("Hadi bakalım pikniğe!");
}else if(temperature <25) {
	System.out.println("Yüzmeye gidebilirsin! Ama ben olsam klimanın yanından ayrılmazdım.");
}

	}

}
