import java.util.Scanner;

public class OOPNakladniAuto {

    public static void main(String[] args) {

        NakladniAuto auto = new NakladniAuto();

        auto.nalozit(10000);
        auto.nalozit(500);
        auto.vylozit(300);
        auto.vylozit(1000);

        System.out.println("V nákladním autě je naloženo " + auto.naklad() + " kg");

    }
}
