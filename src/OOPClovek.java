public class OOPClovek {
    public static void main(String[] args) {
        Clovek clovek = new Clovek();

        clovek.jmeno = "Karel Novák";
        clovek.vek = 33;
        clovek.pritel = "Josef Nový";

        clovek.predstaveni();

        Clovek clovek1 = new Clovek();

        clovek1.jmeno = "Josef Nový";
        clovek1.vek = 27;
        clovek1.pritel = "Karel Novák";

        clovek1.predstaveni();
    }
}
