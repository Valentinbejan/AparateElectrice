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
public class GeneratorMasinaSpalatVase {

	static private String[] numeProdusMasinaSpalatVase = new String[] { "Masina de spalat vase compacta",
			"Masina de spalat vase standard" };

	static private String[] producatorMasinaSpalatVase = new String[] { "BOSCH", "Candy", "Electrolux", "BEKO", "Hansa",
			"Miele" };

	static private int minpret = 500;
	static private int maxpret = 5000;

	static private String[] culoareMasinaSpalatVase = new String[] { "alb", "negru", "verde", "albastru", "rosu",
			"galben" };

	static private int minputereConsumata = 100;
	static private int maxputereConsumata = 2000;

	// metoda statica, poate fi apelata fara a instantia clasa
	public static ArrayList<MasinaSpalatVase> genereazaRandomMasinaSpalatVase(int n) {
		ArrayList<MasinaSpalatVase> listaMasinaSpalatVase = new ArrayList<>();
		MasinaSpalatVase unMasinaSpalatVase;
		for (double i = 0; i < n; i++) {

			double pret = new Random().nextInt(maxpret - minpret + 1) + minpret;
			double putereConsumata = new Random().nextInt(maxputereConsumata - minputereConsumata + 1)
					+ minputereConsumata;

			int numarSeturi = new Random().nextInt(100);
			double latimeCuva = new Random().nextInt(100);

			String numeProdus = numeProdusMasinaSpalatVase[new Random().nextInt(numeProdusMasinaSpalatVase.length)];
			String producator = producatorMasinaSpalatVase[new Random().nextInt(producatorMasinaSpalatVase.length)];
			String culoare = culoareMasinaSpalatVase[new Random().nextInt(culoareMasinaSpalatVase.length)];

			unMasinaSpalatVase = new MasinaSpalatVase(numeProdus, producator, pret, culoare, putereConsumata,
					numarSeturi, latimeCuva);

			listaMasinaSpalatVase.add(unMasinaSpalatVase);
		}
		return listaMasinaSpalatVase;

	}
}
