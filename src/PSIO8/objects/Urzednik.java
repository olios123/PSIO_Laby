package PSIO8.objects;

public class Urzednik extends Pracownik {

	private double plcaPodstawowa;
	private double procentPremii;

	public Urzednik(String nazwisko, double etat, double plcaPodstawowa, double procentPremii) {
		super(nazwisko, etat);
		this.plcaPodstawowa = plcaPodstawowa;
		this.procentPremii = procentPremii;
	}

	@Override
	public double getWyplata() {
		return (plcaPodstawowa * getEtat()) + (plcaPodstawowa * (procentPremii / 100));
	}

	public void setPlcaPodstawowa(double plcaPodstawowa) {
		this.plcaPodstawowa = plcaPodstawowa;
	}
	public void setProcentPremii(double procentPremii) {
		this.procentPremii = procentPremii;
	}

}
