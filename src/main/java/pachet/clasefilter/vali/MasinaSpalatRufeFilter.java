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
public class MasinaSpalatRufeFilter {
    
    
    public static ArrayList<MasinaSpalatRufe> filtreazaDupaCapacitate(ArrayList<MasinaSpalatRufe> listaInitalaMasinaSpalatRufe, double capacitate) {
		ArrayList<MasinaSpalatRufe> listaMasinaSpalatRufe = new ArrayList();
		for(MasinaSpalatRufe masinaSpalatRufe:listaInitalaMasinaSpalatRufe)
			if (masinaSpalatRufe.getCapacicate() <= capacitate) 
					listaMasinaSpalatRufe.add(masinaSpalatRufe);		
		return listaMasinaSpalatRufe;
	}
    
    
    
    public static ArrayList<MasinaSpalatRufe> filtreazaDupaRotatii(ArrayList<MasinaSpalatRufe> listaInitalaMasinaSpalatRufe, double rotatii) {
		ArrayList<MasinaSpalatRufe> listaMasinaSpalatRufe = new ArrayList();
		for(MasinaSpalatRufe masinaSpalatRufe:listaInitalaMasinaSpalatRufe)
			if (masinaSpalatRufe.getRotatii() <= rotatii) 
					listaMasinaSpalatRufe.add(masinaSpalatRufe);		
		return listaMasinaSpalatRufe;
	}
    
    
}
