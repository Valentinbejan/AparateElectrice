package pachet.emil.teste;

import java.util.ArrayList;

import pachet.clasegeneratoare.emil.GeneratorAspiratoare;
import pachet.clasegeneratoare.emil.GeneratorRobotiBucatarie;
import pachet.clasegeneratoare.emil.GeneratorStatiiCalcat;
import pachet.clasegeneratoare.emil.GeneratorTelevizore;
import pachet.emil.clase.Aspirator;
import pachet.emil.clase.RobotBucatarie;
import pachet.emil.clase.StatieCalcat;
import pachet.emil.clase.Televizor;

public class TestTema3 {
	public static void main(String[] args) {
		ArrayList<Aspirator> listaAspiratoare = GeneratorAspiratoare.genereaza(5);
		for (Aspirator aspirator : listaAspiratoare) {
			System.out.println(aspirator);
		}

		ArrayList<Televizor> listaTelevizoare = GeneratorTelevizore.genereaza(5);
		for (Televizor televizor : listaTelevizoare) {
			System.out.println(televizor);
		}

		ArrayList<StatieCalcat> listaStatiiDeCalcat = GeneratorStatiiCalcat.genereaza(5);
		for (StatieCalcat statieDeCalcat : listaStatiiDeCalcat) {
			System.out.println(statieDeCalcat);
		}

		ArrayList<RobotBucatarie> listaRobotiDeBucatarie = GeneratorRobotiBucatarie.genereaza(5);
		for (RobotBucatarie robotBucatarie : listaRobotiDeBucatarie) {
			System.out.println(robotBucatarie);
		}

	}

}
