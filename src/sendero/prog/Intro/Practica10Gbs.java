package sendero.prog.Intro;

import java.util.ArrayList;
import java.util.List;


public class Practica10Gbs  {
	
	
	public double sumatoriaDe_(List<Double> listaDeNumeros) {
		//En Ingles
		/*Purpose:
			Describe the summation of the given list of numbers.
		Parameter/s:
			listaDeNumeros: List<Double>
		Preconditions:
			None.
		Observations:
			*Change the type, if you want operate with another set 
			 of numbers (Double --> Integer for example)
		*/
		//En español
		/*
		Proposito:
			Describe la sumatoria de la lista de numeros dados
		Parametro/s:
			listaDeNumeros: List<Double>
		PRECONDICIONES:
			*Ninguna
		OBSERVACIONES:
			*Si se quiere hacer con otro conjunto de numeros, simplemente
			cambiar el tipo.(Double --> Integer Por ejemplo)
		*/
		List<Double> listaARecorrer  = listaDeNumeros;
		double sumatoriaHastaAhora = 0;
		int indice = 0;
		while(listaARecorrer.size() > indice && !(indice < 0)  ) {
			sumatoriaHastaAhora = sumatoriaHastaAhora + listaARecorrer.get(indice);
			indice = indice + 1;
		}
		return sumatoriaHastaAhora;
	}
	
	
	public double productoriaDe_(List<Double> listaDeNumeros) {
		/*
		//En Ingles
		Purpose:
			Describe the multiplication of the given list of numbers.
		Parameter/s:
			listaDeNumeros: List<Double>
		Preconditions:
			None.
		Observations:
			*Change the type, if you want operate with another set 
			 of numbers (Double --> Integer for example)
		---             ---              ---              ---
		//En español
		Proposito:
			Describe la productoria de la lista de numeros dados
		Parametro/s:
			listaDeNumeros: List<Double>
		PRECONDICIONES:
			*Ninguna
		OBSERVACIONES:
			*Si se quiere hacer con otro conjunto de numeros, simplemente
			cambiar el tipo.(Double --> Integer Por ejemplo)
		*/
		List<Double> listaARecorrer  = listaDeNumeros;
		double productoriaHastaAhora = 0;
		int indice = 0;
		while(listaARecorrer.size() >= indice && !(indice < 0) ) {
			productoriaHastaAhora = productoriaHastaAhora * listaARecorrer.get(indice);
			indice = indice + 1;
		}
		return productoriaHastaAhora;
	}
	
	public <T> List<T> repeticion_VecesDe_(T elemento, Integer cantARepetir ) {
		/*
		//En Ingles
		Purpose:
			Describe a list where appear the element *elemento*,
			the amount of times indicated at *cantARepetir*
		Parameter/s:
			element: T --> It is a generic type, It can be anything 
		Preconditions:
			None.
		Type:
			[Element] or [
		Observations:
			*If the amount of times to repeat the element is zero,
			then the list is gone be empty.
		---             ---              ---              ---
		//En español
		Proposito:
			Describe una lista donde aparece el elemento *elemento* la cantidad
			de veces indicada por *cantARepetir*.
		Parametros:
			elemento : T --> Es un tipo generico, puede ser el tipo que sea
			cantARepetir : Integer
		Precondiciones:
			*Ninguna
		Observaciones:
			Si la cantidad de veces a repetir el elemento es cero,
			entonces la lista va a ser vacia.
		*/
		List<T> listaConRepetidosHastaAhora = new ArrayList<T>();
		Integer repetidoHastaAhora = cantARepetir;
		while(repetidoHastaAhora > 0 && !(repetidoHastaAhora < 0)) {
			listaConRepetidosHastaAhora.add(elemento);
			repetidoHastaAhora = repetidoHastaAhora - 1; 
		}
		return listaConRepetidosHastaAhora;
	}
	
};
