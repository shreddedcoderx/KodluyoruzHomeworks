import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
/*
        for (boolean run = true; run;) {
            System.out.print("Sayi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi < 0) {
                run = false;
            }
        }*/

        do {
            System.out.print("Sayi giriniz : ");
            sayi = scanner.nextInt();
        } while (sayi > 0);


    }
}