package pachet.emil.clasefilter;

import java.util.ArrayList;

import pachet.emil.clase.StatieCalcat;

public class StatieCalcatFilter {

	public static ArrayList<StatieCalcat> filtreazaDupaMaterialTalpa(ArrayList<StatieCalcat> listaStatieCalcat,
			String materialTalpa) {
		ArrayList<StatieCalcat> lista_filtrata = new ArrayList<>();
		for (StatieCalcat obj : listaStatieCalcat)
			if (obj.getMaterialTalpa().equals(materialTalpa))
				lista_filtrata.add(obj);

		return lista_filtrata;
	}

	public static ArrayList<StatieCalcat> filtreazaDupaFunctie(ArrayList<StatieCalcat> listaStatieCalcat,
			String functie) {
		ArrayList<StatieCalcat> lista_filtrata = new ArrayList<>();
		for (StatieCalcat obj : listaStatieCalcat)
			if (obj.getFunctie().equals(functie))
				lista_filtrata.add(obj);

		return lista_filtrata;
	}

}
