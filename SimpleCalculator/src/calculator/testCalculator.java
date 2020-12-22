package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCalculator {
	//con @ si indicano le annotazioni
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	//@Test è un metodo di test
	@Test
	void testAdd() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.add(3, 5);
		int risultatoAtteso=8;
		assertEquals (risultatoAtteso, risultato, "Somma sbagliata");
		
		//le asserzioni sono chiamate che registrano i casi di test passati e quelli falliti
		//fail("Not yet implemented");
	}
	@Test
	void testAdd1() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.add(-3, -6);
		int risultatoAtteso=-9;
		assertEquals (risultatoAtteso, risultato, "Somma sbagliata");
			
	}
	@Test
	void testAdd2() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.add(3, 6);
		int risultatoAtteso=-9;
		assertEquals (risultatoAtteso, risultato, "Somma sbagliata");
			
	}
	
	@Test
	void testSub() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.sub(3, 6);
		int risultatoAtteso=-3;
		assertEquals (risultatoAtteso, risultato, "Differenza sbagliata");

	}
	@Test
	void testSub3() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.sub(6, 3);
		int risultatoAtteso=3;
		assertEquals (risultatoAtteso, risultato, "Differenza sbagliata");

	}
	
	@Test
	void testMol() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.mul(0, 3);
		int risultatoAtteso=0;
		assertEquals (risultatoAtteso, risultato, "Prodotto sbagliato");

	}
	@Test
	void testMol1() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.mul(-4, 3);
		int risultatoAtteso=-12;
		assertEquals (risultatoAtteso, risultato, "Prodotto sbagliato");

	}
	@Test
	void testMol2() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.mul(-4, -3);
		int risultatoAtteso=12;
		assertEquals (risultatoAtteso, risultato, "Prodotto sbagliato");

	}
	@Test
	void testMol3() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.mul(4, 5);
		int risultatoAtteso=20;
		assertEquals (risultatoAtteso, risultato, "Prodotto sbagliato");

	}
	@Test
	void testMol4() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.mul(4, Integer.MAX_VALUE);
		int risultatoAtteso=Integer.MAX_VALUE;
		System.out.println(risultatoAtteso); 
		assertEquals (risultatoAtteso, risultato, "Prodotto sbagliato");
		
	}
	@Test
	void testDiv() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.div(10, 5);
		int risultatoAtteso=2;
		assertEquals (risultatoAtteso, risultato, "Divisione sbagliata");

	}
	@Test
	void testDiv1() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.div(0, 5);
		int risultatoAtteso=0;
		assertEquals (risultatoAtteso, risultato, "Divisione sbagliata");

	}
	@Test
	void testDiv2() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.div(5, 2);
		int risultatoAtteso=2;
		assertEquals (risultatoAtteso, risultato, "Divisione sbagliata");

	}

	
	@Test
	void testDiv3() {
		Calcolatrice c= new Calcolatrice();
		int risultato = c.div(5, 0);
		int risultatoAtteso=Integer.MAX_VALUE;
		assertEquals (risultatoAtteso, risultato, "Divisione sbagliata");
		System.out.println(risultatoAtteso); 
	}
	
	
	
}
