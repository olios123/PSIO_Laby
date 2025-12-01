package PSIO8;

import PSIO8.objects.Pracownik;
import PSIO8.objects.Robotnik;
import PSIO8.objects.Urzednik;

public class Main {
	public static void main(String[] args) {
		Pracownik[] pracownicy = new Pracownik[4];

		pracownicy[0] = new Urzednik("Kowalski", 1.0, 3000, 10);
		pracownicy[1] = new Robotnik("Nowak", 1.0, 20, 160);
		pracownicy[2] = new Urzednik("Wiśniewski", 0.75, 4000, 15);
		pracownicy[3] = new Robotnik("Wójcik", 0.5, 25, 200);

		for (Pracownik pracownik : pracownicy) {
			System.out.println("Nazwisko: " + pracownik.getNazwisko() + ", Wypłata: " + String.format("%.2f", pracownik.getWyplata()));
		}
	}
}
