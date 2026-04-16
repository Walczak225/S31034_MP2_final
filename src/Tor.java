import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tor {
    private String nazwa;
    private List<Sektor> sektory = new ArrayList<>();
    private static Set<Sektor> wszystkieSektory = new HashSet<>();

    public Tor(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajSektor(String nazwaSektora) throws Exception {
        Sektor s = Sektor.stworz(this, nazwaSektora);
        if (wszystkieSektory.contains(s)) throw new Exception("Sektor jest już współdzielony!");
        sektory.add(s);
        wszystkieSektory.add(s);
    }

    public void usunTor(){
        for (Sektor s : sektory) {
            wszystkieSektory.remove(s);
        }
        sektory.clear();
    }

    public String getNazwa() {
        return nazwa;
    }

    public List<Sektor> getSektory() {
        return sektory;
    }

    public Set<Sektor> getWszystkieSektory() {
        return wszystkieSektory;
    }


}