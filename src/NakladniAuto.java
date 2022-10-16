public class NakladniAuto {
    public int nosnost = 3000;
    public int vaha = 0;

    public void nalozit(int naklad) {
        if(naklad <= nosnost) {
            vaha += naklad;
        }
    }

    public void vylozit(int naklad) {
        if(naklad <= vaha) {
            vaha -= naklad;
        }
    }

    public int naklad() {
        return vaha;
    }
}
