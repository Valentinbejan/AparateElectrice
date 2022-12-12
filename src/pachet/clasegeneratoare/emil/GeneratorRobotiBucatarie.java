package pachet.clasegeneratoare.emil;

import java.util.ArrayList;
import java.util.Random;

import pachet.clase.emil.RobotBucatarie;


public class GeneratorRobotiBucatarie {
//	private double capacitate;
//	private double numarViteze;
//	private double numarUstensile;
//	private int nivelZgomot; 48 - 80

	private static float capacitati[] = new float[] { 0.5f, 1, 1.5f, 2, 2.5f, 3, 3.5f, 4, 4.5f, 5 };
	private static int numereViteze[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private static int numereUstensile[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private static int niveleDeZgomot[] = new int[] { 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80 };
	private static String[] culori = new String[] { "albastru", "rosu", "galben", "verde", "mov", "portocaliu", "negru",
			"alb" };

	public static ArrayList<RobotBucatarie> genereaza(int nrRobotiBucatarie) {
		ArrayList<RobotBucatarie> robotiBucatarie = new ArrayList<RobotBucatarie>();
		Random r = new Random();
		for (int i = 0; i < nrRobotiBucatarie; i++) {
			RobotBucatarie ro = new RobotBucatarie("RobotBucatarie" + (i + 1), "Producator" + (i + 1),
					r.nextDouble(1000), culori[r.nextInt(culori.length)], r.nextDouble(1000));
            ro.setCapacitate(capacitati[r.nextInt(capacitati.length)]);
            ro.setNumarViteze(numereViteze[r.nextInt(numereViteze.length)]);
            ro.setNumarUstensile(numereUstensile[r.nextInt(numereUstensile.length)]);
            ro.setNivelZgomot(niveleDeZgomot[r.nextInt(niveleDeZgomot.length)]);
            robotiBucatarie.add(ro);
		}
		return robotiBucatarie;
	}

}
