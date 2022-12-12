package pachet.clase.emil;

import pachet.clasa.abstracta.AparatElectric;

public class Televizor extends AparatElectric {
	private String tipTV; // ex:Clasic, SmartTV,SmartTV 3D,
	private String tehnologieAudio; // ex: Fara, Dolby Digital, Dolby Digital Plus, Dolby Atmos
	private double greutate;// ex:13,5 kg
	private double diagonalaEcran; // ex:80cm, 125cm
	private String tehnologieDisplay;// ex:LCD,LED,OLED
	private String rezolutie;// ex:HD,FullHD,UltraHD4K
	private String tipDisplay;// ex:plat, curbat

	// Constructor implicit (fara parametri):
	public Televizor() {
		super();
		this.tipTV = "";
		this.tehnologieAudio = "";
		this.greutate = 0;
		this.diagonalaEcran = 0;
		this.tehnologieDisplay = "";
		this.rezolutie = "";
		this.tipDisplay = "";
	}

	// construcotr cu parametrii superclasei
	public Televizor(String numeProdus, String producator, double pret, String culoare, double putereConsumata) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.tipTV = "";
		this.tehnologieAudio = "";
		this.greutate = 0;
		this.diagonalaEcran = 0;
		this.tehnologieDisplay = "";
		this.rezolutie = "";
		this.tipDisplay = "";
	}

	// Constructor explicit (cu parametri):
	public Televizor(String numeProdus, String producator, double pret, String culoare, double putereConsumata,
			String tipTV, String tehnologieAudio, double greutate, double diagonalaEcran, String tehnologieDisplay,
			String rezolutie, String tipDisplay) {
		super(numeProdus, producator, pret, culoare, putereConsumata);
		this.tipTV = tipTV;
		this.tehnologieAudio = tehnologieAudio;
		this.greutate = greutate;
		this.diagonalaEcran = diagonalaEcran;
		this.tehnologieDisplay = tehnologieDisplay;
		this.rezolutie = rezolutie;
		this.tipDisplay = tipDisplay;
	}

	// Constructor de copiere:
	public Televizor(Televizor t) {
		super(t);
		this.tipTV = t.tipTV;
		this.tehnologieAudio = t.tehnologieAudio;
		this.greutate = t.greutate;
		this.diagonalaEcran = t.diagonalaEcran;
		this.tehnologieDisplay = t.tehnologieDisplay;
		this.rezolutie = t.rezolutie;
		this.tipDisplay = t.tipDisplay;
	}

	// Metode setters si getters:
	public String getTipTV() {
		return tipTV;
	}

	public void setTipTV(String tipTV) {
		this.tipTV = tipTV;
	}

	public String getTehnologieAudio() {
		return tehnologieAudio;
	}

	public void setTehnologieAudio(String tehnologieAudio) {
		this.tehnologieAudio = tehnologieAudio;
	}

	public double getGreutate() {
		return greutate;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public double getDiagonalaEcran() {
		return diagonalaEcran;
	}

	public void setDiagonalaEcran(double diagonalaEcran) {
		this.diagonalaEcran = diagonalaEcran;
	}

	public String getTehnologieDisplay() {
		return tehnologieDisplay;
	}

	public void setTehnologieDisplay(String tehnologieDisplay) {
		this.tehnologieDisplay = tehnologieDisplay;
	}

	public String getRezolutie() {
		return rezolutie;
	}

	public void setRezolutie(String rezolutie) {
		this.rezolutie = rezolutie;
	}

	public String getTipDisplay() {
		return tipDisplay;
	}

	public void setTipDisplay(String tipDisplay) {
		this.tipDisplay = tipDisplay;
	}

	@Override
	public String toString() {
		StringBuilder sir = new StringBuilder();
		sir.append(super.toString());
		sir.append("\n\tTipTV=" + tipTV);
		sir.append("\n\tTehnologieAudio=" + tehnologieAudio);
		sir.append("\n\tGreutate=" + greutate + " kg");
		sir.append("\n\tDiagonalaEcran=" + diagonalaEcran + " cm");
		sir.append("\n\tTehnologieDisplay=" + tehnologieDisplay);
		sir.append("\n\tRezolutie=" + rezolutie);
		sir.append("\n\tTipDisplay=" + tipDisplay+"\n\n");

		return sir.toString();

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
