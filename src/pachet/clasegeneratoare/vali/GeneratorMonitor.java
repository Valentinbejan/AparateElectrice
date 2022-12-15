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
public class GeneratorMonitor {

	static private String[] numeProdusMonitor = new String[] { "Monitor LCD", "Monitor LED", "Monitor OLED",
			"Monitor QLED" };

	static private String[] producatorMonitor = new String[] { "Philips", "Samsung", "LG", "Acer", "Asus", "Dell" };

	static private int minpret = 500;
	static private int maxpret = 4500;

	static private String[] culoareMonitor = new String[] { "alb", "negru", "verde", "albastru", "rosu", "galben" };

	static private int minputereConsumata = 10000;
	static private int maxputereConsumata = 50000;

	static private String[] formatEcranMonitor = new String[] { "clasic", "ultraWide", "Wide" };
	static private String[] rezolutieOptimaMonitor = new String[] { "1280 x 720", "1920 x 1080", "2560 x 1440",
			"3840 x 2160" };
	static private String[] functiiSpecialeMonitor = new String[] { "ecran curbat", "touchscreen", "webcam" };

	// metoda statica, poate fi apelata fara a instantia clasa
	public static ArrayList<Monitor> genereazaRandomMonitor(int n) {
		ArrayList<Monitor> listaMonitor = new ArrayList<>();
		Monitor unMonitor;
		for (double i = 0; i < n; i++) {

			double pret = new Random().nextInt(maxpret - minpret + 1) + minpret;
			double putereConsumata = new Random().nextInt(maxputereConsumata - minputereConsumata + 1)
					+ minputereConsumata;

			ArrayList<Integer> listrataRefresh = new ArrayList<>();
			listrataRefresh.add(60);
			listrataRefresh.add(75);
			listrataRefresh.add(120);
			listrataRefresh.add(144);
			listrataRefresh.add(240);

			Random randomizer = new Random();
			double rataRefresh = listrataRefresh.get(randomizer.nextInt(listrataRefresh.size()));

			ArrayList<Integer> listdiagonala = new ArrayList<>();
			listdiagonala.add(20);
			listdiagonala.add(23);
			listdiagonala.add(25);
			listdiagonala.add(27);
			listdiagonala.add(29);

			Random randomizer2 = new Random();
			double diagonala = listdiagonala.get(randomizer2.nextInt(listdiagonala.size()));

			ArrayList<Integer> listtimpRaspuns = new ArrayList<>();
			listtimpRaspuns.add(3);
			listtimpRaspuns.add(5);
			listtimpRaspuns.add(7);
			listtimpRaspuns.add(9);
			listtimpRaspuns.add(11);

			Random randomizer3 = new Random();
			double timpRaspuns = listtimpRaspuns.get(randomizer3.nextInt(listtimpRaspuns.size()));

			String formatEcran = formatEcranMonitor[new Random().nextInt(formatEcranMonitor.length)];
			String rezolutieOptima = rezolutieOptimaMonitor[new Random().nextInt(rezolutieOptimaMonitor.length)];
			String functiiSpeciale = functiiSpecialeMonitor[new Random().nextInt(functiiSpecialeMonitor.length)];

			String numeProdus = numeProdusMonitor[new Random().nextInt(numeProdusMonitor.length)];
			String producator = producatorMonitor[new Random().nextInt(producatorMonitor.length)];
			String culoare = culoareMonitor[new Random().nextInt(culoareMonitor.length)];

			unMonitor = new Monitor(numeProdus, producator, pret, culoare, putereConsumata, rataRefresh, diagonala,
					formatEcran, rezolutieOptima, timpRaspuns, functiiSpeciale);

			listaMonitor.add(unMonitor);
		}
		return listaMonitor;

	}
}
