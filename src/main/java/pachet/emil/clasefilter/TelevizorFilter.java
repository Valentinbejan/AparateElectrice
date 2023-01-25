package pachet.emil.clasefilter;

import java.util.ArrayList;

import pachet.emil.clase.Televizor;

public class TelevizorFilter {
	public static ArrayList<Televizor> filtreazaDupaTipTV(ArrayList<Televizor> listaStatieCalcat, String tipTV) {
		
		ArrayList<Televizor> lista_filtrata = new ArrayList<>();
		for (Televizor obj : listaStatieCalcat)
			if (obj.getTipTV().equals(tipTV))
				lista_filtrata.add(obj);

		return lista_filtrata;
	}

	public static ArrayList<Televizor> filtreazaDupaTehnologieAudio(ArrayList<Televizor> listaStatieCalcat,
			String tehnologieAudio) {
		
		ArrayList<Televizor> lista_filtrata = new ArrayList<>();
		for (Televizor obj : listaStatieCalcat)
			if (obj.getTehnologieAudio().equals(tehnologieAudio))
				lista_filtrata.add(obj);

		return lista_filtrata;
	}

}
