package PSIO_Kolos.zad2;

public class Main2 {
	public static void main(String[] args) {
		Tab tab = new Tab(5, 5);
		tab.randomTab(10);

		tab.print();
		System.out.println();

		double[] avgColumns = tab.avgColumns();

		for (double d : avgColumns) {
			System.out.printf("%5.2f ", d);
		}
	}
}
