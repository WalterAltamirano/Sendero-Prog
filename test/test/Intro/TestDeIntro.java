package test.Intro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import sendero.prog.Intro.Practica10Gbs;

public class TestDeIntro {
	
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
	
}
