package PSIO12.zad1;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TEST: Firma oparta o ArrayList =====");
        testFirmaArrayList();

        System.out.println("\n===== TEST: Firma oparta o TreeSet =====");
        testFirmaTreeSet();

        System.out.println("\n===== TEST: Firma oparta o HashMap =====");
        testFirmaHashMap();
    }

    private static void testFirmaArrayList() {
        FirmaArrayList firma = new FirmaArrayList();

        firma.zatrudnij(new Urzednik("Kowalski", 1.0, 5000, 0.2));
        firma.zatrudnij(new Urzednik("Nowak", 0.5, 5000, 0.1));
        firma.zatrudnij(new Robotnik("Zielinski", 1.0, 30, 170));
        firma.zatrudnij(new Robotnik("Adamski", 1.25, 28, 180));

        // próba duplikatu
        System.out.println("Dodanie Kowalskiego ponownie: " +
                firma.zatrudnij(new Urzednik("Kowalski", 1.0, 6000, 0.3)));

        System.out.println("\nLista pracowników:");
        firma.drukujPracownikow();

        System.out.println("\nLista płac:");
        firma.drukujPlace();

        System.out.println("\nIlu urzędników: " + firma.iluUrzednikow());
        System.out.println("Ilu robotników: " + firma.iluRobotnikow());

        System.out.println("Suma płac urzędników: " +
                firma.sumaPlac(Urzednik.class));
        System.out.println("Suma płac robotników: " +
                firma.sumaPlac(Robotnik.class));

        System.out.println("\nZwolnienie Nowaka...");
        firma.zwolnij("Nowak");

        System.out.println("\nLista po zwolnieniu:");
        firma.drukujPracownikow();
    }

    private static void testFirmaTreeSet() {
        FirmaTreeSet firma = new FirmaTreeSet();

        firma.zatrudnij(new Robotnik("Kaczmarek", 1.0, 25, 160));
        firma.zatrudnij(new Urzednik("Borkowski", 1.0, 4800, 0.15));
        firma.zatrudnij(new Robotnik("Adamski", 0.75, 30, 140));
        firma.zatrudnij(new Urzednik("Czarnecki", 1.25, 5500, 0.25));

        // duplikat
        System.out.println("Dodanie Adamskiego ponownie: " +
                firma.zatrudnij(new Robotnik("Adamski", 1.0, 40, 200)));

        System.out.println("\nLista pracowników (alfabetycznie):");
        firma.drukujPracownikow();

        System.out.println("\nZwolnienie Czarneckiego...");
        firma.zwolnij("Czarnecki");

        System.out.println("\nLista po zwolnieniu:");
        firma.drukujPracownikow();
    }

    private static void testFirmaHashMap() {
        FirmaHashMap firma = new FirmaHashMap();

        firma.zatrudnij(new Urzednik("Lewandowski", 1.0, 6000, 0.3));
        firma.zatrudnij(new Robotnik("Mazur", 1.0, 35, 165));
        firma.zatrudnij(new Robotnik("Dabrowski", 0.5, 32, 90));

        // duplikat
        System.out.println("Dodanie Mazura ponownie: " +
                firma.zatrudnij(new Robotnik("Mazur", 1.0, 40, 200)));

        System.out.println("\nLista płac:");
        firma.drukujPlace();

        System.out.println("\nZwolnienie Mazura...");
        firma.zwolnij("Mazur");

        System.out.println("\nLista płac po zwolnieniu:");
        firma.drukujPlace();
    }
}

