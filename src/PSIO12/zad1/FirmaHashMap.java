package PSIO12.zad1;

import java.util.*;

public class FirmaHashMap {
    private Map<String, Pracownik> pracownicy = new HashMap<>();

    public boolean zatrudnij(Pracownik p) {
        return pracownicy.putIfAbsent(p.getNazwisko(), p) == null;
    }

    public Pracownik zwolnij(String nazwisko) {
        return pracownicy.remove(nazwisko);
    }

    public void drukujPlace() {
        int lp = 1;
        for (Pracownik p : pracownicy.values()) {
            System.out.printf("%d. %s, %s, płaca=%.2f%n",
                    lp++, p.getNazwisko(), p.getGrupa(), p.obliczPlace());
        }
    }
}
