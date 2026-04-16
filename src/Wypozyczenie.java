public class Wypozyczenie {
    private double cenaOkrazenia;
    private int iloscOkrazen;
    private Klient klient;
    private Gokart gokart;

    public Wypozyczenie(Klient k, Gokart g, double cenaOkrazenia, int iloscOkrazen) {
        this.klient = k;
        this.gokart = g;
        this.cenaOkrazenia = cenaOkrazenia;
        this.iloscOkrazen = iloscOkrazen;
        k.addWypozyczenie(this);
        g.addWypozyczenie(this);
    }

    public double kosztWypozyczenia(){
        double koszt = iloscOkrazen * cenaOkrazenia;
        return koszt;
    }
}