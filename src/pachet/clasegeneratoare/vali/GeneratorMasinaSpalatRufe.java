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
public class GeneratorMasinaSpalatRufe {

	static private String[] numeProdusMasinaSpalatRufe = new String[] { "Masina de spalat rufe cu incarcare verticala",
			"Masina de spalat rufe cu incarcare frontala", "Masina de spalat rufe slim cu incarcare frontala",
			"Masina de spalat rufe compacta cu incarcare frontala" };

	static private String[] producatorMasinaSpalatRufe = new String[] { "Bosch", "Whirlpool", "Indesit", "Beko", "Arctic"};

	static private int minpret = 100;
	static private int maxpret = 3500;

	static private String[] culoareMasinaSpalatRufe = new String[] { "Alb", "Negru", "Gri", "Albastru", "Rosu",
			"Portocaliu" ,"Argintiu"};

	static private int minputereConsumata = 500;
	static private int maxputereConsumata = 2500;

	// metoda statica, poate fi apelata fara a instantia clasa
	public static ArrayList<MasinaSpalatRufe> genereazaRandomMasinaSpalatRufe(int n) {
		ArrayList<MasinaSpalatRufe> listaMasinaSpalatRufe = new ArrayList<>();
		MasinaSpalatRufe unMasinaSpalatRufe;
		for (double i = 0; i < n; i++) {

			double pret = new Random().nextInt(maxpret - minpret + 1) + minpret;
			double putereConsumata = new Random().nextInt(maxputereConsumata - minputereConsumata + 1)
					+ minputereConsumata;

			double capacitate = new Random().nextInt(100);
			double rotatii = new Random().nextInt(1600);

			String numeProdus = numeProdusMasinaSpalatRufe[new Random().nextInt(numeProdusMasinaSpalatRufe.length)];
			String producator = producatorMasinaSpalatRufe[new Random().nextInt(producatorMasinaSpalatRufe.length)];
			String culoare = culoareMasinaSpalatRufe[new Random().nextInt(culoareMasinaSpalatRufe.length)];

			unMasinaSpalatRufe = new MasinaSpalatRufe(numeProdus, producator, pret, culoare, putereConsumata,
					capacitate, rotatii);

			listaMasinaSpalatRufe.add(unMasinaSpalatRufe);
		}
		return listaMasinaSpalatRufe;

	}
}
