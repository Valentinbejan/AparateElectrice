/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachet.teste.valentin;

import java.util.ArrayList;
import pachet.clase.valentin.FierCalcat;
import pachet.clasegeneratoare.vali.GeneratorAerConditionat;
import pachet.clasegeneratoare.vali.GeneratorFierCalcat;
import pachet.clasegeneratoare.vali.GeneratorMasinaSpalatRufe;
import pachet.clasegeneratoare.vali.GeneratorMasinaSpalatVase;
import pachet.clasegeneratoare.vali.GeneratorMonitor;
import pachet.clase.valentin.*;
import pachet.clasefilter.vali.*;
/**
 *
 * @author Valentin
 */
public class Test4 {
    
   public static void main(String[] args) {

		
                ArrayList<AerConditionat> listaAerConditionat = GeneratorAerConditionat.genereazaRandomAerConditionat(10);
                System.out.println("\n\n"+"filtreaza Dupa Clasa:"+"\n\n");
                AerConditionatFilter.filtreazaDupaClasa(listaAerConditionat,"A+").forEach(System.out::println);
                System.out.println("\n\n"+"filtreaza Dupa arieAcoperita:"+"\n\n");
                AerConditionatFilter.filtreazaDupaArieAcoperita(listaAerConditionat,25).forEach(System.out::println);
       
                
                ArrayList<FierCalcat> listaFierCalcat = GeneratorFierCalcat.genereazaRandomFierCalcat(10);
                System.out.println("\n\n"+"filtreaza Dupa talpa:"+"\n\n");
                FierCalcatFilter.filtreazaDupaTalpa(listaFierCalcat,"Philips").forEach(System.out::println);
                System.out.println("\n\n"+"filtreaza Dupa functii:"+"\n\n");
                FierCalcatFilter.filtreazaDupaFunctii(listaFierCalcat,"functia anti picurare").forEach(System.out::println);
       
       
                ArrayList<MasinaSpalatRufe> listaMasinaSpalatRufe = GeneratorMasinaSpalatRufe.genereazaRandomMasinaSpalatRufe(10);
                System.out.println("\n\n"+"filtreaza Dupa capacitate:"+"\n\n");
                MasinaSpalatRufeFilter.filtreazaDupaCapacitate(listaMasinaSpalatRufe, 25).forEach(System.out::println);
                System.out.println("\n\n"+"filtreaza Dupa rotatii:"+"\n\n");
                MasinaSpalatRufeFilter.filtreazaDupaRotatii(listaMasinaSpalatRufe, 25).forEach(System.out::println);
       
       
                ArrayList<MasinaSpalatVase> listaMasinaSpalatVase = GeneratorMasinaSpalatVase.genereazaRandomMasinaSpalatVase(10);
                System.out.println("\n\n"+"filtreaza Dupa numarSeturi:"+"\n\n");
                MasinaSpalatVaseFilter.filtreazaDupaNumarSeturi(listaMasinaSpalatVase, 25).forEach(System.out::println);
                System.out.println("\n\n"+"filtreaza Dupa latimeCuva:"+"\n\n");
                MasinaSpalatVaseFilter.filtreazaDupaLatimeCuva(listaMasinaSpalatVase, 25).forEach(System.out::println);
       
       
		ArrayList<Monitor> listaMonitor = GeneratorMonitor.genereazaRandomMonitor(10);
                System.out.println("\n\n"+"filtreaza Dupa rataRefresh:"+"\n\n");
                MonitorFilter.filtreazaDupaRataRefresh(listaMonitor, 60).forEach(System.out::println);
                //listaMonitor.forEach(System.out::println);
                      //for (Monitor monitor : listaMonitor)
			//System.out.println(monitor);
                      
                System.out.println("\n\n"+"filtreaza Dupa diagonala:"+"\n\n");
                MonitorFilter.filtreazaDupaDiagonala(listaMonitor, 29).forEach(System.out::println);
                
            
	}
    
}
