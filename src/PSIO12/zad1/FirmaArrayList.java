package PSIO12.zad1;

import java.util.*;

public class FirmaArrayList {
    private List<Pracownik> pracownicy = new ArrayList<>();

    public boolean zatrudnij(Pracownik p) {
        if (pracownicy.contains(p)) return false;
        pracownicy.add(p);
        return true;
    }

    public boolean zwolnij(String nazwisko) {
        return pracownicy.removeIf(p -> p.getNazwisko().equals(nazwisko));
    }

    public long iluUrzednikow() {
        return pracownicy.stream().filter(p -> p instanceof Urzednik).count();
    }

    public long iluRobotnikow() {
        return pracownicy.stream().filter(p -> p instanceof Robotnik).count();
    }

    public double sumaPlac(Class<?> typ) {
        return pracownicy.stream()
                .filter(p -> typ.isInstance(p))
                .mapToDouble(Pracownik::obliczPlace)
                .sum();
    }

    public void drukujPracownikow() {
        int lp = 1;
        for (Pracownik p : pracownicy) {
            System.out.println(lp++ + ". " + p);
        }
    }

    public void drukujPlace() {
        int lp = 1;
        for (Pracownik p : pracownicy) {
            System.out.printf("%d. %s, %s, etat=%.2f, płaca=%.2f%n",
                    lp++, p.getNazwisko(), p.getGrupa(),
                    p.getEtat(), p.obliczPlace());
        }
    }
}
