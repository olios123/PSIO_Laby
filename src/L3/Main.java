package L3;

public class Main {
	public static void main(String[] args) {

		// Przeprowadzanie testów dla klasy Prostokat

		// Konstruktor domyślny
		Prostokat p0 = new Prostokat();
		System.out.println("Konstruktor domyślny");
		System.out.println("Bok a: " + p0.getA());
		System.out.println("Bok b: " + p0.getB());
		System.out.println("Pole: " + p0.pole());
		System.out.println("Obwód: " + p0.obwod());
		System.out.println("Przekątna: " + p0.przekatna());
		System.out.println("-----------------------------------------");

		// Pozycja: 0 0 4 3
		Prostokat p1 = new Prostokat(0, 0, 4, 3);
		System.out.println("Dla danych: 0 0 4 3");
		System.out.println("Bok a: " + p1.getA());
		System.out.println("Bok b: " + p1.getB());
		System.out.println("Pole: " + p1.pole());
		System.out.println("Obwód: " + p1.obwod());
		System.out.println("Przekątna: " + p1.przekatna());
		System.out.println("-----------------------------------------");


		// Pozycja: 1 2 6 7
		Prostokat p2 = new Prostokat(1, 2, 6, 7);
		System.out.println("Dla danych: 1 2 6 7");
		System.out.println("Bok a: " + p2.getA());
		System.out.println("Bok b: " + p2.getB());
		System.out.println("Pole: " + p2.pole());
		System.out.println("Obwód: " + p2.obwod());
		System.out.println("Przekątna: " + p2.przekatna());
		System.out.println("-----------------------------------------");


		// Pozycja: -2 -1 3 4
		Prostokat p3 = new Prostokat(-2, -1, 3, 4);
		System.out.println("Dla danych: -2 -1 3 4");
		System.out.println("Bok a: " + p3.getA());
		System.out.println("Bok b: " + p3.getB());
		System.out.println("Pole: " + p3.pole());
		System.out.println("Obwód: " + p3.obwod());
		System.out.println("Przekątna: " + p3.przekatna());
		System.out.println("-----------------------------------------");


		// Wymiary: a=10, b=5
		Prostokat p4 = new Prostokat(10, 5);
		System.out.println("Dla danych: a=10, b=5");
		System.out.println("Bok a: " + p4.getA());
		System.out.println("Bok b: " + p4.getB());
		System.out.println("Pole: " + p4.pole());
		System.out.println("Obwód: " + p4.obwod());
		System.out.println("Przekątna: " + p4.przekatna());
		System.out.println("-----------------------------------------");


		// Wymiary: a=2.5, b=7.5
		Prostokat p5 = new Prostokat(2.5, 7.5);
		System.out.println("Dla danych: a=2.5, b=7.5");
		System.out.println("Bok a: " + p5.getA());
		System.out.println("Bok b: " + p5.getB());
		System.out.println("Pole: " + p5.pole());
		System.out.println("Obwód: " + p5.obwod());
		System.out.println("Przekątna: " + p5.przekatna());
		System.out.println("-----------------------------------------");


		// Błędne dane: 0 0 0 5
		Prostokat p6 = new Prostokat(0, 0, 0, 5);
		System.out.println("Dla danych: 0 0 0 5");
		System.out.println("-----------------------------------------");


		// Błędne dane: 2 3 5 3
		Prostokat p7 = new Prostokat(2, 3, 5, 3);
		System.out.println("Dla danych: 2 3 5 3");
		System.out.println("-----------------------------------------");


		// Błędne dane: 2 2 2 2
		Prostokat p8 = new Prostokat(2, 2, 2, 2);
		System.out.println("Dla danych: 2 2 2 2");
		System.out.println("-----------------------------------------");


		// Wymiary: a=0, b=5
		Prostokat p9 = new Prostokat(0, 5);
		System.out.println("Dla danych: a=0, b=5");
		System.out.println("Bok a: " + p9.getA());
		System.out.println("Bok b: " + p9.getB());
		System.out.println("Pole: " + p9.pole());
		System.out.println("Obwód: " + p9.obwod());
		System.out.println("Przekątna: " + p9.przekatna());
		System.out.println("-----------------------------------------");


		// Wymiary: a=-4, b=3
		Prostokat p10 = new Prostokat(-4, 3);
		System.out.println("Dla danych: a=-4, b=3");
		System.out.println("Bok a: " + p10.getA());
		System.out.println("Bok b: " + p10.getB());
		System.out.println("Pole: " + p10.pole());
		System.out.println("Obwód: " + p10.obwod());
		System.out.println("Przekątna: " + p10.przekatna());
		System.out.println("-----------------------------------------");

	}
}
