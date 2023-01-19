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
public class MonitorFilter {
    
    public static ArrayList<Monitor> filtreazaDupaRataRefresh(ArrayList<Monitor> listaInitalaMonitor, double rataRefresh) {
		ArrayList<Monitor> listaMonitor = new ArrayList();
		for(Monitor monitor:listaInitalaMonitor)
			if (monitor.getRataRefresh() == rataRefresh) 
					listaMonitor.add(monitor);		
		return listaMonitor;
	}
    
    
    public static ArrayList<Monitor> filtreazaDupaDiagonala(ArrayList<Monitor> listaInitalaMonitor, double diagonala) {
		ArrayList<Monitor> listaMonitor = new ArrayList();
		for(Monitor monitor:listaInitalaMonitor)
			if (monitor.getDiagonala() == diagonala) 
					listaMonitor.add(monitor);		
		return listaMonitor;
	}
    
}
