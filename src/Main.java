import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int left = 100, right = 200;

        while (++left < --right);

        System.out.println("Left : " + left);
        System.out.println("Right : " + right);
    }
}