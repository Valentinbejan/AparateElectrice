
package pachet.clasa.abstracta;

import java.io.Serializable;

public abstract class AparatElectric implements Serializable{
	private static final long serialVersionUID = 5656L;
	private String numeProdus;
	private String producator;
	private double pret;
	private String culoare;
	private double putereConsumata;

	// Constructor implicit (fara parametri):
	public AparatElectric() {
		this.numeProdus = "";
		this.producator = "";
		this.pret = 0;
		this.culoare = "";
		this.putereConsumata = 0;

	}

	// Constructor explicit (cu parametri):
	public AparatElectric(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		this.numeProdus = numeProdus;
		this.producator = producator;
		this.pret = pret;
		this.culoare = culoare;
		this.putereConsumata = putereConsumata;
	}

	// Constructor de copiere:
	public AparatElectric(AparatElectric obiect) {
		this.numeProdus = obiect.numeProdus;
		this.producator = obiect.producator;
		this.pret = obiect.pret;
		this.culoare = obiect.culoare;
		this.putereConsumata = obiect.putereConsumata;
	}

	// Metode abstracte
	public abstract double calculeazaPretConsumPeLuna(int oreConsumZi);

	public abstract double calculeazaPretConsumPeZi(int oreConsumZi);

	// Metode setters si getters:
	public void setNumeProdus(String numeProdus) {
		this.numeProdus = numeProdus;
	}

	public String getNumeProdus() {
		return numeProdus;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	public String getProducator() {
		return producator;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public double getPret() {
		return pret;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setPutereConsumata(double putereConsumata) {
		this.putereConsumata = putereConsumata;
	}

	public double getPutereConsumata() {
		return putereConsumata;
	}

	
	@Override
	public String toString() {
		return "Aparat Electric: " + numeProdus + "\n\n\tProducator:\t\t" + producator + "\n\tPret:\t\t\t" + pret
				+ " [lei]" + "\n\tCuloare:\t\t" + culoare + "\n\tPutere Consumata:\t" + putereConsumata + " [W]";
	}

}
