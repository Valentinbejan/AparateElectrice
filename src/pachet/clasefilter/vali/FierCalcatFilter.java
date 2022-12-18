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
public class FierCalcatFilter {
    
    
     public static ArrayList<FierCalcat> filtreazaDupaTalpa(ArrayList<FierCalcat> listaInitalaFierCalcat, String talpa) {
		ArrayList<FierCalcat> listaFierCalcat = new ArrayList();
		for(FierCalcat fierCalcat:listaInitalaFierCalcat)
			if (fierCalcat.getTalpa().equals(talpa) )
					listaFierCalcat.add(fierCalcat);		
		return listaFierCalcat;
	}
    
    
    public static ArrayList<FierCalcat> filtreazaDupaFunctii(ArrayList<FierCalcat> listaInitalaFierCalcat, String functii) {
		ArrayList<FierCalcat> listaFierCalcat = new ArrayList();
		for(FierCalcat fierCalcat:listaInitalaFierCalcat)
			if (fierCalcat.getFunctii().equals(functii) )
					listaFierCalcat.add(fierCalcat);		
		return listaFierCalcat;
	}
    
    
}
