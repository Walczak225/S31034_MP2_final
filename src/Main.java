void main() {
    // Testowanie asocjacji z atrybutem
    Klient klient1 = new Klient("Adam");
    Klient klient2 = new Klient("Antek");

    Gokart gokart1 = new Gokart("Sodi RTX2", 8);
    Gokart gokart2 = new Gokart("SRCW GT2", 12);
    Gokart gokart3 = new Gokart("CWC GT1", 6);

    Wypozyczenie wypozyczenieAdam1 = new Wypozyczenie(klient1, gokart1, 70, 5);
    Wypozyczenie wypozyczenieAdam2 = new Wypozyczenie(klient1, gokart2, 50, 5);
    Wypozyczenie wypozyczenie2 = new Wypozyczenie(klient2, gokart3, 80, 6);

    System.out.println("Kosz wypozyczenia 1 dla klienta " + klient1.getImie() + " wynosi: " + wypozyczenieAdam1.kosztWypozyczenia() + " zl");
    System.out.println("Liczba wypożyczeń w systemie dla klienta " + klient1.getImie() + " wynosi: " + klient1.getWypozyczenie().size());
    System.out.println();
    System.out.println("Kosz wypozyczenia dla klienta " + klient2.getImie() + " wynosi: " + wypozyczenie2.kosztWypozyczenia() + " zl");
    System.out.println("Liczba wypożyczeń w systemie dla klienta " + klient2.getImie() + " wynosi: " + klient2.getWypozyczenie().size());

    // Testowanie asocjacji zwykłej
    Klub RCW = new Klub("RCW");
    Klub RCL = new Klub("RCL");

    Kierowca kierowca1 = new Kierowca("Robert");
    Kierowca kierowca2 = new Kierowca("Adam");

    RCW.addKierowca(kierowca1);
    RCL.addKierowca(kierowca2);

    System.out.println("\nKlub A po dodaniu: " + RCW.getCzlonkowie().size());
    System.out.println("Klub B po dodaniu: " + RCL.getCzlonkowie().size());
    RCL.addKierowca(kierowca1);
    System.out.println("Po przeniesieniu do klubu: " + RCL.getNazwa() + " kierowcy: " + kierowca1.getImie());
    System.out.println("Klub A po przeniesieniu: " + RCW.getCzlonkowie().size());
    System.out.println("Klub B po przeniesieniu: " + RCL.getCzlonkowie().size());

    // Asocjacja kwalifikowana
    UczestnikWyscigu uczestnik1 = new UczestnikWyscigu("Adam");
    UczestnikWyscigu uczestnik2 = new UczestnikWyscigu("Tomek");
    UczestnikWyscigu uczestnik3 = new UczestnikWyscigu("Romek");
    Wyscig wyscig = new Wyscig("Kwalifikacje");
    Tor torSpa = new Tor("SPA");
    Tor torKrakow = new Tor("Tor Kraków");
    try {
        wyscig.dodajUczestnika(1,uczestnik1);
        wyscig.dodajUczestnika(2,uczestnik2);
        wyscig.dodajUczestnika(3,uczestnik3);
        System.out.println("Liczba uczestników w wyscigu: " + wyscig.getNazwa() + " to: " + wyscig.getUczestnicy().size());
        System.out.println("Uczestnik wyscigu o id rownym 2: " + wyscig.znajdzUczestnika(2) + " imie: " + wyscig.znajdzUczestnika(2).getImie());
        // Kompozycja
        System.out.println();
        torSpa.dodajSektor("Prosta Spa");
        torSpa.dodajSektor("Szykana");
        torKrakow.dodajSektor("Prosta Krakow");
        System.out.println("Tor: " + torSpa.getNazwa() + " ma " + torSpa.getSektory().size() + " sektorów");
        System.out.println("Tor: " + torKrakow.getNazwa() + " ma " + torKrakow.getSektory().size() + " sektorów");
        System.out.println("Łącznie sektorów: " + torKrakow.getWszystkieSektory().size());
        System.out.println("Pierwszy sektor na torze: " + torSpa.getNazwa() + " to " + torSpa.getSektory().get(0).getNazwa());
        System.out.println("Pierwszy sektor na torze: " + torKrakow.getNazwa() + " to " + torKrakow.getSektory().get(0).getNazwa());
        torSpa.usunTor();
        System.out.println("Sektory Spa po usunięciu toru: " + torSpa.getNazwa() + " to: " + torSpa.getSektory().size());
        System.out.println("Globalna liczba sektorów: " + torSpa.getWszystkieSektory().size());
    } catch (Exception e) {
        System.err.println("Błąd: " + e.getMessage());
    }

}

