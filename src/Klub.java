import java.util.ArrayList;
import java.util.List;

public class Klub {
    private String nazwa;
    private List<Kierowca> czlonkowie = new ArrayList<>();

    public Klub(String nazwa) {
        this.nazwa = nazwa;
    }

    public void addKierowca(Kierowca k) {
        if (!czlonkowie.contains(k)) {
            czlonkowie.add(k);
            k.setKlub(this);
        }
    }

    public void removeKierowca(Kierowca k) {
        if (czlonkowie.contains(k)) {
            czlonkowie.remove(k);
            k.setKlub(null);
        }
    }

    public  String getNazwa() {
        return nazwa;
    }

    public List<Kierowca> getCzlonkowie() {
        return czlonkowie;
    }

}