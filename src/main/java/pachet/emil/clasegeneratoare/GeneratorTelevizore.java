package pachet.emil.clasegeneratoare;

import java.util.ArrayList;
import java.util.Random;

import pachet.emil.clase.Televizor;

public class GeneratorTelevizore {
	private static String[] tipuriTV = new String[] { "Clasic", "SmartTV", "SmartTV 3D" };

	private static String[] tehnologiiAudio = new String[] { "Fara", "Dolby Digital", "Dolby Digital Plus",
			"Dolby Atmos" };

	private static double[] greutati = new double[] { 13.5, 15.5, 17.5, 19.5, 21.5 };
	private static double[] diagonaleEcran = new double[] { 80, 100, 125, 150, 175 };
	private static String[] tehnologiiDisplay = new String[] { "LCD", "LED", "OLED" };
	private static String[] rezolutii = new String[] { "HD", "FullHD", "UltraHD4K" };
	private static String[] tipuriDisplay = new String[] { "plat", "curbat" };

	private static String[] culori = new String[] { "albastru", "rosu", "galben", "verde", "mov", "portocaliu", "negru",
			"alb" };

	public static ArrayList<Televizor> genereaza(int nrTelevizoare) {
		ArrayList<Televizor> televizoare = new ArrayList<Televizor>();
		Random r = new Random();
		for (int i = 0; i < nrTelevizoare; i++) {
			Televizor t = new Televizor("Televizor" + (i + 1), "Producator" + (i + 1), Math.max(100, r.nextInt(1000)),
					culori[r.nextInt(culori.length)], Math.max(100, r.nextInt(1000)));
			t.setTipTV(tipuriTV[r.nextInt(tipuriTV.length)]);
			t.setTehnologieAudio(tehnologiiAudio[r.nextInt(tehnologiiAudio.length)]);
			t.setGreutate(greutati[r.nextInt(greutati.length)]);
			t.setDiagonalaEcran(diagonaleEcran[r.nextInt(diagonaleEcran.length)]);
			t.setTehnologieDisplay(tehnologiiDisplay[r.nextInt(tehnologiiDisplay.length)]);
			t.setRezolutie(rezolutii[r.nextInt(rezolutii.length)]);
			t.setTipDisplay(tipuriDisplay[r.nextInt(tipuriDisplay.length)]);
			televizoare.add(t);
		}
		return televizoare;
	}

	public static String[] getTipuriTV() {
		return tipuriTV;
	}

	public static String[] getTehnologiiAudio() {
		return tehnologiiAudio;
	}
}
