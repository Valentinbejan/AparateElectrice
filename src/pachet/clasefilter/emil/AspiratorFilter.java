package pachet.clasefilter.emil;

import java.util.ArrayList;

import pachet.clase.emil.Aspirator;

public class AspiratorFilter {
	public static ArrayList<Aspirator> filtreazaDupaCapacitateaDeColectare(ArrayList<Aspirator> listaAspiratoare,
			int capacitateDeColectare) {

		ArrayList<Aspirator> lista_filtrata = new ArrayList<>();
		for (Aspirator obj : listaAspiratoare) {
			if (obj.getCapacitateDeColectare() <= capacitateDeColectare)
				lista_filtrata.add(obj);
		}

		return lista_filtrata;
	}

	public static ArrayList<Aspirator> filtreazaDupaClasaEmisiilorDePraf(ArrayList<Aspirator> listaAspiratoare,
			char clasaEmisiPraf) {

		ArrayList<Aspirator> lista_filtrata = new ArrayList<>();
		char clasaEmisiPraf_ = Character.toUpperCase(clasaEmisiPraf);
		for (Aspirator obj : listaAspiratoare) {
			if (obj.getClasaEmisiPraf() == clasaEmisiPraf_)
				lista_filtrata.add(obj);
		}

		return lista_filtrata;
	}

}
