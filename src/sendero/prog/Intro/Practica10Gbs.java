package sendero.prog.Intro;

import java.util.ArrayList;
import java.util.List;

public class Practica10Gbs {
	
	
	public double sumatoriaDe_(List<Double> listaDeNumeros) {
		
		List<Double> listaARecorrer  = listaDeNumeros;
		double sumatoriaHastaAhora = 0;
		int indice = 0;
		while(listaARecorrer.size() != indice && !listaARecorrer.isEmpty() ) {
			sumatoriaHastaAhora = sumatoriaHastaAhora + listaARecorrer.get(indice);
			indice = indice + 1;
		}
		return sumatoriaHastaAhora;
	}
	
};
