package PSIO6;

import java.util.Random;

public class Tablica2W {

	private double[][] tab;

	public Tablica2W(int i, int j)
	{
		this.tab = new double[i][j];
	}

	public void setValue(int i , int j, double value)
	{
		this.tab[i][j] = value;
	}

	public void randomTab(int max)
	{
		Random random = new Random();
		for (int i = 0; i < this.tab.length; i++)
		{
			for (int j = 0; j < this.tab[i].length; j++)
			{
				this.tab[i][j] = random.nextDouble(max);
			}
		}
	}

	public double[] max()
	{
		double maxValue = this.tab[0][0];
		int x = 0;
		int y = 0;

		for (int i = 0; i < this.tab.length; i++)
		{
			for (int j = 0; j < this.tab[i].length; j++)
			{
				if (this.tab[i][j] > maxValue)
				{
					x = i;
					y = j;
					maxValue = this.tab[i][j];
				}

			}
		}

		return new double[]{x, y, maxValue};
	}

	public double[] sredniaWierszy()
	{
		double[] srednie = new double[this.tab.length];

		for (int i = 0; i < this.tab.length; i++)
		{
			double suma = 0;
			for (int j = 0; j < this.tab[i].length; j++)
			{
				suma += this.tab[i][j];
			}
			srednie[i] = suma / this.tab[i].length;
		}

		return srednie;
	}


	public void printTab()
	{
		for (int i = 0; i < this.tab.length; i++)
		{
			for (int j = 0; j < this.tab[i].length; j++)
			{
				System.out.printf("%7.2f", this.tab[i][j]);
			}
			System.out.print("\n");
		}
	}

	public double[][] getTab()
	{
		return this.tab;
	}

}
