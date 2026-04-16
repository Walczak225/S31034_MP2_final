public class Sektor {
    private String nazwa;
    private Tor tor;

    private Sektor(Tor t, String n) {
        this.tor = t;
        this.nazwa = n;
    }

    public static Sektor stworz(Tor t, String n) throws Exception {
        if (t == null) throw new Exception("Część nie może istnieć bez całości!");
        return new Sektor(t, n);
    }

    public String getNazwa() {
        return nazwa;
    }
    public Tor getTor() {
        return tor;
    }
}