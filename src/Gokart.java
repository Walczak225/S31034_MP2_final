import java.util.ArrayList;
import java.util.List;

public class Gokart {
    private String model;
    private double moc;
    private List<Wypozyczenie> wypozyczenia = new ArrayList<>();
    public Gokart(String model, double moc) {
        this.model = model;
        this.moc = moc;
    }

    public void addWypozyczenie(Wypozyczenie w) {
        if(!wypozyczenia.contains(w)){
            wypozyczenia.add(w);
        }
    }
    public List<Wypozyczenie> getWypozyczenie() {
        return wypozyczenia;
    }
    public String getModel() {
        return model;
    }
}