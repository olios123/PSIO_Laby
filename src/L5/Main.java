package L5;

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		Tab tab = new Tab();

		tab.randomTab(0, 100);

		tab.printTab();

		System.out.println("Max: " + tab.maxValue());

		System.out.println("Min: " + tab.minValue());

		System.out.println("Avg: " + tab.avg());

		System.out.println(Arrays.toString(tab.evenArray()));
	}
}
