package br.univille.poo.colecoes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HashMapExerciciosTests {

	
	@Test
	public void criarUmMapa() {
		Map<Integer,String> map = HashMapExercicios.criarUmMapa("mapa");
		
		assertEquals("Exer 001: Criar um mapa."
				,"mapa"
				,map.get(1));
	}
	
	@Test
	public void obterUmElemento() {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Argentina");
		map.put(2, "Brasil");
		
		String valor = HashMapExercicios.obterUmElemento(map);
		
		assertEquals("Exer 002: Obter um elemento."
				,"Brasil"
				,valor);
	}
	
	@Test
	public void atualizarUmElemento() {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Argentina");
		map.put(2, "Brasil");
		
		map = HashMapExercicios.atualizarUmElemento(map);
		
		assertEquals("Exer 003: Atualizar um elemento."
				,"Chile"
				,map.get(2));
	}
	
	@Test
	public void removerUmElemento() {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Argentina");
		map.put(2, "Brasil");
		
		map = HashMapExercicios.removerUmElemento(map);
		
		assertEquals("Exer 004: Remover um elemento."
				,false
				,map.containsKey(1));
	}
	
	@Test
	public void titulosNaCopaDoMundoFutebol() {
		
		
		Map<String,Integer> map = HashMapExercicios.titulosNaCopaDoMundoFutebol();
		
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(5)
				,map.get("Brasil"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(4)
				,map.get("Italia"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(4)
				,map.get("Alemanha"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(2)
				,map.get("Argentina"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(2)
				,map.get("Uruguai"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(2)
				,map.get("França"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(1)
				,map.get("Espanha"));
		assertEquals("Exer 005: Titulos na copa do mundo de futebol."
				,new Integer(1)
				,map.get("Inglaterra"));
	}
	
	@Test
	public void contarPaises() {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Argentina");
		lista.add("Brasil");
		lista.add("Chile");
		lista.add("Chile");
		lista.add("Argentina");
		lista.add("Argentina");
		
		Map<String,Integer> map = HashMapExercicios.contarPaises(lista);
		
		assertEquals("Exer 006: Contar paises."
				,new Integer(1)
				,map.get("Brasil"));
		assertEquals("Exer 006: Contar paises."
				,new Integer(2)
				,map.get("Chile"));
		assertEquals("Exer 006: Contar paises."
				,new Integer(3)
				,map.get("Argentina"));
	}
	
}
