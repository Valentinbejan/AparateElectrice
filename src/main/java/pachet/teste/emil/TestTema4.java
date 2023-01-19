package pachet.teste.emil;

import java.util.ArrayList;
import pachet.clase.emil.*;
import pachet.clasefilter.emil.*;
import pachet.clasegeneratoare.emil.*;

public class TestTema4 {
	public static void main(String[] args) {
		ArrayList<Aspirator> listaAspiratoare = GeneratorAspiratoare.genereaza(5);
		ArrayList<Televizor> listaTelevizoare = GeneratorTelevizore.genereaza(5);
		ArrayList<StatieCalcat> listaStatiiDeCalcat = GeneratorStatiiCalcat.genereaza(5);
		ArrayList<RobotBucatarie> listaRobotiDeBucatarie = GeneratorRobotiBucatarie.genereaza(5);

		// Iteram folosind programarea concurenta:

		System.out.println("AspiratorFilter.filtreazaDupaCapacitateaDeColectare:\n");
		AspiratorFilter.filtreazaDupaCapacitateaDeColectare(listaAspiratoare, 3000).forEach(System.out::println);
		System.out.println("AspiratorFilter.filtreazaDupaClasaEmisiilorDePraf:\n");
		AspiratorFilter.filtreazaDupaClasaEmisiilorDePraf(listaAspiratoare, 'A').forEach(System.out::println);

		System.out.println("RobotBucatarieFilter.filtreazaDupaNumarViteze:\n");
		RobotBucatarieFilter.filtreazaDupaNumarViteze(listaRobotiDeBucatarie, 3).forEach(System.out::println);
		System.out.println("RobotBucatarieFilter.filtreazaDupaNumarUstensile:\n");
		RobotBucatarieFilter.filtreazaDupaNumarUstensile(listaRobotiDeBucatarie, 5).forEach(System.out::println);

		System.out.println("StatieCalcatFilter.filtreazaDupaMaterialTalpa:\n");
		StatieCalcatFilter.filtreazaDupaMaterialTalpa(listaStatiiDeCalcat, "teflon").forEach(System.out::println);
		System.out.println("StatieCalcatFilter.filtreazaDupaFunctie:\n");
		StatieCalcatFilter.filtreazaDupaFunctie(listaStatiiDeCalcat, "anticalcar").forEach(System.out::println);

		System.out.println("TelevizorFilter.filtreazaDupaTehnologieAudio:\n");
		TelevizorFilter.filtreazaDupaTehnologieAudio(listaTelevizoare, "Dolby Atmos").forEach(System.out::println);
		System.out.println("TelevizorFilter.filtreazaDupaTipTV:\n");
		TelevizorFilter.filtreazaDupaTipTV(listaTelevizoare, "SmartTV").forEach(System.out::println);
	}
}
