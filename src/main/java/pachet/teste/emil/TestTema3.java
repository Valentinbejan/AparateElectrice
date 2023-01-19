package pachet.teste.emil;

import java.util.ArrayList;
import pachet.clase.emil.*;
import pachet.clasegeneratoare.emil.*;

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
