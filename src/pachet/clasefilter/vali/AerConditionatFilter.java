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
public class AerConditionatFilter {
    
    public static ArrayList<AerConditionat> filtreazaDupaClasa(ArrayList<AerConditionat> listaInitalaAerConditionat, String clasa) {
		ArrayList<AerConditionat> listaAerConditionat = new ArrayList();
		for(AerConditionat aerConditionat:listaInitalaAerConditionat)
			if (aerConditionat.getClasa().equals(clasa) )
					listaAerConditionat.add(aerConditionat);		
		return listaAerConditionat;
	}
    
    
    public static ArrayList<AerConditionat> filtreazaDupaArieAcoperita(ArrayList<AerConditionat> listaInitalaAerConditionat, double arieAcoperita) {
		ArrayList<AerConditionat> listaAerConditionat = new ArrayList();
		for(AerConditionat aerConditionat:listaInitalaAerConditionat)
			if (aerConditionat.getarieAcoperita() <= arieAcoperita) 
					listaAerConditionat.add(aerConditionat);		
		return listaAerConditionat;
	}
    
    
    
    
}
