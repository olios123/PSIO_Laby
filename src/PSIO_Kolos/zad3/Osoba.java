package PSIO_Kolos.zad3;

public class Osoba {

	private String name;
	private String surname;

	public Osoba(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String toString() {
		return name + " " + surname;
	}
	public boolean equals(Osoba osoba) {
		if (this.getName().equals(osoba.getName()) &&
			this.getSurname().equals(osoba.getSurname())) return true;
		return false;
	}

}
