package pachet.emil.clase;

import pachet.clasa.abstracta.AparatElectric;

public class Aspirator extends AparatElectric {
	private static final long serialVersionUID = 5656L;
	private char clasaEmisiPraf; // A //B //C
	private String tip; // vertical //horizontal
	private String tipAspirare; // umeda //uscata
	private String tipCarcasa; // plastic //metal
	private String tipSac; // hartie, platic, textil
	private String tipFiltru; // HEPA //H13 //H14 //H15
	private int capacitateDeColectare; // ml
	private int greutate; // kg
	private int nivelZgomot; // db
	private int nrFiltre; // 1 //2 //3

	// constructor fara parametri
	public Aspirator() {
		super();
		this.clasaEmisiPraf = ' ';
		this.tip = "";
		this.tipAspirare = "";
		this.tipCarcasa = "";
		this.tipSac = "";
		this.tipFiltru = "";
		this.capacitateDeColectare = 0;
		this.greutate = 0;
		this.nivelZgomot = 0;
		this.nrFiltre = 0;
	}

	// construcotr cu parametrii superclasei
	public Aspirator(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.clasaEmisiPraf = ' ';
		this.tip = "";
		this.tipAspirare = "";
		this.tipCarcasa = "";
		this.tipSac = "";
		this.tipFiltru = "";
		this.capacitateDeColectare = 0;
		this.greutate = 0;
		this.nivelZgomot = 0;
		this.nrFiltre = 0;
	}

	// constructor cu parametri
	public Aspirator(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			char clasaEmisiPraf, String tip, String tipAspirare, String tipCarcasa, String tipSac, String tipFiltru,
			int capacitateDeColectare, int greutate, int nivelZgomot, int nrFiltre) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.clasaEmisiPraf = clasaEmisiPraf;
		this.tip = tip;
		this.tipAspirare = tipAspirare;
		this.tipCarcasa = tipCarcasa;
		this.tipSac = tipSac;
		this.tipFiltru = tipFiltru;
		this.capacitateDeColectare = capacitateDeColectare;
		this.greutate = greutate;
		this.nivelZgomot = nivelZgomot;
		this.nrFiltre = nrFiltre;
	}

	// constructor de copiere
	public Aspirator(Aspirator a) {
		super(a);
		this.clasaEmisiPraf = a.clasaEmisiPraf;
		this.tip = a.tip;
		this.tipAspirare = a.tipAspirare;
		this.tipCarcasa = a.tipCarcasa;
		this.tipSac = a.tipSac;
		this.tipFiltru = a.tipFiltru;
		this.capacitateDeColectare = a.capacitateDeColectare;
		this.greutate = a.greutate;
		this.nivelZgomot = a.nivelZgomot;
		this.nrFiltre = a.nrFiltre;
	}

	// getteri si setteri

	@Override
	public String toString() {
		StringBuilder sir = new StringBuilder();
		// sir.append(super.toString());

		sir.append("\nAparat electric:\t\t" + getNumeProdus());
		sir.append("\n\tProducator:\t\t" + getProducator());
		sir.append("\n\tPret:\t\t" + getPret() + "[lei]");
		sir.append("\n\tCuloare:\t\t" + getCuloare());
		sir.append("\n\tPutere consumata:\t" + getPutereConsumata());
		sir.append("\n\tClasa emisi praf:\t" + this.clasaEmisiPraf);
		sir.append("\n\tTip:\t\t" + this.tip);
		sir.append("\n\tTip aspirare:\t\t" + this.tipAspirare);
		sir.append("\n\tTip carcasa:\t\t" + this.tipCarcasa);
		sir.append("\n\tTip sac:\t\t" + this.tipSac);
		sir.append("\n\tTip filtru:\t\t" + this.tipFiltru);
		sir.append("\n\tCapacitate de colectare:\t" + this.capacitateDeColectare + " [ml]");
		sir.append("\n\tGreutate:\t\t" + this.greutate + " [kg]");
		sir.append("\n\tNivel zgomot:\t\t" + this.nivelZgomot + " [dB]");
		sir.append("\n\tNumar filtre:\t\t" + this.nrFiltre + "\n\n");

		return sir.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// folosim contructorul de copiere
		// urmat de "new" pentru a creea un nou obiect
		Aspirator clona = new Aspirator(this);
		return clona;
	}

	// Metode getters si setters
	public char getClasaEmisiPraf() {
		return clasaEmisiPraf;
	}

	public void setClasaEmisiPraf(char clasaEmisiPraf) {
		this.clasaEmisiPraf = clasaEmisiPraf;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getTipAspirare() {
		return tipAspirare;
	}

	public void setTipAspirare(String tipAspirare) {
		this.tipAspirare = tipAspirare;
	}

	public String getTipCarcasa() {
		return tipCarcasa;
	}

	public void setTipCarcasa(String tipCarcasa) {
		this.tipCarcasa = tipCarcasa;
	}

	public String getTipSac() {
		return tipSac;
	}

	public void setTipSac(String tipSac) {
		this.tipSac = tipSac;
	}

	public String getTipFiltru() {
		return tipFiltru;
	}

	public void setTipFiltru(String tipFiltru) {
		this.tipFiltru = tipFiltru;
	}

	public int getCapacitateDeColectare() {
		return capacitateDeColectare;
	}

	public void setCapacitateDeColectare(int capacitateDeColectare) {
		this.capacitateDeColectare = capacitateDeColectare;
	}

	public int getGreutate() {
		return greutate;
	}

	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}

	public int getNivelZgomot() {
		return nivelZgomot;
	}

	public void setNivelZgomot(int nivelZgomot) {
		this.nivelZgomot = nivelZgomot;
	}

	public int getNrFiltre() {
		return nrFiltre;
	}

	public void setNrFiltre(int nrFiltre) {
		this.nrFiltre = nrFiltre;
	}

	// metode suprascrise din clasa abstracta
	@Override
	public double calculeazaPretConsumPeLuna(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi * 30;
	}

	@Override
	public double calculeazaPretConsumPeZi(int oreConsumZi) {
		return this.getPutereConsumata() * oreConsumZi;
	}

}
