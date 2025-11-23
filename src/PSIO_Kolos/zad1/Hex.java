package PSIO_Kolos.zad1;

public class Hex {

	public Hex() {}

	public int charHexToDec(char charHex) {
		charHex = Character.toUpperCase(charHex);
		switch (charHex) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return Character.getNumericValue(charHex);
			case 'A':
				return 10;
			case 'B':
				return 11;
			case 'C':
				return 12;
			case 'D':
				return 13;
			case 'E':
				return 14;
			case 'F':
				return 15;
			default:
				System.out.println("Invalid HEX number: " + charHex);
				return -1;
		}
	}

	public int hexToDec(String hex) {
		int sum = 0;
		int power = 1;

		for (int i = hex.length() - 1; i >= 0; i--) {
			char hexChar = hex.charAt(i);
			int decNumber = charHexToDec(hexChar);

			if (i == hex.length() - 1) {
				sum += decNumber;
			} else {
				power *= 16;
				sum += decNumber * power;
			}
		}
		return sum;
	}

}
