import java.util.HashMap;
import java.util.Map;

public class Wyscig {
    private String nazwa;
    private Map<Integer, UczestnikWyscigu> uczestnicy = new HashMap<>();
    public Wyscig(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajUczestnika(int nr, UczestnikWyscigu u) throws Exception{
        if (uczestnicy.containsKey(nr)) {
            throw new Exception(" Numer Startowy " + nr + " jest zajęty");
        }
        uczestnicy.put(nr, u);
        u.setWyscig(this);
    }

    public UczestnikWyscigu znajdzUczestnika(int nr) throws Exception {
        if (!uczestnicy.containsKey(nr)) throw new Exception("Brak uczestnika o nr: " + nr);
        return uczestnicy.get(nr);
    }

    public Map<Integer, UczestnikWyscigu> getUczestnicy() {
        return uczestnicy;
    }
    public String getNazwa() {
        return nazwa;
    }
}