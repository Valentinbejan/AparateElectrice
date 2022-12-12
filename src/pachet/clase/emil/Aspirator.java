package pachet.clase.emil;

import pachet.clasa.abstracta.AparatElectric;

public class Aspirator extends AparatElectric {
	private String clasaEmisiPraf; //
	private String tip;
	private String tipAspirare;
	private String tipCarcasa;
	private String tipFiltrare;
	private String tipFiltru;
	private int capacitateDeColectare;
	private int greutate;
	private int nivelZgomot;
	private int nrFiltre; //

	// Constructor cu parametrii
	public Aspirator(String clasaEmisiPraf, String tip, String tipAspirare, String tipCarcasa, String tipFiltrare,
			String tipFiltru, int capacitateDeColectare, int greutate, int nivelZgomot, int nrFiltre) {
		super();
		this.clasaEmisiPraf = clasaEmisiPraf;
		this.tip = tip;
		this.tipAspirare = tipAspirare;
		this.tipCarcasa = tipCarcasa;
		this.tipFiltrare = tipFiltrare;
		this.tipFiltru = tipFiltru;
		this.capacitateDeColectare = capacitateDeColectare;
		this.greutate = greutate;
		this.nivelZgomot = nivelZgomot;
		this.nrFiltre = nrFiltre;
	}

	public Aspirator(Aspirator a) {
		this.clasaEmisiPraf = a.clasaEmisiPraf;
		this.tip = a.tip;
		this.tipAspirare = a.tipAspirare;
		this.tipCarcasa = a.tipCarcasa;
		this.tipFiltrare = a.tipFiltrare;
		this.tipFiltru = a.tipFiltru;
		this.capacitateDeColectare = a.capacitateDeColectare;
		this.greutate = a.greutate;
		this.nivelZgomot = a.nivelZgomot;
		this.nrFiltre = a.nrFiltre;
	}

	// Metode getters si setters
	public String getClasaEmisiPraf() {
		return clasaEmisiPraf;
	}

	public void setClasaEmisiPraf(String clasaEmisiPraf) {
		this.clasaEmisiPraf = clasaEmisiPraf;
	}

	public int getNrFiltre() {
		return nrFiltre;
	}

	public void setNrFiltre(int nrFiltre) {
		this.nrFiltre = nrFiltre;
	}

	public int getGreutate() {
		return greutate;
	}

	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}

	public int getCapacitateDeColectare() {
		return capacitateDeColectare;
	}

	public void setCapacitateDeColectare(int capacitateDeColectare) {
		this.capacitateDeColectare = capacitateDeColectare;
	}

	public String getTipCarcasa() {
		return tipCarcasa;
	}

	public void setTipCarcasa(String tipCarcasa) {
		this.tipCarcasa = tipCarcasa;
	}

	public int getNivelZgomot() {
		return nivelZgomot;
	}

	public void setNivelZgomot(int nivelZgomot) {
		this.nivelZgomot = nivelZgomot;
	}

	public String getTipFiltru() {
		return tipFiltru;
	}

	public void setTipFiltru(String tipFiltru) {
		this.tipFiltru = tipFiltru;
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

	public String getTipFiltrare() {
		return tipFiltrare;
	}

	public void setTipFiltrare(String tipFiltrare) {
		this.tipFiltrare = tipFiltrare;
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
	public String toString() {
		return "Aspirator [clasaEmisiPraf=" + clasaEmisiPraf + ", tip=" + tip + ", tipAspirare=" + tipAspirare
				+ ", tipCarcasa=" + tipCarcasa + ", tipFiltrare=" + tipFiltrare + ", tipFiltru=" + tipFiltru
				+ ", capacitateDeColectare=" + capacitateDeColectare + ", greutate=" + greutate + ", nivelZgomot="
				+ nivelZgomot + ", nrFiltre=" + nrFiltre + "]";
	}

}
