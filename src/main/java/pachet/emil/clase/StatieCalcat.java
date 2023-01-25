
package pachet.emil.clase;

import pachet.clasa.abstracta.AparatElectric;

public class StatieCalcat extends AparatElectric {
	private static final long serialVersionUID = 5656L;

	private String tip; // vertical //horizontal
	private String materialTalpa; // teflon //ceramica //inox
	private String tip_panou_de_comanda; // mecanic //digital
	private double greutate; // kg
	private String functie; // auto-curatare //anticalcar //cu boiler
	private double capacitate_rezervor_apa; // l

	// Constructor implicit (fara parametri):
	public StatieCalcat() {
		super();
		this.tip = "";
		this.materialTalpa = "";
		this.tip_panou_de_comanda = "";
		this.greutate = 0;
		this.functie = "";
		this.capacitate_rezervor_apa = 0;

	}

	// construcotr cu parametrii superclasei
	public StatieCalcat(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.tip = "";
		this.materialTalpa = "";
		this.tip_panou_de_comanda = "";
		this.greutate = 0;
		this.functie = "";
		this.capacitate_rezervor_apa = 0;
	}

	// Constructor explicit (cu parametri):
	public StatieCalcat(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			String tip, String materialTalpa, String tip_panou_de_comanda, double greutate, String functii,
			double capacitate_rezervor_apa) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.tip = tip;
		this.materialTalpa = materialTalpa;
		this.tip_panou_de_comanda = tip_panou_de_comanda;
		this.greutate = greutate;
		this.functie = functii;
		this.capacitate_rezervor_apa = capacitate_rezervor_apa;
	}

	// Constructor de copiere:
	public StatieCalcat(StatieCalcat s) {
		super(s);
		this.tip = s.tip;
		this.materialTalpa = s.materialTalpa;
		this.tip_panou_de_comanda = s.tip_panou_de_comanda;
		this.greutate = s.greutate;
		this.functie = s.functie;
		this.capacitate_rezervor_apa = s.capacitate_rezervor_apa;
	}

	@Override
	public String toString() {
		StringBuilder sir = new StringBuilder();
		// sir.append(super.toString());
		sir.append("\n Aparat electric: \t\t" + getNumeProdus());
		sir.append("\n\tProducator: \t\t" + getProducator());
		sir.append("\n\tPret: \t\t" + getPret() + "[lei]");
		sir.append("\n\tCuloare: \t\t" + getCuloare());
		sir.append("\n\tPutere consumata: \t" + getPutereConsumata());
		sir.append("\n\tTip: \t\t" + this.tip);
		sir.append("\n\tMaterial talpa: \t\t" + this.materialTalpa);
		sir.append("\n\tTip panou de comanda: \t" + this.tip_panou_de_comanda);
		sir.append("\n\tGreutate: \t\t" + this.greutate + " kg");
		sir.append("\n\tFunctie: \t\t" + this.functie);
		sir.append("\n\tCapacitate rezervor apa: \t" + this.capacitate_rezervor_apa + " L\n\n");

		return sir.toString();

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// returnam un nou obiect identic folosind constructorul de copiere
		StatieCalcat clona = new StatieCalcat(this);
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

	// Metode setters si getters:

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getMaterialTalpa() {
		return materialTalpa;
	}

	public void setMaterialTalpa(String materialTalpa) {
		this.materialTalpa = materialTalpa;
	}

	public String getTip_panou_de_comanda() {
		return tip_panou_de_comanda;
	}

	public void setTip_panou_de_comanda(String tip_panou_de_comanda) {
		this.tip_panou_de_comanda = tip_panou_de_comanda;
	}

	public double getGreutate() {
		return greutate;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functii) {
		this.functie = functii;
	}

	public double getCapacitate_rezervor_apa() {
		return capacitate_rezervor_apa;
	}

	public void setCapacitate_rezervor_apa(double capacitate_rezervor_apa) {
		this.capacitate_rezervor_apa = capacitate_rezervor_apa;
	}

}
