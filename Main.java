import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz kto piecze ciasto: 1 - Babcia, 2 - Dziadek");
        int wyborPiekarza = scanner.nextInt();

        System.out.println("Wybierz rodzaj ciasta: 1 - Szarlotka, 2 - Ciasto śliwkowe");
        int wyborCiasta = scanner.nextInt();

        Ciasto ciasto;
        if (wyborCiasta == 1) {
            ciasto = new Szarlotka();
            System.out.println("Wybierz sposób przygotowania jabłek: 1 - Kostka, 2 - Ćwiartki");
            int wyborJablka = scanner.nextInt();

            if (wyborJablka == 1) {
                ciasto.setAlgorytmJablko(new Kostka());
            } else {
                ciasto.setAlgorytmJablko(new Cwiartki());
            }
        } else {
            ciasto = new CiastoSliwkowe();
            System.out.println("Wybierz sposób przygotowania śliwek: 1 - Zmiksowane, 2 - Połówki");
            int wyborSliwki = scanner.nextInt();

            if (wyborSliwki == 1) {
                ciasto.setAlgorytmSliwka(new Zmiksowane());
            } else {
                ciasto.setAlgorytmSliwka(new Polowki());
            }
        }

        if (wyborPiekarza == 1) {
            new PieczeBabcia().pieczCiasto(ciasto);
        } else {
            new PieczeDziadek().pieczCiasto(ciasto);
        }

        scanner.close();
    }
}
