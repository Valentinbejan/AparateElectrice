package pachet.teste.emil;

import java.util.ArrayList;

import pachet.clase.emil.*;

import pachet.clasegeneratoare.emil.*;

public class TestAparate {
	public static void main(String[] args) {

		ArrayList<Aspirator> lista1 = GeneratorAspiratoare.genereaza(3);
		for (Aspirator aspirator : lista1) {
			System.out.println(aspirator);
		}

		ArrayList<Televizor> lista2 = GeneratorTelevizore.genereaza(3);
		for (Televizor televizor : lista2) {
			System.out.println(televizor);
		}

		ArrayList<StatieCalcat> lista3 = GeneratorStatiiCalcat.genereaza(3);
		for (StatieCalcat statieDeCalcat : lista3) {
			System.out.println(statieDeCalcat);
		}
		
		ArrayList<RobotBucatarie> lista4 = GeneratorRobotiBucatarie.genereaza(3);
		for (RobotBucatarie robotBucatarie : lista4) {
			System.out.println(robotBucatarie);
		}
	}
}
