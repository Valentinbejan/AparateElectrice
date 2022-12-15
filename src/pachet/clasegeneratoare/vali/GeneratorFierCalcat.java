/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachet.clasegeneratoare.vali;

import java.util.ArrayList;
import java.util.Random;

import pachet.clase.valentin.*;

/**
 *
 * @author Valentin
 */
public class GeneratorFierCalcat {

	static private String[] numeProdusFierCalcat = new String[] { "Fier Calcat vertical", "Fier de Calcat orizontal",
			"Fier de Calcat cu abur", "Fier de Calcat mini" };

	static private String[] producatorFierCalcat = new String[] { "Tefal", "Hausberg", "Philips", "Zilian", "Braun",
			"OEM" };

	static private double pret;
	static private int minpret = 100;
	static private int maxpret = 800;

	static private String[] culoareFierCalcat = new String[] { "alb", "negru", "verde", "albastru", "rosu", "galben" };

	static private double putereConsumata;
	static private int minputereConsumata = 100;
	static private int maxputereConsumata = 2000;

	static private String[] talpi = new String[] { "Zola", "Iron", "Philips", "Prym", "Veronesi", "STB" };
	static private String[] functiiFierCalcat = new String[] { "functia anti picurare", "functia de oprire automata" };

	// metoda statica, poate fi apelata fara a instantia clasa
	public static ArrayList<FierCalcat> genereazaRandomFierCalcat(int n) {
		ArrayList<FierCalcat> listaFierCalcat = new ArrayList();
		FierCalcat unFierCalcat;
		for (double i = 0; i < n; i++) {

			double pret = new Random().nextInt(maxpret - minpret + 1) + minpret;
			double putereConsumata = new Random().nextInt(maxputereConsumata - minputereConsumata + 1)
					+ minputereConsumata;

			double latime = new Random().nextInt(100);
			double lungime = new Random().nextInt(100);
			double adancime = new Random().nextInt(100);
			double lungimeCablu = new Random().nextInt(100);
			double greutate = new Random().nextInt(100);
			double debitAbur = new Random().nextInt(100);
			String talpa = talpi[new Random().nextInt(talpi.length)];
			String functii = functiiFierCalcat[new Random().nextInt(functiiFierCalcat.length)];
			String numeProdus = numeProdusFierCalcat[new Random().nextInt(numeProdusFierCalcat.length)];
			String producator = producatorFierCalcat[new Random().nextInt(producatorFierCalcat.length)];
			String culoare = culoareFierCalcat[new Random().nextInt(culoareFierCalcat.length)];

			unFierCalcat = new FierCalcat(numeProdus, producator, pret, culoare, putereConsumata, talpa, latime,
					lungime, adancime, lungimeCablu, greutate, debitAbur, functii);

			listaFierCalcat.add(unFierCalcat);
		}
		return listaFierCalcat;
	}

}
