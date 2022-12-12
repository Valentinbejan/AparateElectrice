package pachet.clasegeneratoare.emil;

import java.util.ArrayList;
import java.util.Random;
import pachet.clase.emil.*;

public class GeneratorAspiratoare {
	private static char[] claseEmisiPraf = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	private static String[] tipuri = new String[] { "vertical", "horizontal" };
	private static String[] tipuriAspirare = new String[] { "umeda", "uscata" };
	private static String[] tipuriCarcasa = new String[] { "plastic", "metal" };
	private static String[] tipuriSac = new String[] { "hartie", "plastic", "textil" };
	private static String[] tipuriFiltru = new String[] { "HEPA", "H13", "H14", "H15" };
	private static int[] capacitateDeColectare = new int[] { 1000, 2000, 3000, 4000, 5000 };
	private static int[] greutate = new int[] { 1, 2, 3, 4, 5 };
	private static int[] nivelZgomot = new int[] { 50, 60, 70, 80, 90 };
	private static int[] nrFiltre = new int[] { 1, 2, 3 };
	private static String[] culori = new String[] { "albastru", "rosu", "galben", "verde", "mov", "portocaliu", "negru",
			"alb" };

	public static ArrayList<Aspirator> genereaza(int nrAspiratoare) {
		ArrayList<Aspirator> listaAspiratoare = new ArrayList<Aspirator>();
		Random r = new Random();
		for (int i = 0; i < nrAspiratoare; i++) {
			Aspirator a = new Aspirator("Aspirator" + (i + 1), "Producator" + (i + 1), r.nextDouble(1000),
					culori[r.nextInt(culori.length)], r.nextDouble(1000));
			a.setClasaEmisiPraf(claseEmisiPraf[r.nextInt(claseEmisiPraf.length)]);
			a.setTip(tipuri[r.nextInt(tipuri.length)]);
			a.setTipAspirare(tipuriAspirare[r.nextInt(tipuriAspirare.length)]);
			a.setTipCarcasa(tipuriCarcasa[r.nextInt(tipuriCarcasa.length)]);
			a.setTipSac(tipuriSac[r.nextInt(tipuriSac.length)]);
			a.setTipFiltru(tipuriFiltru[r.nextInt(tipuriFiltru.length)]);
			a.setCapacitateDeColectare(capacitateDeColectare[r.nextInt(capacitateDeColectare.length)]);
			a.setGreutate(greutate[r.nextInt(greutate.length)]);
			a.setNivelZgomot(nivelZgomot[r.nextInt(nivelZgomot.length)]);
			a.setNrFiltre(nrFiltre[r.nextInt(nrFiltre.length)]);
			listaAspiratoare.add(a);
		}
		return listaAspiratoare;
	}

}
