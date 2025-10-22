package L3.Program_Glowny;

import L3.Biblioteka.Matematyka;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();

		int n = 10; // Dokładność do testowania zadań

		// Przeprowadzanie testów dla funkcji Matematyka.sin()
		System.out.println("----- Testowanie funkcji sin(x) -----");
		for (int i = 0; i < 5; i++)
		{
			double stopnie = (int) (-90 + (180 + 1) * rand.nextDouble()); // losowy kąt od -90° do 90°
			double x = Math.toRadians(stopnie); // konwersja na radiany
			double wynik = Matematyka.sin(x, n);
			System.out.println("sin(" + stopnie + "°) = " + wynik + " | Math.sin = " + Math.sin(x));
		}

		// Przeprowadzanie testów dla funkcji Matematyka.cos()
		System.out.println("----- Testowanie funkcji cos(x) -----");
		for (int i = 0; i < 5; i++)
		{
			double stopnie = (int) (-90 + (180 + 1) * rand.nextDouble()); // losowy kąt od -90° do 90°
			double x = Math.toRadians(stopnie); // konwersja na radiany
			double wynik = Matematyka.cos(x, n);
			System.out.println("cos(" + stopnie + "°) = " + wynik + " | Math.sin = " + Math.sin(x));
		}

		// Przeprowadzanie testów dla funkcji Matematyka.ex()
		System.out.println("----- Testowanie funkcji e^x -----");
		for (int i = 0; i < 5; i++)
		{
			double x = Math.round((-5 + (5 + 5) * rand.nextDouble()) * 10.0) / 10.0; // losowy x z zakresu [-5, 5]
			double wynik = Matematyka.ex(x, n);
			System.out.println("e^x(" + x + ") = " + wynik + " | Math.exp = " + Math.exp(x));
		}
	}
}
