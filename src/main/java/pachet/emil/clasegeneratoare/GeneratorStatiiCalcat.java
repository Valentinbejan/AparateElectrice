package pachet.emil.clasegeneratoare;

import java.util.ArrayList;
import java.util.Random;

import pachet.emil.clase.StatieCalcat;

public class GeneratorStatiiCalcat {
	private static String[] lista_tipuri = new String[] { "vertical", "horizontal" };
	private static String[] lista_materiale_talpa = new String[] { "teflon", "ceramica", "inox" };

	private static String[] lista_tipuri_panou_de_comanda = new String[] { "mecanic", "digital" };
	private static int[] greutati = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private static String[] lista_functii = new String[] { "auto-curatare", "anticalcar", "cu boiler" };

	private static double[] lista_capacitati_rezervor_apa = new double[] { 1.5, 2.5, 3.5, 4.5, 5.5 };
	private static String[] culori = new String[] { "albastru", "rosu", "galben", "verde", "mov", "portocaliu", "negru",
			"alb" };

	public static ArrayList<StatieCalcat> genereaza(int nrStatiiDeCalcat) {
		ArrayList<StatieCalcat> listaStatiiDeCalcat = new ArrayList<StatieCalcat>();
		Random r = new Random();
		for (int i = 0; i < nrStatiiDeCalcat; i++) {
			StatieCalcat s = new StatieCalcat("StatieDeCalcat" + (i + 1), "Producator" + (i + 1),
					Math.max(100, r.nextInt(1000)), culori[r.nextInt(culori.length)], Math.max(100, r.nextInt(1000)));
			s.setTip(lista_tipuri[r.nextInt(lista_tipuri.length)]);
			s.setMaterialTalpa(lista_materiale_talpa[r.nextInt(lista_materiale_talpa.length)]);
			s.setTip_panou_de_comanda(lista_tipuri_panou_de_comanda[r.nextInt(lista_tipuri_panou_de_comanda.length)]);
			s.setGreutate(greutati[r.nextInt(greutati.length)]);
			s.setFunctie(lista_functii[r.nextInt(lista_functii.length)]);
			s.setCapacitate_rezervor_apa(
					lista_capacitati_rezervor_apa[r.nextInt(lista_capacitati_rezervor_apa.length)]);
			listaStatiiDeCalcat.add(s);
		}
		return listaStatiiDeCalcat;
	}

	public static String[] getLista_materiale_talpa() {

		return lista_materiale_talpa;
	}

	public static String[] getLista_functii() {
		return lista_functii;
	}
}
