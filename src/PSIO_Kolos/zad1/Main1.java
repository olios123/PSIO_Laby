package PSIO_Kolos.zad1;

public class Main1 {
	public static void main(String[] args) {
		Hex hex = new Hex();

		System.out.println("Hex: 10 | Dec: " + hex.hexToDec("10"));
		System.out.println("Hex: A1 | Dec: " + hex.hexToDec("A1"));
		System.out.println("Hex: FF | Dec: " + hex.hexToDec("FF"));
		System.out.println("Hex: 0F | Dec: " + hex.hexToDec("0F"));
		System.out.println("Hex: 00002 | Dec: " + hex.hexToDec("00002"));
	}
}
