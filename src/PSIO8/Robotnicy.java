package PSIO8;

import PSIO8.objects.Robotnik;

import java.util.ArrayList;
import java.util.List;

public class Robotnicy {

	private List<Robotnik> robotnicy;

	public Robotnicy() {
		this.robotnicy = new ArrayList<>();
	}

	public void zatrudnijRobotnika(String nazwisko, double stawkaGodzinowa, int liczbaGodzin) {
		Robotnik robotnik = new Robotnik(nazwisko, 1.0, stawkaGodzinowa, liczbaGodzin);
		robotnicy.add(robotnik);
	}



}


