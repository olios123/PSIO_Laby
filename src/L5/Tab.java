package L5;

import java.util.Arrays;
import java.util.Random;

public class Tab {

	private int[] tab;

	/**
	 * Empty tab list with 100 elements
	 */
	public Tab()
	{
		this.tab = new int[100];
	}

	/**
	 * Empty tab list with specified number of elements
	 * @param size - array size
	 */
	public Tab(int size)
	{
		this.tab = new int[size];
	}

	// Get-ery
	public int[] getTab()
	{
		return this.tab;
	}

	/**
	 * Fills tab array with random values
	 * @param from - min value
	 * @param to - max value
	 */
	public void randomTab(int from, int to)
	{
		Random random = new Random();

		for (int i = 0; i < this.tab.length; i++)
			this.tab[i] = random.nextInt(from, to);
	}

	/**
	 * Prints all elements as one string
	 */
	public void printTab()
	{
		System.out.println(Arrays.toString(this.tab));
	}

	/**
	 * Prints all values in separate lines
	 */
	public void printTabElements()
	{
		for (int i = 0; i < this.tab.length; i++)
		{
			System.out.println(this.tab[i]);
		}
	}

	/**
	 * Returns max value in tab array
	 * @return max value of tab
	 */
	public int maxValue()
	{
		int max = this.tab[0];
		for (int i = 0; i < this.tab.length; i++)
			if (this.tab[i] > max)
				max = this.tab[i];

		return max;
	}

	/**
	 * Returns min value in tab array
	 * @return min value of tab
	 */
	public int minValue()
	{
		int min = this.tab[0];
		for (int i = 0; i < this.tab.length; i++)
			if (this.tab[i] < min)
				min = this.tab[i];

		return min;
	}

	/**
	 * Returns average value of the tab array
	 * @return average value of tab
	 */
	public double avg()
	{
		double avg = 0;
		for (int i = 0; i < this.tab.length; i++)
			avg += this.tab[i];

		avg /= this.tab.length;
		return avg;
	}

	/**
	 * Returns tab with only even numbers from tab array
	 * @return even numbers of tab
	 */
	public int[] evenArray()
	{
		int[] evenTab = new int[this.tab.length];
		int pos = 0;

		for (int i = 0; i < this.tab.length; i++)
			if (this.tab[i] % 2 == 0)
				evenTab[pos++] = this.tab[i];

		return evenTab;

	}

}
