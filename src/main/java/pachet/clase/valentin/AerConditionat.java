
package pachet.clase.valentin;

import pachet.clasa.abstracta.AparatElectric;

public class AerConditionat extends AparatElectric {
	private String clasa;
	private double arieAcoperita;
	private double consumTelecomanda;

	// Constructor implicit (fara parametri):
	public AerConditionat() {
		super();
		clasa = null;
		arieAcoperita = 0.0;
		consumTelecomanda = 0.0;
	}

	// Constructor explicit (cu parametri):
	public AerConditionat(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
	}

	public AerConditionat(String clasa, double arieAcoperita, double consumTelecomanda) {
		this.clasa = clasa;
		this.arieAcoperita = arieAcoperita;
		this.consumTelecomanda = consumTelecomanda;
	}

	public AerConditionat(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			String clasa, double arieAcoperita, double consumTelecomanda) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.clasa = clasa;
		this.arieAcoperita = arieAcoperita;
		this.consumTelecomanda = consumTelecomanda;
	}

	// Constructor de copiere:
	public AerConditionat(AerConditionat obiect) {
		super(obiect);
		this.clasa = obiect.clasa;
		this.arieAcoperita = obiect.arieAcoperita;
		this.consumTelecomanda = obiect.consumTelecomanda;

	}

	// Metode setters si getters:
	public String getClasa() {
		return clasa;
	}

	public void setClasa(String clasa) {
		this.clasa = clasa;
	}

	public double getarieAcoperita() {
		return arieAcoperita;
	}

	public void setarieAcoperita(double arieAcoperita) {
		this.arieAcoperita = arieAcoperita;
	}

	public double getconsumTelecomanda() {
		return consumTelecomanda;
	}

	public void setconsumTelecomanda(double consumTelecomanda) {
		this.consumTelecomanda = consumTelecomanda;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n\tClasa:\t\t\t" + clasa + "\n\tArie Acoperita:\t\t" + arieAcoperita + " [m]"
				+ "\n\tConsum telecomanda:\t" + consumTelecomanda + " [W]";
	}

	@Override
	public double calculeazaPretConsumPeLuna(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi * 30;
	}

	@Override
	public double calculeazaPretConsumPeZi(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi;
	}
	
	
        
        //incercare5
        @Override
    public String afisare(){
        return super.afisare()
            + "\n\tClasa:\t\t\t" + clasa
            + "\n\tArie Acoperita:\t\t" + arieAcoperita +" [m]" 
            + "\n\tConsum telecomanda:\t"+ consumTelecomanda +" [W]\n\n";
    }
        
        
        

}
