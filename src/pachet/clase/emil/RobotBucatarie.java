
package pachet.clase.emil;

import pachet.clasa.abstracta.AparatElectric;

public class RobotBucatarie extends AparatElectric {
	private double capacitate;
	private double numarViteze;
	private double numarUstensile;

	// Constructor implicit (fara parametri):
	public RobotBucatarie() {
		super();
		capacitate = 0.0;
		numarViteze = 0.0;
		numarUstensile = 0.0;
	}

	// Constructor explicit (cu parametri):
	public RobotBucatarie(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
	}

	public RobotBucatarie(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			double capacitate, double numarViteze, double numarUstensile) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.capacitate = capacitate;
		this.numarViteze = numarViteze;
		this.numarUstensile = numarUstensile;
	}

	// Constructor de copiere:
	public RobotBucatarie(RobotBucatarie obiect) {
		super(obiect);
		this.capacitate = obiect.capacitate;
		this.numarViteze = obiect.numarViteze;
		this.numarUstensile = obiect.numarUstensile;
	}

	public double getCapacitate() {
		return capacitate;
	}

	public void setCapacitate(double capacitate) {
		this.capacitate = capacitate;
	}

	public double getnumarViteze() {
		return numarViteze;
	}

	public void setnumarViteze(double numarViteze) {
		this.numarViteze = numarViteze;
	}

	public double getnumarUstensile() {
		return numarUstensile;
	}

	public void setnumarUstensile(double numarUstensile) {
		this.numarUstensile = numarUstensile;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n\tCapacitate:\t\t" + capacitate + " [litri]" + "\n\tNumar Viteze:\t\t"
				+ numarViteze + "\n\tNumar Ustensile:\t" + numarUstensile;
	}

	@Override
	public double calculeazaPretConsumPeLuna(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi * 30;
	}

	@Override
	public double calculeazaPretConsumPeZi(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi;
	}

}
