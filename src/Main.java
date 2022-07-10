import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass;
        boolean askPass = true;


        do {
            System.out.print("Lütfen şifre giriniz: ");
            pass = scanner.nextInt();
            if (pass == 123){
                askPass = false;
                System.out.println("Şifre doğru.");
            } else {
                System.out.println("Şifre yanlış.");
            }
        } while (askPass);


    }
}