package PSIO6;

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		Tablica2W tab = new Tablica2W(5, 10);
		tab.randomTab(100);

		tab.setValue(2, 3, 0);

		tab.printTab();

		double[] max = tab.max();

		System.out.print((int) max[0] + " " + (int) max[1] + " ");
		System.out.printf("%7.2f \n", max[2]);

		double[] srednie = tab.sredniaWierszy();

		for (int i = 0; i < srednie.length; i++)
		{
			System.out.printf("%7.2f ", srednie[i]);
		}
	}
}
