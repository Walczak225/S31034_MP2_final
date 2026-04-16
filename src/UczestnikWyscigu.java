public class UczestnikWyscigu {
    private String imie;
    private Wyscig wyscig;
    public UczestnikWyscigu(String imie) {
        this.imie = imie;
    }

    public void setWyscig(Wyscig w) {
        this.wyscig = w;
    }
    public String getImie() {
        return imie;
    }
}