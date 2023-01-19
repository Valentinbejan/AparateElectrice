
package pachet.clase.valentin;

import pachet.clasa.abstracta.AparatElectric;

public class MasinaSpalatVase extends AparatElectric {
	private int numarSeturi;
	private double latimeCuva;

	// Constructor implicit (fara parametri):
	public MasinaSpalatVase() {
		super();
		numarSeturi = 0;
		latimeCuva = 0;
	}

	// Constructor explicit (cu parametri):
	public MasinaSpalatVase(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
	}

	public MasinaSpalatVase(int numarSeturi, double latimeCuva) {
		super();
		this.numarSeturi = numarSeturi;
		this.latimeCuva = latimeCuva;
	}

	public MasinaSpalatVase(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			int numarSeturi, double latimeCuva) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.numarSeturi = numarSeturi;
		this.latimeCuva = latimeCuva;
	}

	// Constructor de copiere:
	public MasinaSpalatVase(MasinaSpalatVase obiect) {
		super(obiect);
		this.numarSeturi = obiect.numarSeturi;
		this.latimeCuva = obiect.latimeCuva;
	}

	// Metode setters si getters:
	public void setNumarSeturi(int numarSeturi) {
		this.numarSeturi = numarSeturi;
	}

	public int getNumarSeturi() {
		return numarSeturi;
	}

	public void setLatimeCuva(double latimeCuva) {
		this.latimeCuva = latimeCuva;
	}

	public double getLatimeCuva() {
		return latimeCuva;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n\tNumar de seturi:\t" + numarSeturi + "\n\tLatime cuva:\t\t" + latimeCuva
				+ " [cm]";
	}

	@Override
	public double calculeazaPretConsumPeLuna(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi * 30;
	}

	@Override
	public double calculeazaPretConsumPeZi(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi;
	}

        //Metoda de afisare pentru GUI:
    @Override
    public String afisare(){
        return  super.afisare()
                + "\n\tNumar de seturi:\t\t" + numarSeturi
                + "\n\tLatime cuva:\t\t" + latimeCuva + " [cm]";
    }
        
}
