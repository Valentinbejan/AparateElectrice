package pachet.emil.clasefilter;

import java.util.ArrayList;

import pachet.emil.clase.RobotBucatarie;

public class RobotBucatarieFilter {
	public static ArrayList<RobotBucatarie> filtreazaDupaNumarViteze(ArrayList<RobotBucatarie> listaRobotiDeBucatarie,
			int numarViteze) {
		ArrayList<RobotBucatarie> lista_filtrata = new ArrayList<>();
		for (RobotBucatarie obj : listaRobotiDeBucatarie)
			if (obj.getNumarViteze() <= numarViteze)
				lista_filtrata.add(obj);

		return lista_filtrata;
	}

	public static ArrayList<RobotBucatarie> filtreazaDupaNumarUstensile(
			ArrayList<RobotBucatarie> listaRobotiDeBucatarie, int numarUstensile) {
		ArrayList<RobotBucatarie> lista_filtrata = new ArrayList<>();
		for (RobotBucatarie obj : listaRobotiDeBucatarie)
			if (obj.getNumarUstensile() <= numarUstensile)
				lista_filtrata.add(obj);

		return lista_filtrata;
	}
}
