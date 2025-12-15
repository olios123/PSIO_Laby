package PSIO9;

public class Main {
	public static void main(String[] args) {
		double podstawa = 3000.0;

		Pracownicy pracownicy = new Pracownicy();
		pracownicy.setStrategy(new Kierownik());

		System.out.println("Wypłata kierownika: " + pracownicy.getWyplata(podstawa));

		pracownicy.setStrategy(new Robotnik());

		System.out.println("Wypłata robotnika: " + pracownicy.getWyplata(podstawa));
	}
}
