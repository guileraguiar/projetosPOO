package br.univille.poo.colecoes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * Testes unitários para verificar a corretude dos exercicios sobre ArrayList.
 * 
 * @author leandersonandre
 * 
 */
public class ArrayListExerciciosTests {
	
	@Test
	public void criarUmaLista() {
		ArrayList<Integer> lista = ArrayListExercicios.criarUmaLista();
		assertEquals("Exer 001 : Listas devem ser iguais. "
				, Arrays.asList(1,2,3,4)
				, lista);
	}
	
	@Test
	public void adicionarElementos() {
		ArrayList<Integer> lista = ArrayListExercicios.adicionarElementos(Arrays.asList(1,2,3,4));
		assertEquals("Exer 002 : Listas devem ser iguais. "
				, Arrays.asList(1,2,-1,3,4)
				, lista);
	}
	
	@Test
	public void modificarElementos() {
		ArrayList<Integer> lista = ArrayListExercicios.modificarElementos(Arrays.asList(1,2,3,4));
		assertEquals("Exer 003 : Listas devem ser iguais. "
				, Arrays.asList(1,4,3,4)
				, lista);
	}
	
	@Test
	public void removerElementos() {
		ArrayList<Integer> lista = ArrayListExercicios.removerElementos(Arrays.asList(1,2,3,4));
		assertEquals("Exer 004 : Listas devem ser iguais. "
				, Arrays.asList(1,3,4)
				, lista);
	}
	
	@Test
	public void obterElemento() {
		int elemento = ArrayListExercicios.obterElemento(Arrays.asList(-4,-6,-5,-3));
		assertEquals("Exer 005 : Elementos devem ser iguais. "
				, -3
				, elemento);
	}
	
	@Test
	public void obterTamanhoDaLista() {
		int elemento = ArrayListExercicios.obterTamanhoDaLista(Arrays.asList(-4,-6,-5,-3,5,6,8));
		assertEquals("Exer 006 : Elementos devem ser iguais. "
				, 7
				, elemento);
	}
	
	@Test
	public void somarOsNumerosDaLista() {
		int elemento = ArrayListExercicios.somarOsNumerosDaLista(Arrays.asList(-4,-6,-5,-3,5,6,8));
		assertEquals("Exer 007 : Elementos devem ser iguais. "
				, 1
				, elemento);
	}
	
	@Test
	public void verificarSeAListaContemUmElemento() {
		boolean r1 = ArrayListExercicios.verificarSeAListaContemUmElemento(Arrays.asList(-4,-6,-5,-3,5,6,8),9);
		boolean r2 = ArrayListExercicios.verificarSeAListaContemUmElemento(Arrays.asList(-4,-6,-5,-3,5,6,8),8);
		assertEquals("Exer 008 : Elementos devem ser iguais. "
				, false
				, r1);
		assertEquals("Exer 008 : Elementos devem ser iguais. "
				, true
				, r2);
	}
	
	@Test
	public void retorneUmListaComApenasOsNumerosNegativos() {
		ArrayList<Integer> lista = ArrayListExercicios.retorneUmListaComApenasOsNumerosNegativos(Arrays.asList(-4,4,-3,3,-2,2,-1,1));
		assertEquals("Exer 009 : Elementos devem ser iguais. "
				, Arrays.asList(-4,-3,-2,-1)
				, lista);
	}
	
	@Test
	public void unirDuasListas() {
		ArrayList<Integer> lista = ArrayListExercicios.unirDuasListas(Arrays.asList(1,2,3,4), Arrays.asList(3,4,5,6));
		
		assertEquals("Exer 010 : Elementos devem ser iguais. "
				, Arrays.asList(1,2,3,4, 5, 6)
				, lista);
	}
	
	@Test
	public void algoritmoDeOrdenacaoDeStalin() {
		ArrayList<Integer> lista = ArrayListExercicios.algoritmoDeOrdenacaoDeStalin(Arrays.asList(5,3,6,1,9,-1));
		
		assertEquals("Exer 011 : Elementos devem ser iguais. "
				, Arrays.asList(5,6,9)
				, lista);
	}

}
