/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachet.teste.valentin;
import java.util.ArrayList;
import java.util.Random;


import pachet.clase.valentin.*;
/**
 *
 * @author Valentin
 */
public class GeneratorAerConditionat {
    
    
    
    static private String[] numeProdusAerConditionat = new String[]{"Aparate de aer conditionat de tip split"," Aparate de aer conditionat de tip duct","Aparate de aer conditionat de tip caseta","Aparatele de aer conditionat mobile"};
    
    static private String[] producatorAerConditionat = new String[]{"Vivax","Daikin","Hitachi","Gree","MDV","LG"};
    
    static private double pret;
    static private int minpret = 500;  
    static private int maxpret = 4500;  
    
    static private String[] culoareAerConditionat = new String[]{"alb","negru","verde","albastru","rosu","galben"};
    
    static private double putereConsumata;
    static private int minputereConsumata = 10000;  
    static private int maxputereConsumata = 75000;  
	
	static private String[] clasaAerConditionat = new String[]{"A+","A++","A+++","C","B","D"};
       
        static private int minarieAcoperita = 10;  
        static private int maxarieAcoperita = 100;  
        
	
	// metoda statica, poate fi apelata fara a instantia clasa
	public static ArrayList<AerConditionat> genereazaRandomAerConditionat(int n){
		ArrayList<AerConditionat> listaAerConditionat = new ArrayList();
		AerConditionat unAerConditionat;
		for (double i=0;i<n;i++) {
                
                    
                        double pret = new Random().nextInt(maxpret - minpret + 1) + minpret;
                        double putereConsumata = new Random().nextInt(maxputereConsumata - minputereConsumata + 1) + minputereConsumata;
                        
                   
                        double arieAcoperita = new Random().nextInt(maxarieAcoperita - minarieAcoperita + 1) + minarieAcoperita;
                        double consumTelecomanda = new Random().nextInt(100);
                        
                        
                         
			String clasa = clasaAerConditionat[new Random().nextInt(clasaAerConditionat.length)];
                        
                          
                        String numeProdus = numeProdusAerConditionat[new Random().nextInt(numeProdusAerConditionat.length)];
                        String producator = producatorAerConditionat[new Random().nextInt(producatorAerConditionat.length)];
                        String culoare = culoareAerConditionat[new Random().nextInt(culoareAerConditionat.length)];
                        
                        
			 unAerConditionat=new AerConditionat(numeProdus,producator,pret,culoare,putereConsumata,clasa,arieAcoperita,consumTelecomanda);
                       
                         
			listaAerConditionat.add(unAerConditionat);
                        
                      
                        
		}
		return listaAerConditionat;
                
	}
    
    
}
