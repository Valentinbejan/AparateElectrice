
package pachet.clase.emil;

import pachet.clasa.abstracta.AparatElectric;

public class RobotBucatarie extends AparatElectric {
	private static final long serialVersionUID = 5656L;
	private float capacitate;
	private int numarViteze;
	private int numarUstensile;
	private int nivelZgomot;

	// Constructor implicit (fara parametri):
	public RobotBucatarie() {
		super();
		this.capacitate = 0;
		this.numarViteze = 0;
		this.numarUstensile = 0;
		this.nivelZgomot = 0;
	}

	// construcotr cu parametrii superclasei
	public RobotBucatarie(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.capacitate = 0;
		this.numarViteze = 0;
		this.numarUstensile = 0;
		this.nivelZgomot = 0;
	}

	// Constructor cu parametri:
	public RobotBucatarie(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			float capacitate, int numarViteze, int numarUstensile, int nivelZgomot) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.capacitate = capacitate;
		this.numarViteze = numarViteze;
		this.numarUstensile = numarUstensile;
		this.nivelZgomot = nivelZgomot;
	}

	// Constructor de copiere:
	public RobotBucatarie(RobotBucatarie robotBucatarie) {
		super(robotBucatarie);
		this.capacitate = robotBucatarie.capacitate;
		this.numarViteze = robotBucatarie.numarViteze;
		this.numarUstensile = robotBucatarie.numarUstensile;
		this.nivelZgomot = robotBucatarie.nivelZgomot;
	}

	public float getCapacitate() {
		return capacitate;
	}

	public void setCapacitate(float capacitate) {
		this.capacitate = capacitate;
	}

	public int getNumarViteze() {
		return numarViteze;
	}

	public void setNumarViteze(int numarViteze) {
		this.numarViteze = numarViteze;
	}

	public int getNumarUstensile() {
		return numarUstensile;
	}

	public void setNumarUstensile(int numarUstensile) {
		this.numarUstensile = numarUstensile;
	}

	public int getNivelZgomot() {
		return nivelZgomot;
	}

	public void setNivelZgomot(int nivelZgomot) {
		this.nivelZgomot = nivelZgomot;
	}

	@Override
	public String toString() {
		StringBuilder sir = new StringBuilder();

		sir.append(super.toString());
		sir.append("\n\tCapacitate: " + this.capacitate + " litri");
		sir.append("\n\tNumar viteze: " + this.numarViteze);
		sir.append("\n\tNumar ustensile: " + this.numarUstensile);
		sir.append("\n\tNivel zgomot: " + this.nivelZgomot + " [dB]\n\n");

		return sir.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// folosim contructorul de copiere
		// urmat de "new" pentru a creea un nou obiect
		RobotBucatarie clona = new RobotBucatarie(this);
		return clona;
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
