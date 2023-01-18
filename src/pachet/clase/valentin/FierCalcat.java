
package pachet.clase.valentin;

import pachet.clasa.abstracta.AparatElectric;

public class FierCalcat extends AparatElectric {
	private String talpa;
	private double latime;
	private double lungime;
	private double adancime;
	private double lungimeCablu;
	private double greutate;
	private double debitAbur;
	private String functii;

	// Constructor implicit (fara parametri):
	public FierCalcat() {
		super();
		talpa = null;
		latime = 0;
		lungime = 0;
		adancime = 0;
		lungimeCablu = 0;
		greutate = 0;
		debitAbur = 0;
		functii = null;

	}

	// Constructor explicit (cu parametri):
	public FierCalcat(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			String talpa, double latime, double lungime, double adancime, double lungimeCablu, double greutate,
			double debitAbur, String functii) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.talpa = talpa;
		this.latime = latime;
		this.lungime = lungime;
		this.adancime = adancime;
		this.lungimeCablu = lungimeCablu;
		this.greutate = greutate;
		this.debitAbur = debitAbur;
		this.functii = functii;

	}

	// Constructor de copiere:
	public FierCalcat(FierCalcat obiect) {
		super(obiect);
		this.talpa = obiect.talpa;
		this.latime = obiect.latime;
		this.lungime = obiect.lungime;
		this.adancime = obiect.adancime;
		this.lungimeCablu = obiect.lungimeCablu;
		this.greutate = obiect.greutate;
		this.debitAbur = obiect.debitAbur;
		this.functii = obiect.functii;
	}

	// Metode setters si getters:

	public void setTalpa(String talpa) {
		this.talpa = talpa;
	}

	public String getTalpa() {
		return talpa;
	}

	public void setLatime(double latime) {
		this.latime = latime;
	}

	public double getLatime() {
		return latime;
	}

	public void setLungime(double lungime) {
		this.lungime = lungime;
	}

	public double getLungime() {
		return lungime;
	}

	public void setAdancime(double adancime) {
		this.adancime = adancime;
	}

	public double getAdancime() {
		return adancime;
	}

	public void setLungimeCablu(double lungimeCablu) {
		this.lungimeCablu = lungimeCablu;
	}

	public double getLungimeCablu() {
		return lungimeCablu;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public double getGreutate() {
		return greutate;
	}

	public void setDebitAbur(double debitAbur) {
		this.debitAbur = debitAbur;
	}

	public double getDebitAbur() {
		return debitAbur;
	}

	public void setFunctii(String functii) {
		this.functii = functii;
	}

	public String getFunctii() {
		return functii;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n\tTalpa:\t\t\t" + talpa + "\n\tLatime:\t\t\t" + latime + " [cm]"
				+ "\n\tLungime:\t\t" + lungime + " [cm]" + "\n\tAdancime:\t\t" + adancime + " [cm]"
				+ "\n\tLungime cablu:\t\t" + lungimeCablu + " [m]" + "\n\tGreutate:\t\t" + greutate + " [kg]"
				+ "\n\tDebit de abur:\t\t" + debitAbur + " [g/min]" + "\n\tFunctii:\t\t" + functii;

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
                + "\n\tTalpa:\t\t\t" + talpa
                + "\n\tLatime:\t\t\t" + latime + " [cm]"
                + "\n\tLungime:\t\t" + lungime + " [cm]"
                + "\n\tAdancime:\t\t" + adancime + " [cm]"
                + "\n\tLungime cablu:\t\t" + lungimeCablu + " [m]"
                + "\n\tGreutate:\t\t" +   greutate + " [kg]"
                + "\n\tDebit de abur:\t\t" + debitAbur + " [g/min]"
                + "\n\tFunctii:\t\t\t" + functii
                + "\n\n\n";}


}
