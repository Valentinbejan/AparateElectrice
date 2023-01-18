/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachet.teste.valentin;
import pachet.clase.valentin.*;

import java.io.*;
import java.util.*;
import pachet.clasegeneratoare.vali.GeneratorAerConditionat;
import pachet.clasegeneratoare.vali.GeneratorFierCalcat;
import pachet.clasegeneratoare.vali.GeneratorMasinaSpalatRufe;
import pachet.clasegeneratoare.vali.GeneratorMasinaSpalatVase;
import pachet.clasegeneratoare.vali.GeneratorMonitor;

/**
 *
 * @author Valentin
 */
public class Test6Vali {
    public static void main(String args[]) throws FileNotFoundException {
   /*
        MasinaSpalatRufe masina1 = new MasinaSpalatRufe();
masina1.setNumeProdus("Masina de spalat rufe");
masina1.setProducator("Samsung");
masina1.setPret(2700);
masina1.setCuloare("alba");
masina1.setPutereConsumata(5500);
masina1.setCapacicate(15);
masina1.setRotatii(700);

File file = new File("masina1.txt");
PrintWriter writer = new PrintWriter(file);
writer.println(masina1);
writer.close();
*/
ArrayList<MasinaSpalatRufe> listaMasinaSpalatRufe = GeneratorMasinaSpalatRufe
				.genereazaRandomMasinaSpalatRufe(10);
		for (MasinaSpalatRufe unMasinaSpalatRufe : listaMasinaSpalatRufe)
			System.out.println(unMasinaSpalatRufe);

               
File file = new File("listaMasinaSpalatRufe.txt");
PrintWriter writer = new PrintWriter(file);
writer.println(listaMasinaSpalatRufe);
writer.close();
    


ArrayList<FierCalcat> listaFierCalcat = GeneratorFierCalcat.genereazaRandomFierCalcat(10);
		for (FierCalcat unFierCalcat : listaFierCalcat)
			System.out.println(unFierCalcat);

File file1 = new File("listaFierCalcat.txt");
PrintWriter writer1 = new PrintWriter(file1);
writer1.println(listaFierCalcat);
writer1.close();
                
                
                
		ArrayList<AerConditionat> listaAerConditionat = GeneratorAerConditionat.genereazaRandomAerConditionat(10);
		for (AerConditionat unAerConditionat : listaAerConditionat)
			System.out.println(unAerConditionat);

File file2 = new File("listaAerConditionat.txt");
PrintWriter writer2 = new PrintWriter(file2);
writer2.println(listaAerConditionat);
writer2.close();
                
                
                ArrayList<MasinaSpalatVase> listaMasinaSpalatVase = GeneratorMasinaSpalatVase
				.genereazaRandomMasinaSpalatVase(10);
		for (MasinaSpalatVase unMasinaSpalatVase : listaMasinaSpalatVase)
			System.out.println(unMasinaSpalatVase);

		
File file3 = new File("listaMasinaSpalatVase.txt");
PrintWriter writer3 = new PrintWriter(file3);
writer3.println(listaMasinaSpalatVase);
writer3.close();

                ArrayList<Monitor> listaMonitor = GeneratorMonitor.genereazaRandomMonitor(10);
		for (Monitor unMonitor : listaMonitor)
			System.out.println(unMonitor);
                
                
                
File file4 = new File("listaMonitor.txt");
PrintWriter writer4 = new PrintWriter(file4);
writer4.println(listaMonitor);
writer4.close();



    }
    
}
