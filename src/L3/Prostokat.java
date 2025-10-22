package L3;

public class Prostokat {

	// Deklaracja zmiennych definiujących pozycje wierzchołków prostokąta
	// Pozycja 1
	private double posX_1;
	private double posY_1;
	// Pozycja 2
	private double posX_2;
	private double posY_2;

	// Dane obliczane po inicjalizacji klasy
	public double a; // Bok a
	public double b; // Bok b

	// Zmienna sprawdzająca czy podczas inicjalizacji nie popełniono błędu wprowadzania danych
	private boolean error = false;

	/**
	 * Inicjalizacja klasy Prostokat za pomocą konstruktora.
	 * Wymagane podanie jest przeciwległych wierzchołków prostokąta.
	 * @param posX_1 - współrzędna X pierwszego punktu
	 * @param posY_1 - współrzędna Y pierwszego punktu
	 * @param posX_2 - współrzędna X drugiego punktu
	 * @param posY_2 - współrzędna Y drugiego punktu
	 */
	public Prostokat(
			double posX_1, double posY_1,
			double posX_2, double posY_2
	)
	{
		// Współrzędne pierwsze
		this.posX_1 = posX_1;
		this.posY_1 = posY_1;
		// Współrzędne drugie
		this.posX_2 = posX_2;
		this.posY_2 = posY_2;


		// Sprawdzanie błędów podanych wartości
		if (this.posX_1 == this.posX_2)
		{
			System.out.println("Błąd inicjalizacji: Współrzędne X nie mogą być takie same!");
			error = true;
		}
		if (this.posY_1 == this.posY_2)
		{
			System.out.println("Błąd inicjalizacji: Współrzędne Y nie mogą być takie same!");
			error = true;
		}

		// Jeżeli błąd to nie obliczamy długości boków
		if (error) return;

		// Obliczanie boków prostokąta na podstawie podanych wartości;
		this.a = Math.abs(this.posX_1 - this.posX_2);
		this.b = Math.abs(this.posY_1 - this.posY_2);
	}
	/**
	 * Inicjalizacja klasy Prostokat za pomocą konstruktora.
	 * Wymagane jest podanie wymiarów boków prostokąta.
	 * @param a - bok a
	 * @param b - bok b
	 */
	public Prostokat(
			double a, double b
	)
	{
		this.a = a;
		this.b = b;

		// Sprawdzanie poprawności wprowadzonych danych
		if (a == 0 || b == 0)
		{
			System.out.println("Błąd inicjalizacji: Żaden z boków nie może być równy 0!");
			error = true;
		}
	}


	/**
	 * Obliczanie pola prostokąta na podstawie jego wymiarów.
	 * @return pole prostokąta
	 */
	public double Pole()
	{
		if (error) return Double.NaN;
		return a * b;
	}


	/**
	 * Obliczanie obwodu prostokąta na podstawie jego wymiarów.
	 * @return obwód prostokąta
	 */
	public double Obwod()
	{
		if (error) return Double.NaN;
		return a * 2 + b * 2;
	}


	/**
	 * Obliczanie długości przekątnej prostokąta na podstawie jego wymiarów.
	 * @return przekątna prostokąta
	 */
	public double Przekatna()
	{
		if (error) return Double.NaN;
		return Math.sqrt(a * a + b * b);
	}

}
