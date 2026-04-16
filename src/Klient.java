import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private List<Wypozyczenie> wypozyczenia = new ArrayList<>();

    public Klient(String imie) {
        this.imie = imie;
    }
    public void addWypozyczenie(Wypozyczenie w) {
        if (!wypozyczenia.contains(w)) {
            wypozyczenia.add(w);
        }
    }
    public List<Wypozyczenie> getWypozyczenie() {
        return  wypozyczenia;
    }

    public String getImie() {
        return imie;
    }
}