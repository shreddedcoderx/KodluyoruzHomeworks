import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pass = 123;
        int enteredPass;
        boolean isPasswordSuccess = false;
        Scanner scanner = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.print("Şifrenizi girin: ");
            enteredPass = scanner.nextInt();
            if (enteredPass == pass) {
                isPasswordSuccess = true;
                System.out.println("Şifre doğru.Giriş yapıldı.");

            } else {
                System.out.println("Şifre Yanlış.Farklı bir şifre deneyin.");
            }
        }

        scanner.close();
    }
}