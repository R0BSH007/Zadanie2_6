import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe calkowita :] : ");
        int liczba = scanner.nextInt();

        boolean jestPierwsza = true;

        if (liczba < 2) {
            jestPierwsza = false;
        } else {
            for (int i = 2; i < liczba; i++) {
                if (liczba % i == 0) {
                    jestPierwsza = false;
                    break;
                }
            }
        }

        if (jestPierwsza) {
            System.out.println("Liczba " + liczba + " jest liczba pierwsza.");
        } else {
            System.out.println("Liczba " + liczba + " NIE jest liczba pierwsza.");
        }

        scanner.close();
    }
}