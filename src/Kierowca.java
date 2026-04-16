public class Kierowca {
    private String imie;
    private Klub klub;

    public Kierowca(String imie) {
        this.imie = imie;
    }

    public void setKlub(Klub nowyKlub) {
        if (this.klub != nowyKlub) {
            if (this.klub != null) {
                Klub stary = this.klub;
                this.klub = null;
                stary.removeKierowca(this);
            }
            this.klub = nowyKlub;
            if (nowyKlub != null) {
                nowyKlub.addKierowca(this); // Nowe połączenie zwrotne [cite: 634]
            }
        }
    }
    public String getImie() {
        return imie;
    }
}