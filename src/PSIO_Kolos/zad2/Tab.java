package PSIO_Kolos.zad2;

import java.util.Random;

public class Tab {

	private double[][] tab;

	public Tab(int x, int y) {
		tab = new double[x][y];
	}

	public void randomTab(int z) {
		Random random = new Random();

		for (int x = 0; x < tab.length; x++) {
			for (int y = 0; y < tab[x].length; y++) {
				tab[x][y] = random.nextDouble(z);
			}
		}
	}

	public void print() {
		for (int x = 0; x < tab.length; x++) {
			for (int y = 0; y < tab[x].length; y++) {
				System.out.printf("%5.2f ", tab[x][y]);
			}
			System.out.println();
		}
	}

	public double[] avgColumns() {
		double[] avgColumns = new double[tab.length];

		for (int x = 0; x < tab.length; x++) {
			for (int y = 0; y < tab[x].length; y++) {
				avgColumns[x] += tab[y][x];
			}
			avgColumns[x] /= tab[x].length;
		}

		return avgColumns;
	}



}
