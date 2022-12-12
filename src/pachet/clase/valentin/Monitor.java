
package pachet.clase.valentin;

import pachet.clasa.abstracta.AparatElectric;

public class Monitor extends AparatElectric {
	private double rataRefresh;// ex:75Hz,120Hz,144Hz
	private double diagonala;// ex:20inch,27inch
	private String formatEcran;// ex:clasic,ultraWide,Wide
	private String rezolutieOptima;// ex:1024x768
	private double timpRaspuns;// ex:2ms,7ms;
	private String functiiSpeciale;// ex:ecran curbat,touchscreen,webcam

	// Constructor implicit (fara parametri):
	public Monitor() {
		super();
		rataRefresh = 0;
		diagonala = 0;
		formatEcran = null;
		rezolutieOptima = null;
		timpRaspuns = 0;
		functiiSpeciale = null;
	}

	// Constructor explicit (cu parametri):
	public Monitor(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			double rataRefresh, double diagonala, String formatEcran, String rezolutieOptima, double timpRaspuns,
			String functiiSpeciale) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.rataRefresh = rataRefresh;
		this.diagonala = diagonala;
		this.formatEcran = formatEcran;
		this.rezolutieOptima = rezolutieOptima;
		this.timpRaspuns = timpRaspuns;
		this.functiiSpeciale = functiiSpeciale;
	}

	// Constructor de copiere:
	public Monitor(Monitor m1) {
		super(m1);
		this.rataRefresh = m1.rataRefresh;
		this.diagonala = m1.diagonala;
		this.formatEcran = m1.formatEcran;
		this.rezolutieOptima = m1.rezolutieOptima;
		this.timpRaspuns = m1.timpRaspuns;
		this.functiiSpeciale = m1.functiiSpeciale;
	}

	// Metode setters si getters:
	public void setRataRefresh(double rataRefresh) {
		this.rataRefresh = rataRefresh;
	}

	public double getRataRefresh() {
		return rataRefresh;
	}

	public void setDiagonala(double diagonala) {
		this.diagonala = diagonala;
	}

	public double getDiagonala() {
		return diagonala;
	}

	public void setFormatEcran(String formatEcran) {
		this.formatEcran = formatEcran;
	}

	public String getFormatEcran() {
		return formatEcran;
	}

	public void setRezolutieOptima(String rezolutieOptima) {
		this.rezolutieOptima = rezolutieOptima;
	}

	public String getRezolutieOptima() {
		return rezolutieOptima;
	}

	public void setTimpRaspuns(double timpRaspuns) {
		this.timpRaspuns = timpRaspuns;
	}

	public double getTimpRaspuns() {
		return timpRaspuns;
	}

	public void setFunctiiSpeciale(String functiiSpeciale) {
		this.functiiSpeciale = functiiSpeciale;
	}

	public String getFunctiiSpeciale() {
		return functiiSpeciale;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n\tRata de refresh:\t" + rataRefresh + " [Hz]" + "\n\tDiagonala:\t\t" + diagonala
				+ " [inch]" + "\n\tFormat ecran:\t\t" + formatEcran + "\n\tRezolutie optima:\t" + rezolutieOptima
				+ "\n\tTimp de raspuns:\t" + timpRaspuns + " [ms]" + "\n\tFunctii speciale:\t" + functiiSpeciale;
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
