import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userName, password;
		System.out.print("Kullanıcı adınızı giriniz: ");
		userName = scanner.nextLine();
		System.out.print("Şifrenizi giriniz: ");
		password = scanner.nextLine();
		if (userName.equals("Patika") && password.equals("Dev")) {
			System.out.println("Sisteme giriş yaptınız.");

		} else {
			System.out.println("Kullanıcı adı veya şifre yanlış!");
		}

	}
}
