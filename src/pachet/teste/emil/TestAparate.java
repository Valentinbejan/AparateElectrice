package pachet.teste.emil;

import java.util.ArrayList;

import pachet.clase.emil.*;
import pachet.clasefilter.emil.*;
import pachet.clasegeneratoare.emil.*;

public class TestAparate {

	public static void main(String[] args) {

		ArrayList<Aspirator> listaAspiratoare = GeneratorAspiratoare.genereaza(5);
//		for (Aspirator aspirator : listaAspiratoare) {
//			System.out.println(aspirator);
//		}

		ArrayList<Televizor> listaTelevizoare = GeneratorTelevizore.genereaza(5);
//		for (Televizor televizor : listaTelevizoare) {
//			System.out.println(televizor);
//		}

		ArrayList<StatieCalcat> listaStatiiDeCalcat = GeneratorStatiiCalcat.genereaza(5);
//		for (StatieCalcat statieDeCalcat : listaStatiiDeCalcat) {
//			System.out.println(statieDeCalcat);
//		}

		ArrayList<RobotBucatarie> listaRobotiDeBucatarie = GeneratorRobotiBucatarie.genereaza(5);
//		for (RobotBucatarie robotBucatarie : listaRobotiDeBucatarie) {
//			System.out.println(robotBucatarie);
//		}

		// Folosind programarea concurenta:

		AspiratorFilter.filtreazaDupaCapacitateaDeColectare(listaAspiratoare, 3000).forEach(System.out::println);
		AspiratorFilter.filtreazaDupaClasaEmisiilorDePraf(listaAspiratoare, 'A').forEach(System.out::println);
		RobotBucatarieFilter.filtreazaDupaNumarViteze(listaRobotiDeBucatarie, 3).forEach(System.out::println);
		RobotBucatarieFilter.filtreazaDupaNumarUstensile(listaRobotiDeBucatarie, 5).forEach(System.out::println);
		StatieCalcatFilter.filtreazaDupaMaterialTalpa(listaStatiiDeCalcat, "teflon").forEach(System.out::println);
		StatieCalcatFilter.filtreazaDupaFunctie(listaStatiiDeCalcat, "anticalcar").forEach(System.out::println);
		TelevizorFilter.filtreazaDupaTehnologieAudio(listaTelevizoare, "Dolby Atmos").forEach(System.out::println);
		TelevizorFilter.filtreazaDupaTipTV(listaTelevizoare, "SmartTV").forEach(System.out::println);
		
		
	}
}
