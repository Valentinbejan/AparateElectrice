/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachet.clasefilter.vali;
import java.util.ArrayList;

import pachet.clase.valentin.*;


/**
 *
 * @author Valentin
 */
public class MasinaSpalatVaseFilter {
    
      public static ArrayList<MasinaSpalatVase> filtreazaDupaNumarSeturi(ArrayList<MasinaSpalatVase> listaInitalaMasinaSpalatVase, int numarSeturi) {
		ArrayList<MasinaSpalatVase> listaMasinaSpalatVase = new ArrayList();
		for(MasinaSpalatVase masinaSpalatVase:listaInitalaMasinaSpalatVase)
			if (masinaSpalatVase.getNumarSeturi() <= numarSeturi) 
					listaMasinaSpalatVase.add(masinaSpalatVase);		
		return listaMasinaSpalatVase;
	}
    
    
    
    public static ArrayList<MasinaSpalatVase> filtreazaDupaLatimeCuva(ArrayList<MasinaSpalatVase> listaInitalaMasinaSpalatVase, double latimeCuva) {
		ArrayList<MasinaSpalatVase> listaMasinaSpalatVase = new ArrayList();
		for(MasinaSpalatVase masinaSpalatVase:listaInitalaMasinaSpalatVase)
			if (masinaSpalatVase.getLatimeCuva() <= latimeCuva) 
					listaMasinaSpalatVase.add(masinaSpalatVase);		
		return listaMasinaSpalatVase;
	}
    
    
}
