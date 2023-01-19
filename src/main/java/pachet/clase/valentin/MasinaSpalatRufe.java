package pachet.clase.valentin;

import pachet.clasa.abstracta.AparatElectric;

public class MasinaSpalatRufe extends AparatElectric {
	private double capacitate;
	private double rotatii;

	// Constructor implicit (fara parametri):
	public MasinaSpalatRufe() {
		super();
		capacitate = 0.0;
		rotatii = 0.0;
	}

	// Constructor explicit (cu parametri):
	public MasinaSpalatRufe(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
	}

	public MasinaSpalatRufe(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			double capacicate, double rotatii) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.capacitate = capacicate;
		this.rotatii = rotatii;
	}

	// Constructor de copiere:
	public MasinaSpalatRufe(MasinaSpalatRufe obiect) {
		super(obiect);
		this.capacitate = obiect.capacitate;
		this.rotatii = obiect.rotatii;
	}

	// Metode setters si getters:
	public void setCapacicate(double capacicate) {
		this.capacitate = capacicate;
	}

	public double getCapacicate() {
		return capacitate;
	}

	public void setRotatii(double rotatii) {
		this.rotatii = rotatii;
	}

	public double getRotatii() {
		return rotatii;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n\tCapacitate:\t\t" + capacitate + "\n\tRotatii:\t\t" + rotatii + " [rotatii/min]";
	}

	@Override
	public double calculeazaPretConsumPeLuna(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi * 30;
	}

	@Override
	public double calculeazaPretConsumPeZi(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi;
	}

      @Override
    public String afisare(){
        return  super.afisare()
                + "\n\tCapacitate:\t\t" + capacitate
                + "\n\tRotatii:\t\t\t" + rotatii + " [rotatii/min]\n\n\n";
    }
        
}
