package intro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sendero.prog.Intro.Practica10Gbs;

public class TestDeIntro  {
	
	private Practica10Gbs practica;
	private List<Double> listaDoubles;
	
	@BeforeEach
	public void setUp() {
		practica = new Practica10Gbs();
		listaDoubles = Arrays.asList(50d,50d,50d,12.5);
	}
	
	@Test
	public void testSumatoriaDe() {
		Practica10Gbs practicaDeMas = new Practica10Gbs();
		List<Double> listaDoubless = Arrays.asList(50d,50d,50d,12.5);
		assertEquals(162.5d , practicaDeMas.sumatoriaDe_(listaDoubless));
	}
	@Test
	public <T> void testRepetirElementoDadoXCantidadDeVeces() {
		
		Practica10Gbs practicaExample = new Practica10Gbs();
		
		List<String> strings = new ArrayList<String>(); 
		strings.add("Chill de cojones"); //Una lista con un string
		
		//Una lista de strings que se repite x cantidad de veces
		@SuppressWarnings("unchecked")
		List<T> resultado = (List<T>) practicaExample.repeticion_VecesDe_(strings, 2);
		
		assertEquals(2, resultado.size()); //Se repite el elemento segun la cantidad dada
		System.out.print("TestXcantidadDada\n");
		System.out.print(resultado);
		System.out.print("\n");
	}
	@Test
	public <T> void testRepetirElementoDado0CantidadDeVeces() {
		
		Practica10Gbs practicaExample = new Practica10Gbs();
		
		List<String> strings = new ArrayList<String>(); 
		strings.add("Chill de cojones"); //Una lista con un string
		
		//Una lista de strings que no se repite
		@SuppressWarnings("unchecked")
		List<T> resultado = (List<T>) practicaExample.repeticion_VecesDe_(strings, 0);
		
		assertEquals(0 , resultado.size()); //No deberia aparecer ningun elemento
		
		System.out.print("\nTest0cantidadDada\n");
		System.out.print(resultado);
	}
	
}
