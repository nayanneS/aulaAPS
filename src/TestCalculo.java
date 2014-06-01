import org.junit.Test;

import artigotdd.calculadora.teste.Calculadora;
import static org.junit.Assert.*;

/** * * @author Fabio Gomes Rocha */
public class TestCalculo { 
	public TestCalculo() { } 
	
@Test /** * * @Description Testa o m�todo soma */ 
public void testSoma(){ System.out.println("Soma");
int a = 10;
int b = 20; 
int expResult = 30;
int result = Calculo.Soma(a, b);
assertEquals(expResult, result); } 

@Test /** * * @Description Testa o m�todo subtra��o */ 
public void testSubtracao(){
	System.out.println("Subtra��o");
int a = 20; 
int b = 10;
int expResult = 10; 
int result = Calculo.Subtracao(a, b);
assertEquals(expResult, result); }

