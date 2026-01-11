package PSIO12.zad1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class FirmaTreeSet {
    private Set<Pracownik> pracownicy =
            new TreeSet<>(Comparator.comparing(Pracownik::getNazwisko));

    public boolean zatrudnij(Pracownik p) {
        return pracownicy.add(p);
    }

    public boolean zwolnij(String nazwisko) {
        return pracownicy.removeIf(p -> p.getNazwisko().equals(nazwisko));
    }

    public void drukujPracownikow() {
        int lp = 1;
        for (Pracownik p : pracownicy) {
            System.out.println(lp++ + ". " + p);
        }
    }
}

