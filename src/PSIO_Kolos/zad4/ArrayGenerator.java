package PSIO_Kolos.zad4;

public class ArrayGenerator {

	private int min;
	private int max;

	public ArrayGenerator(int min, int max) {
		this.min = min;
		this.max = max;
	}

	private boolean checkIfNumberIsOdd(int number) {
		while (number != 0) {
			int sign = number % 10;
			number /= 10;

			if (sign % 2 == 0) return false;
		}
		return true;
	}

	public void printOddNumbers() {
		int[] numbers = new int[10];
		int index = 0;

		for (int i = this.min; i <= this.max; i++) {
			if (index == 10) {
				for (int j = 0; j < 10; j++) {
					System.out.print(numbers[j] + " ");
				}
				System.out.println();
				index = 0;
				numbers = new int[10];
			}

			if (checkIfNumberIsOdd(i)) {
				numbers[index++] = i;
			}
		}

		if (index != 0) {
			for (int j = 0; j < 10; j++) {
				if (numbers[j] == 0) continue;
				System.out.print(numbers[j] + " ");
			}
		}
	}
}
