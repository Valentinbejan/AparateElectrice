package pachet.clase.emil;

import pachet.clasa.abstracta.AparatElectric;

public class Televizor extends AparatElectric {
	private String tipTV; // ex:SmartTV,SmartTV 3D, non SmartTV
	private String accesoriiIncluse;// ex:manual de utilizare, telecomanda, cablu de alimentare
	private double greutate;// ex:13,5 kg
	private double diagonalaEcran;// ex:80cm, 125cm
	private String tehnologieDisplay;// ex:LCD,LED,OLED
	private String rezolutie;// ex:HD,FullHD,UltraHD4K
	private String tipDisplay;// ex:plat, curbat

	// Constructor implicit (fara parametri):
	public Televizor() {
		super();
		tipTV = null;
		accesoriiIncluse = null;
		greutate = 0;
		diagonalaEcran = 0;
		tehnologieDisplay = null;
		rezolutie = null;
		tipDisplay = null;
	}

	// Constructor explicit (cu parametri):
	public Televizor(String numeProdus, String producator, double pret, String culoare, double putereConsumata, String tipTV,
			String accesoriiIncluse, double greutate, double diagonalaEcran, String tehnologieDisplay, String rezolutie,
			String tipDisplay) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.tipTV = tipTV;
		this.accesoriiIncluse = accesoriiIncluse;
		this.greutate = greutate;
		this.diagonalaEcran = diagonalaEcran;
		this.tehnologieDisplay = tehnologieDisplay;
		this.rezolutie = rezolutie;
		this.tipDisplay = tipDisplay;
	}

	// Constructor de copiere:
	public Televizor(Televizor t1) {
		super(t1);
		this.tipTV = t1.tipTV;
		this.accesoriiIncluse = t1.accesoriiIncluse;
		this.greutate = t1.greutate;
		this.diagonalaEcran = t1.diagonalaEcran;
		this.tehnologieDisplay = t1.tehnologieDisplay;
		this.rezolutie = t1.rezolutie;
		this.tipDisplay = t1.tipDisplay;
	}

	// Metode setters si getters:
	public void setTipTV(String tipTV) {
		this.tipTV = tipTV;
	}

	public String getTipTV() {
		return tipTV;
	}

	public void setAccesoriiIncluse(String accesoriiIncluse) {
		this.accesoriiIncluse = accesoriiIncluse;
	}

	public String getAccesoriiIncluse() {
		return accesoriiIncluse;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public double getGreutate() {
		return greutate;
	}

	public void setDiagonalaEcran(double diagonalaEcran) {
		this.diagonalaEcran = diagonalaEcran;
	}

	public double getDiagonalaEcran() {
		return diagonalaEcran;
	}

	public void setTehnologieDisplay(String tehnologieDisplay) {
		this.tehnologieDisplay = tehnologieDisplay;
	}

	public String getTehnologieDisplay() {
		return tehnologieDisplay;
	}

	public void setRezolutie(String rezolutie) {
		this.rezolutie = rezolutie;
	}

	public String getRezolutie() {
		return rezolutie;
	}

	public void setTipDisplay(String tipDisplay) {
		this.tipDisplay = tipDisplay;
	}

	public String getTipDisplay() {
		return tipDisplay;
	}

	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(super.toString());
		buffer.append("\n\tTipul televizorului:\t" + tipTV);
		buffer.append("\n\tAccesorii incluse:\t" + accesoriiIncluse);
		buffer.append("\n\tGreutate:\t\t" + greutate + " [kg]");
		buffer.append("\n\tDiagonala ecranului:\t" + diagonalaEcran + " [cm]");
		buffer.append("\n\tTehnologia display:\t" + tehnologieDisplay);
		buffer.append("\n\tRezolutie:\t\t" + rezolutie);
		buffer.append("\n\tTip display:\t\t" + tipDisplay);
		return buffer.toString();
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
