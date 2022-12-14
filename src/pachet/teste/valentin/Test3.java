/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachet.teste.valentin;

import java.util.ArrayList;
import pachet.clase.valentin.FierCalcat;
import pachet.clase.valentin.*;

/**
 *
 * @author Valentin
 */
public class Test3 {
    
    
    
    
    public static void main(String[] args) {
		
			
		ArrayList<FierCalcat> listaFierCalcat = GeneratorFierCalcat.genereazaRandomFierCalcat(10);		
		for(FierCalcat unFierCalcat:listaFierCalcat)
			System.out.println(unFierCalcat);
		
                
                ArrayList<AerConditionat> listaAerConditionat = GeneratorAerConditionat.genereazaRandomAerConditionat(10);		
		for(AerConditionat unAerConditionat:listaAerConditionat)
			System.out.println(unAerConditionat);
                
                
                ArrayList<MasinaSpalatRufe> listaMasinaSpalatRufe = GeneratorMasinaSpalatRufe.genereazaRandomMasinaSpalatRufe(10);		
		for(MasinaSpalatRufe unMasinaSpalatRufe:listaMasinaSpalatRufe)
			System.out.println(unMasinaSpalatRufe);
                
                
                ArrayList<MasinaSpalatVase> listaMasinaSpalatVase = GeneratorMasinaSpalatVase.genereazaRandomMasinaSpalatVase(10);		
		for(MasinaSpalatVase unMasinaSpalatVase:listaMasinaSpalatVase)
			System.out.println(unMasinaSpalatVase);
                
              
                 ArrayList<Monitor> listaMonitor = GeneratorMonitor.genereazaRandomMonitor(10);		
		for(Monitor unMonitor:listaMonitor)
			System.out.println(unMonitor);
                
                

	}
    
    
    
}
