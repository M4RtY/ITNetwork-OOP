import java.util.Scanner;

public class OOPKalkulacka {

    public static void main(String[] args) {

        Kalkulacka kalkulacka = new Kalkulacka();
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Zadej 1. číslo:");
        kalkulacka.cislo1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Zadej 2. číslo:");
        kalkulacka.cislo2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Součet: " + kalkulacka.soucet());
        System.out.println("Rozdíl: " + kalkulacka.rozdil());
        System.out.println("Součin: " + kalkulacka.soucin());
        System.out.println("Podíl: " + kalkulacka.podil());

    }
}
