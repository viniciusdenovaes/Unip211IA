package entity.grafo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Grafo {
	
	Map<String, Vertice> V;
	Map<String, Aresta> A;
	Map<Vertice, List<Vertice>> listaDeAdjacencia;
	
	public Grafo() {
		V = new TreeMap<>();
		A = new TreeMap<>();
		listaDeAdjacencia = new TreeMap<>();
	}
	
	public void addAresta(Aresta a) {
		addVertice(a.v1);
		addVertice(a.v2);
		A.put(a.id, a);
		listaDeAdjacencia.get(a.v1).add(a.v2);
		listaDeAdjacencia.get(a.v2).add(a.v1);
	}
	
	private void addVertice(Vertice v) {
		V.put(v.id, v);
		if(!listaDeAdjacencia.containsKey(v)) {
			listaDeAdjacencia.put(v, new ArrayList<>());
		}
	}
	
	public void addAresta(String nomeV1, String nomeV2, double peso) {
		Aresta a = new Aresta(new Vertice(nomeV1), new Vertice(nomeV2), peso);
		this.addAresta(a);
	}
	
	public Vertice getVertice(String nome) {
		return this.V.get(nome);
	}
	
	public Aresta getAresta(Vertice v1, Vertice v2) {
		return this.A.get(Aresta.getIdAresta(v1, v2));
	}
	
	public Aresta getAresta(String nome) {
		return this.A.get(nome);
	}
	
	public Collection<Vertice> getTodosVertices(){
		return this.V.values();
	}
	
	public Collection<Aresta> getTodosArestas(){
		return this.A.values();
	} 
	
	public Map<Vertice, List<Vertice>> getListaAdjacencia(){
		return this.listaDeAdjacencia;
	}
	
	public List<Vertice> getVerticesAdjacentes(Vertice v){
		return this.listaDeAdjacencia.get(v);
	}
	
	private String listaAdajacenciaToSring(Vertice vOriginal) {
		String res = "";
		for(Vertice adj: listaDeAdjacencia.get(vOriginal)) {
			res += " " + adj;
		}
		return res;
		
	}
	
	@Override
	public String toString() {
		String res = "";
		
		for(Vertice v: this.V.values()) {
			res += v + ", adjs: " + listaAdajacenciaToSring(v) + "\n";
		}
		for(Aresta a: this.A.values()) {
			res += a + "\n";
		}
		
		return res;
	}
	

}
