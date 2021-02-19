package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Grafo {
	
	Set<Vertice> V;
	Set<Aresta> A;
	Map<Vertice, List<Aresta>> listaDeAdjacencia;
	
	public Grafo() {
		V = new TreeSet<>();
		A = new TreeSet<>();
		listaDeAdjacencia = new TreeMap<>();
	}
	
	public void addVertice(Vertice v) {
		V.add(v);
		listaDeAdjacencia.put(v, new ArrayList<>());
	}
	
	public void addAresta(Aresta a) {
		A.add(a);
		listaDeAdjacencia.get(a.v1).add(a);
		listaDeAdjacencia.get(a.v2).add(a);
	}
	

}
